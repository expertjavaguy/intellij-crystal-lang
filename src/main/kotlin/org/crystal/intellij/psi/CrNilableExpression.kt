package org.crystal.intellij.psi

import com.intellij.lang.ASTNode

open class CrNilableExpression(node: ASTNode) : CrExpression(node) {
    override fun accept(visitor: CrVisitor) = visitor.visitNilableExpression(this)
}