// Generated from D:/IdeaProjects/Crone/src/main/kotlin/pelican\PelicanParser.g4 by ANTLR 4.9
package pelican;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PelicanParser}.
 */
public interface PelicanParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PelicanParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(PelicanParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(PelicanParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PelicanParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PelicanParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#basic_expression}.
	 * @param ctx the parse tree
	 */
	void enterBasic_expression(PelicanParser.Basic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#basic_expression}.
	 * @param ctx the parse tree
	 */
	void exitBasic_expression(PelicanParser.Basic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(PelicanParser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(PelicanParser.Literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(PelicanParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(PelicanParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(PelicanParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(PelicanParser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(PelicanParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(PelicanParser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#invocation_expression}.
	 * @param ctx the parse tree
	 */
	void enterInvocation_expression(PelicanParser.Invocation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#invocation_expression}.
	 * @param ctx the parse tree
	 */
	void exitInvocation_expression(PelicanParser.Invocation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#indexing_expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexing_expression(PelicanParser.Indexing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#indexing_expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexing_expression(PelicanParser.Indexing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expression(PelicanParser.Prefix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expression(PelicanParser.Prefix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(PelicanParser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(PelicanParser.Sizeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#product_expression}.
	 * @param ctx the parse tree
	 */
	void enterProduct_expression(PelicanParser.Product_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#product_expression}.
	 * @param ctx the parse tree
	 */
	void exitProduct_expression(PelicanParser.Product_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#sum_expression}.
	 * @param ctx the parse tree
	 */
	void enterSum_expression(PelicanParser.Sum_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#sum_expression}.
	 * @param ctx the parse tree
	 */
	void exitSum_expression(PelicanParser.Sum_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(PelicanParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(PelicanParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#compare_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare_expression(PelicanParser.Compare_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#compare_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare_expression(PelicanParser.Compare_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(PelicanParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(PelicanParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#identity_expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentity_expression(PelicanParser.Identity_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#identity_expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentity_expression(PelicanParser.Identity_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_expression(PelicanParser.Bit_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_expression(PelicanParser.Bit_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#bit_xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_xor_expression(PelicanParser.Bit_xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#bit_xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_xor_expression(PelicanParser.Bit_xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#bit_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_or_expression(PelicanParser.Bit_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#bit_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_or_expression(PelicanParser.Bit_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(PelicanParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(PelicanParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(PelicanParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(PelicanParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void enterCoalescing_expression(PelicanParser.Coalescing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void exitCoalescing_expression(PelicanParser.Coalescing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(PelicanParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(PelicanParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(PelicanParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(PelicanParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#sequence_expression}.
	 * @param ctx the parse tree
	 */
	void enterSequence_expression(PelicanParser.Sequence_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#sequence_expression}.
	 * @param ctx the parse tree
	 */
	void exitSequence_expression(PelicanParser.Sequence_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PelicanParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PelicanParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(PelicanParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(PelicanParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PelicanParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PelicanParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#statement_seq}.
	 * @param ctx the parse tree
	 */
	void enterStatement_seq(PelicanParser.Statement_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#statement_seq}.
	 * @param ctx the parse tree
	 */
	void exitStatement_seq(PelicanParser.Statement_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PelicanParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PelicanParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#function_invocation_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_invocation_statement(PelicanParser.Function_invocation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#function_invocation_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_invocation_statement(PelicanParser.Function_invocation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(PelicanParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(PelicanParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(PelicanParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(PelicanParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#control_flow_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_flow_statement(PelicanParser.Control_flow_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#control_flow_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_flow_statement(PelicanParser.Control_flow_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(PelicanParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(PelicanParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(PelicanParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(PelicanParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(PelicanParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(PelicanParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PelicanParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PelicanParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(PelicanParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(PelicanParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(PelicanParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(PelicanParser.Switch_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(PelicanParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(PelicanParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(PelicanParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(PelicanParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(PelicanParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(PelicanParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(PelicanParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(PelicanParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(PelicanParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(PelicanParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#for_every_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_every_statement(PelicanParser.For_every_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#for_every_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_every_statement(PelicanParser.For_every_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void enterForeach_statement(PelicanParser.Foreach_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void exitForeach_statement(PelicanParser.Foreach_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PelicanParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PelicanParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#declaration_seq}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_seq(PelicanParser.Declaration_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#declaration_seq}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_seq(PelicanParser.Declaration_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PelicanParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PelicanParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(PelicanParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(PelicanParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#abstract_function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_function_declaration(PelicanParser.Abstract_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#abstract_function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_function_declaration(PelicanParser.Abstract_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(PelicanParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(PelicanParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter_list(PelicanParser.Function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter_list(PelicanParser.Function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(PelicanParser.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(PelicanParser.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#function_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter_name(PelicanParser.Function_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#function_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter_name(PelicanParser.Function_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(PelicanParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(PelicanParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(PelicanParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(PelicanParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#simple_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_var_declaration(PelicanParser.Simple_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#simple_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_var_declaration(PelicanParser.Simple_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(PelicanParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(PelicanParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#destructed_var_name}.
	 * @param ctx the parse tree
	 */
	void enterDestructed_var_name(PelicanParser.Destructed_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#destructed_var_name}.
	 * @param ctx the parse tree
	 */
	void exitDestructed_var_name(PelicanParser.Destructed_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#destructed_var_name_list}.
	 * @param ctx the parse tree
	 */
	void enterDestructed_var_name_list(PelicanParser.Destructed_var_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#destructed_var_name_list}.
	 * @param ctx the parse tree
	 */
	void exitDestructed_var_name_list(PelicanParser.Destructed_var_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#var_initializer}.
	 * @param ctx the parse tree
	 */
	void enterVar_initializer(PelicanParser.Var_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#var_initializer}.
	 * @param ctx the parse tree
	 */
	void exitVar_initializer(PelicanParser.Var_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(PelicanParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(PelicanParser.Initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#container_declaration}.
	 * @param ctx the parse tree
	 */
	void enterContainer_declaration(PelicanParser.Container_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#container_declaration}.
	 * @param ctx the parse tree
	 */
	void exitContainer_declaration(PelicanParser.Container_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#container_head}.
	 * @param ctx the parse tree
	 */
	void enterContainer_head(PelicanParser.Container_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#container_head}.
	 * @param ctx the parse tree
	 */
	void exitContainer_head(PelicanParser.Container_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#container_name}.
	 * @param ctx the parse tree
	 */
	void enterContainer_name(PelicanParser.Container_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#container_name}.
	 * @param ctx the parse tree
	 */
	void exitContainer_name(PelicanParser.Container_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#container_body}.
	 * @param ctx the parse tree
	 */
	void enterContainer_body(PelicanParser.Container_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#container_body}.
	 * @param ctx the parse tree
	 */
	void exitContainer_body(PelicanParser.Container_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#container_field_list}.
	 * @param ctx the parse tree
	 */
	void enterContainer_field_list(PelicanParser.Container_field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#container_field_list}.
	 * @param ctx the parse tree
	 */
	void exitContainer_field_list(PelicanParser.Container_field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#container_field}.
	 * @param ctx the parse tree
	 */
	void enterContainer_field(PelicanParser.Container_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#container_field}.
	 * @param ctx the parse tree
	 */
	void exitContainer_field(PelicanParser.Container_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#container_method_list}.
	 * @param ctx the parse tree
	 */
	void enterContainer_method_list(PelicanParser.Container_method_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#container_method_list}.
	 * @param ctx the parse tree
	 */
	void exitContainer_method_list(PelicanParser.Container_method_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#container_implementation}.
	 * @param ctx the parse tree
	 */
	void enterContainer_implementation(PelicanParser.Container_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#container_implementation}.
	 * @param ctx the parse tree
	 */
	void exitContainer_implementation(PelicanParser.Container_implementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(PelicanParser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(PelicanParser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_name(PelicanParser.Enum_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_name(PelicanParser.Enum_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#enum_entry_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_entry_list(PelicanParser.Enum_entry_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#enum_entry_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_entry_list(PelicanParser.Enum_entry_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#enum_entry}.
	 * @param ctx the parse tree
	 */
	void enterEnum_entry(PelicanParser.Enum_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#enum_entry}.
	 * @param ctx the parse tree
	 */
	void exitEnum_entry(PelicanParser.Enum_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration(PelicanParser.Interface_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration(PelicanParser.Interface_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#interface_method_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_method_list(PelicanParser.Interface_method_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#interface_method_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_method_list(PelicanParser.Interface_method_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void enterInterface_name(PelicanParser.Interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void exitInterface_name(PelicanParser.Interface_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(PelicanParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(PelicanParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#type_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterType_modifiers(PelicanParser.Type_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#type_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitType_modifiers(PelicanParser.Type_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PelicanParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PelicanParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#tupel_type}.
	 * @param ctx the parse tree
	 */
	void enterTupel_type(PelicanParser.Tupel_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#tupel_type}.
	 * @param ctx the parse tree
	 */
	void exitTupel_type(PelicanParser.Tupel_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#tupel_type_list}.
	 * @param ctx the parse tree
	 */
	void enterTupel_type_list(PelicanParser.Tupel_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#tupel_type_list}.
	 * @param ctx the parse tree
	 */
	void exitTupel_type_list(PelicanParser.Tupel_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#templated_type}.
	 * @param ctx the parse tree
	 */
	void enterTemplated_type(PelicanParser.Templated_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#templated_type}.
	 * @param ctx the parse tree
	 */
	void exitTemplated_type(PelicanParser.Templated_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(PelicanParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(PelicanParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#visibility_modifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibility_modifier(PelicanParser.Visibility_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#visibility_modifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibility_modifier(PelicanParser.Visibility_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#extern}.
	 * @param ctx the parse tree
	 */
	void enterExtern(PelicanParser.ExternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#extern}.
	 * @param ctx the parse tree
	 */
	void exitExtern(PelicanParser.ExternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#const_}.
	 * @param ctx the parse tree
	 */
	void enterConst_(PelicanParser.Const_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#const_}.
	 * @param ctx the parse tree
	 */
	void exitConst_(PelicanParser.Const_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#static_}.
	 * @param ctx the parse tree
	 */
	void enterStatic_(PelicanParser.Static_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#static_}.
	 * @param ctx the parse tree
	 */
	void exitStatic_(PelicanParser.Static_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#builtin_type}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_type(PelicanParser.Builtin_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#builtin_type}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_type(PelicanParser.Builtin_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#container_type}.
	 * @param ctx the parse tree
	 */
	void enterContainer_type(PelicanParser.Container_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#container_type}.
	 * @param ctx the parse tree
	 */
	void exitContainer_type(PelicanParser.Container_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(PelicanParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(PelicanParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#template_specifier}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_specifier(PelicanParser.Template_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#template_specifier}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_specifier(PelicanParser.Template_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#template_type_list}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_type_list(PelicanParser.Template_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#template_type_list}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_type_list(PelicanParser.Template_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#template_type}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_type(PelicanParser.Template_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#template_type}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_type(PelicanParser.Template_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#template_kind}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_kind(PelicanParser.Template_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#template_kind}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_kind(PelicanParser.Template_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#template_name}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_name(PelicanParser.Template_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#template_name}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_name(PelicanParser.Template_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#actual_template_types}.
	 * @param ctx the parse tree
	 */
	void enterActual_template_types(PelicanParser.Actual_template_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#actual_template_types}.
	 * @param ctx the parse tree
	 */
	void exitActual_template_types(PelicanParser.Actual_template_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PelicanParser#actual_template_type_list}.
	 * @param ctx the parse tree
	 */
	void enterActual_template_type_list(PelicanParser.Actual_template_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PelicanParser#actual_template_type_list}.
	 * @param ctx the parse tree
	 */
	void exitActual_template_type_list(PelicanParser.Actual_template_type_listContext ctx);
}