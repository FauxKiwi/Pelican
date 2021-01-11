// Generated from D:/IdeaProjects/Crone/src/main/kotlin/pelican\PelicanParser.g4 by ANTLR 4.9
package pelican;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PelicanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PelicanParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PelicanParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(PelicanParser.Translation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PelicanParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#basic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_expression(PelicanParser.Basic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#literal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expression(PelicanParser.Literal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(PelicanParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#lambda_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(PelicanParser.Lambda_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(PelicanParser.Postfix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#invocation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation_expression(PelicanParser.Invocation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#indexing_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexing_expression(PelicanParser.Indexing_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#prefix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expression(PelicanParser.Prefix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#sizeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_expression(PelicanParser.Sizeof_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#product_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct_expression(PelicanParser.Product_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#sum_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_expression(PelicanParser.Sum_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(PelicanParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#compare_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_expression(PelicanParser.Compare_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(PelicanParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#identity_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentity_expression(PelicanParser.Identity_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#bit_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_and_expression(PelicanParser.Bit_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#bit_xor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_xor_expression(PelicanParser.Bit_xor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#bit_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_or_expression(PelicanParser.Bit_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(PelicanParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(PelicanParser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#coalescing_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoalescing_expression(PelicanParser.Coalescing_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(PelicanParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(PelicanParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#sequence_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_expression(PelicanParser.Sequence_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PelicanParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(PelicanParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PelicanParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#statement_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_seq(PelicanParser.Statement_seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PelicanParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#function_invocation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_invocation_statement(PelicanParser.Function_invocation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(PelicanParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(PelicanParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#control_flow_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_flow_statement(PelicanParser.Control_flow_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(PelicanParser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(PelicanParser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(PelicanParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PelicanParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(PelicanParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#switch_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_body(PelicanParser.Switch_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(PelicanParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(PelicanParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(PelicanParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(PelicanParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(PelicanParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#for_every_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_every_statement(PelicanParser.For_every_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#foreach_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_statement(PelicanParser.Foreach_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PelicanParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#declaration_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_seq(PelicanParser.Declaration_seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PelicanParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(PelicanParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#abstract_function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_function_declaration(PelicanParser.Abstract_function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(PelicanParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#function_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter_list(PelicanParser.Function_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter(PelicanParser.Function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#function_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter_name(PelicanParser.Function_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(PelicanParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(PelicanParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#simple_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_var_declaration(PelicanParser.Simple_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(PelicanParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#destructed_var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructed_var_name(PelicanParser.Destructed_var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#destructed_var_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructed_var_name_list(PelicanParser.Destructed_var_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#var_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_initializer(PelicanParser.Var_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_list(PelicanParser.Initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#container_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_declaration(PelicanParser.Container_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#container_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_head(PelicanParser.Container_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#container_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_name(PelicanParser.Container_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#container_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_body(PelicanParser.Container_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#container_field_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_field_list(PelicanParser.Container_field_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#container_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_field(PelicanParser.Container_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#container_method_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_method_list(PelicanParser.Container_method_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#container_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_implementation(PelicanParser.Container_implementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(PelicanParser.Enum_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#enum_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_name(PelicanParser.Enum_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#enum_entry_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_entry_list(PelicanParser.Enum_entry_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#enum_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_entry(PelicanParser.Enum_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#interface_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration(PelicanParser.Interface_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#interface_method_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_method_list(PelicanParser.Interface_method_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#interface_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_name(PelicanParser.Interface_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(PelicanParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#type_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_modifiers(PelicanParser.Type_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PelicanParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#tupel_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupel_type(PelicanParser.Tupel_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#tupel_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupel_type_list(PelicanParser.Tupel_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#templated_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplated_type(PelicanParser.Templated_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(PelicanParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#visibility_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility_modifier(PelicanParser.Visibility_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#extern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern(PelicanParser.ExternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#const_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_(PelicanParser.Const_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#static_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_(PelicanParser.Static_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#builtin_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltin_type(PelicanParser.Builtin_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#container_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_type(PelicanParser.Container_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(PelicanParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#template_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_specifier(PelicanParser.Template_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#template_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_type_list(PelicanParser.Template_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#template_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_type(PelicanParser.Template_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#template_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_kind(PelicanParser.Template_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#template_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_name(PelicanParser.Template_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#actual_template_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_template_types(PelicanParser.Actual_template_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PelicanParser#actual_template_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_template_type_list(PelicanParser.Actual_template_type_listContext ctx);
}