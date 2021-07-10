package org.crystal.intellij.parser

import com.intellij.lang.ASTNode
import com.intellij.psi.tree.IElementType
import org.crystal.intellij.CrystalLanguage
import org.crystal.intellij.psi.*

class CrCompositeElementType(
    debugName: String,
    val factory: (ASTNode) -> CrElement
) : IElementType(debugName, CrystalLanguage)

// Definitions
@JvmField val CR_ALIAS_DEFINITION = CrCompositeElementType("CR_ALIAS_DEFINITION", ::CrAlias)
@JvmField val CR_ANNOTATION_DEFINITION = CrCompositeElementType("CR_ANNOTATION_DEFINITION", ::CrAnnotation)
@JvmField val CR_CLASS_DEFINITION = CrCompositeElementType("CR_CLASS_DEFINITION", ::CrClass)
@JvmField val CR_C_FIELD_DEFINITION = CrCompositeElementType("CR_C_FIELD_DEFINITION", ::CrCField)
@JvmField val CR_C_STRUCT_DEFINITION = CrCompositeElementType("CR_C_STRUCT_DEFINITION", ::CrCStruct)
@JvmField val CR_C_UNION_DEFINITION = CrCompositeElementType("CR_C_UNION_DEFINITION", ::CrCUnion)
@JvmField val CR_ENUM_DEFINITION = CrCompositeElementType("CR_ENUM_DEFINITION", ::CrEnum)
@JvmField val CR_ENUM_CONSTANT_DEFINITION = CrCompositeElementType("CR_ENUM_CONSTANT_DEFINITION", ::CrEnumConstant)
@JvmField val CR_FUNCTION_DEFINITION = CrCompositeElementType("CR_FUNCTION_DEFINITION", ::CrFunction)
@JvmField val CR_LIBRARY_DEFINITION = CrCompositeElementType("CR_LIBRARY_DEFINITION", ::CrLibrary)
@JvmField val CR_METHOD_DEFINITION = CrCompositeElementType("CR_METHOD_DEFINITION", ::CrMethod)
@JvmField val CR_MODULE_DEFINITION = CrCompositeElementType("CR_MODULE_DEFINITION", ::CrModule)
@JvmField val CR_MULTI_PARAMETER_DEFINITION = CrCompositeElementType("CR_MULTI_PARAMETER_DEFINITION", ::CrMultiParameter)
@JvmField val CR_SIMPLE_PARAMETER_DEFINITION = CrCompositeElementType("CR_SIMPLE_PARAMETER_DEFINITION", ::CrSimpleParameter)
@JvmField val CR_STRUCT_DEFINITION = CrCompositeElementType("CR_STRUCT_DEFINITION", ::CrStruct)
@JvmField val CR_TYPE_DEFINITION = CrCompositeElementType("CR_TYPE_DEFINITION", ::CrTypeDef)
@JvmField val CR_TYPE_PARAMETER_DEFINITION = CrCompositeElementType("CR_TYPE_PARAMETER_DEFINITION", ::CrTypeParameter)
@JvmField val CR_VARIABLE_DEFINITION = CrCompositeElementType("CR_VARIABLE_DECLARATION", ::CrVariable)
@JvmField val CR_VARIADIC_PARAMETER_DEFINITION = CrCompositeElementType("CR_VARIADIC_PARAMETER_DEFINITION", ::CrVariadicParameter)

