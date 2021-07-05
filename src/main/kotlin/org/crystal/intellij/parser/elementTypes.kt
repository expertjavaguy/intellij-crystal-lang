package org.crystal.intellij.parser

import com.intellij.lang.ASTNode
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import org.crystal.intellij.CrystalLanguage
import org.crystal.intellij.psi.*

class CrCompositeElementType(
    debugName: String,
    val factory: (ASTNode) -> CrElement
) : IElementType(debugName, CrystalLanguage)

// Definitions
val CR_ALIAS_DEFINITION = CrCompositeElementType("CR_ALIAS_DEFINITION", ::CrAlias)
val CR_ANNOTATION_DEFINITION = CrCompositeElementType("CR_ANNOTATION_DEFINITION", ::CrAnnotation)
val CR_CLASS_DEFINITION = CrCompositeElementType("CR_CLASS_DEFINITION", ::CrClass)
val CR_C_FIELD_DEFINITION = CrCompositeElementType("CR_C_FIELD_DEFINITION", ::CrCField)
val CR_C_STRUCT_DEFINITION = CrCompositeElementType("CR_C_STRUCT_DEFINITION", ::CrCStruct)
val CR_C_UNION_DEFINITION = CrCompositeElementType("CR_C_UNION_DEFINITION", ::CrCUnion)
val CR_ENUM_DEFINITION = CrCompositeElementType("CR_ENUM_DEFINITION", ::CrEnum)
val CR_ENUM_CONSTANT_DEFINITION = CrCompositeElementType("CR_ENUM_CONSTANT_DEFINITION", ::CrEnumConstant)
val CR_FUNCTION_DEFINITION = CrCompositeElementType("CR_FUNCTION_DEFINITION", ::CrFunction)
val CR_LIBRARY_DEFINITION = CrCompositeElementType("CR_LIBRARY_DEFINITION", ::CrLibrary)
val CR_MACRO_DEFINITION = CrCompositeElementType("CR_MACRO_DEFINITION", ::CrMacro)
val CR_METHOD_DEFINITION = CrCompositeElementType("CR_METHOD_DEFINITION", ::CrMethod)
val CR_MODULE_DEFINITION = CrCompositeElementType("CR_MODULE_DEFINITION", ::CrModule)
val CR_MULTI_PARAMETER_DEFINITION = CrCompositeElementType("CR_MULTI_PARAMETER_DEFINITION", ::CrMultiParameter)
val CR_SIMPLE_PARAMETER_DEFINITION = CrCompositeElementType("CR_SIMPLE_PARAMETER_DEFINITION", ::CrSimpleParameter)
val CR_STRUCT_DEFINITION = CrCompositeElementType("CR_STRUCT_DEFINITION", ::CrStruct)
val CR_TYPE_DEFINITION = CrCompositeElementType("CR_TYPE_DEFINITION", ::CrTypeDef)
val CR_TYPE_PARAMETER_DEFINITION = CrCompositeElementType("CR_TYPE_PARAMETER_DEFINITION", ::CrTypeParameter)
val CR_VARIABLE_DEFINITION = CrCompositeElementType("CR_VARIABLE_DECLARATION", ::CrVariable)

