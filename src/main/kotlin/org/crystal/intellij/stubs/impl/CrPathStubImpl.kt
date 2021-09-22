package org.crystal.intellij.stubs.impl

import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubElement
import org.crystal.intellij.psi.CrPathNameElement
import org.crystal.intellij.stubs.api.CrPathStub

class CrPathStubImpl(
    parent: StubElement<*>?,
    elementType: IStubElementType<out StubElement<*>, *>,
    override val isGlobal: Boolean,
    override val items: List<String>,
) : CrStubElementImpl<CrPathNameElement>(parent, elementType), CrPathStub {
    override fun toString() = "CrPathStubImpl(isGlobal=$isGlobal, items=$items)"
}