// Expressions
@JvmField val CR_ANNOTATION_EXPRESSION = CrCompositeElementType("CR_ANNOTATION_EXPRESSION", ::CrAnnotationExpression)
@JvmField val CR_ARRAY_LITERAL_EXPRESSION = CrCompositeElementType("CR_ARRAY_LITERAL_EXPRESSION", ::CrArrayLiteralExpression)
@JvmField val CR_AS_EXPRESSION = CrCompositeElementType("CR_AS_EXPRESSION", ::CrAsExpression)
@JvmField val CR_ASSIGNMENT_EXPRESSION = CrCompositeElementType("CR_ASSIGNMENT_EXPRESSION", ::CrAssignmentExpression)
@JvmField val CR_BINARY_EXPRESSION = CrCompositeElementType("CR_BINARY_EXPRESSION", ::CrBinaryExpression)
@JvmField val CR_BLOCK_EXPRESSION = CrCompositeElementType("CR_BLOCK_EXPRESSION", ::CrBlockExpression)
@JvmField val CR_BOOLEAN_LITERAL_EXPRESSION = CrCompositeElementType("CR_BOOLEAN_LITERAL_EXPRESSION", ::CrBooleanLiteralExpression)
@JvmField val CR_BREAK_EXPRESSION = CrCompositeElementType("CR_BREAK_EXPRESSION", ::CrBreakExpression)
@JvmField val CR_CALL_EXPRESSION = CrCompositeElementType("CR_CALL_EXPRESSION", ::CrCallExpression)
@JvmField val CR_CASE_EXPRESSION = CrCompositeElementType("CR_CASE_EXPRESSION", ::CrCaseExpression)
@JvmField val CR_CHAR_LITERAL_EXPRESSION = CrCompositeElementType("CR_CHAR_LITERAL_EXPRESSION", ::CrCharLiteralExpression)
@JvmField val CR_COMMAND_EXPRESSION = CrCompositeElementType("CR_COMMAND_EXPRESSION", ::CrCommandExpression)
@JvmField val CR_CONCATENATED_STRING_LITERAL_EXPRESSION = CrCompositeElementType("CR_CONCATENATED_STRING_LITERAL_EXPRESSION", ::CrConcatenatedStringLiteralExpression)
@JvmField val CR_CONDITIONAL_EXPRESSION = CrCompositeElementType("CR_CONDITIONAL_EXPRESSION", ::CrConditionalExpression)
@JvmField val CR_DOUBLE_SPLAT_EXPRESSION = CrCompositeElementType("CR_DOUBLE_SPLAT_EXPRESSION", ::CrDoubleSplatExpression)
@JvmField val CR_ENSURE_EXPRESSION = CrCompositeElementType("CR_ENSURE_EXPRESSION", ::CrEnsureExpression)
@JvmField val CR_EXTEND_EXPRESSION = CrCompositeElementType("CR_EXTEND_EXPRESSION", ::CrExtendExpression)
@JvmField val CR_FLOAT_LITERAL_EXPRESSION = CrCompositeElementType("CR_FLOAT_LITERAL_EXPRESSION", ::CrFloatLiteralExpression)
@JvmField val CR_FUNCTION_LITERAL_EXPRESSION = CrCompositeElementType("CR_FUNCTION_LITERAL_EXPRESSION", ::CrFunctionLiteralExpression)
@JvmField val CR_FUNCTION_POINTER_EXPRESSION = CrCompositeElementType("CR_FUNCTION_POINTER_EXPRESSION", ::CrFunctionPointerExpression)
@JvmField val CR_HASH_EXPRESSION = CrCompositeElementType("CR_HASH_EXPRESSION", ::CrHashExpression)
@JvmField val CR_HEREDOC_EXPRESSION = CrCompositeElementType("CR_HEREDOC_EXPRESSION", ::CrHeredocExpression)
@JvmField val CR_IF_EXPRESSION = CrCompositeElementType("CR_IF_EXPRESSION", ::CrIfExpression)
@JvmField val CR_INDEXED_EXPRESSION = CrCompositeElementType("CR_INDEXED_EXPRESSION", ::CrIndexedExpression)
@JvmField val CR_INDEXED_LHS_EXPRESSION = CrCompositeElementType("CR_INDEXED_LHS_EXPRESSION", ::CrIndexedLHSExpression)
@JvmField val CR_INCLUDE_EXPRESSION = CrCompositeElementType("CR_INCLUDE_EXPRESSION", ::CrIncludeExpression)
@JvmField val CR_INSTANCE_SIZE_EXPRESSION = CrCompositeElementType("CR_INSTANCE_SIZE_EXPRESSION", ::CrInstanceSizeExpression)
@JvmField val CR_INTEGER_LITERAL_EXPRESSION = CrCompositeElementType("CR_INTEGER_LITERAL_EXPRESSION", ::CrIntegerLiteralExpression)
@JvmField val CR_IS_EXPRESSION = CrCompositeElementType("CR_IS_EXPRESSION", ::CrIsExpression)
@JvmField val CR_IS_NIL_EXPRESSION = CrCompositeElementType("CR_IS_NIL_EXPRESSION", ::CrIsNilExpression)
@JvmField val CR_LIST_EXPRESSION = CrCompositeElementType("CR_LIST_EXPRESSION", ::CrListExpression)
@JvmField val CR_NAMED_ARGUMENT_EXPRESSION = CrCompositeElementType("CR_NAMED_ARGUMENT_EXPRESSION", ::CrNamedArgumentExpression)
@JvmField val CR_NAMED_TUPLE_EXPRESSION = CrCompositeElementType("CR_NAMED_TUPLE_EXPRESSION", ::CrNamedTupleExpression)
@JvmField val CR_NEXT_EXPRESSION = CrCompositeElementType("CR_NEXT_EXPRESSION", ::CrNextExpression)
@JvmField val CR_NIL_EXPRESSION = CrCompositeElementType("CR_NIL_EXPRESSION", ::CrNilExpression)
@JvmField val CR_NILABLE_EXPRESSION = CrCompositeElementType("CR_NILABLE_EXPRESSION", ::CrNilableExpression)
@JvmField val CR_OFFSET_EXPRESSION = CrCompositeElementType("CR_OFFSETOF_EXPRESSION", ::CrOffsetExpression)
@JvmField val CR_OUT_ARGUMENT_EXPRESSION = CrCompositeElementType("CR_OUT_ARGUMENT_EXPRESSION", ::CrOutArgumentExpression)
@JvmField val CR_PARENTHESIZED_EXPRESSION = CrCompositeElementType("CR_PARENTHESIZED_EXPRESSION", ::CrParenthesizedExpression)
@JvmField val CR_PATH_EXPRESSION = CrCompositeElementType("CR_PATH_EXPRESSION", ::CrPathExpression)
@JvmField val CR_POINTER_EXPRESSION = CrCompositeElementType("CR_POINTER_EXPRESSION", ::CrPointerExpression)
@JvmField val CR_PSEUDO_CONSTANT_EXPRESSION = CrCompositeElementType("CR_PSEUDO_CONSTANT_EXPRESSION", ::CrPseudoConstantExpression)
@JvmField val CR_RANGE_EXPRESSION = CrCompositeElementType("CR_RANGE_EXPRESSION", ::CrRangeExpression)
@JvmField val CR_REFERENCE_EXPRESSION = CrCompositeElementType("CR_REFERENCE_EXPRESSION", ::CrReferenceExpression)
@JvmField val CR_REGEX_EXPRESSION = CrCompositeElementType("CR_REGEX_EXPRESSION", ::CrRegexExpression)
@JvmField val CR_REQUIRE_EXPRESSION = CrCompositeElementType("CR_REQUIRE_EXPRESSION", ::CrRequireExpression)
@JvmField val CR_RESPONDS_TO_EXPRESSION = CrCompositeElementType("CR_RESPONDS_TO_EXPRESSION", ::CrRespondsToExpression)
@JvmField val CR_RESCUE_EXPRESSION = CrCompositeElementType("CR_RESCUE_EXPRESSION", ::CrRescueExpression)
@JvmField val CR_RETURN_EXPRESSION = CrCompositeElementType("CR_RETURN_EXPRESSION", ::CrReturnExpression)
@JvmField val CR_SELECT_EXPRESSION = CrCompositeElementType("CR_SELECT_EXPRESSION", ::CrSelectExpression)
@JvmField val CR_SELF_EXPRESSION = CrCompositeElementType("CR_SELF_EXPRESSION", ::CrSelfExpression)
@JvmField val CR_SHORT_BLOCK_EXPRESSION = CrCompositeElementType("CR_SHORT_BLOCK_EXPRESSION", ::CrShortBlockExpression)
@JvmField val CR_SIZE_EXPRESSION = CrCompositeElementType("CR_SIZE_EXPRESSION", ::CrSizeExpression)
@JvmField val CR_SPLAT_EXPRESSION = CrCompositeElementType("CR_SPLAT_EXPRESSION", ::CrSplatExpression)
@JvmField val CR_STRING_ARRAY_EXPRESSION = CrCompositeElementType("CR_STRING_ARRAY_EXPRESSION", ::CrStringArrayExpression)
@JvmField val CR_STRING_LITERAL_EXPRESSION = CrCompositeElementType("CR_STRING_LITERAL_EXPRESSION", ::CrStringLiteralExpression)
@JvmField val CR_SYMBOL_ARRAY_EXPRESSION = CrCompositeElementType("CR_SYMBOL_ARRAY_EXPRESSION", ::CrSymbolArrayExpression)
@JvmField val CR_SYMBOL_EXPRESSION = CrCompositeElementType("CR_SYMBOL_EXPRESSION", ::CrSymbolExpression)
@JvmField val CR_TUPLE_EXPRESSION = CrCompositeElementType("CR_TUPLE_EXPRESSION", ::CrTupleExpression)
@JvmField val CR_TYPE_EXPRESSION = CrCompositeElementType("CR_TYPE_EXPRESSION", ::CrTypeExpression)
@JvmField val CR_UNARY_EXPRESSION = CrCompositeElementType("CR_UNARY_EXPRESSION", ::CrUnaryExpression)
@JvmField val CR_UNINITIALIZED_EXPRESSION = CrCompositeElementType("CR_UNINITIALIZED_EXPRESSION", ::CrUninitializedExpression)
@JvmField val CR_UNLESS_EXPRESSION = CrCompositeElementType("CR_UNLESS_EXPRESSION", ::CrUnlessExpression)
@JvmField val CR_UNTIL_EXPRESSION = CrCompositeElementType("CR_UNTIL_EXPRESSION", ::CrUntilExpression)
@JvmField val CR_VISIBILITY_EXPRESSION = CrCompositeElementType("CR_VISIBILITY_EXPRESSION", ::CrVisibilityExpression)
@JvmField val CR_WHILE_EXPRESSION = CrCompositeElementType("CR_WHILE_EXPRESSION", ::CrWhileExpression)
@JvmField val CR_WITH_EXPRESSION = CrCompositeElementType("CR_WITH_EXPRESSION", ::CrWithExpression)
@JvmField val CR_YIELD_EXPRESSION = CrCompositeElementType("CR_YIELD_EXPRESSION", ::CrYieldExpression)