// Expressions
val CR_ANNOTATION_EXPRESSION = CrCompositeElementType("CR_ANNOTATION_EXPRESSION", ::CrAnnotationExpression)
val CR_ARRAY_LITERAL_EXPRESSION = CrCompositeElementType("CR_ARRAY_LITERAL_EXPRESSION", ::CrArrayLiteralExpression)
val CR_AS_EXPRESSION = CrCompositeElementType("CR_AS_EXPRESSION", ::CrAsExpression)
val CR_ASM_EXPRESSION = CrCompositeElementType("CR_ASM_EXPRESSION", ::CrAsmExpression)
val CR_ASSIGNMENT_EXPRESSION = CrCompositeElementType("CR_ASSIGNMENT_EXPRESSION", ::CrAssignmentExpression)
val CR_BINARY_EXPRESSION = CrCompositeElementType("CR_BINARY_EXPRESSION", ::CrBinaryExpression)
val CR_BLOCK_EXPRESSION = CrCompositeElementType("CR_BLOCK_EXPRESSION", ::CrBlockExpression)
val CR_BOOLEAN_LITERAL_EXPRESSION = CrCompositeElementType("CR_BOOLEAN_LITERAL_EXPRESSION", ::CrBooleanLiteralExpression)
val CR_BREAK_EXPRESSION = CrCompositeElementType("CR_BREAK_EXPRESSION", ::CrBreakExpression)
val CR_CALL_EXPRESSION = CrCompositeElementType("CR_CALL_EXPRESSION", ::CrCallExpression)
val CR_CASE_EXPRESSION = CrCompositeElementType("CR_CASE_EXPRESSION", ::CrCaseExpression)
val CR_CHAR_LITERAL_EXPRESSION = CrCompositeElementType("CR_CHAR_LITERAL_EXPRESSION", ::CrCharLiteralExpression)
val CR_COMMAND_EXPRESSION = CrCompositeElementType("CR_COMMAND_EXPRESSION", ::CrCommandExpression)
val CR_CONCATENATED_STRING_LITERAL_EXPRESSION = CrCompositeElementType("CR_CONCATENATED_STRING_LITERAL_EXPRESSION", ::CrConcatenatedStringLiteralExpression)
val CR_CONDITIONAL_EXPRESSION = CrCompositeElementType("CR_CONDITIONAL_EXPRESSION", ::CrConditionalExpression)
val CR_ENSURE_EXPRESSION = CrCompositeElementType("CR_ENSURE_EXPRESSION", ::CrEnsureExpression)
val CR_EXTEND_EXPRESSION = CrCompositeElementType("CR_EXTEND_EXPRESSION", ::CrExtendExpression)
val CR_FLOAT_LITERAL_EXPRESSION = CrCompositeElementType("CR_FLOAT_LITERAL_EXPRESSION", ::CrFloatLiteralExpression)
val CR_FUNCTION_LITERAL_EXPRESSION = CrCompositeElementType("CR_FUNCTION_LITERAL_EXPRESSION", ::CrFunctionLiteralExpression)
val CR_FUNCTION_POINTER_EXPRESSION = CrCompositeElementType("CR_FUNCTION_POINTER_EXPRESSION", ::CrFunctionPointerExpression)
val CR_HASH_EXPRESSION = CrCompositeElementType("CR_HASH_EXPRESSION", ::CrHashExpression)
val CR_HEREDOC_EXPRESSION = CrCompositeElementType("CR_HEREDOC_EXPRESSION", ::CrHeredocExpression)
val CR_IF_EXPRESSION = CrCompositeElementType("CR_IF_EXPRESSION", ::CrIfExpression)
val CR_INDEXED_EXPRESSION = CrCompositeElementType("CR_INDEXED_EXPRESSION", ::CrIndexedExpression)
val CR_INCLUDE_EXPRESSION = CrCompositeElementType("CR_INCLUDE_EXPRESSION", ::CrIncludeExpression)
val CR_INSTANCE_SIZE_EXPRESSION = CrCompositeElementType("CR_INSTANCE_SIZE_EXPRESSION", ::CrInstanceSizeExpression)
val CR_INTEGER_LITERAL_EXPRESSION = CrCompositeElementType("CR_INTEGER_LITERAL_EXPRESSION", ::CrIntegerLiteralExpression)
val CR_IS_EXPRESSION = CrCompositeElementType("CR_IS_EXPRESSION", ::CrIsExpression)
val CR_IS_NIL_EXPRESSION = CrCompositeElementType("CR_IS_NIL_EXPRESSION", ::CrIsNilExpression)
val CR_LIST_EXPRESSION = CrCompositeElementType("CR_LIST_EXPRESSION", ::CrListExpression)
val CR_MACRO_EXPRESSION = CrCompositeElementType("CR_MACRO_EXPRESSION", ::CrMacroExpression)
val CR_MACRO_LITERAL = CrCompositeElementType("CR_MACRO_LITERAL", ::CrMacroLiteral)
val CR_MACRO_VARIABLE_EXPRESSION = CrCompositeElementType("CR_MACRO_VARIABLE_EXPRESSION", ::CrMacroVariableExpression)
val CR_NAMED_TUPLE_EXPRESSION = CrCompositeElementType("CR_NAMED_TUPLE_EXPRESSION", ::CrNamedTupleExpression)
val CR_NEXT_EXPRESSION = CrCompositeElementType("CR_NEXT_EXPRESSION", ::CrNextExpression)
val CR_NIL_EXPRESSION = CrCompositeElementType("CR_NIL_EXPRESSION", ::CrNilExpression)
val CR_NILABLE_EXPRESSION = CrCompositeElementType("CR_NILABLE_EXPRESSION", ::CrNilableExpression)
val CR_OFFSET_EXPRESSION = CrCompositeElementType("CR_OFFSETOF_EXPRESSION", ::CrOffsetExpression)
val CR_PARENTHESIZED_EXPRESSION = CrCompositeElementType("CR_PARENTHESIZED_EXPRESSION", ::CrParenthesizedExpression)
val CR_PATH_EXPRESSION = CrCompositeElementType("CR_PATH_EXPRESSION", ::CrPathExpression)
val CR_POINTER_EXPRESSION = CrCompositeElementType("CR_POINTER_EXPRESSION", ::CrPointerExpression)
val CR_PSEUDO_CONSTANT_EXPRESSION = CrCompositeElementType("CR_PSEUDO_CONSTANT_EXPRESSION", ::CrPseudoConstantExpression)
val CR_REFERENCE_EXPRESSION = CrCompositeElementType("CR_REFERENCE_EXPRESSION", ::CrReferenceExpression)
val CR_REGEX_EXPRESSION = CrCompositeElementType("CR_REGEX_EXPRESSION", ::CrRegexExpression)
val CR_REQUIRE_EXPRESSION = CrCompositeElementType("CR_REQUIRE_EXPRESSION", ::CrRequireExpression)
val CR_RESPONDS_TO_EXPRESSION = CrCompositeElementType("CR_RESPONDS_TO_EXPRESSION", ::CrRespondsToExpression)
val CR_RESCUE_EXPRESSION = CrCompositeElementType("CR_RESCUE_EXPRESSION", ::CrRescueExpression)
val CR_RETURN_EXPRESSION = CrCompositeElementType("CR_RETURN_EXPRESSION", ::CrReturnExpression)
val CR_SELECT_EXPRESSION = CrCompositeElementType("CR_SELECT_EXPRESSION", ::CrSelectExpression)
val CR_SELF_EXPRESSION = CrCompositeElementType("CR_SELF_EXPRESSION", ::CrSelfExpression)
val CR_SIZE_EXPRESSION = CrCompositeElementType("CR_SIZE_EXPRESSION", ::CrSizeExpression)
val CR_STRING_ARRAY_EXPRESSION = CrCompositeElementType("CR_STRING_ARRAY_EXPRESSION", ::CrStringArrayExpression)
val CR_STRING_LITERAL_EXPRESSION = CrCompositeElementType("CR_STRING_LITERAL_EXPRESSION", ::CrStringLiteralExpression)
val CR_SYMBOL_ARRAY_EXPRESSION = CrCompositeElementType("CR_SYMBOL_ARRAY_EXPRESSION", ::CrSymbolArrayExpression)
val CR_SYMBOL_EXPRESSION = CrCompositeElementType("CR_SYMBOL_EXPRESSION", ::CrSymbolExpression)
val CR_TUPLE_EXPRESSION = CrCompositeElementType("CR_TUPLE_EXPRESSION", ::CrTupleExpression)
val CR_TYPE_EXPRESSION = CrCompositeElementType("CR_TYPE_EXPRESSION", ::CrTypeExpression)
val CR_UNARY_EXPRESSION = CrCompositeElementType("CR_UNARY_EXPRESSION", ::CrUnaryExpression)
val CR_UNINITIALIZED_EXPRESSION = CrCompositeElementType("CR_UNINITIALIZED_EXPRESSION", ::CrUninitializedExpression)
val CR_UNLESS_EXPRESSION = CrCompositeElementType("CR_UNLESS_EXPRESSION", ::CrUnlessExpression)
val CR_UNTIL_EXPRESSION = CrCompositeElementType("CR_UNTIL_EXPRESSION", ::CrUntilExpression)
val CR_VISIBILITY_EXPRESSION = CrCompositeElementType("CR_VISIBILITY_EXPRESSION", ::CrVisibilityExpression)
val CR_WHILE_EXPRESSION = CrCompositeElementType("CR_WHILE_EXPRESSION", ::CrWhileExpression)
val CR_WITH_EXPRESSION = CrCompositeElementType("CR_WITH_EXPRESSION", ::CrWithExpression)
val CR_YIELD_EXPRESSION = CrCompositeElementType("CR_YIELD_EXPRESSION", ::CrYieldExpression)

