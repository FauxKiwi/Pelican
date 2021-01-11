package pelican

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.TerminalNode

class PelicanTranspiler : PelicanParserListener {
    private val output = StringBuilder()
    private var indent = 0

    private fun appendIndent() { repeat(if (currentOutput) mainFileIndent else indent) {
        if (currentOutput) mainFileOutput.append('\t') else output.append('\t') }
    }
    private fun append(string: String) { if (currentOutput) mainFileOutput.append(string) else output.append(string) }
    private fun nl() { if (currentOutput) mainFileOutput.append("\r\n") else output.append("\r\n") }

    private val mainFileOutput = StringBuilder()
    private var mainFileIndent = 0

    private var currentOutput = false

    private fun switchOutput(mainFile: Boolean) {
        currentOutput = mainFile
    }


    private val staticStack = ScopeStack(null)
    private var localStack: ScopeStack = staticStack

    private fun pushStack() { localStack = ScopeStack(localStack) }
    private fun popStack() {
        localStack.variables.forEach {
            nl()
            appendIndent()
            append(it)
            append(".destructorCall()")
        }
        nl()
        appendIndent()
        append("MemoryStack.dealloc(${localStack.stackSize})")
        nl()

        localStack = localStack.parent ?: staticStack
    }


    override fun visitTerminal(p0: TerminalNode?) {
        if (p0 == null) return

        val text = switchSymbolType(p0)

        append(text ?: "\$\$\$error\$\$\$")
    }

    private fun switchSymbolType(p0: TerminalNode?): String? {
        return when (p0?.symbol?.type) {
            PelicanLexer.INT -> "Int"
            PelicanLexer.INTERNAL -> "internal"
            PelicanLexer.PRIVATE -> "private"
            PelicanLexer.PROTECTED -> "protected"
            PelicanLexer.PUBLIC -> "public"
            PelicanLexer.TYPENAME -> ""
            PelicanLexer.VARARG -> "vararg"
            PelicanLexer.VOID -> "Unit"

            PelicanLexer.ID -> p0.text

            PelicanLexer.INTEGER_LITERAL -> p0.text

            PelicanLexer.LT -> "<"
            PelicanLexer.GT -> ">"
            PelicanLexer.COMMA -> ","

            PelicanLexer.AMP -> "and"
            PelicanLexer.ASSIGN -> "="

            else -> null
        }
    }

    override fun visitErrorNode(p0: ErrorNode?) {
        TODO("Not yet implemented")
    }

    override fun enterEveryRule(p0: ParserRuleContext?) {
        TODO("Not yet implemented")
    }

    override fun exitEveryRule(p0: ParserRuleContext?) {
        TODO("Not yet implemented")
    }

    override fun enterTranslation_unit(ctx: PelicanParser.Translation_unitContext?) {
        if (ctx == null) return
        println(" ############################### Start ############################### ")

        enterDeclaration_seq(ctx.declaration_seq())

        exitTranslation_unit(ctx)
    }

    override fun exitTranslation_unit(ctx: PelicanParser.Translation_unitContext?) {
        println(" ############################### End ############################### ")
        println()
        println(output.toString())
        println()
        println(mainFileOutput.toString())
    }

    override fun enterExpression(ctx: PelicanParser.ExpressionContext?) {
        if (ctx == null) return

        ctx.basic_expression()?.let { enterBasic_expression(it) }
        ctx.assignment_expression()?.let { enterAssignment_expression(it) }
        ctx.invocation_expression()?.let { enterInvocation_expression(it) }
        ctx.sequence_expression()?.let { enterSequence_expression(it) }

        exitExpression(ctx)
    }