// Type elements
@JvmField val CR_DOUBLE_SPLAT_TYPE = CrCompositeElementType("CR_DOUBLE_SPLAT_TYPE", ::CrDoubleSplatType)
@JvmField val CR_EXPRESSION_TYPE = CrCompositeElementType("CR_EXPRESSION_TYPE", ::CrExpressionType)
@JvmField val CR_HASH_TYPE = CrCompositeElementType("CR_HASH_TYPE", ::CrHashType)
@JvmField val CR_INSTANTIATED_TYPE = CrCompositeElementType("CR_INSTANTIATED_TYPE", ::CrInstantiatedType)
@JvmField val CR_LABELED_TYPE = CrCompositeElementType("CR_LABELED_TYPE", ::CrLabeledType)
@JvmField val CR_METACLASS_TYPE = CrCompositeElementType("CR_METACLASS_TYPE", ::CrMetaclassType)
@JvmField val CR_NAMED_TUPLE_TYPE = CrCompositeElementType("CR_NAMED_TUPLE_TYPE", ::CrNamedTupleType)
@JvmField val CR_NILABLE_TYPE = CrCompositeElementType("CR_NILABLE_TYPE", ::CrNilableType)
@JvmField val CR_PARENTHESIZED_TYPE = CrCompositeElementType("CR_PARENTHESIZED_TYPE", ::CrParenthesizedType)
@JvmField val CR_PATH_TYPE = CrCompositeElementType("CR_PATH_TYPE", ::CrPathType)
@JvmField val CR_POINTER_TYPE = CrCompositeElementType("CR_POINTER_TYPE", ::CrPointerType)
@JvmField val CR_PROC_TYPE = CrCompositeElementType("CR_PROC_TYPE", ::CrProcType)
@JvmField val CR_SELF_TYPE = CrCompositeElementType("CR_SELF_TYPE", ::CrSelfType)
@JvmField val CR_SPLAT_TYPE = CrCompositeElementType("CR_SPLAT_TYPE", ::CrSplatType)
@JvmField val CR_STATIC_ARRAY_TYPE = CrCompositeElementType("CR_STATIC_ARRAY_TYPE", ::CrStaticArrayType)
@JvmField val CR_TUPLE_TYPE = CrCompositeElementType("CR_TUPLE_TYPE", ::CrTupleType)
@JvmField val CR_UNDERSCORE_TYPE = CrCompositeElementType("CR_UNDERSCORE_TYPE", ::CrUnderscoreType)
@JvmField val CR_UNION_TYPE = CrCompositeElementType("CR_UNION_TYPE", ::CrUnionType)