// Type elements
val CR_DOUBLE_SPLAT_TYPE = CrCompositeElementType("CR_DOUBLE_SPLAT_TYPE", ::CrDoubleSplatType)
val CR_EXPRESSION_TYPE = CrCompositeElementType("CR_EXPRESSION_TYPE", ::CrExpressionType)
val CR_HASH_TYPE = CrCompositeElementType("CR_HASH_TYPE", ::CrHashType)
val CR_INSTANTIATED_TYPE = CrCompositeElementType("CR_INSTANTIATED_TYPE", ::CrInstantiatedType)
val CR_LABELED_TYPE = CrCompositeElementType("CR_LABELED_TYPE", ::CrLabeledType)
val CR_METACLASS_TYPE = CrCompositeElementType("CR_METACLASS_TYPE", ::CrMetaclassType)
val CR_NAMED_TUPLE_TYPE = CrCompositeElementType("CR_NAMED_TUPLE_TYPE", ::CrNamedTupleType)
val CR_NILABLE_TYPE = CrCompositeElementType("CR_NILABLE_TYPE", ::CrNilableType)
val CR_PARENTHESIZED_TYPE = CrCompositeElementType("CR_PARENTHESIZED_TYPE", ::CrParenthesizedType)
val CR_PATH_TYPE = CrCompositeElementType("CR_PATH_TYPE", ::CrPathType)
val CR_POINTER_TYPE = CrCompositeElementType("CR_POINTER_TYPE", ::CrPointerType)
val CR_PROC_TYPE = CrCompositeElementType("CR_PROC_TYPE", ::CrProcType)
val CR_SELF_TYPE = CrCompositeElementType("CR_SELF_TYPE", ::CrSelfType)
val CR_SPLAT_TYPE = CrCompositeElementType("CR_SPLAT_TYPE", ::CrSplatType)
val CR_STATIC_ARRAY_TYPE = CrCompositeElementType("CR_STATIC_ARRAY_TYPE", ::CrStaticArrayType)
val CR_TUPLE_TYPE = CrCompositeElementType("CR_TUPLE_TYPE", ::CrTupleType)
val CR_UNDERSCORE_TYPE = CrCompositeElementType("CR_UNDERSCORE_TYPE", ::CrUnderscoreType)
val CR_UNION_TYPE = CrCompositeElementType("CR_UNION_TYPE", ::CrUnionType)