    override fun exitExpression(ctx: PelicanParser.ExpressionContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterBasic_expression(ctx: PelicanParser.Basic_expressionContext?) {
        if (ctx == null) return

        ctx.expression()?.let {
            visitTerminal(ctx.OPEN_PAREN())
            enterExpression(it)
            visitTerminal(ctx.CLOSE_PAREN())
        }
        ctx.literal_expression()?.let { enterLiteral_expression(it) }
        ctx.lambda_expression()?.let { enterLambda_expression(it) }
        ctx.variable()?.let { enterVariable(it) }
        ctx.THIS()?.let { visitTerminal(it) }

        exitBasic_expression(ctx)
    }

    override fun exitBasic_expression(ctx: PelicanParser.Basic_expressionContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterLiteral_expression(ctx: PelicanParser.Literal_expressionContext?) {
        if (ctx == null) return

        ctx.integer_literal()?.let { enterInteger_literal(it) }
        ctx.REAL_LITERAL()?.let { visitTerminal(it) }
        ctx.CHARACTER_LITERAL()?.let { visitTerminal(it) }
        ctx.REGULAR_STRING()?.let { visitTerminal(it) }
        ctx.TRUE_()?.let { visitTerminal(it) }
        ctx.FALSE_()?.let { visitTerminal(it) }
        ctx.NULL()?.let { visitTerminal(it) }

        exitLiteral_expression(ctx)
    }

    override fun exitLiteral_expression(ctx: PelicanParser.Literal_expressionContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterInteger_literal(ctx: PelicanParser.Integer_literalContext?) {
        if (ctx == null) return

        visitTerminal(ctx.INTEGER_LITERAL())
        visitTerminal(ctx.HEX_INTEGER_LITERAL())
        visitTerminal(ctx.BIN_INTEGER_LITERAL())

        exitInteger_literal(ctx)
    }

    override fun exitInteger_literal(ctx: PelicanParser.Integer_literalContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterLambda_expression(ctx: PelicanParser.Lambda_expressionContext?) {
        if (ctx == null) return

        ctx.label_name()?.let { enterLabel_name(it) }
        append("{ ")
        ctx.destructed_var_name()?.let {
            enterDestructed_var_name_list(it.destructed_var_name_list())
            append(" ->")
        }
        nl()
        ++indent
        enterStatement(ctx.statement())
        --indent
        appendIndent()
        append("}")

        exitLambda_expression(ctx)
    }

    override fun exitLambda_expression(ctx: PelicanParser.Lambda_expressionContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterPostfix_expression(ctx: PelicanParser.Postfix_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitPostfix_expression(ctx: PelicanParser.Postfix_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterInvocation_expression(ctx: PelicanParser.Invocation_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitInvocation_expression(ctx: PelicanParser.Invocation_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterIndexing_expression(ctx: PelicanParser.Indexing_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitIndexing_expression(ctx: PelicanParser.Indexing_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterPrefix_expression(ctx: PelicanParser.Prefix_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitPrefix_expression(ctx: PelicanParser.Prefix_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterSizeof_expression(ctx: PelicanParser.Sizeof_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitSizeof_expression(ctx: PelicanParser.Sizeof_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterProduct_expression(ctx: PelicanParser.Product_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitProduct_expression(ctx: PelicanParser.Product_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterSum_expression(ctx: PelicanParser.Sum_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitSum_expression(ctx: PelicanParser.Sum_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterShift_expression(ctx: PelicanParser.Shift_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitShift_expression(ctx: PelicanParser.Shift_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterCompare_expression(ctx: PelicanParser.Compare_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitCompare_expression(ctx: PelicanParser.Compare_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterEquality_expression(ctx: PelicanParser.Equality_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitEquality_expression(ctx: PelicanParser.Equality_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterIdentity_expression(ctx: PelicanParser.Identity_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitIdentity_expression(ctx: PelicanParser.Identity_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterBit_and_expression(ctx: PelicanParser.Bit_and_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitBit_and_expression(ctx: PelicanParser.Bit_and_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterBit_xor_expression(ctx: PelicanParser.Bit_xor_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitBit_xor_expression(ctx: PelicanParser.Bit_xor_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterBit_or_expression(ctx: PelicanParser.Bit_or_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitBit_or_expression(ctx: PelicanParser.Bit_or_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterLogical_and_expression(ctx: PelicanParser.Logical_and_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitLogical_and_expression(ctx: PelicanParser.Logical_and_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterLogical_or_expression(ctx: PelicanParser.Logical_or_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitLogical_or_expression(ctx: PelicanParser.Logical_or_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterCoalescing_expression(ctx: PelicanParser.Coalescing_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitCoalescing_expression(ctx: PelicanParser.Coalescing_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterAssignment_expression(ctx: PelicanParser.Assignment_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitAssignment_expression(ctx: PelicanParser.Assignment_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterConditional_expression(ctx: PelicanParser.Conditional_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitConditional_expression(ctx: PelicanParser.Conditional_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterSequence_expression(ctx: PelicanParser.Sequence_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitSequence_expression(ctx: PelicanParser.Sequence_expressionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterVariable(ctx: PelicanParser.VariableContext?) {
        if (ctx == null) return

        visitTerminal(ctx.ID())

        exitVariable(ctx)
    }

    override fun exitVariable(ctx: PelicanParser.VariableContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterArg_list(ctx: PelicanParser.Arg_listContext?) {
        TODO("Not yet implemented")
    }

    override fun exitArg_list(ctx: PelicanParser.Arg_listContext?) {
        TODO("Not yet implemented")
    }

    override fun enterArgument(ctx: PelicanParser.ArgumentContext?) {
        TODO("Not yet implemented")
    }

    override fun exitArgument(ctx: PelicanParser.ArgumentContext?) {
        TODO("Not yet implemented")
    }

    override fun enterStatement_seq(ctx: PelicanParser.Statement_seqContext?) {
        if (ctx == null) return

        ctx.statement()?.forEach { enterStatement(it) }

        exitStatement_seq(ctx)
    }

    override fun exitStatement_seq(ctx: PelicanParser.Statement_seqContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterStatement(ctx: PelicanParser.StatementContext?) {
        if (ctx == null) return

        appendIndent()
        enterFunction_invocation_statement(ctx.function_invocation_statement())
        enterExpression_statement(ctx.expression_statement())
        enterDeclaration(ctx.declaration())
        nl()

        exitStatement(ctx)
    }

    override fun exitStatement(ctx: PelicanParser.StatementContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterFunction_invocation_statement(ctx: PelicanParser.Function_invocation_statementContext?) {
        if (ctx == null) return

        if (ctx.function_name()?.name?.text?.equals("println") == true) {
            println(ctx.arg_list()?.argument()?.expression()?.basic_expression()?.literal_expression()?.REGULAR_STRING()?.symbol?.text?.let {
                it.substring(1, it.length - 1)
            })
        }

        exitFunction_invocation_statement(ctx)
    }

    override fun exitFunction_invocation_statement(ctx: PelicanParser.Function_invocation_statementContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterExpression_statement(ctx: PelicanParser.Expression_statementContext?) {
        if (ctx == null) return

        enterExpression(ctx.expression())

        exitExpression_statement(ctx)
    }

    override fun exitExpression_statement(ctx: PelicanParser.Expression_statementContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterCompound_statement(ctx: PelicanParser.Compound_statementContext?) {
        enterStatement_seq(ctx?.statement_seq())
    }

    override fun exitCompound_statement(ctx: PelicanParser.Compound_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterControl_flow_statement(ctx: PelicanParser.Control_flow_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitControl_flow_statement(ctx: PelicanParser.Control_flow_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterLabeled_statement(ctx: PelicanParser.Labeled_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitLabeled_statement(ctx: PelicanParser.Labeled_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterLabel_name(ctx: PelicanParser.Label_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun exitLabel_name(ctx: PelicanParser.Label_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun enterConditional_statement(ctx: PelicanParser.Conditional_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitConditional_statement(ctx: PelicanParser.Conditional_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterIf_statement(ctx: PelicanParser.If_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitIf_statement(ctx: PelicanParser.If_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterSwitch_statement(ctx: PelicanParser.Switch_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitSwitch_statement(ctx: PelicanParser.Switch_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterSwitch_body(ctx: PelicanParser.Switch_bodyContext?) {
        TODO("Not yet implemented")
    }

    override fun exitSwitch_body(ctx: PelicanParser.Switch_bodyContext?) {
        TODO("Not yet implemented")
    }

    override fun enterSwitch_case(ctx: PelicanParser.Switch_caseContext?) {
        TODO("Not yet implemented")
    }

    override fun exitSwitch_case(ctx: PelicanParser.Switch_caseContext?) {
        TODO("Not yet implemented")
    }

    override fun enterLoop_statement(ctx: PelicanParser.Loop_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitLoop_statement(ctx: PelicanParser.Loop_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterWhile_statement(ctx: PelicanParser.While_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitWhile_statement(ctx: PelicanParser.While_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterDo_while_statement(ctx: PelicanParser.Do_while_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitDo_while_statement(ctx: PelicanParser.Do_while_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterFor_statement(ctx: PelicanParser.For_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitFor_statement(ctx: PelicanParser.For_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterFor_every_statement(ctx: PelicanParser.For_every_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitFor_every_statement(ctx: PelicanParser.For_every_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterForeach_statement(ctx: PelicanParser.Foreach_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun exitForeach_statement(ctx: PelicanParser.Foreach_statementContext?) {
        TODO("Not yet implemented")
    }

    override fun enterCondition(ctx: PelicanParser.ConditionContext?) {
        TODO("Not yet implemented")
    }

    override fun exitCondition(ctx: PelicanParser.ConditionContext?) {
        TODO("Not yet implemented")
    }

    override fun enterDeclaration_seq(ctx: PelicanParser.Declaration_seqContext?) {
        if (ctx == null) return

        ctx.declaration()?.forEach { enterDeclaration(it) }

        exitDeclaration_seq(ctx)
    }

    override fun exitDeclaration_seq(ctx: PelicanParser.Declaration_seqContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterDeclaration(ctx: PelicanParser.DeclarationContext?) {
        if (ctx == null) return

        enterFunction_declaration(ctx.function_declaration())
        enterAbstract_function_declaration(ctx.abstract_function_declaration())
        enterVar_declaration(ctx.var_declaration())
        enterContainer_declaration(ctx.container_declaration())
        enterEnum_declaration(ctx.enum_declaration())
        enterInterface_declaration(ctx.interface_declaration())

        exitDeclaration(ctx)
    }

    override fun exitDeclaration(ctx: PelicanParser.DeclarationContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterFunction_declaration(ctx: PelicanParser.Function_declarationContext?) {
        if (ctx == null) return

        enterType_modifiers(ctx.type_modifiers())
        append("fun ")
        ctx.template_specifier()?.let { enterTemplate_specifier(it) }
        enterFunction_name(ctx.function_name())
        append("(")
        appendClassAndTypeTemplates(ctx.function_parameter_list() != null)
        oneVararg = false
        ctx.function_parameter_list()?.let { enterFunction_parameter_list(it) }
        append("): ")
        enterType_specifier(ctx.type_specifier())
        enterFunction_body(ctx.function_body())

        exitFunction_declaration(ctx)
    }

    override fun exitFunction_declaration(ctx: PelicanParser.Function_declarationContext?) {
        classTemplates.clear()
        typeTemplates.clear()
        //TODO("Not yet implemented")
    }

    override fun enterAbstract_function_declaration(ctx: PelicanParser.Abstract_function_declarationContext?) {
        if (ctx == null) return
9
        enterType_modifiers(ctx.type_modifiers())
        append("abstract fun ")
        ctx.template_specifier()?.let { enterTemplate_specifier(it) }
        enterFunction_name(ctx.function_name())
        append("(")
        appendClassAndTypeTemplates(ctx.function_parameter_list() != null)
        oneVararg = false
        ctx.function_parameter_list()?.let { enterFunction_parameter_list(it) }
        append("): ")
        enterType_specifier(ctx.type_specifier())

        exitAbstract_function_declaration(ctx)
    }

    override fun exitAbstract_function_declaration(ctx: PelicanParser.Abstract_function_declarationContext?) {
        classTemplates.clear()
        typeTemplates.clear()
        //TODO("Not yet implemented")
    }

    private fun appendClassAndTypeTemplates(hasOtherParams: Boolean) {
        classTemplates.forEachIndexed { i, v -> append(v); if (hasOtherParams && i < classTemplates.size - 1 && typeTemplates.isNotEmpty()) append(", ") }
        typeTemplates.forEachIndexed { i, v -> append(v); if (hasOtherParams && i < typeTemplates.size - 1) append(", ") }
    }

    override fun enterFunction_name(ctx: PelicanParser.Function_nameContext?) {
        if (ctx == null) return

        visitTerminal(ctx.ID())

        enterMainFunctionDeclaration(ctx)

        exitFunction_name(ctx)
    }

    override fun exitFunction_name(ctx: PelicanParser.Function_nameContext?) {
        //TODO("Not yet implemented")
    }

    var oneVararg = false
    override fun enterFunction_parameter_list(ctx: PelicanParser.Function_parameter_listContext?) {
        if (ctx == null) return

        if (oneVararg && (ctx.VARARG() != null)) error("Multiple vararg parameters are not allowed")
        if (ctx.VARARG() != null) {
            oneVararg = true
            visitTerminal(ctx.VARARG())
            append(" ")
        }
        enterFunction_parameter(ctx.function_parameter())
        ctx.COMMA()?.let {
            visitTerminal(it)
            append(" ")
        }
        enterFunction_parameter_list(ctx.function_parameter_list())

        exitFunction_parameter_list(ctx)
    }

    override fun exitFunction_parameter_list(ctx: PelicanParser.Function_parameter_listContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterFunction_parameter(ctx: PelicanParser.Function_parameterContext?) {
        if (ctx == null) return

        enterFunction_parameter_name(ctx.function_parameter_name())
        append(": pelican.runtime.Pointer<")
        enterType_specifier(ctx.type_specifier())
        append(">")
        visitTerminal(ctx.ASSIGN())
        enterExpression(ctx.expression())

        exitFunction_parameter(ctx)
    }

    override fun exitFunction_parameter(ctx: PelicanParser.Function_parameterContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterFunction_parameter_name(ctx: PelicanParser.Function_parameter_nameContext?) {
        if (ctx == null) return

        visitTerminal(ctx.ID())

        exitFunction_parameter_name(ctx)
    }

    override fun exitFunction_parameter_name(ctx: PelicanParser.Function_parameter_nameContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterFunction_body(ctx: PelicanParser.Function_bodyContext?) {
        if (ctx == null) return

        if (ctx.ASSIGN() != null) {
            append(" = ")
            enterExpression(ctx.expression())
        } else {
            append(" {")
            nl()
            ++indent

            pushStack()
            enterCompound_statement(ctx.compound_statement())
            popStack()

            --indent
            appendIndent()
            append("}")
        }

        exitFunction_body(ctx)
    }

    override fun exitFunction_body(ctx: PelicanParser.Function_bodyContext?) {
        //TODO("Not yet implemented")
        nl()
    }

    override fun enterVar_declaration(ctx: PelicanParser.Var_declarationContext?) {
        if (ctx == null) return

        val varNameN = ctx.var_name().size
        ctx.var_name()?.forEachIndexed { index, it ->
            append("val ")
            enterVar_name(it)

            addAllVarNames(it)

            append(": pelican.runtime.Pointer<")
            enterType_specifier(ctx.type_specifier())
            append("> = pelican.runtime.Pointer(pelican.runtime.MemoryStack.alloc(pelican.runtime.SIZEOF_")
            enterType(ctx.type_specifier()?.type()?.also {
                localStack.stackSize += sizeofType(it)
            })
            append("))")
            /*ctx.ASSIGN(index).let {
                append(" ")
                visitTerminal(it)
                append(" ")
            }*/
            if (ctx.ASSIGN(index) != null) {
                nl()
                appendIndent()
                enterVar_name(it)
                append(".setPointedValue(")
                enterVar_initializer(ctx.var_initializer(index))
                append(")")
            }
        }

        exitVar_declaration(ctx)
    }

    override fun exitVar_declaration(ctx: PelicanParser.Var_declarationContext?) {
        //TODO("Not yet implemented")
        nl()
    }

    override fun enterSimple_var_declaration(ctx: PelicanParser.Simple_var_declarationContext?) {
        TODO("Not yet implemented")
    }

    override fun exitSimple_var_declaration(ctx: PelicanParser.Simple_var_declarationContext?) {
        TODO("Not yet implemented")
    }

    override fun enterVar_name(ctx: PelicanParser.Var_nameContext?) {
        if (ctx == null) return

        visitTerminal(ctx.ID())

        exitVar_name(ctx)
    }

    override fun exitVar_name(ctx: PelicanParser.Var_nameContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterDestructed_var_name(ctx: PelicanParser.Destructed_var_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun exitDestructed_var_name(ctx: PelicanParser.Destructed_var_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun enterDestructed_var_name_list(ctx: PelicanParser.Destructed_var_name_listContext?) {
        if (ctx == null) return

        enterVar_name(ctx.var_name())
        ctx.destructed_var_name_list()?.let {
            visitTerminal(ctx.COMMA())
            append(" ")
            enterDestructed_var_name_list(it)
        }

        exitDestructed_var_name_list(ctx)
    }

    override fun exitDestructed_var_name_list(ctx: PelicanParser.Destructed_var_name_listContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterVar_initializer(ctx: PelicanParser.Var_initializerContext?) {
        if (ctx == null) return

        enterExpression(ctx.expression())

        exitVar_initializer(ctx)
    }

    override fun exitVar_initializer(ctx: PelicanParser.Var_initializerContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterInitializer_list(ctx: PelicanParser.Initializer_listContext?) {
        TODO("Not yet implemented")
    }

    override fun exitInitializer_list(ctx: PelicanParser.Initializer_listContext?) {
        TODO("Not yet implemented")
    }

    override fun enterContainer_declaration(ctx: PelicanParser.Container_declarationContext?) {
        //TODO("Not yet implemented")
    }

    override fun exitContainer_declaration(ctx: PelicanParser.Container_declarationContext?) {
        TODO("Not yet implemented")
    }

    override fun enterContainer_head(ctx: PelicanParser.Container_headContext?) {
        TODO("Not yet implemented")
    }

    override fun exitContainer_head(ctx: PelicanParser.Container_headContext?) {
        TODO("Not yet implemented")
    }

    override fun enterContainer_name(ctx: PelicanParser.Container_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun exitContainer_name(ctx: PelicanParser.Container_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun enterContainer_body(ctx: PelicanParser.Container_bodyContext?) {
        TODO("Not yet implemented")
    }

    override fun exitContainer_body(ctx: PelicanParser.Container_bodyContext?) {
        TODO("Not yet implemented")
    }

    override fun enterContainer_field_list(ctx: PelicanParser.Container_field_listContext?) {
        TODO("Not yet implemented")
    }

    override fun exitContainer_field_list(ctx: PelicanParser.Container_field_listContext?) {
        TODO("Not yet implemented")
    }

    override fun enterContainer_field(ctx: PelicanParser.Container_fieldContext?) {
        TODO("Not yet implemented")
    }

    override fun exitContainer_field(ctx: PelicanParser.Container_fieldContext?) {
        TODO("Not yet implemented")
    }

    override fun enterContainer_method_list(ctx: PelicanParser.Container_method_listContext?) {
        TODO("Not yet implemented")
    }

    override fun exitContainer_method_list(ctx: PelicanParser.Container_method_listContext?) {
        TODO("Not yet implemented")
    }

    override fun enterContainer_implementation(ctx: PelicanParser.Container_implementationContext?) {
        TODO("Not yet implemented")
    }

    override fun exitContainer_implementation(ctx: PelicanParser.Container_implementationContext?) {
        TODO("Not yet implemented")
    }

    override fun enterEnum_declaration(ctx: PelicanParser.Enum_declarationContext?) {
        //TODO("Not yet implemented")
    }

    override fun exitEnum_declaration(ctx: PelicanParser.Enum_declarationContext?) {
        TODO("Not yet implemented")
    }

    override fun enterEnum_name(ctx: PelicanParser.Enum_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun exitEnum_name(ctx: PelicanParser.Enum_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun enterEnum_entry_list(ctx: PelicanParser.Enum_entry_listContext?) {
        TODO("Not yet implemented")
    }

    override fun exitEnum_entry_list(ctx: PelicanParser.Enum_entry_listContext?) {
        TODO("Not yet implemented")
    }

    override fun enterEnum_entry(ctx: PelicanParser.Enum_entryContext?) {
        TODO("Not yet implemented")
    }

    override fun exitEnum_entry(ctx: PelicanParser.Enum_entryContext?) {
        TODO("Not yet implemented")
    }

    override fun enterInterface_declaration(ctx: PelicanParser.Interface_declarationContext?) {
        //TODO("Not yet implemented")
    }

    override fun exitInterface_declaration(ctx: PelicanParser.Interface_declarationContext?) {
        TODO("Not yet implemented")
    }

    override fun enterInterface_method_list(ctx: PelicanParser.Interface_method_listContext?) {
        TODO("Not yet implemented")
    }

    override fun exitInterface_method_list(ctx: PelicanParser.Interface_method_listContext?) {
        TODO("Not yet implemented")
    }

    override fun enterInterface_name(ctx: PelicanParser.Interface_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun exitInterface_name(ctx: PelicanParser.Interface_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun enterType_specifier(ctx: PelicanParser.Type_specifierContext?) {
        if (ctx == null) return

        enterType(ctx.type())

        exitType_specifier(ctx)
    }

    override fun exitType_specifier(ctx: PelicanParser.Type_specifierContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterType_modifiers(ctx: PelicanParser.Type_modifiersContext?) {
        if (ctx == null) return

        ctx.visibility_modifier()?.let { enterVisibility_modifier(it) }

        exitType_modifiers(ctx)
    }

    override fun exitType_modifiers(ctx: PelicanParser.Type_modifiersContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterType(ctx: PelicanParser.TypeContext?) {
        if (ctx == null) return

        enterBuiltin_type(ctx.builtin_type())

        exitType(ctx)
    }

    override fun exitType(ctx: PelicanParser.TypeContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterTupel_type(ctx: PelicanParser.Tupel_typeContext?) {
        TODO("Not yet implemented")
    }

    override fun exitTupel_type(ctx: PelicanParser.Tupel_typeContext?) {
        TODO("Not yet implemented")
    }

    override fun enterTupel_type_list(ctx: PelicanParser.Tupel_type_listContext?) {
        TODO("Not yet implemented")
    }

    override fun exitTupel_type_list(ctx: PelicanParser.Tupel_type_listContext?) {
        TODO("Not yet implemented")
    }

    override fun enterTemplated_type(ctx: PelicanParser.Templated_typeContext?) {
        TODO("Not yet implemented")
    }

    override fun exitTemplated_type(ctx: PelicanParser.Templated_typeContext?) {
        TODO("Not yet implemented")
    }

    override fun enterType_name(ctx: PelicanParser.Type_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun exitType_name(ctx: PelicanParser.Type_nameContext?) {
        TODO("Not yet implemented")
    }

    override fun enterVisibility_modifier(ctx: PelicanParser.Visibility_modifierContext?) {
        if (ctx == null) return

        ctx.PUBLIC()?.let { visitTerminal(it) }
        ctx.PRIVATE()?.let { visitTerminal(it) }
        ctx.PROTECTED()?.let { visitTerminal(it) }
        ctx.INTERNAL()?.let { visitTerminal(it) }

        append(" ")

        exitVisibility_modifier(ctx)
    }

    override fun exitVisibility_modifier(ctx: PelicanParser.Visibility_modifierContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterExtern(ctx: PelicanParser.ExternContext?) {
        TODO("Not yet implemented")
    }

    override fun exitExtern(ctx: PelicanParser.ExternContext?) {
        TODO("Not yet implemented")
    }

    override fun enterConst_(ctx: PelicanParser.Const_Context?) {
        TODO("Not yet implemented")
    }

    override fun exitConst_(ctx: PelicanParser.Const_Context?) {
        TODO("Not yet implemented")
    }

    override fun enterStatic_(ctx: PelicanParser.Static_Context?) {
        TODO("Not yet implemented")
    }

    override fun exitStatic_(ctx: PelicanParser.Static_Context?) {
        TODO("Not yet implemented")
    }

    override fun enterBuiltin_type(ctx: PelicanParser.Builtin_typeContext?) {
        if (ctx == null) return

        visitTerminal(ctx.VOID())
        visitTerminal(ctx.INT())

        exitBuiltin_type(ctx)
    }

    override fun exitBuiltin_type(ctx: PelicanParser.Builtin_typeContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterContainer_type(ctx: PelicanParser.Container_typeContext?) {
        TODO("Not yet implemented")
    }

    override fun exitContainer_type(ctx: PelicanParser.Container_typeContext?) {
        TODO("Not yet implemented")
    }

    override fun enterPointer(ctx: PelicanParser.PointerContext?) {
        TODO("Not yet implemented")
    }

    override fun exitPointer(ctx: PelicanParser.PointerContext?) {
        TODO("Not yet implemented")
    }

    override fun enterTemplate_specifier(ctx: PelicanParser.Template_specifierContext?) {
        if (ctx == null) return

        ctx.template_type_list()?.let {
            visitTerminal(ctx.LT())
            enterTemplate_type_list(it)
            visitTerminal(ctx.GT())
            append(" ")
        }

        exitTemplate_specifier(ctx)
    }

    override fun exitTemplate_specifier(ctx: PelicanParser.Template_specifierContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterTemplate_type_list(ctx: PelicanParser.Template_type_listContext?) {
        if (ctx == null) return

        enterTemplate_type(ctx.template_type())
        ctx.template_type_list()?.let {
            visitTerminal(ctx.COMMA())
            append(" ")
            enterTemplate_type_list(it)
        }

        exitTemplate_type_list(ctx)
    }

    override fun exitTemplate_type_list(ctx: PelicanParser.Template_type_listContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterTemplate_type(ctx: PelicanParser.Template_typeContext?) {
        if (ctx == null) return

        enterTemplate_kind(ctx.template_kind())
        if (!addTypeTemplate) {
            enterTemplate_name(ctx.template_name())
            if (addClassTemplate) {
                addClassTemplate = false
                classTemplates.add("`${ctx.template_name().text}\$class`: kotlin.reflect.KClass<${ctx.template_name().text}>")
                append(" : Any")
            }
        } else {
            addTypeTemplate = false
            typeTemplates.add("${ctx.template_name().text}: `${ctx.template_name().text}\$template`")
            append("`")
            append("${ctx.template_name().text}\$template` : ")
            enterBuiltin_type(ctx.template_kind().builtin_type())
        }

        exitTemplate_type(ctx)
    }

    override fun exitTemplate_type(ctx: PelicanParser.Template_typeContext?) {
        //TODO("Not yet implemented")
    }

    var classTemplates = mutableListOf<String>()
    var addClassTemplate = false
    var typeTemplates = mutableListOf<String>()
    var addTypeTemplate = false
    override fun enterTemplate_kind(ctx: PelicanParser.Template_kindContext?) {
        if (ctx == null) return

        ctx.TYPENAME()?.let { visitTerminal(it) }
        ctx.CLASS()?.let { addClassTemplate = true }
        ctx.builtin_type()?.let { addTypeTemplate = true }

        exitTemplate_kind(ctx)
    }

    override fun exitTemplate_kind(ctx: PelicanParser.Template_kindContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterTemplate_name(ctx: PelicanParser.Template_nameContext?) {
        if (ctx == null) return

        visitTerminal(ctx.ID())

        exitTemplate_name(ctx)
    }

    override fun exitTemplate_name(ctx: PelicanParser.Template_nameContext?) {
        //TODO("Not yet implemented")
    }

    override fun enterActual_template_types(ctx: PelicanParser.Actual_template_typesContext?) {
        TODO("Not yet implemented")
    }

    override fun exitActual_template_types(ctx: PelicanParser.Actual_template_typesContext?) {
        TODO("Not yet implemented")
    }

    override fun enterActual_template_type_list(ctx: PelicanParser.Actual_template_type_listContext?) {
        TODO("Not yet implemented")
    }

    override fun exitActual_template_type_list(ctx: PelicanParser.Actual_template_type_listContext?) {
        TODO("Not yet implemented")
    }


    private fun enterMainFunctionDeclaration(ctx: PelicanParser.Function_nameContext) {
        if (ctx.ID().text == "main") {
            var args = false
            var mainFunctionCall = "main("
            (ctx.parent as PelicanParser.Function_declarationContext).let { context ->
                if (context.function_parameter_list() == null) return@let

                context.function_parameter_list()?.let {
                    if (it.function_parameter().type_specifier().type().builtin_type().INT() != null &&
                        it.function_parameter_list().function_parameter().type_specifier().let {
                            it.type().builtin_type().CHAR() != null && it.pointer().STAR(1) != null
                        }
                    ) {
                        mainFunctionCall += "argc, argv"
                        args = true
                    } else
                        return
                }
            }
            mainFunctionCall += ")"
            mainFileOutput.append("fun main(args: Array<String>) {\n")
            if(args)
                mainFileOutput.append("\tval argc = args.size\n" +
                        "\tval argvArray = Array(argc) { index ->\n" +
                        "\t\targs[index].c_str\n" +
                        "\t}\n" +
                        "\tval argv = Pointer<Pointer<Char>>(MemoryStack.alloc(argc))\n" +
                        "\tvar argvPtr = Pointer<Long>(argv.address)\n" +
                        "\targvArray.forEach { v ->\n" +
                        "\t\tMemory.setLong(argvPtr, v.address)\n" +
                        "\t\targvPtr += SIZEOF_Long.toLong()\n" +
                        "\t}\n")
            mainFileOutput.append("\t$mainFunctionCall\n" +
                    "}")
        }
    }

    private fun sizeofType(type: PelicanParser.TypeContext): Int {
        var size = 0
        type.builtin_type()?.let { size = sizeofBuiltinType(it) }
        return size
    }

    private fun sizeofBuiltinType(type: PelicanParser.Builtin_typeContext): Int {
        type.INT()?.let { return pelican.runtime.SIZEOF_Int }
        error("...")
    }

    private fun addAllVarNames(varName: PelicanParser.Var_nameContext) {
        varName.ID()?.text?.let { localStack.variables.add(it) }
        varName.destructed_var_name()?.let { addAllVarNames(it.destructed_var_name_list()) }
    }

    private fun addAllVarNames(varNames: PelicanParser.Destructed_var_name_listContext) {
        addAllVarNames(varNames.var_name())
        varNames.destructed_var_name_list()?.let { addAllVarNames(it) }
    }
}