package org.crystal.intellij.resolve.symbols

import org.crystal.intellij.psi.CrSuperTypeAware
import org.crystal.intellij.psi.CrTypeSource
import org.crystal.intellij.psi.typePath
import org.crystal.intellij.resolve.CrStdFqNames
import org.crystal.intellij.resolve.cache.newResolveSlice
import org.crystal.intellij.resolve.cache.resolveCache
import org.crystal.intellij.resolve.predefinedSuperClasses
import org.crystal.intellij.resolve.scopes.getTypeAs
import org.crystal.intellij.resolve.superlessClasses

sealed class CrClassLikeSym(
    name: String,
    sources: List<CrTypeSource>
) : CrModuleLikeSym(name, sources) {
    companion object {
        private val SUPER_CLASS = newResolveSlice<CrClassLikeSym, CrClassLikeSym>("SUPER_CLASS")
    }

    override val superClass: CrClassLikeSym?
        get() = program.project.resolveCache.getOrCompute(SUPER_CLASS, this) {
            if (fqName in superlessClasses) return@getOrCompute null
            predefinedSuperClasses[fqName]?.let { return@getOrCompute program.memberScope.getTypeAs(it) }
            for (source in sources) {
                val superClause = (source as? CrSuperTypeAware)?.superTypeClause
                if (superClause != null) return@getOrCompute superClause.type?.typePath?.resolveSymbol() as? CrClassLikeSym
            }
            val superName = when (this) {
                is CrClassSym -> CrStdFqNames.REFERENCE
                is CrStructSym -> CrStdFqNames.STRUCT
                is CrEnumSym -> CrStdFqNames.ENUM
                else -> return@getOrCompute null
            }
            program.memberScope.getTypeAs(superName)
        }
}