// Arguments
val CR_DOUBLE_SPLAT_ARGUMENT = CrCompositeElementType("CR_DOUBLE_SPLAT_ARGUMENT", ::CrDoubleSplatArgument)
val CR_NAMED_ARGUMENT = CrCompositeElementType("CR_NAMED_ARGUMENT", ::CrNamedArgument)
val CR_OUT_ARGUMENT = CrCompositeElementType("CR_OUT_ARGUMENT", ::CrOutArgument)
val CR_SHORT_BLOCK_ARGUMENT = CrCompositeElementType("CR_SHORT_BLOCK_ARGUMENT", ::CrShortBlockArgument)
val CR_SPLAT_ARGUMENT = CrCompositeElementType("CR_SPLAT_ARGUMENT", ::CrSplatArgument)

// Macro statements
val CR_MACRO_BLOCK_STATEMENT = CrCompositeElementType("CR_MACRO_BLOCK_STATEMENT", ::CrMacroBlockStatement)
val CR_MACRO_FOR_STATEMENT = CrCompositeElementType("CR_MACRO_FOR_STATEMENT", ::CrMacroForStatement)
val CR_MACRO_IF_STATEMENT = CrCompositeElementType("CR_MACRO_IF_STATEMENT", ::CrMacroIfStatement)
val CR_MACRO_UNLESS_STATEMENT = CrCompositeElementType("CR_MACRO_UNLESS_STATEMENT", ::CrMacroUnlessStatement)
val CR_MACRO_VERBATIM_STATEMENT = CrCompositeElementType("CR_MACRO_VERBATIM_STATEMENT", ::CrMacroVerbatimStatement)
val CR_MACRO_WRAPPER_STATEMENT = CrCompositeElementType("CR_MACRO_WRAPPER_STATEMENT", ::CrMacroWrapperStatement)

