package org.crystal.intellij.psi

import com.intellij.lang.ASTNode

class CrCUnion(node: ASTNode) : CrDefinitionImpl(node),
                                CrBodyHolder,
                                CrTypeDefinition {
    override fun accept(visitor: CrVisitor) = visitor.visitCUnion(this)
}