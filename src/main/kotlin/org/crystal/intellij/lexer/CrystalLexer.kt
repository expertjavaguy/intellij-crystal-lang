package org.crystal.intellij.lexer

import com.intellij.lexer.FlexAdapter
import com.intellij.psi.tree.IElementType

class CrystalLexer : FlexAdapter(_CrystalLexer()) {
    interface LookAhead {
        val tokenType: IElementType?

        fun advance()
    }

    private val delegate: _CrystalLexer get() = flex as _CrystalLexer

    val lexerState: LexerState get() = delegate.lexerState

    private val la = object : LookAhead {
        private var lastTokenType: IElementType? = null

        private fun updateToken() {
            if (lastTokenType != null) return
            lastTokenType = delegate.advance()
        }

        override val tokenType: IElementType?
            get() {
                updateToken()
                return lastTokenType
            }

        override fun advance() {
            updateToken()
            reset()
        }

        fun reset() {
            lastTokenType = null
        }
    }

    fun <T> lookAhead(body: LookAhead.() -> T): T {
        delegate.enterLookAhead()
        try {
            la.reset()
            return la.body()
        }
        finally {
            delegate.leaveLookAhead()
        }
    }

    fun lookAhead(): IElementType? = delegate.lookAhead()
}