// Miscellaneous
val CR_ASM_CLOBBER_LIST = CrCompositeElementType("CR_ASM_CLOBBER_LIST", ::CrAsmClobberList)
val CR_ASM_OPERAND = CrCompositeElementType("CR_ASM_OPERAND", ::CrAsmOperand)
val CR_ASM_OPERAND_LIST = CrCompositeElementType("CR_ASM_OPERAND_LIST", ::CrAsmOperandList)
val CR_ASM_OPTIONS_LIST = CrCompositeElementType("CR_ASM_OPTIONS_LIST", ::CrAsmOptionsList)
val CR_BLOCK_PARAMETER_LIST = CrCompositeElementType("CR_BLOCK_PARAMETER_LIST", ::CrBlockParameterList)
val CR_BODY = CrCompositeElementType("CR_BODY", ::CrBody)
val CR_C_FIELD_GROUP = CrCompositeElementType("CR_C_FIELD_GROUP", ::CrCFieldGroup)
val CR_ELSE_CLAUSE = CrCompositeElementType("CR_ELSE_CLAUSE", ::CrElseClause)
val CR_ENSURE_CLAUSE = CrCompositeElementType("CR_ENSURE_CLAUSE", ::CrEnsureClause)
val CR_EXCEPTION_HANDLER = CrCompositeElementType("CR_EXCEPTION_HANDLER", ::CrExceptionHandler)
val CR_HASH_ENTRY = CrCompositeElementType("CR_HASH_ENTRY", ::CrHashEntry)
val CR_HEREDOC_LITERAL_BODY = CrCompositeElementType("CR_HEREDOC_LITERAL_BODY", ::CrHeredocLiteralBody)
val CR_SIMPLE_NAME_ELEMENT = CrCompositeElementType("CR_SIMPLE_NAME_ELEMENT", ::CrSimpleNameElement)
val CR_NAMED_TUPLE_ENTRY = CrCompositeElementType("CR_NAMED_TUPLE_ENTRY", ::CrNamedTupleEntry)
val CR_PARAMETER_LIST = CrCompositeElementType("CR_PARAMETER_LIST", ::CrParameterList)
val CR_PARENTHESIZED_ARGUMENT_LIST = CrCompositeElementType("CR_PARENTHESIZED_ARGUMENT_LIST", ::CrArgumentList)
val CR_PATH_NAME_ELEMENT = CrCompositeElementType("CR_PATH_NAME_ELEMENT", ::CrPathNameElement)
val CR_RESCUE_CLAUSE = CrCompositeElementType("CR_RESCUE_CLAUSE", ::CrRescueClause)
val CR_SPACED_ARGUMENT_LIST = CrCompositeElementType("CR_SPACED_ARGUMENT_LIST", ::CrArgumentList)
val CR_STRING_INTERPOLATION = CrCompositeElementType("CR_STRING_INTERPOLATION", ::CrStringInterpolation)
val CR_SUPERTYPE_CLAUSE = CrCompositeElementType("CR_SUPERTYPE_CLAUSE", ::CrSupertypeClause)
val CR_THEN_CLAUSE = CrCompositeElementType("CR_THEN_CLAUSE", ::CrThenClause)
val CR_TYPE_ARGUMENT_LIST = CrCompositeElementType("CR_TYPE_ARGUMENT_LIST", ::CrTypeArgumentList)
val CR_TYPE_PARAMETER_LIST = CrCompositeElementType("CR_TYPE_PARAMETER_LIST", ::CrTypeParameterList)
val CR_UNICODE_BLOCK = CrCompositeElementType("CR_UNICODE_BLOCK", ::CrUnicodeBlock)
val CR_WHEN_CLAUSE = CrCompositeElementType("CR_WHEN_CLAUSE", ::CrWhenClause)

// Type sets

val CR_STRING_LITERALS = TokenSet.create(
    CR_STRING_LITERAL_EXPRESSION,
    CR_CONCATENATED_STRING_LITERAL_EXPRESSION
)