// Miscellaneous
@JvmField val CR_BODY = CrCompositeElementType("CR_BODY", ::CrBody)
@JvmField val CR_C_FIELD_GROUP = CrCompositeElementType("CR_C_FIELD_GROUP", ::CrCFieldGroup)
@JvmField val CR_ELSE_CLAUSE = CrCompositeElementType("CR_ELSE_CLAUSE", ::CrElseClause)
@JvmField val CR_ENSURE_CLAUSE = CrCompositeElementType("CR_ENSURE_CLAUSE", ::CrEnsureClause)
@JvmField val CR_EXCEPTION_HANDLER = CrCompositeElementType("CR_EXCEPTION_HANDLER", ::CrExceptionHandler)
@JvmField val CR_HASH_ENTRY = CrCompositeElementType("CR_HASH_ENTRY", ::CrHashEntry)
@JvmField val CR_HEREDOC_LITERAL_BODY = CrCompositeElementType("CR_HEREDOC_LITERAL_BODY", ::CrHeredocLiteralBody)
@JvmField val CR_NAME_ELEMENT = CrCompositeElementType("CR_NAME_ELEMENT", ::CrNameElement)
@JvmField val CR_NAMED_TUPLE_ENTRY = CrCompositeElementType("CR_NAMED_TUPLE_ENTRY", ::CrNamedTupleEntry)
@JvmField val CR_PARAMETER_LIST = CrCompositeElementType("CR_PARAMETER_LIST", ::CrParameterList)
@JvmField val CR_PARENTHESIZED_ARGUMENT_LIST = CrCompositeElementType("CR_PARENTHESIZED_ARGUMENT_LIST", ::CrArgumentList)
@JvmField val CR_PATH = CrCompositeElementType("CR_PATH", ::CrPath)
@JvmField val CR_RESCUE_CLAUSE = CrCompositeElementType("CR_RESCUE_CLAUSE", ::CrRescueClause)
@JvmField val CR_SPACED_ARGUMENT_LIST = CrCompositeElementType("CR_SPACED_ARGUMENT_LIST", ::CrArgumentList)
@JvmField val CR_STRING_INTERPOLATION = CrCompositeElementType("CR_STRING_INTERPOLATION", ::CrStringInterpolation)
@JvmField val CR_SUPERTYPE_CLAUSE = CrCompositeElementType("CR_SUPERTYPE_CLAUSE", ::CrSupertypeClause)
@JvmField val CR_THEN_CLAUSE = CrCompositeElementType("CR_THEN_CLAUSE", ::CrThenClause)
@JvmField val CR_TYPE_ARGUMENT_LIST = CrCompositeElementType("CR_TYPE_ARGUMENT_LIST", ::CrTypeArgumentList)
@JvmField val CR_TYPE_PARAMETER_LIST = CrCompositeElementType("CR_TYPE_PARAMETER_LIST", ::CrTypeParameterList)
@JvmField val CR_UNICODE_BLOCK = CrCompositeElementType("CR_UNICODE_BLOCK", ::CrUnicodeBlock)
@JvmField val CR_WHEN_CLAUSE = CrCompositeElementType("CR_WHEN_CLAUSE", ::CrWhenClause)