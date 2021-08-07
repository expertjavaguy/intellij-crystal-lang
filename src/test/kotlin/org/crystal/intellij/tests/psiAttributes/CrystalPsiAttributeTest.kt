package org.crystal.intellij.tests.psiAttributes

import com.intellij.psi.PsiElement
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import junit.framework.TestCase
import org.crystal.intellij.psi.*
import org.crystal.intellij.util.firstInstanceOrNull

abstract class CrystalPsiAttributeTest : BasePlatformTestCase() {
    protected inline fun <reified T : PsiElement> check(text: String, attribute: T.() -> Any?, expected: Any?) {
        myFixture.configureByText("a.cr", text)
        TestCase.assertEquals(expected, myFixture.file.allDescendants().firstInstanceOrNull<T>()!!.attribute())
    }
}