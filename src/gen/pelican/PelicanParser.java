// Generated from D:/IdeaProjects/Crone/src/main/kotlin/pelican\PelicanParser.g4 by ANTLR 4.9
package pelican;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PelicanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_LINE_DOC_COMMENT=1, EMPTY_DELIMITED_DOC_COMMENT=2, DELIMITED_DOC_COMMENT=3, 
		SINGLE_LINE_COMMENT=4, DELIMITED_COMMENT=5, WHITESPACES=6, BOOL=7, BREAK=8, 
		BYTE=9, CHAR=10, CLASS=11, CONTINUE=12, CONST=13, DO=14, DOUBLE=15, ELSE=16, 
		ENUM=17, EXTERN=18, FALSE_=19, FLOAT=20, FOR=21, FOREACH=22, FUNCTION=23, 
		GOTO=24, IF=25, INT=26, INTERFACE=27, INTERNAL=28, LONG=29, NEW=30, NULL=31, 
		PRIVATE=32, PROPERTY=33, PROTECTED=34, PUBLIC=35, RETURN=36, SBYTE=37, 
		SHORT=38, SIZEOF=39, STATIC=40, STRUCT=41, SWITCH=42, THIS=43, TRUE_=44, 
		TYPENAME=45, UINT=46, ULONG=47, UNION=48, USHORT=49, VAR=50, VARARG=51, 
		VOID=52, WHILE=53, ID=54, LITERAL_ACCES=55, INTEGER_LITERAL=56, HEX_INTEGER_LITERAL=57, 
		BIN_INTEGER_LITERAL=58, REAL_LITERAL=59, CHARACTER_LITERAL=60, REGULAR_STRING=61, 
		OPEN_BRACE=62, CLOSE_BRACE=63, OPEN_BRACKET=64, CLOSE_BRACKET=65, OPEN_PAREN=66, 
		CLOSE_PAREN=67, DOT=68, COMMA=69, COLON=70, SEMI=71, PLUS=72, MINUS=73, 
		STAR=74, SLASH=75, PERCENT=76, AMP=77, OR=78, CARET=79, BANG=80, TILDE=81, 
		ASSIGN=82, LT=83, GT=84, BIG_ARROW=85, QUESTION=86, DOUBLE_COLON=87, OP_COALESCING=88, 
		OP_INC=89, OP_DEC=90, OP_AND=91, OP_OR=92, OP_ARROW=93, OP_EQ=94, OP_NE=95, 
		OP_IDENTITY=96, OP_NIDENTITY=97, OP_LTE=98, OP_GTE=99, OP_PLUS_ASSIGN=100, 
		OP_MINUS_ASSIGN=101, OP_TIMES_ASSIGN=102, OP_DIV_ASSIGN=103, OP_REM_ASSIGN=104, 
		OP_AND_ASSIGN=105, OP_XOR_ASSIGN=106, OP_OR_ASSIGN=107, OP_SHL_ASSIGN=108, 
		OP_SHR_ASSIGN=109, OP_COALESCING_ASSIGN=110, OP_RANGE=111, OP_SPREAD=112;
	public static final int
		RULE_translation_unit = 0, RULE_expression = 1, RULE_basic_expression = 2, 
		RULE_literal_expression = 3, RULE_integer_literal = 4, RULE_lambda_expression = 5, 
		RULE_postfix_expression = 6, RULE_invocation_expression = 7, RULE_indexing_expression = 8, 
		RULE_prefix_expression = 9, RULE_sizeof_expression = 10, RULE_product_expression = 11, 
		RULE_sum_expression = 12, RULE_shift_expression = 13, RULE_compare_expression = 14, 
		RULE_equality_expression = 15, RULE_identity_expression = 16, RULE_bit_and_expression = 17, 
		RULE_bit_xor_expression = 18, RULE_bit_or_expression = 19, RULE_logical_and_expression = 20, 
		RULE_logical_or_expression = 21, RULE_coalescing_expression = 22, RULE_assignment_expression = 23, 
		RULE_conditional_expression = 24, RULE_sequence_expression = 25, RULE_variable = 26, 
		RULE_arg_list = 27, RULE_argument = 28, RULE_statement_seq = 29, RULE_statement = 30, 
		RULE_function_invocation_statement = 31, RULE_expression_statement = 32, 
		RULE_compound_statement = 33, RULE_control_flow_statement = 34, RULE_labeled_statement = 35, 
		RULE_label_name = 36, RULE_conditional_statement = 37, RULE_if_statement = 38, 
		RULE_switch_statement = 39, RULE_switch_body = 40, RULE_switch_case = 41, 
		RULE_loop_statement = 42, RULE_while_statement = 43, RULE_do_while_statement = 44, 
		RULE_for_statement = 45, RULE_for_every_statement = 46, RULE_foreach_statement = 47, 
		RULE_condition = 48, RULE_declaration_seq = 49, RULE_declaration = 50, 
		RULE_function_declaration = 51, RULE_abstract_function_declaration = 52, 
		RULE_function_name = 53, RULE_function_parameter_list = 54, RULE_function_parameter = 55, 
		RULE_function_parameter_name = 56, RULE_function_body = 57, RULE_var_declaration = 58, 
		RULE_simple_var_declaration = 59, RULE_var_name = 60, RULE_destructed_var_name = 61, 
		RULE_destructed_var_name_list = 62, RULE_var_initializer = 63, RULE_initializer_list = 64, 
		RULE_container_declaration = 65, RULE_container_head = 66, RULE_container_name = 67, 
		RULE_container_body = 68, RULE_container_field_list = 69, RULE_container_field = 70, 
		RULE_container_method_list = 71, RULE_container_implementation = 72, RULE_enum_declaration = 73, 
		RULE_enum_name = 74, RULE_enum_entry_list = 75, RULE_enum_entry = 76, 
		RULE_interface_declaration = 77, RULE_interface_method_list = 78, RULE_interface_name = 79, 
		RULE_type_specifier = 80, RULE_type_modifiers = 81, RULE_type = 82, RULE_tupel_type = 83, 
		RULE_tupel_type_list = 84, RULE_templated_type = 85, RULE_type_name = 86, 
		RULE_visibility_modifier = 87, RULE_extern = 88, RULE_const_ = 89, RULE_static_ = 90, 
		RULE_builtin_type = 91, RULE_container_type = 92, RULE_pointer = 93, RULE_template_specifier = 94, 
		RULE_template_type_list = 95, RULE_template_type = 96, RULE_template_kind = 97, 
		RULE_template_name = 98, RULE_actual_template_types = 99, RULE_actual_template_type_list = 100;
	private static String[] makeRuleNames() {
		return new String[] {
			"translation_unit", "expression", "basic_expression", "literal_expression", 
			"integer_literal", "lambda_expression", "postfix_expression", "invocation_expression", 
			"indexing_expression", "prefix_expression", "sizeof_expression", "product_expression", 
			"sum_expression", "shift_expression", "compare_expression", "equality_expression", 
			"identity_expression", "bit_and_expression", "bit_xor_expression", "bit_or_expression", 
			"logical_and_expression", "logical_or_expression", "coalescing_expression", 
			"assignment_expression", "conditional_expression", "sequence_expression", 
			"variable", "arg_list", "argument", "statement_seq", "statement", "function_invocation_statement", 
			"expression_statement", "compound_statement", "control_flow_statement", 
			"labeled_statement", "label_name", "conditional_statement", "if_statement", 
			"switch_statement", "switch_body", "switch_case", "loop_statement", "while_statement", 
			"do_while_statement", "for_statement", "for_every_statement", "foreach_statement", 
			"condition", "declaration_seq", "declaration", "function_declaration", 
			"abstract_function_declaration", "function_name", "function_parameter_list", 
			"function_parameter", "function_parameter_name", "function_body", "var_declaration", 
			"simple_var_declaration", "var_name", "destructed_var_name", "destructed_var_name_list", 
			"var_initializer", "initializer_list", "container_declaration", "container_head", 
			"container_name", "container_body", "container_field_list", "container_field", 
			"container_method_list", "container_implementation", "enum_declaration", 
			"enum_name", "enum_entry_list", "enum_entry", "interface_declaration", 
			"interface_method_list", "interface_name", "type_specifier", "type_modifiers", 
			"type", "tupel_type", "tupel_type_list", "templated_type", "type_name", 
			"visibility_modifier", "extern", "const_", "static_", "builtin_type", 
			"container_type", "pointer", "template_specifier", "template_type_list", 
			"template_type", "template_kind", "template_name", "actual_template_types", 
			"actual_template_type_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'/***/'", null, null, null, null, "'bool'", "'break'", "'byte'", 
			"'char'", "'class'", "'continue'", "'const'", "'do'", "'double'", "'else'", 
			"'enum'", "'extern'", "'false'", "'float'", "'for'", "'forEach'", "'function'", 
			"'goto'", "'if'", "'int'", "'interface'", "'internal'", "'long'", "'new'", 
			"'null'", "'private'", "'property'", "'protected'", "'public'", "'return'", 
			"'sbyte'", "'short'", "'sizeof'", "'static'", "'struct'", "'switch'", 
			"'this'", "'true'", "'typename'", "'uint'", "'ulong'", "'union'", "'ushort'", 
			"'var'", "'vararg'", "'void'", "'while'", null, null, null, null, null, 
			null, null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", 
			"':'", "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", 
			"'!'", "'~'", "'='", "'<'", "'>'", "'=>'", "'?'", "'::'", "'??'", "'++'", 
			"'--'", "'&&'", "'||'", "'->'", "'=='", "'!='", "'==='", "'!=='", "'<='", 
			"'>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'^='", "'|='", 
			"'<<='", "'>>='", "'??='", "'..'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_LINE_DOC_COMMENT", "EMPTY_DELIMITED_DOC_COMMENT", "DELIMITED_DOC_COMMENT", 
			"SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", "WHITESPACES", "BOOL", "BREAK", 
			"BYTE", "CHAR", "CLASS", "CONTINUE", "CONST", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTERN", "FALSE_", "FLOAT", "FOR", "FOREACH", "FUNCTION", "GOTO", 
			"IF", "INT", "INTERFACE", "INTERNAL", "LONG", "NEW", "NULL", "PRIVATE", 
			"PROPERTY", "PROTECTED", "PUBLIC", "RETURN", "SBYTE", "SHORT", "SIZEOF", 
			"STATIC", "STRUCT", "SWITCH", "THIS", "TRUE_", "TYPENAME", "UINT", "ULONG", 
			"UNION", "USHORT", "VAR", "VARARG", "VOID", "WHILE", "ID", "LITERAL_ACCES", 
			"INTEGER_LITERAL", "HEX_INTEGER_LITERAL", "BIN_INTEGER_LITERAL", "REAL_LITERAL", 
			"CHARACTER_LITERAL", "REGULAR_STRING", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_PAREN", "CLOSE_PAREN", "DOT", "COMMA", "COLON", 
			"SEMI", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "AMP", "OR", "CARET", 
			"BANG", "TILDE", "ASSIGN", "LT", "GT", "BIG_ARROW", "QUESTION", "DOUBLE_COLON", 
			"OP_COALESCING", "OP_INC", "OP_DEC", "OP_AND", "OP_OR", "OP_ARROW", "OP_EQ", 
			"OP_NE", "OP_IDENTITY", "OP_NIDENTITY", "OP_LTE", "OP_GTE", "OP_PLUS_ASSIGN", 
			"OP_MINUS_ASSIGN", "OP_TIMES_ASSIGN", "OP_DIV_ASSIGN", "OP_REM_ASSIGN", 
			"OP_AND_ASSIGN", "OP_XOR_ASSIGN", "OP_OR_ASSIGN", "OP_SHL_ASSIGN", "OP_SHR_ASSIGN", 
			"OP_COALESCING_ASSIGN", "OP_RANGE", "OP_SPREAD"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PelicanParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PelicanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Translation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PelicanParser.EOF, 0); }
		public Declaration_seqContext declaration_seq() {
			return getRuleContext(Declaration_seqContext.class,0);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitTranslation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitTranslation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FUNCTION) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SBYTE) | (1L << SHORT) | (1L << STATIC) | (1L << STRUCT) | (1L << UINT) | (1L << ULONG) | (1L << UNION) | (1L << USHORT) | (1L << VAR) | (1L << VOID) | (1L << ID))) != 0) || _la==OPEN_PAREN || _la==LT) {
				{
				setState(202);
				declaration_seq();
				}
			}

			setState(205);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Basic_expressionContext basic_expression() {
			return getRuleContext(Basic_expressionContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Invocation_expressionContext invocation_expression() {
			return getRuleContext(Invocation_expressionContext.class,0);
		}
		public Sequence_expressionContext sequence_expression() {
			return getRuleContext(Sequence_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				basic_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				assignment_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				invocation_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				sequence_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode THIS() { return getToken(PelicanParser.THIS, 0); }
		public Basic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterBasic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitBasic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitBasic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_expressionContext basic_expression() throws RecognitionException {
		Basic_expressionContext _localctx = new Basic_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_basic_expression);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(OPEN_PAREN);
				setState(214);
				expression();
				setState(215);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				lambda_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(THIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_expressionContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public TerminalNode REAL_LITERAL() { return getToken(PelicanParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(PelicanParser.CHARACTER_LITERAL, 0); }
		public TerminalNode REGULAR_STRING() { return getToken(PelicanParser.REGULAR_STRING, 0); }
		public TerminalNode TRUE_() { return getToken(PelicanParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(PelicanParser.FALSE_, 0); }
		public TerminalNode NULL() { return getToken(PelicanParser.NULL, 0); }
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitLiteral_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitLiteral_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal_expression);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				integer_literal();
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(CHARACTER_LITERAL);
				}
				break;
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(REGULAR_STRING);
				}
				break;
			case FALSE_:
			case TRUE_:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				_la = _input.LA(1);
				if ( !(_la==FALSE_ || _la==TRUE_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(PelicanParser.INTEGER_LITERAL, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(PelicanParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode BIN_INTEGER_LITERAL() { return getToken(PelicanParser.BIN_INTEGER_LITERAL, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_expressionContext extends ParserRuleContext {
		public TerminalNode BIG_ARROW() { return getToken(PelicanParser.BIG_ARROW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(PelicanParser.OPEN_BRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PelicanParser.CLOSE_BRACE, 0); }
		public Destructed_var_nameContext destructed_var_name() {
			return getRuleContext(Destructed_var_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PelicanParser.COLON, 0); }
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterLambda_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitLambda_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitLambda_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lambda_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(233);
				label_name();
				setState(234);
				match(COLON);
				}
			}

			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(238);
				destructed_var_name();
				}
				break;
			case 2:
				{
				setState(239);
				match(OPEN_PAREN);
				setState(240);
				match(CLOSE_PAREN);
				}
				break;
			}
			setState(243);
			match(BIG_ARROW);
			setState(244);
			match(OPEN_BRACE);
			setState(245);
			statement();
			setState(246);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Basic_expressionContext basic_expression() {
			return getRuleContext(Basic_expressionContext.class,0);
		}
		public List<TerminalNode> OP_INC() { return getTokens(PelicanParser.OP_INC); }
		public TerminalNode OP_INC(int i) {
			return getToken(PelicanParser.OP_INC, i);
		}
		public List<TerminalNode> OP_DEC() { return getTokens(PelicanParser.OP_DEC); }
		public TerminalNode OP_DEC(int i) {
			return getToken(PelicanParser.OP_DEC, i);
		}
		public Invocation_expressionContext invocation_expression() {
			return getRuleContext(Invocation_expressionContext.class,0);
		}
		public Indexing_expressionContext indexing_expression() {
			return getRuleContext(Indexing_expressionContext.class,0);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitPostfix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_postfix_expression);
		int _la;
		try {
			int _alt;
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				basic_expression();
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						_la = _input.LA(1);
						if ( !(_la==OP_INC || _la==OP_DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				invocation_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				indexing_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Invocation_expressionContext extends ParserRuleContext {
		public Basic_expressionContext basic_expression() {
			return getRuleContext(Basic_expressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Function_invocation_statementContext function_invocation_statement() {
			return getRuleContext(Function_invocation_statementContext.class,0);
		}
		public Invocation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterInvocation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitInvocation_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitInvocation_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invocation_expressionContext invocation_expression() throws RecognitionException {
		Invocation_expressionContext _localctx = new Invocation_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_invocation_expression);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				basic_expression();
				setState(260);
				match(OPEN_PAREN);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE_) | (1L << NEW) | (1L << NULL) | (1L << SIZEOF) | (1L << THIS) | (1L << TRUE_) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)) | (1L << (OP_SPREAD - 66)))) != 0)) {
					{
					setState(261);
					arg_list();
					}
				}

				setState(264);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				function_invocation_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexing_expressionContext extends ParserRuleContext {
		public Basic_expressionContext basic_expression() {
			return getRuleContext(Basic_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(PelicanParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PelicanParser.CLOSE_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Indexing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterIndexing_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitIndexing_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitIndexing_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexing_expressionContext indexing_expression() throws RecognitionException {
		Indexing_expressionContext _localctx = new Indexing_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_indexing_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			basic_expression();
			setState(270);
			match(OPEN_BRACKET);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE_) | (1L << NEW) | (1L << NULL) | (1L << SIZEOF) | (1L << THIS) | (1L << TRUE_) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)))) != 0)) {
				{
				{
				setState(271);
				expression();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public List<TerminalNode> OP_INC() { return getTokens(PelicanParser.OP_INC); }
		public TerminalNode OP_INC(int i) {
			return getToken(PelicanParser.OP_INC, i);
		}
		public List<TerminalNode> OP_DEC() { return getTokens(PelicanParser.OP_DEC); }
		public TerminalNode OP_DEC(int i) {
			return getToken(PelicanParser.OP_DEC, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PelicanParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PelicanParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PelicanParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PelicanParser.MINUS, i);
		}
		public List<TerminalNode> BANG() { return getTokens(PelicanParser.BANG); }
		public TerminalNode BANG(int i) {
			return getToken(PelicanParser.BANG, i);
		}
		public List<TerminalNode> TILDE() { return getTokens(PelicanParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(PelicanParser.TILDE, i);
		}
		public List<TerminalNode> STAR() { return getTokens(PelicanParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PelicanParser.STAR, i);
		}
		public List<TerminalNode> AMP() { return getTokens(PelicanParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(PelicanParser.AMP, i);
		}
		public List<TerminalNode> NEW() { return getTokens(PelicanParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(PelicanParser.NEW, i);
		}
		public Sizeof_expressionContext sizeof_expression() {
			return getRuleContext(Sizeof_expressionContext.class,0);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterPrefix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitPrefix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitPrefix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prefix_expression);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE_:
			case NEW:
			case NULL:
			case THIS:
			case TRUE_:
			case ID:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case OPEN_PAREN:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (NEW - 30)) | (1L << (PLUS - 30)) | (1L << (MINUS - 30)) | (1L << (STAR - 30)) | (1L << (AMP - 30)) | (1L << (BANG - 30)) | (1L << (TILDE - 30)) | (1L << (OP_INC - 30)) | (1L << (OP_DEC - 30)))) != 0)) {
					{
					{
					setState(279);
					_la = _input.LA(1);
					if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (NEW - 30)) | (1L << (PLUS - 30)) | (1L << (MINUS - 30)) | (1L << (STAR - 30)) | (1L << (AMP - 30)) | (1L << (BANG - 30)) | (1L << (TILDE - 30)) | (1L << (OP_INC - 30)) | (1L << (OP_DEC - 30)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				postfix_expression();
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				sizeof_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_expressionContext extends ParserRuleContext {
		public TerminalNode SIZEOF() { return getToken(PelicanParser.SIZEOF, 0); }
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Sizeof_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitSizeof_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitSizeof_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sizeof_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(SIZEOF);
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(290);
				postfix_expression();
				}
				break;
			case 2:
				{
				setState(291);
				match(OPEN_PAREN);
				setState(292);
				type(0);
				setState(293);
				match(CLOSE_PAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Product_expressionContext extends ParserRuleContext {
		public List<Prefix_expressionContext> prefix_expression() {
			return getRuleContexts(Prefix_expressionContext.class);
		}
		public Prefix_expressionContext prefix_expression(int i) {
			return getRuleContext(Prefix_expressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PelicanParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PelicanParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(PelicanParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PelicanParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(PelicanParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(PelicanParser.PERCENT, i);
		}
		public Product_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterProduct_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitProduct_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitProduct_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Product_expressionContext product_expression() throws RecognitionException {
		Product_expressionContext _localctx = new Product_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_product_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			prefix_expression();
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					_la = _input.LA(1);
					if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (STAR - 74)) | (1L << (SLASH - 74)) | (1L << (PERCENT - 74)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(299);
					prefix_expression();
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sum_expressionContext extends ParserRuleContext {
		public List<Product_expressionContext> product_expression() {
			return getRuleContexts(Product_expressionContext.class);
		}
		public Product_expressionContext product_expression(int i) {
			return getRuleContext(Product_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PelicanParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PelicanParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PelicanParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PelicanParser.MINUS, i);
		}
		public Sum_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterSum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitSum_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitSum_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sum_expressionContext sum_expression() throws RecognitionException {
		Sum_expressionContext _localctx = new Sum_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sum_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			product_expression();
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(307);
					product_expression();
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Sum_expressionContext> sum_expression() {
			return getRuleContexts(Sum_expressionContext.class);
		}
		public Sum_expressionContext sum_expression(int i) {
			return getRuleContext(Sum_expressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(PelicanParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(PelicanParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(PelicanParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(PelicanParser.GT, i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			sum_expression();
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
						{
						setState(314);
						match(LT);
						setState(315);
						match(LT);
						}
						break;
					case GT:
						{
						setState(316);
						match(GT);
						setState(317);
						match(GT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(320);
					sum_expression();
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compare_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(PelicanParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(PelicanParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(PelicanParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(PelicanParser.GT, i);
		}
		public List<TerminalNode> OP_LTE() { return getTokens(PelicanParser.OP_LTE); }
		public TerminalNode OP_LTE(int i) {
			return getToken(PelicanParser.OP_LTE, i);
		}
		public List<TerminalNode> OP_GTE() { return getTokens(PelicanParser.OP_GTE); }
		public TerminalNode OP_GTE(int i) {
			return getToken(PelicanParser.OP_GTE, i);
		}
		public Compare_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterCompare_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitCompare_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitCompare_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_expressionContext compare_expression() throws RecognitionException {
		Compare_expressionContext _localctx = new Compare_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compare_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			shift_expression();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (LT - 83)) | (1L << (GT - 83)) | (1L << (OP_LTE - 83)) | (1L << (OP_GTE - 83)))) != 0)) {
				{
				{
				setState(327);
				_la = _input.LA(1);
				if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (LT - 83)) | (1L << (GT - 83)) | (1L << (OP_LTE - 83)) | (1L << (OP_GTE - 83)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				shift_expression();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Compare_expressionContext> compare_expression() {
			return getRuleContexts(Compare_expressionContext.class);
		}
		public Compare_expressionContext compare_expression(int i) {
			return getRuleContext(Compare_expressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(PelicanParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(PelicanParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(PelicanParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(PelicanParser.OP_NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			compare_expression();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_EQ) {
				{
				{
				{
				setState(335);
				match(OP_EQ);
				setState(336);
				match(OP_NE);
				}
				setState(338);
				compare_expression();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identity_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> OP_IDENTITY() { return getTokens(PelicanParser.OP_IDENTITY); }
		public TerminalNode OP_IDENTITY(int i) {
			return getToken(PelicanParser.OP_IDENTITY, i);
		}
		public List<TerminalNode> OP_NIDENTITY() { return getTokens(PelicanParser.OP_NIDENTITY); }
		public TerminalNode OP_NIDENTITY(int i) {
			return getToken(PelicanParser.OP_NIDENTITY, i);
		}
		public Identity_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identity_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterIdentity_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitIdentity_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitIdentity_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identity_expressionContext identity_expression() throws RecognitionException {
		Identity_expressionContext _localctx = new Identity_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identity_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			equality_expression();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_IDENTITY || _la==OP_NIDENTITY) {
				{
				{
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==OP_IDENTITY || _la==OP_NIDENTITY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				equality_expression();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_and_expressionContext extends ParserRuleContext {
		public List<Identity_expressionContext> identity_expression() {
			return getRuleContexts(Identity_expressionContext.class);
		}
		public Identity_expressionContext identity_expression(int i) {
			return getRuleContext(Identity_expressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(PelicanParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(PelicanParser.AMP, i);
		}
		public Bit_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitBit_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitBit_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bit_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			identity_expression();
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					match(AMP);
					setState(354);
					identity_expression();
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_xor_expressionContext extends ParserRuleContext {
		public List<Bit_and_expressionContext> bit_and_expression() {
			return getRuleContexts(Bit_and_expressionContext.class);
		}
		public Bit_and_expressionContext bit_and_expression(int i) {
			return getRuleContext(Bit_and_expressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(PelicanParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(PelicanParser.CARET, i);
		}
		public Bit_xor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_xor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterBit_xor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitBit_xor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitBit_xor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_xor_expressionContext bit_xor_expression() throws RecognitionException {
		Bit_xor_expressionContext _localctx = new Bit_xor_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bit_xor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			bit_and_expression();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(361);
				match(CARET);
				setState(362);
				bit_and_expression();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_or_expressionContext extends ParserRuleContext {
		public List<Bit_xor_expressionContext> bit_xor_expression() {
			return getRuleContexts(Bit_xor_expressionContext.class);
		}
		public Bit_xor_expressionContext bit_xor_expression(int i) {
			return getRuleContext(Bit_xor_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PelicanParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PelicanParser.OR, i);
		}
		public Bit_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterBit_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitBit_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitBit_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_or_expressionContext bit_or_expression() throws RecognitionException {
		Bit_or_expressionContext _localctx = new Bit_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bit_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			bit_xor_expression();
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					match(OR);
					setState(370);
					bit_xor_expression();
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public List<Bit_or_expressionContext> bit_or_expression() {
			return getRuleContexts(Bit_or_expressionContext.class);
		}
		public Bit_or_expressionContext bit_or_expression(int i) {
			return getRuleContext(Bit_or_expressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(PelicanParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(PelicanParser.AMP, i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitLogical_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitLogical_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logical_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			bit_or_expression();
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(377);
					match(AMP);
					setState(378);
					match(AMP);
					setState(379);
					bit_or_expression();
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PelicanParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PelicanParser.OR, i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitLogical_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitLogical_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			logical_and_expression();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(386);
				match(OR);
				setState(387);
				match(OR);
				setState(388);
				logical_and_expression();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Coalescing_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode OP_COALESCING() { return getToken(PelicanParser.OP_COALESCING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Coalescing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coalescing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterCoalescing_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitCoalescing_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitCoalescing_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Coalescing_expressionContext coalescing_expression() throws RecognitionException {
		Coalescing_expressionContext _localctx = new Coalescing_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_coalescing_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			logical_or_expression();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COALESCING) {
				{
				setState(395);
				match(OP_COALESCING);
				setState(396);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public List<Coalescing_expressionContext> coalescing_expression() {
			return getRuleContexts(Coalescing_expressionContext.class);
		}
		public Coalescing_expressionContext coalescing_expression(int i) {
			return getRuleContext(Coalescing_expressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(PelicanParser.ASSIGN, 0); }
		public TerminalNode OP_PLUS_ASSIGN() { return getToken(PelicanParser.OP_PLUS_ASSIGN, 0); }
		public TerminalNode OP_MINUS_ASSIGN() { return getToken(PelicanParser.OP_MINUS_ASSIGN, 0); }
		public TerminalNode OP_TIMES_ASSIGN() { return getToken(PelicanParser.OP_TIMES_ASSIGN, 0); }
		public TerminalNode OP_DIV_ASSIGN() { return getToken(PelicanParser.OP_DIV_ASSIGN, 0); }
		public TerminalNode OP_REM_ASSIGN() { return getToken(PelicanParser.OP_REM_ASSIGN, 0); }
		public TerminalNode OP_AND_ASSIGN() { return getToken(PelicanParser.OP_AND_ASSIGN, 0); }
		public TerminalNode OP_XOR_ASSIGN() { return getToken(PelicanParser.OP_XOR_ASSIGN, 0); }
		public TerminalNode OP_OR_ASSIGN() { return getToken(PelicanParser.OP_OR_ASSIGN, 0); }
		public TerminalNode OP_SHL_ASSIGN() { return getToken(PelicanParser.OP_SHL_ASSIGN, 0); }
		public TerminalNode OP_SHR_ASSIGN() { return getToken(PelicanParser.OP_SHR_ASSIGN, 0); }
		public TerminalNode OP_COALESCING_ASSIGN() { return getToken(PelicanParser.OP_COALESCING_ASSIGN, 0); }
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignment_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			coalescing_expression();
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(400);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ASSIGN - 82)) | (1L << (OP_PLUS_ASSIGN - 82)) | (1L << (OP_MINUS_ASSIGN - 82)) | (1L << (OP_TIMES_ASSIGN - 82)) | (1L << (OP_DIV_ASSIGN - 82)) | (1L << (OP_REM_ASSIGN - 82)) | (1L << (OP_AND_ASSIGN - 82)) | (1L << (OP_XOR_ASSIGN - 82)) | (1L << (OP_OR_ASSIGN - 82)) | (1L << (OP_SHL_ASSIGN - 82)) | (1L << (OP_SHR_ASSIGN - 82)) | (1L << (OP_COALESCING_ASSIGN - 82)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(401);
				coalescing_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(PelicanParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PelicanParser.COLON, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			assignment_expression();
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(405);
				match(QUESTION);
				setState(406);
				expression();
				setState(407);
				match(COLON);
				setState(408);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Sequence_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterSequence_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitSequence_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitSequence_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_expressionContext sequence_expression() throws RecognitionException {
		Sequence_expressionContext _localctx = new Sequence_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sequence_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			conditional_expression();
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(413);
				match(COMMA);
				setState(414);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			((VariableContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_listContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitArg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			argument();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(420);
				match(COMMA);
				setState(421);
				arg_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode OP_SPREAD() { return getToken(PelicanParser.OP_SPREAD, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PelicanParser.ASSIGN, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argument);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(OP_SPREAD);
				setState(425);
				argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				var_name();
				setState(428);
				match(ASSIGN);
				setState(429);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_seqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterStatement_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitStatement_seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitStatement_seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_seqContext statement_seq() throws RecognitionException {
		Statement_seqContext _localctx = new Statement_seqContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement_seq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(433);
				statement();
				}
				}
				setState(436); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << CONST) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FALSE_) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << LONG) | (1L << NEW) | (1L << NULL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << SWITCH) | (1L << THIS) | (1L << TRUE_) | (1L << UINT) | (1L << ULONG) | (1L << UNION) | (1L << USHORT) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING) | (1L << OPEN_BRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (LT - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Control_flow_statementContext control_flow_statement() {
			return getRuleContext(Control_flow_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PelicanParser.SEMI, 0); }
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Function_invocation_statementContext function_invocation_statement() {
			return getRuleContext(Function_invocation_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				labeled_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				control_flow_statement();
				setState(440);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(443);
				loop_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				function_invocation_statement();
				setState(445);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				expression_statement();
				setState(448);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(450);
				compound_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(451);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_invocation_statementContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Actual_template_typesContext actual_template_types() {
			return getRuleContext(Actual_template_typesContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Function_invocation_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterFunction_invocation_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitFunction_invocation_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitFunction_invocation_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invocation_statementContext function_invocation_statement() throws RecognitionException {
		Function_invocation_statementContext _localctx = new Function_invocation_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_invocation_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			function_name();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(455);
				actual_template_types();
				}
			}

			setState(458);
			match(OPEN_PAREN);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE_) | (1L << NEW) | (1L << NULL) | (1L << SIZEOF) | (1L << THIS) | (1L << TRUE_) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)) | (1L << (OP_SPREAD - 66)))) != 0)) {
				{
				setState(459);
				arg_list();
				}
			}

			setState(462);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitExpression_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(PelicanParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PelicanParser.CLOSE_BRACE, 0); }
		public Statement_seqContext statement_seq() {
			return getRuleContext(Statement_seqContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(OPEN_BRACE);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << CONST) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FALSE_) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << LONG) | (1L << NEW) | (1L << NULL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SBYTE) | (1L << SHORT) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << SWITCH) | (1L << THIS) | (1L << TRUE_) | (1L << UINT) | (1L << ULONG) | (1L << UNION) | (1L << USHORT) | (1L << VAR) | (1L << VOID) | (1L << WHILE) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING) | (1L << OPEN_BRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (LT - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)))) != 0)) {
				{
				setState(467);
				statement_seq();
				}
			}

			setState(470);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_flow_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PelicanParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(PelicanParser.CONTINUE, 0); }
		public TerminalNode GOTO() { return getToken(PelicanParser.GOTO, 0); }
		public TerminalNode RETURN() { return getToken(PelicanParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PelicanParser.COLON, 0); }
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Control_flow_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_flow_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterControl_flow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitControl_flow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitControl_flow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_flow_statementContext control_flow_statement() throws RecognitionException {
		Control_flow_statementContext _localctx = new Control_flow_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_control_flow_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << GOTO) | (1L << RETURN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE_) | (1L << NEW) | (1L << NULL) | (1L << SIZEOF) | (1L << THIS) | (1L << TRUE_) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)))) != 0)) {
				{
				setState(473);
				expression();
				}
			}

			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(476);
				match(COLON);
				setState(477);
				label_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PelicanParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_labeled_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			label_name();
			setState(481);
			match(COLON);
			setState(482);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterLabel_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitLabel_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitLabel_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			((Label_nameContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitConditional_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitConditional_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditional_statement);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				if_statement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				switch_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PelicanParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PelicanParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(IF);
			setState(491);
			match(OPEN_PAREN);
			setState(492);
			condition();
			setState(493);
			match(CLOSE_PAREN);
			setState(494);
			statement();
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(495);
				match(ELSE);
				setState(496);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(PelicanParser.SWITCH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(PelicanParser.OPEN_BRACE, 0); }
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PelicanParser.CLOSE_BRACE, 0); }
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(SWITCH);
			setState(500);
			match(OPEN_PAREN);
			setState(501);
			condition();
			setState(502);
			match(CLOSE_PAREN);
			setState(503);
			match(OPEN_BRACE);
			setState(504);
			switch_body();
			setState(505);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_bodyContext extends ParserRuleContext {
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public List<TerminalNode> BIG_ARROW() { return getTokens(PelicanParser.BIG_ARROW); }
		public TerminalNode BIG_ARROW(int i) {
			return getToken(PelicanParser.BIG_ARROW, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitSwitch_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitSwitch_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE_) | (1L << NEW) | (1L << NULL) | (1L << SIZEOF) | (1L << THIS) | (1L << TRUE_) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)))) != 0)) {
				{
				{
				setState(507);
				switch_case();
				setState(508);
				match(BIG_ARROW);
				setState(509);
				statement();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PelicanParser.SEMI, 0); }
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Foreach_statementContext foreach_statement() {
			return getRuleContext(Foreach_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_loop_statement);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				while_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				do_while_statement();
				setState(520);
				match(SEMI);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				for_statement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
				foreach_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PelicanParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(WHILE);
			setState(527);
			match(OPEN_PAREN);
			setState(528);
			condition();
			setState(529);
			match(CLOSE_PAREN);
			setState(530);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(PelicanParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PelicanParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(DO);
			setState(533);
			statement();
			setState(534);
			match(WHILE);
			setState(535);
			match(OPEN_PAREN);
			setState(536);
			expression();
			setState(537);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PelicanParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PelicanParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PelicanParser.SEMI, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_every_statementContext for_every_statement() {
			return getRuleContext(For_every_statementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(FOR);
			setState(540);
			match(OPEN_PAREN);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FALSE_) | (1L << FLOAT) | (1L << FUNCTION) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << NULL) | (1L << SBYTE) | (1L << SHORT) | (1L << SIZEOF) | (1L << STRUCT) | (1L << THIS) | (1L << TRUE_) | (1L << UINT) | (1L << ULONG) | (1L << UNION) | (1L << USHORT) | (1L << VAR) | (1L << VOID) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)))) != 0)) {
				{
				setState(541);
				condition();
				}
			}

			setState(544);
			match(SEMI);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE_) | (1L << NEW) | (1L << NULL) | (1L << SIZEOF) | (1L << THIS) | (1L << TRUE_) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)))) != 0)) {
				{
				setState(545);
				expression();
				}
			}

			setState(548);
			match(SEMI);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE_) | (1L << NEW) | (1L << NULL) | (1L << SIZEOF) | (1L << THIS) | (1L << TRUE_) | (1L << ID) | (1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << REGULAR_STRING))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (OPEN_PAREN - 66)) | (1L << (PLUS - 66)) | (1L << (MINUS - 66)) | (1L << (STAR - 66)) | (1L << (AMP - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (OP_INC - 66)) | (1L << (OP_DEC - 66)))) != 0)) {
				{
				setState(549);
				for_every_statement();
				}
			}

			setState(552);
			match(CLOSE_PAREN);
			setState(553);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_every_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_every_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_every_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterFor_every_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitFor_every_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitFor_every_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_every_statementContext for_every_statement() throws RecognitionException {
		For_every_statementContext _localctx = new For_every_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_for_every_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_statementContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(PelicanParser.FOREACH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PelicanParser.COLON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Foreach_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterForeach_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitForeach_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitForeach_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_statementContext foreach_statement() throws RecognitionException {
		Foreach_statementContext _localctx = new Foreach_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_foreach_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(FOREACH);
			setState(558);
			match(OPEN_PAREN);
			setState(559);
			var_name();
			setState(560);
			match(COLON);
			setState(561);
			condition();
			setState(562);
			match(CLOSE_PAREN);
			setState(563);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Simple_var_declarationContext simple_var_declaration() {
			return getRuleContext(Simple_var_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_condition);
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				simple_var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_seqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Declaration_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterDeclaration_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitDeclaration_seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitDeclaration_seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_seqContext declaration_seq() throws RecognitionException {
		Declaration_seqContext _localctx = new Declaration_seqContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_declaration_seq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(569);
				declaration();
				}
				}
				setState(572); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FUNCTION) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SBYTE) | (1L << SHORT) | (1L << STATIC) | (1L << STRUCT) | (1L << UINT) | (1L << ULONG) | (1L << UNION) | (1L << USHORT) | (1L << VAR) | (1L << VOID) | (1L << ID))) != 0) || _la==OPEN_PAREN || _la==LT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Abstract_function_declarationContext abstract_function_declaration() {
			return getRuleContext(Abstract_function_declarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PelicanParser.SEMI, 0); }
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Container_declarationContext container_declaration() {
			return getRuleContext(Container_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declaration);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				function_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				abstract_function_declaration();
				setState(576);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				var_declaration();
				setState(579);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(581);
				container_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				enum_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(583);
				interface_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Type_modifiersContext type_modifiers() {
			return getRuleContext(Type_modifiersContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Template_specifierContext template_specifier() {
			return getRuleContext(Template_specifierContext.class,0);
		}
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(586);
				template_specifier();
				}
			}

			setState(589);
			type_modifiers();
			setState(590);
			type_specifier();
			setState(591);
			function_name();
			setState(592);
			match(OPEN_PAREN);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (BOOL - 7)) | (1L << (BYTE - 7)) | (1L << (CHAR - 7)) | (1L << (DOUBLE - 7)) | (1L << (FLOAT - 7)) | (1L << (FUNCTION - 7)) | (1L << (INT - 7)) | (1L << (LONG - 7)) | (1L << (SBYTE - 7)) | (1L << (SHORT - 7)) | (1L << (STRUCT - 7)) | (1L << (UINT - 7)) | (1L << (ULONG - 7)) | (1L << (UNION - 7)) | (1L << (USHORT - 7)) | (1L << (VARARG - 7)) | (1L << (VOID - 7)) | (1L << (ID - 7)) | (1L << (OPEN_PAREN - 7)))) != 0)) {
				{
				setState(593);
				function_parameter_list();
				}
			}

			setState(596);
			match(CLOSE_PAREN);
			setState(597);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abstract_function_declarationContext extends ParserRuleContext {
		public Type_modifiersContext type_modifiers() {
			return getRuleContext(Type_modifiersContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Template_specifierContext template_specifier() {
			return getRuleContext(Template_specifierContext.class,0);
		}
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public Abstract_function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterAbstract_function_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitAbstract_function_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitAbstract_function_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abstract_function_declarationContext abstract_function_declaration() throws RecognitionException {
		Abstract_function_declarationContext _localctx = new Abstract_function_declarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_abstract_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(599);
				template_specifier();
				}
			}

			setState(602);
			type_modifiers();
			setState(603);
			type_specifier();
			setState(604);
			function_name();
			setState(605);
			match(OPEN_PAREN);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (BOOL - 7)) | (1L << (BYTE - 7)) | (1L << (CHAR - 7)) | (1L << (DOUBLE - 7)) | (1L << (FLOAT - 7)) | (1L << (FUNCTION - 7)) | (1L << (INT - 7)) | (1L << (LONG - 7)) | (1L << (SBYTE - 7)) | (1L << (SHORT - 7)) | (1L << (STRUCT - 7)) | (1L << (UINT - 7)) | (1L << (ULONG - 7)) | (1L << (UNION - 7)) | (1L << (USHORT - 7)) | (1L << (VARARG - 7)) | (1L << (VOID - 7)) | (1L << (ID - 7)) | (1L << (OPEN_PAREN - 7)))) != 0)) {
				{
				setState(606);
				function_parameter_list();
				}
			}

			setState(609);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			((Function_nameContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameter_listContext extends ParserRuleContext {
		public Function_parameterContext function_parameter() {
			return getRuleContext(Function_parameterContext.class,0);
		}
		public TerminalNode VARARG() { return getToken(PelicanParser.VARARG, 0); }
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public Function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterFunction_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitFunction_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitFunction_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameter_listContext function_parameter_list() throws RecognitionException {
		Function_parameter_listContext _localctx = new Function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARARG) {
				{
				setState(613);
				match(VARARG);
				}
			}

			setState(616);
			function_parameter();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(617);
				match(COMMA);
				setState(618);
				function_parameter_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameterContext extends ParserRuleContext {
		public ExpressionContext default_value;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Function_parameter_nameContext function_parameter_name() {
			return getRuleContext(Function_parameter_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PelicanParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterFunction_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitFunction_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitFunction_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_function_parameter);
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				type_specifier();
				setState(622);
				function_parameter_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				type_specifier();
				setState(625);
				function_parameter_name();
				setState(626);
				match(ASSIGN);
				setState(627);
				((Function_parameterContext)_localctx).default_value = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameter_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public Function_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterFunction_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitFunction_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitFunction_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameter_nameContext function_parameter_name() throws RecognitionException {
		Function_parameter_nameContext _localctx = new Function_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_function_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			((Function_parameter_nameContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PelicanParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PelicanParser.SEMI, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_function_body);
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				compound_statement();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(ASSIGN);
				setState(635);
				expression();
				setState(636);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declarationContext extends ParserRuleContext {
		public Type_modifiersContext type_modifiers() {
			return getRuleContext(Type_modifiersContext.class,0);
		}
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public TerminalNode VAR() { return getToken(PelicanParser.VAR, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(PelicanParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(PelicanParser.ASSIGN, i);
		}
		public List<Var_initializerContext> var_initializer() {
			return getRuleContexts(Var_initializerContext.class);
		}
		public Var_initializerContext var_initializer(int i) {
			return getRuleContext(Var_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PelicanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PelicanParser.COMMA, i);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitVar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			type_modifiers();
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(641);
				match(VAR);
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case FUNCTION:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case STRUCT:
			case UINT:
			case ULONG:
			case UNION:
			case USHORT:
			case VOID:
			case ID:
			case OPEN_PAREN:
				{
				setState(642);
				type_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(645);
			var_name();
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(646);
				match(ASSIGN);
				setState(647);
				var_initializer();
				}
			}

			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(650);
				match(COMMA);
				setState(651);
				var_name();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(652);
					match(ASSIGN);
					setState(653);
					var_initializer();
					}
				}

				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_var_declarationContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PelicanParser.ASSIGN, 0); }
		public Var_initializerContext var_initializer() {
			return getRuleContext(Var_initializerContext.class,0);
		}
		public TerminalNode VAR() { return getToken(PelicanParser.VAR, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Simple_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterSimple_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitSimple_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitSimple_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_var_declarationContext simple_var_declaration() throws RecognitionException {
		Simple_var_declarationContext _localctx = new Simple_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_simple_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(661);
				match(VAR);
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case FUNCTION:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case STRUCT:
			case UINT:
			case ULONG:
			case UNION:
			case USHORT:
			case VOID:
			case ID:
			case OPEN_PAREN:
				{
				setState(662);
				type_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(665);
			var_name();
			setState(666);
			match(ASSIGN);
			setState(667);
			var_initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public Destructed_var_nameContext destructed_var_name() {
			return getRuleContext(Destructed_var_nameContext.class,0);
		}
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_var_name);
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				((Var_nameContext)_localctx).name = match(ID);
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				destructed_var_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Destructed_var_nameContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public Destructed_var_name_listContext destructed_var_name_list() {
			return getRuleContext(Destructed_var_name_listContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Destructed_var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructed_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterDestructed_var_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitDestructed_var_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitDestructed_var_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destructed_var_nameContext destructed_var_name() throws RecognitionException {
		Destructed_var_nameContext _localctx = new Destructed_var_nameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_destructed_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(OPEN_PAREN);
			setState(674);
			destructed_var_name_list();
			setState(675);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Destructed_var_name_listContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public Destructed_var_name_listContext destructed_var_name_list() {
			return getRuleContext(Destructed_var_name_listContext.class,0);
		}
		public Destructed_var_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructed_var_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterDestructed_var_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitDestructed_var_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitDestructed_var_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destructed_var_name_listContext destructed_var_name_list() throws RecognitionException {
		Destructed_var_name_listContext _localctx = new Destructed_var_name_listContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_destructed_var_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			var_name();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(678);
				match(COMMA);
				setState(679);
				destructed_var_name_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PelicanParser.OPEN_BRACE, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PelicanParser.CLOSE_BRACE, 0); }
		public Var_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterVar_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitVar_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitVar_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_initializerContext var_initializer() throws RecognitionException {
		Var_initializerContext _localctx = new Var_initializerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_var_initializer);
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE_:
			case NEW:
			case NULL:
			case SIZEOF:
			case THIS:
			case TRUE_:
			case ID:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case OPEN_PAREN:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(OPEN_BRACE);
				setState(684);
				initializer_list();
				setState(685);
				match(CLOSE_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitInitializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitInitializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			expression();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(690);
				match(COMMA);
				setState(691);
				initializer_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Container_declarationContext extends ParserRuleContext {
		public Container_headContext container_head() {
			return getRuleContext(Container_headContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PelicanParser.OPEN_BRACE, 0); }
		public Container_bodyContext container_body() {
			return getRuleContext(Container_bodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PelicanParser.CLOSE_BRACE, 0); }
		public Container_implementationContext container_implementation() {
			return getRuleContext(Container_implementationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PelicanParser.SEMI, 0); }
		public Container_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterContainer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitContainer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitContainer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_declarationContext container_declaration() throws RecognitionException {
		Container_declarationContext _localctx = new Container_declarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_container_declaration);
		int _la;
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				container_head();
				setState(695);
				match(OPEN_BRACE);
				setState(696);
				container_body();
				setState(697);
				match(CLOSE_BRACE);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(698);
					container_implementation();
					}
				}

				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(701);
					match(SEMI);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				container_head();
				setState(707);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(705);
					container_implementation();
					}
					break;
				case SEMI:
					{
					setState(706);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Container_headContext extends ParserRuleContext {
		public Container_nameContext container_name() {
			return getRuleContext(Container_nameContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(PelicanParser.STRUCT, 0); }
		public TerminalNode UNION() { return getToken(PelicanParser.UNION, 0); }
		public Template_specifierContext template_specifier() {
			return getRuleContext(Template_specifierContext.class,0);
		}
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public Container_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterContainer_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitContainer_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitContainer_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_headContext container_head() throws RecognitionException {
		Container_headContext _localctx = new Container_headContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_container_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(711);
				template_specifier();
				}
			}

			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERNAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(714);
				visibility_modifier();
				}
			}

			setState(717);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(718);
			container_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Container_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public Container_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterContainer_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitContainer_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitContainer_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_nameContext container_name() throws RecognitionException {
		Container_nameContext _localctx = new Container_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_container_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			((Container_nameContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Container_bodyContext extends ParserRuleContext {
		public Container_field_listContext container_field_list() {
			return getRuleContext(Container_field_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PelicanParser.SEMI, 0); }
		public Container_method_listContext container_method_list() {
			return getRuleContext(Container_method_listContext.class,0);
		}
		public Container_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterContainer_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitContainer_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitContainer_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_bodyContext container_body() throws RecognitionException {
		Container_bodyContext _localctx = new Container_bodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_container_body);
		int _la;
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (BOOL - 7)) | (1L << (BYTE - 7)) | (1L << (CHAR - 7)) | (1L << (DOUBLE - 7)) | (1L << (FLOAT - 7)) | (1L << (FUNCTION - 7)) | (1L << (INT - 7)) | (1L << (LONG - 7)) | (1L << (SBYTE - 7)) | (1L << (SHORT - 7)) | (1L << (STRUCT - 7)) | (1L << (UINT - 7)) | (1L << (ULONG - 7)) | (1L << (UNION - 7)) | (1L << (USHORT - 7)) | (1L << (VOID - 7)) | (1L << (ID - 7)) | (1L << (OPEN_PAREN - 7)))) != 0)) {
					{
					setState(722);
					container_field_list();
					}
				}

				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(725);
					match(SEMI);
					setState(726);
					container_method_list();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				container_method_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Container_field_listContext extends ParserRuleContext {
		public Container_fieldContext container_field() {
			return getRuleContext(Container_fieldContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public Container_field_listContext container_field_list() {
			return getRuleContext(Container_field_listContext.class,0);
		}
		public Container_field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterContainer_field_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitContainer_field_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitContainer_field_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_field_listContext container_field_list() throws RecognitionException {
		Container_field_listContext _localctx = new Container_field_listContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_container_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			container_field();
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(733);
				match(COMMA);
				setState(734);
				container_field_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Container_fieldContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PelicanParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Container_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterContainer_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitContainer_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitContainer_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_fieldContext container_field() throws RecognitionException {
		Container_fieldContext _localctx = new Container_fieldContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_container_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			type_specifier();
			setState(738);
			var_name();
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(739);
				match(ASSIGN);
				setState(740);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Container_method_listContext extends ParserRuleContext {
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public Container_method_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_method_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterContainer_method_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitContainer_method_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitContainer_method_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_method_listContext container_method_list() throws RecognitionException {
		Container_method_listContext _localctx = new Container_method_listContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_container_method_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(743);
				function_declaration();
				}
				}
				setState(746); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << EXTERN) | (1L << FLOAT) | (1L << FUNCTION) | (1L << INT) | (1L << INTERNAL) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SBYTE) | (1L << SHORT) | (1L << STATIC) | (1L << STRUCT) | (1L << UINT) | (1L << ULONG) | (1L << UNION) | (1L << USHORT) | (1L << VOID) | (1L << ID))) != 0) || _la==OPEN_PAREN || _la==LT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Container_implementationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PelicanParser.COLON, 0); }
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PelicanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PelicanParser.COMMA, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PelicanParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PelicanParser.CLOSE_BRACE, 0); }
		public Container_method_listContext container_method_list() {
			return getRuleContext(Container_method_listContext.class,0);
		}
		public Container_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterContainer_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitContainer_implementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitContainer_implementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_implementationContext container_implementation() throws RecognitionException {
		Container_implementationContext _localctx = new Container_implementationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_container_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(COLON);
			setState(749);
			interface_name();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(750);
				match(COMMA);
				setState(751);
				interface_name();
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(757);
				match(OPEN_BRACE);
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << EXTERN) | (1L << FLOAT) | (1L << FUNCTION) | (1L << INT) | (1L << INTERNAL) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SBYTE) | (1L << SHORT) | (1L << STATIC) | (1L << STRUCT) | (1L << UINT) | (1L << ULONG) | (1L << UNION) | (1L << USHORT) | (1L << VOID) | (1L << ID))) != 0) || _la==OPEN_PAREN || _la==LT) {
					{
					setState(758);
					container_method_list();
					}
				}

				setState(761);
				match(CLOSE_BRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(PelicanParser.ENUM, 0); }
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PelicanParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PelicanParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PelicanParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PelicanParser.SEMI, i);
		}
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public Enum_entry_listContext enum_entry_list() {
			return getRuleContext(Enum_entry_listContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitEnum_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitEnum_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_enum_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERNAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(764);
				visibility_modifier();
				}
			}

			setState(767);
			match(ENUM);
			setState(768);
			enum_name();
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(769);
				match(OPEN_BRACE);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID || _la==OPEN_PAREN) {
					{
					setState(770);
					enum_entry_list();
					}
				}

				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(773);
					match(SEMI);
					}
				}

				setState(776);
				match(CLOSE_BRACE);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(777);
					match(SEMI);
					}
				}

				}
				break;
			case SEMI:
				{
				setState(780);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterEnum_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitEnum_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitEnum_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			((Enum_nameContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_entry_listContext extends ParserRuleContext {
		public Enum_entryContext enum_entry() {
			return getRuleContext(Enum_entryContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public Enum_entry_listContext enum_entry_list() {
			return getRuleContext(Enum_entry_listContext.class,0);
		}
		public Enum_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterEnum_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitEnum_entry_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitEnum_entry_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_entry_listContext enum_entry_list() throws RecognitionException {
		Enum_entry_listContext _localctx = new Enum_entry_listContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_enum_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			enum_entry();
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(786);
				match(COMMA);
				setState(787);
				enum_entry_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_entryContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PelicanParser.ASSIGN, 0); }
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Enum_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterEnum_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitEnum_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitEnum_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_entryContext enum_entry() throws RecognitionException {
		Enum_entryContext _localctx = new Enum_entryContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_enum_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			var_name();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(791);
				match(ASSIGN);
				setState(792);
				integer_literal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_declarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(PelicanParser.INTERFACE, 0); }
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PelicanParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PelicanParser.CLOSE_BRACE, 0); }
		public TerminalNode SEMI() { return getToken(PelicanParser.SEMI, 0); }
		public Template_specifierContext template_specifier() {
			return getRuleContext(Template_specifierContext.class,0);
		}
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public Interface_method_listContext interface_method_list() {
			return getRuleContext(Interface_method_listContext.class,0);
		}
		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterInterface_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitInterface_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitInterface_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_interface_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(795);
				template_specifier();
				}
			}

			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERNAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(798);
				visibility_modifier();
				}
			}

			setState(801);
			match(INTERFACE);
			setState(802);
			interface_name();
			setState(812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(803);
				match(OPEN_BRACE);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << EXTERN) | (1L << FLOAT) | (1L << FUNCTION) | (1L << INT) | (1L << INTERNAL) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SBYTE) | (1L << SHORT) | (1L << STATIC) | (1L << STRUCT) | (1L << UINT) | (1L << ULONG) | (1L << UNION) | (1L << USHORT) | (1L << VOID) | (1L << ID))) != 0) || _la==OPEN_PAREN || _la==LT) {
					{
					setState(804);
					interface_method_list();
					}
				}

				setState(807);
				match(CLOSE_BRACE);
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(808);
					match(SEMI);
					}
				}

				}
				break;
			case SEMI:
				{
				setState(811);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_method_listContext extends ParserRuleContext {
		public List<Abstract_function_declarationContext> abstract_function_declaration() {
			return getRuleContexts(Abstract_function_declarationContext.class);
		}
		public Abstract_function_declarationContext abstract_function_declaration(int i) {
			return getRuleContext(Abstract_function_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PelicanParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PelicanParser.SEMI, i);
		}
		public Interface_method_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_method_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterInterface_method_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitInterface_method_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitInterface_method_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_method_listContext interface_method_list() throws RecognitionException {
		Interface_method_listContext _localctx = new Interface_method_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_interface_method_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(814);
				abstract_function_declaration();
				setState(815);
				match(SEMI);
				}
				}
				setState(819); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << EXTERN) | (1L << FLOAT) | (1L << FUNCTION) | (1L << INT) | (1L << INTERNAL) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SBYTE) | (1L << SHORT) | (1L << STATIC) | (1L << STRUCT) | (1L << UINT) | (1L << ULONG) | (1L << UNION) | (1L << USHORT) | (1L << VOID) | (1L << ID))) != 0) || _la==OPEN_PAREN || _la==LT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public Interface_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterInterface_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitInterface_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitInterface_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_nameContext interface_name() throws RecognitionException {
		Interface_nameContext _localctx = new Interface_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_interface_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			((Interface_nameContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifierContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitType_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_type_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			type(0);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==AMP) {
				{
				setState(824);
				pointer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_modifiersContext extends ParserRuleContext {
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public ExternContext extern() {
			return getRuleContext(ExternContext.class,0);
		}
		public Const_Context const_() {
			return getRuleContext(Const_Context.class,0);
		}
		public Static_Context static_() {
			return getRuleContext(Static_Context.class,0);
		}
		public Type_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterType_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitType_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitType_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_modifiersContext type_modifiers() throws RecognitionException {
		Type_modifiersContext _localctx = new Type_modifiersContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_type_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERNAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(827);
				visibility_modifier();
				}
			}

			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERN) {
				{
				setState(830);
				extern();
				}
			}

			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(833);
				const_();
				}
			}

			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(836);
				static_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Tupel_typeContext tupel_type() {
			return getRuleContext(Tupel_typeContext.class,0);
		}
		public Builtin_typeContext builtin_type() {
			return getRuleContext(Builtin_typeContext.class,0);
		}
		public Templated_typeContext templated_type() {
			return getRuleContext(Templated_typeContext.class,0);
		}
		public Actual_template_typesContext actual_template_types() {
			return getRuleContext(Actual_template_typesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(PelicanParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PelicanParser.CLOSE_BRACKET, 0); }
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				setState(840);
				tupel_type();
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case FUNCTION:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
			case VOID:
				{
				setState(841);
				builtin_type();
				}
				break;
			case STRUCT:
			case UNION:
			case ID:
				{
				setState(842);
				templated_type();
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(843);
					actual_template_types();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(856);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(848);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(849);
					match(OPEN_BRACKET);
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << HEX_INTEGER_LITERAL) | (1L << BIN_INTEGER_LITERAL))) != 0)) {
						{
						setState(850);
						integer_literal();
						}
					}

					setState(853);
					match(CLOSE_BRACKET);
					}
					} 
				}
				setState(858);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tupel_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public Tupel_type_listContext tupel_type_list() {
			return getRuleContext(Tupel_type_listContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Tupel_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupel_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterTupel_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitTupel_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitTupel_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tupel_typeContext tupel_type() throws RecognitionException {
		Tupel_typeContext _localctx = new Tupel_typeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_tupel_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(OPEN_PAREN);
			setState(860);
			tupel_type_list();
			setState(861);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tupel_type_listContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public Tupel_type_listContext tupel_type_list() {
			return getRuleContext(Tupel_type_listContext.class,0);
		}
		public Tupel_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupel_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterTupel_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitTupel_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitTupel_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tupel_type_listContext tupel_type_list() throws RecognitionException {
		Tupel_type_listContext _localctx = new Tupel_type_listContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_tupel_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			type(0);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(864);
				match(COMMA);
				setState(865);
				tupel_type_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Templated_typeContext extends ParserRuleContext {
		public Container_typeContext container_type() {
			return getRuleContext(Container_typeContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Templated_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templated_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterTemplated_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitTemplated_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitTemplated_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Templated_typeContext templated_type() throws RecognitionException {
		Templated_typeContext _localctx = new Templated_typeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_templated_type);
		try {
			setState(870);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				container_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				type_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			((Type_nameContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Visibility_modifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(PelicanParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(PelicanParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(PelicanParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(PelicanParser.INTERNAL, 0); }
		public Visibility_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterVisibility_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitVisibility_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitVisibility_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Visibility_modifierContext visibility_modifier() throws RecognitionException {
		Visibility_modifierContext _localctx = new Visibility_modifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_visibility_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERNAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(PelicanParser.EXTERN, 0); }
		public ExternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitExtern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitExtern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternContext extern() throws RecognitionException {
		ExternContext _localctx = new ExternContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_extern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(EXTERN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_Context extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PelicanParser.CONST, 0); }
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterConst_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitConst_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitConst_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_const_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_Context extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(PelicanParser.STATIC, 0); }
		public Static_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterStatic_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitStatic_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitStatic_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Static_Context static_() throws RecognitionException {
		Static_Context _localctx = new Static_Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_static_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(STATIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Builtin_typeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(PelicanParser.VOID, 0); }
		public TerminalNode BOOL() { return getToken(PelicanParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(PelicanParser.BYTE, 0); }
		public TerminalNode SBYTE() { return getToken(PelicanParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(PelicanParser.SHORT, 0); }
		public TerminalNode USHORT() { return getToken(PelicanParser.USHORT, 0); }
		public TerminalNode INT() { return getToken(PelicanParser.INT, 0); }
		public TerminalNode UINT() { return getToken(PelicanParser.UINT, 0); }
		public TerminalNode LONG() { return getToken(PelicanParser.LONG, 0); }
		public TerminalNode ULONG() { return getToken(PelicanParser.ULONG, 0); }
		public TerminalNode FLOAT() { return getToken(PelicanParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(PelicanParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(PelicanParser.CHAR, 0); }
		public TerminalNode FUNCTION() { return getToken(PelicanParser.FUNCTION, 0); }
		public TerminalNode LT() { return getToken(PelicanParser.LT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(PelicanParser.GT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PelicanParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PelicanParser.CLOSE_PAREN, 0); }
		public Actual_template_type_listContext actual_template_type_list() {
			return getRuleContext(Actual_template_type_listContext.class,0);
		}
		public Builtin_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterBuiltin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitBuiltin_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitBuiltin_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Builtin_typeContext builtin_type() throws RecognitionException {
		Builtin_typeContext _localctx = new Builtin_typeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_builtin_type);
		int _la;
		try {
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				match(VOID);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				match(BOOL);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(884);
				match(BYTE);
				}
				break;
			case SBYTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
				match(SBYTE);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(886);
				match(SHORT);
				}
				break;
			case USHORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(887);
				match(USHORT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 7);
				{
				setState(888);
				match(INT);
				}
				break;
			case UINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(889);
				match(UINT);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 9);
				{
				setState(890);
				match(LONG);
				}
				break;
			case ULONG:
				enterOuterAlt(_localctx, 10);
				{
				setState(891);
				match(ULONG);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 11);
				{
				setState(892);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 12);
				{
				setState(893);
				match(DOUBLE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(894);
				match(CHAR);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 14);
				{
				setState(895);
				match(FUNCTION);
				setState(896);
				match(LT);
				setState(897);
				type(0);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(898);
					match(OPEN_PAREN);
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (BOOL - 7)) | (1L << (BYTE - 7)) | (1L << (CHAR - 7)) | (1L << (DOUBLE - 7)) | (1L << (FLOAT - 7)) | (1L << (FUNCTION - 7)) | (1L << (INT - 7)) | (1L << (LONG - 7)) | (1L << (SBYTE - 7)) | (1L << (SHORT - 7)) | (1L << (STRUCT - 7)) | (1L << (UINT - 7)) | (1L << (ULONG - 7)) | (1L << (UNION - 7)) | (1L << (USHORT - 7)) | (1L << (VOID - 7)) | (1L << (ID - 7)) | (1L << (OPEN_PAREN - 7)))) != 0)) {
						{
						setState(899);
						actual_template_type_list();
						}
					}

					setState(902);
					match(CLOSE_PAREN);
					}
				}

				setState(905);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Container_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(PelicanParser.OPEN_BRACE, 0); }
		public Container_field_listContext container_field_list() {
			return getRuleContext(Container_field_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PelicanParser.CLOSE_BRACE, 0); }
		public TerminalNode STRUCT() { return getToken(PelicanParser.STRUCT, 0); }
		public TerminalNode UNION() { return getToken(PelicanParser.UNION, 0); }
		public Container_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterContainer_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitContainer_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitContainer_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_typeContext container_type() throws RecognitionException {
		Container_typeContext _localctx = new Container_typeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_container_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(910);
			match(OPEN_BRACE);
			setState(911);
			container_field_list();
			setState(912);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> STAR() { return getTokens(PelicanParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PelicanParser.STAR, i);
		}
		public TerminalNode AMP() { return getToken(PelicanParser.AMP, 0); }
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_pointer);
		int _la;
		try {
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(915); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(914);
					match(STAR);
					}
					}
					setState(917); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STAR );
				}
				break;
			case AMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				match(AMP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_specifierContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(PelicanParser.LT, 0); }
		public TerminalNode GT() { return getToken(PelicanParser.GT, 0); }
		public Template_type_listContext template_type_list() {
			return getRuleContext(Template_type_listContext.class,0);
		}
		public Template_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterTemplate_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitTemplate_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitTemplate_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_specifierContext template_specifier() throws RecognitionException {
		Template_specifierContext _localctx = new Template_specifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_template_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(LT);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FUNCTION) | (1L << INT) | (1L << LONG) | (1L << SBYTE) | (1L << SHORT) | (1L << TYPENAME) | (1L << UINT) | (1L << ULONG) | (1L << USHORT) | (1L << VARARG) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(923);
				template_type_list();
				}
			}

			setState(926);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_type_listContext extends ParserRuleContext {
		public Template_typeContext template_type() {
			return getRuleContext(Template_typeContext.class,0);
		}
		public TerminalNode VARARG() { return getToken(PelicanParser.VARARG, 0); }
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public Template_type_listContext template_type_list() {
			return getRuleContext(Template_type_listContext.class,0);
		}
		public Template_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterTemplate_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitTemplate_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitTemplate_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_type_listContext template_type_list() throws RecognitionException {
		Template_type_listContext _localctx = new Template_type_listContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_template_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARARG) {
				{
				setState(928);
				match(VARARG);
				}
			}

			setState(931);
			template_type();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(932);
				match(COMMA);
				setState(933);
				template_type_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_typeContext extends ParserRuleContext {
		public Template_kindContext template_kind() {
			return getRuleContext(Template_kindContext.class,0);
		}
		public Template_nameContext template_name() {
			return getRuleContext(Template_nameContext.class,0);
		}
		public Template_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterTemplate_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitTemplate_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitTemplate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_typeContext template_type() throws RecognitionException {
		Template_typeContext _localctx = new Template_typeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_template_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			template_kind();
			setState(937);
			template_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_kindContext extends ParserRuleContext {
		public TerminalNode TYPENAME() { return getToken(PelicanParser.TYPENAME, 0); }
		public TerminalNode CLASS() { return getToken(PelicanParser.CLASS, 0); }
		public Builtin_typeContext builtin_type() {
			return getRuleContext(Builtin_typeContext.class,0);
		}
		public Template_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterTemplate_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitTemplate_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitTemplate_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_kindContext template_kind() throws RecognitionException {
		Template_kindContext _localctx = new Template_kindContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_template_kind);
		int _la;
		try {
			setState(944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPENAME:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPENAME) {
					{
					setState(939);
					match(TYPENAME);
					}
				}

				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(CLASS);
				}
				break;
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case FUNCTION:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
				builtin_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_nameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(PelicanParser.ID, 0); }
		public Template_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterTemplate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitTemplate_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitTemplate_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_nameContext template_name() throws RecognitionException {
		Template_nameContext _localctx = new Template_nameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_template_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			((Template_nameContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_template_typesContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(PelicanParser.LT, 0); }
		public TerminalNode GT() { return getToken(PelicanParser.GT, 0); }
		public Actual_template_type_listContext actual_template_type_list() {
			return getRuleContext(Actual_template_type_listContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(PelicanParser.QUESTION, 0); }
		public Actual_template_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_template_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterActual_template_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitActual_template_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitActual_template_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_template_typesContext actual_template_types() throws RecognitionException {
		Actual_template_typesContext _localctx = new Actual_template_typesContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_actual_template_types);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(LT);
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case FUNCTION:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case STRUCT:
			case UINT:
			case ULONG:
			case UNION:
			case USHORT:
			case VOID:
			case ID:
			case OPEN_PAREN:
				{
				setState(949);
				actual_template_type_list();
				}
				break;
			case QUESTION:
				{
				setState(950);
				match(QUESTION);
				}
				break;
			case GT:
				break;
			default:
				break;
			}
			setState(953);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_template_type_listContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PelicanParser.COMMA, 0); }
		public Actual_template_type_listContext actual_template_type_list() {
			return getRuleContext(Actual_template_type_listContext.class,0);
		}
		public Actual_template_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_template_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).enterActual_template_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PelicanParserListener ) ((PelicanParserListener)listener).exitActual_template_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PelicanParserVisitor ) return ((PelicanParserVisitor<? extends T>)visitor).visitActual_template_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_template_type_listContext actual_template_type_list() throws RecognitionException {
		Actual_template_type_listContext _localctx = new Actual_template_type_listContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_actual_template_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			type(0);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(956);
				match(COMMA);
				setState(957);
				actual_template_type_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 82:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3r\u03c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\5\2\u00ce\n\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3\u00d6\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e0\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00e8\n\5\3\6\3\6\3\7\3\7\3\7\5\7\u00ef"+
		"\n\7\3\7\3\7\3\7\5\7\u00f4\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00fd\n"+
		"\b\f\b\16\b\u0100\13\b\3\b\3\b\5\b\u0104\n\b\3\t\3\t\3\t\5\t\u0109\n\t"+
		"\3\t\3\t\3\t\5\t\u010e\n\t\3\n\3\n\3\n\7\n\u0113\n\n\f\n\16\n\u0116\13"+
		"\n\3\n\3\n\3\13\7\13\u011b\n\13\f\13\16\13\u011e\13\13\3\13\3\13\5\13"+
		"\u0122\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u012a\n\f\3\r\3\r\3\r\7\r\u012f"+
		"\n\r\f\r\16\r\u0132\13\r\3\16\3\16\3\16\7\16\u0137\n\16\f\16\16\16\u013a"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u0141\n\17\3\17\7\17\u0144\n\17\f"+
		"\17\16\17\u0147\13\17\3\20\3\20\3\20\7\20\u014c\n\20\f\20\16\20\u014f"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\7\21\u0156\n\21\f\21\16\21\u0159\13\21"+
		"\3\22\3\22\3\22\7\22\u015e\n\22\f\22\16\22\u0161\13\22\3\23\3\23\3\23"+
		"\7\23\u0166\n\23\f\23\16\23\u0169\13\23\3\24\3\24\3\24\7\24\u016e\n\24"+
		"\f\24\16\24\u0171\13\24\3\25\3\25\3\25\7\25\u0176\n\25\f\25\16\25\u0179"+
		"\13\25\3\26\3\26\3\26\3\26\7\26\u017f\n\26\f\26\16\26\u0182\13\26\3\27"+
		"\3\27\3\27\3\27\7\27\u0188\n\27\f\27\16\27\u018b\13\27\3\30\3\30\3\30"+
		"\5\30\u0190\n\30\3\31\3\31\3\31\5\31\u0195\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u019d\n\32\3\33\3\33\3\33\5\33\u01a2\n\33\3\34\3\34\3\35"+
		"\3\35\3\35\5\35\u01a9\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01b2"+
		"\n\36\3\37\6\37\u01b5\n\37\r\37\16\37\u01b6\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \5 \u01c7\n \3!\3!\5!\u01cb\n!\3!\3!\5!\u01cf\n!\3!\3"+
		"!\3\"\3\"\3#\3#\5#\u01d7\n#\3#\3#\3$\3$\5$\u01dd\n$\3$\3$\5$\u01e1\n$"+
		"\3%\3%\3%\3%\3&\3&\3\'\3\'\5\'\u01eb\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u01f4"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\7*\u0202\n*\f*\16*\u0205\13*\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\5,\u020f\n,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		".\3.\3/\3/\3/\5/\u0221\n/\3/\3/\5/\u0225\n/\3/\3/\5/\u0229\n/\3/\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\5\62\u023a"+
		"\n\62\3\63\6\63\u023d\n\63\r\63\16\63\u023e\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u024b\n\64\3\65\5\65\u024e\n\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u0255\n\65\3\65\3\65\3\65\3\66\5\66\u025b\n\66\3"+
		"\66\3\66\3\66\3\66\3\66\5\66\u0262\n\66\3\66\3\66\3\67\3\67\38\58\u0269"+
		"\n8\38\38\38\58\u026e\n8\39\39\39\39\39\39\39\39\59\u0278\n9\3:\3:\3;"+
		"\3;\3;\3;\3;\5;\u0281\n;\3<\3<\3<\5<\u0286\n<\3<\3<\3<\5<\u028b\n<\3<"+
		"\3<\3<\3<\5<\u0291\n<\7<\u0293\n<\f<\16<\u0296\13<\3=\3=\5=\u029a\n=\3"+
		"=\3=\3=\3=\3>\3>\5>\u02a2\n>\3?\3?\3?\3?\3@\3@\3@\5@\u02ab\n@\3A\3A\3"+
		"A\3A\3A\5A\u02b2\nA\3B\3B\3B\5B\u02b7\nB\3C\3C\3C\3C\3C\5C\u02be\nC\3"+
		"C\5C\u02c1\nC\3C\3C\3C\5C\u02c6\nC\5C\u02c8\nC\3D\5D\u02cb\nD\3D\5D\u02ce"+
		"\nD\3D\3D\3D\3E\3E\3F\5F\u02d6\nF\3F\3F\5F\u02da\nF\3F\5F\u02dd\nF\3G"+
		"\3G\3G\5G\u02e2\nG\3H\3H\3H\3H\5H\u02e8\nH\3I\6I\u02eb\nI\rI\16I\u02ec"+
		"\3J\3J\3J\3J\7J\u02f3\nJ\fJ\16J\u02f6\13J\3J\3J\5J\u02fa\nJ\3J\5J\u02fd"+
		"\nJ\3K\5K\u0300\nK\3K\3K\3K\3K\5K\u0306\nK\3K\5K\u0309\nK\3K\3K\5K\u030d"+
		"\nK\3K\5K\u0310\nK\3L\3L\3M\3M\3M\5M\u0317\nM\3N\3N\3N\5N\u031c\nN\3O"+
		"\5O\u031f\nO\3O\5O\u0322\nO\3O\3O\3O\3O\5O\u0328\nO\3O\3O\5O\u032c\nO"+
		"\3O\5O\u032f\nO\3P\3P\3P\6P\u0334\nP\rP\16P\u0335\3Q\3Q\3R\3R\5R\u033c"+
		"\nR\3S\5S\u033f\nS\3S\5S\u0342\nS\3S\5S\u0345\nS\3S\5S\u0348\nS\3T\3T"+
		"\3T\3T\3T\5T\u034f\nT\5T\u0351\nT\3T\3T\3T\5T\u0356\nT\3T\7T\u0359\nT"+
		"\fT\16T\u035c\13T\3U\3U\3U\3U\3V\3V\3V\5V\u0365\nV\3W\3W\5W\u0369\nW\3"+
		"X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]"+
		"\3]\3]\3]\3]\3]\5]\u0387\n]\3]\5]\u038a\n]\3]\3]\5]\u038e\n]\3^\3^\3^"+
		"\3^\3^\3_\6_\u0396\n_\r_\16_\u0397\3_\5_\u039b\n_\3`\3`\5`\u039f\n`\3"+
		"`\3`\3a\5a\u03a4\na\3a\3a\3a\5a\u03a9\na\3b\3b\3b\3c\5c\u03af\nc\3c\3"+
		"c\5c\u03b3\nc\3d\3d\3e\3e\3e\5e\u03ba\ne\3e\3e\3f\3f\3f\5f\u03c1\nf\3"+
		"f\2\3\u00a6g\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\2\16\4\2\25\25"+
		"..\3\2:<\3\2[\\\7\2  JLOORS[\\\3\2LN\3\2JK\4\2UVde\3\2bc\4\2TTfp\6\2\n"+
		"\n\16\16\32\32&&\4\2++\62\62\5\2\36\36\"\"$%\2\u03f8\2\u00cd\3\2\2\2\4"+
		"\u00d5\3\2\2\2\6\u00df\3\2\2\2\b\u00e7\3\2\2\2\n\u00e9\3\2\2\2\f\u00ee"+
		"\3\2\2\2\16\u0103\3\2\2\2\20\u010d\3\2\2\2\22\u010f\3\2\2\2\24\u0121\3"+
		"\2\2\2\26\u0123\3\2\2\2\30\u012b\3\2\2\2\32\u0133\3\2\2\2\34\u013b\3\2"+
		"\2\2\36\u0148\3\2\2\2 \u0150\3\2\2\2\"\u015a\3\2\2\2$\u0162\3\2\2\2&\u016a"+
		"\3\2\2\2(\u0172\3\2\2\2*\u017a\3\2\2\2,\u0183\3\2\2\2.\u018c\3\2\2\2\60"+
		"\u0191\3\2\2\2\62\u0196\3\2\2\2\64\u019e\3\2\2\2\66\u01a3\3\2\2\28\u01a5"+
		"\3\2\2\2:\u01b1\3\2\2\2<\u01b4\3\2\2\2>\u01c6\3\2\2\2@\u01c8\3\2\2\2B"+
		"\u01d2\3\2\2\2D\u01d4\3\2\2\2F\u01da\3\2\2\2H\u01e2\3\2\2\2J\u01e6\3\2"+
		"\2\2L\u01ea\3\2\2\2N\u01ec\3\2\2\2P\u01f5\3\2\2\2R\u0203\3\2\2\2T\u0206"+
		"\3\2\2\2V\u020e\3\2\2\2X\u0210\3\2\2\2Z\u0216\3\2\2\2\\\u021d\3\2\2\2"+
		"^\u022d\3\2\2\2`\u022f\3\2\2\2b\u0239\3\2\2\2d\u023c\3\2\2\2f\u024a\3"+
		"\2\2\2h\u024d\3\2\2\2j\u025a\3\2\2\2l\u0265\3\2\2\2n\u0268\3\2\2\2p\u0277"+
		"\3\2\2\2r\u0279\3\2\2\2t\u0280\3\2\2\2v\u0282\3\2\2\2x\u0299\3\2\2\2z"+
		"\u02a1\3\2\2\2|\u02a3\3\2\2\2~\u02a7\3\2\2\2\u0080\u02b1\3\2\2\2\u0082"+
		"\u02b3\3\2\2\2\u0084\u02c7\3\2\2\2\u0086\u02ca\3\2\2\2\u0088\u02d2\3\2"+
		"\2\2\u008a\u02dc\3\2\2\2\u008c\u02de\3\2\2\2\u008e\u02e3\3\2\2\2\u0090"+
		"\u02ea\3\2\2\2\u0092\u02ee\3\2\2\2\u0094\u02ff\3\2\2\2\u0096\u0311\3\2"+
		"\2\2\u0098\u0313\3\2\2\2\u009a\u0318\3\2\2\2\u009c\u031e\3\2\2\2\u009e"+
		"\u0333\3\2\2\2\u00a0\u0337\3\2\2\2\u00a2\u0339\3\2\2\2\u00a4\u033e\3\2"+
		"\2\2\u00a6\u0350\3\2\2\2\u00a8\u035d\3\2\2\2\u00aa\u0361\3\2\2\2\u00ac"+
		"\u0368\3\2\2\2\u00ae\u036a\3\2\2\2\u00b0\u036c\3\2\2\2\u00b2\u036e\3\2"+
		"\2\2\u00b4\u0370\3\2\2\2\u00b6\u0372\3\2\2\2\u00b8\u038d\3\2\2\2\u00ba"+
		"\u038f\3\2\2\2\u00bc\u039a\3\2\2\2\u00be\u039c\3\2\2\2\u00c0\u03a3\3\2"+
		"\2\2\u00c2\u03aa\3\2\2\2\u00c4\u03b2\3\2\2\2\u00c6\u03b4\3\2\2\2\u00c8"+
		"\u03b6\3\2\2\2\u00ca\u03bd\3\2\2\2\u00cc\u00ce\5d\63\2\u00cd\u00cc\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\2\2\3\u00d0"+
		"\3\3\2\2\2\u00d1\u00d6\5\6\4\2\u00d2\u00d6\5\60\31\2\u00d3\u00d6\5\20"+
		"\t\2\u00d4\u00d6\5\64\33\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\5\3\2\2\2\u00d7\u00d8\7D\2\2"+
		"\u00d8\u00d9\5\4\3\2\u00d9\u00da\7E\2\2\u00da\u00e0\3\2\2\2\u00db\u00e0"+
		"\5\b\5\2\u00dc\u00e0\5\f\7\2\u00dd\u00e0\5\66\34\2\u00de\u00e0\7-\2\2"+
		"\u00df\u00d7\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\7\3\2\2\2\u00e1\u00e8\5\n\6\2\u00e2"+
		"\u00e8\7=\2\2\u00e3\u00e8\7>\2\2\u00e4\u00e8\7?\2\2\u00e5\u00e8\t\2\2"+
		"\2\u00e6\u00e8\7!\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3"+
		"\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\t\3\2\2\2\u00e9\u00ea\t\3\2\2\u00ea\13\3\2\2\2\u00eb\u00ec\5J&\2\u00ec"+
		"\u00ed\7H\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f4\5|?\2\u00f1\u00f2\7D\2\2\u00f2\u00f4"+
		"\7E\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\7W\2\2\u00f6\u00f7\7@\2\2\u00f7\u00f8\5> \2\u00f8\u00f9\7A\2\2"+
		"\u00f9\r\3\2\2\2\u00fa\u00fe\5\6\4\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3"+
		"\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0104\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0104\5\20\t\2\u0102\u0104\5"+
		"\22\n\2\u0103\u00fa\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\17\3\2\2\2\u0105\u0106\5\6\4\2\u0106\u0108\7D\2\2\u0107\u0109\58\35\2"+
		"\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\7E\2\2\u010b\u010e\3\2\2\2\u010c\u010e\5@!\2\u010d\u0105\3\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\21\3\2\2\2\u010f\u0110\5\6\4\2\u0110\u0114\7B\2\2"+
		"\u0111\u0113\5\4\3\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\7C\2\2\u0118\23\3\2\2\2\u0119\u011b\t\5\2\2\u011a\u0119\3\2\2\2"+
		"\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0122\5\16\b\2\u0120\u0122\5\26\f\2"+
		"\u0121\u011c\3\2\2\2\u0121\u0120\3\2\2\2\u0122\25\3\2\2\2\u0123\u0129"+
		"\7)\2\2\u0124\u012a\5\16\b\2\u0125\u0126\7D\2\2\u0126\u0127\5\u00a6T\2"+
		"\u0127\u0128\7E\2\2\u0128\u012a\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125"+
		"\3\2\2\2\u012a\27\3\2\2\2\u012b\u0130\5\24\13\2\u012c\u012d\t\6\2\2\u012d"+
		"\u012f\5\24\13\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\31\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0138\5\30\r\2\u0134\u0135\t\7\2\2\u0135\u0137\5\30\r\2\u0136\u0134\3"+
		"\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\33\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0145\5\32\16\2\u013c\u013d\7U\2"+
		"\2\u013d\u0141\7U\2\2\u013e\u013f\7V\2\2\u013f\u0141\7V\2\2\u0140\u013c"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\5\32\16\2"+
		"\u0143\u0140\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\35\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014d\5\34\17\2\u0149"+
		"\u014a\t\b\2\2\u014a\u014c\5\34\17\2\u014b\u0149\3\2\2\2\u014c\u014f\3"+
		"\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\37\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0157\5\36\20\2\u0151\u0152\7`\2\2\u0152\u0153\7"+
		"a\2\2\u0153\u0154\3\2\2\2\u0154\u0156\5\36\20\2\u0155\u0151\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158!\3\2\2\2"+
		"\u0159\u0157\3\2\2\2\u015a\u015f\5 \21\2\u015b\u015c\t\t\2\2\u015c\u015e"+
		"\5 \21\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160#\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0167\5\"\22\2"+
		"\u0163\u0164\7O\2\2\u0164\u0166\5\"\22\2\u0165\u0163\3\2\2\2\u0166\u0169"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168%\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016f\5$\23\2\u016b\u016c\7Q\2\2\u016c\u016e\5$\23"+
		"\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\'\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0177\5&\24\2\u0173"+
		"\u0174\7P\2\2\u0174\u0176\5&\24\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178)\3\2\2\2\u0179\u0177"+
		"\3\2\2\2\u017a\u0180\5(\25\2\u017b\u017c\7O\2\2\u017c\u017d\7O\2\2\u017d"+
		"\u017f\5(\25\2\u017e\u017b\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181+\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0189"+
		"\5*\26\2\u0184\u0185\7P\2\2\u0185\u0186\7P\2\2\u0186\u0188\5*\26\2\u0187"+
		"\u0184\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a-\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018f\5,\27\2\u018d\u018e"+
		"\7Z\2\2\u018e\u0190\5\4\3\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"/\3\2\2\2\u0191\u0194\5.\30\2\u0192\u0193\t\n\2\2\u0193\u0195\5.\30\2"+
		"\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\61\3\2\2\2\u0196\u019c"+
		"\5\60\31\2\u0197\u0198\7X\2\2\u0198\u0199\5\4\3\2\u0199\u019a\7H\2\2\u019a"+
		"\u019b\5\4\3\2\u019b\u019d\3\2\2\2\u019c\u0197\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\63\3\2\2\2\u019e\u01a1\5\62\32\2\u019f\u01a0\7G\2\2\u01a0\u01a2"+
		"\5\4\3\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\65\3\2\2\2\u01a3"+
		"\u01a4\78\2\2\u01a4\67\3\2\2\2\u01a5\u01a8\5:\36\2\u01a6\u01a7\7G\2\2"+
		"\u01a7\u01a9\58\35\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a99\3"+
		"\2\2\2\u01aa\u01ab\7r\2\2\u01ab\u01b2\5:\36\2\u01ac\u01b2\5\4\3\2\u01ad"+
		"\u01ae\5z>\2\u01ae\u01af\7T\2\2\u01af\u01b0\5\4\3\2\u01b0\u01b2\3\2\2"+
		"\2\u01b1\u01aa\3\2\2\2\u01b1\u01ac\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b2;"+
		"\3\2\2\2\u01b3\u01b5\5> \2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7=\3\2\2\2\u01b8\u01c7\5H%\2\u01b9"+
		"\u01ba\5F$\2\u01ba\u01bb\7I\2\2\u01bb\u01c7\3\2\2\2\u01bc\u01c7\5L\'\2"+
		"\u01bd\u01c7\5V,\2\u01be\u01bf\5@!\2\u01bf\u01c0\7I\2\2\u01c0\u01c7\3"+
		"\2\2\2\u01c1\u01c2\5B\"\2\u01c2\u01c3\7I\2\2\u01c3\u01c7\3\2\2\2\u01c4"+
		"\u01c7\5D#\2\u01c5\u01c7\5f\64\2\u01c6\u01b8\3\2\2\2\u01c6\u01b9\3\2\2"+
		"\2\u01c6\u01bc\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c6\u01be\3\2\2\2\u01c6\u01c1"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7?\3\2\2\2\u01c8"+
		"\u01ca\5l\67\2\u01c9\u01cb\5\u00c8e\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\7D\2\2\u01cd\u01cf\58\35\2\u01ce"+
		"\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7E"+
		"\2\2\u01d1A\3\2\2\2\u01d2\u01d3\5\4\3\2\u01d3C\3\2\2\2\u01d4\u01d6\7@"+
		"\2\2\u01d5\u01d7\5<\37\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\7A\2\2\u01d9E\3\2\2\2\u01da\u01dc\t\13\2\2"+
		"\u01db\u01dd\5\4\3\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0"+
		"\3\2\2\2\u01de\u01df\7H\2\2\u01df\u01e1\5J&\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1G\3\2\2\2\u01e2\u01e3\5J&\2\u01e3\u01e4\7H\2\2\u01e4"+
		"\u01e5\5> \2\u01e5I\3\2\2\2\u01e6\u01e7\78\2\2\u01e7K\3\2\2\2\u01e8\u01eb"+
		"\5N(\2\u01e9\u01eb\5P)\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb"+
		"M\3\2\2\2\u01ec\u01ed\7\33\2\2\u01ed\u01ee\7D\2\2\u01ee\u01ef\5b\62\2"+
		"\u01ef\u01f0\7E\2\2\u01f0\u01f3\5> \2\u01f1\u01f2\7\22\2\2\u01f2\u01f4"+
		"\5> \2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4O\3\2\2\2\u01f5\u01f6"+
		"\7,\2\2\u01f6\u01f7\7D\2\2\u01f7\u01f8\5b\62\2\u01f8\u01f9\7E\2\2\u01f9"+
		"\u01fa\7@\2\2\u01fa\u01fb\5R*\2\u01fb\u01fc\7A\2\2\u01fcQ\3\2\2\2\u01fd"+
		"\u01fe\5T+\2\u01fe\u01ff\7W\2\2\u01ff\u0200\5> \2\u0200\u0202\3\2\2\2"+
		"\u0201\u01fd\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204"+
		"\3\2\2\2\u0204S\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\5\4\3\2\u0207"+
		"U\3\2\2\2\u0208\u020f\5X-\2\u0209\u020a\5Z.\2\u020a\u020b\7I\2\2\u020b"+
		"\u020f\3\2\2\2\u020c\u020f\5\\/\2\u020d\u020f\5`\61\2\u020e\u0208\3\2"+
		"\2\2\u020e\u0209\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f"+
		"W\3\2\2\2\u0210\u0211\7\67\2\2\u0211\u0212\7D\2\2\u0212\u0213\5b\62\2"+
		"\u0213\u0214\7E\2\2\u0214\u0215\5> \2\u0215Y\3\2\2\2\u0216\u0217\7\20"+
		"\2\2\u0217\u0218\5> \2\u0218\u0219\7\67\2\2\u0219\u021a\7D\2\2\u021a\u021b"+
		"\5\4\3\2\u021b\u021c\7E\2\2\u021c[\3\2\2\2\u021d\u021e\7\27\2\2\u021e"+
		"\u0220\7D\2\2\u021f\u0221\5b\62\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0224\7I\2\2\u0223\u0225\5\4\3\2\u0224"+
		"\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\7I"+
		"\2\2\u0227\u0229\5^\60\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022b\7E\2\2\u022b\u022c\5> \2\u022c]\3\2\2\2\u022d"+
		"\u022e\5\4\3\2\u022e_\3\2\2\2\u022f\u0230\7\30\2\2\u0230\u0231\7D\2\2"+
		"\u0231\u0232\5z>\2\u0232\u0233\7H\2\2\u0233\u0234\5b\62\2\u0234\u0235"+
		"\7E\2\2\u0235\u0236\5> \2\u0236a\3\2\2\2\u0237\u023a\5x=\2\u0238\u023a"+
		"\5\4\3\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023ac\3\2\2\2\u023b"+
		"\u023d\5f\64\2\u023c\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023fe\3\2\2\2\u0240\u024b\5h\65\2\u0241\u0242"+
		"\5j\66\2\u0242\u0243\7I\2\2\u0243\u024b\3\2\2\2\u0244\u0245\5v<\2\u0245"+
		"\u0246\7I\2\2\u0246\u024b\3\2\2\2\u0247\u024b\5\u0084C\2\u0248\u024b\5"+
		"\u0094K\2\u0249\u024b\5\u009cO\2\u024a\u0240\3\2\2\2\u024a\u0241\3\2\2"+
		"\2\u024a\u0244\3\2\2\2\u024a\u0247\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u0249"+
		"\3\2\2\2\u024bg\3\2\2\2\u024c\u024e\5\u00be`\2\u024d\u024c\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\5\u00a4S\2\u0250\u0251"+
		"\5\u00a2R\2\u0251\u0252\5l\67\2\u0252\u0254\7D\2\2\u0253\u0255\5n8\2\u0254"+
		"\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\7E"+
		"\2\2\u0257\u0258\5t;\2\u0258i\3\2\2\2\u0259\u025b\5\u00be`\2\u025a\u0259"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\5\u00a4S"+
		"\2\u025d\u025e\5\u00a2R\2\u025e\u025f\5l\67\2\u025f\u0261\7D\2\2\u0260"+
		"\u0262\5n8\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2"+
		"\2\u0263\u0264\7E\2\2\u0264k\3\2\2\2\u0265\u0266\78\2\2\u0266m\3\2\2\2"+
		"\u0267\u0269\7\65\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a"+
		"\3\2\2\2\u026a\u026d\5p9\2\u026b\u026c\7G\2\2\u026c\u026e\5n8\2\u026d"+
		"\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026eo\3\2\2\2\u026f\u0270\5\u00a2"+
		"R\2\u0270\u0271\5r:\2\u0271\u0278\3\2\2\2\u0272\u0273\5\u00a2R\2\u0273"+
		"\u0274\5r:\2\u0274\u0275\7T\2\2\u0275\u0276\5\4\3\2\u0276\u0278\3\2\2"+
		"\2\u0277\u026f\3\2\2\2\u0277\u0272\3\2\2\2\u0278q\3\2\2\2\u0279\u027a"+
		"\78\2\2\u027as\3\2\2\2\u027b\u0281\5D#\2\u027c\u027d\7T\2\2\u027d\u027e"+
		"\5\4\3\2\u027e\u027f\7I\2\2\u027f\u0281\3\2\2\2\u0280\u027b\3\2\2\2\u0280"+
		"\u027c\3\2\2\2\u0281u\3\2\2\2\u0282\u0285\5\u00a4S\2\u0283\u0286\7\64"+
		"\2\2\u0284\u0286\5\u00a2R\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u028a\5z>\2\u0288\u0289\7T\2\2\u0289\u028b\5\u0080"+
		"A\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0294\3\2\2\2\u028c"+
		"\u028d\7G\2\2\u028d\u0290\5z>\2\u028e\u028f\7T\2\2\u028f\u0291\5\u0080"+
		"A\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292"+
		"\u028c\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295w\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u029a\7\64\2\2\u0298\u029a"+
		"\5\u00a2R\2\u0299\u0297\3\2\2\2\u0299\u0298\3\2\2\2\u029a\u029b\3\2\2"+
		"\2\u029b\u029c\5z>\2\u029c\u029d\7T\2\2\u029d\u029e\5\u0080A\2\u029ey"+
		"\3\2\2\2\u029f\u02a2\78\2\2\u02a0\u02a2\5|?\2\u02a1\u029f\3\2\2\2\u02a1"+
		"\u02a0\3\2\2\2\u02a2{\3\2\2\2\u02a3\u02a4\7D\2\2\u02a4\u02a5\5~@\2\u02a5"+
		"\u02a6\7E\2\2\u02a6}\3\2\2\2\u02a7\u02aa\5z>\2\u02a8\u02a9\7G\2\2\u02a9"+
		"\u02ab\5~@\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\177\3\2\2\2"+
		"\u02ac\u02b2\5\4\3\2\u02ad\u02ae\7@\2\2\u02ae\u02af\5\u0082B\2\u02af\u02b0"+
		"\7A\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02ac\3\2\2\2\u02b1\u02ad\3\2\2\2\u02b2"+
		"\u0081\3\2\2\2\u02b3\u02b6\5\4\3\2\u02b4\u02b5\7G\2\2\u02b5\u02b7\5\u0082"+
		"B\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u0083\3\2\2\2\u02b8"+
		"\u02b9\5\u0086D\2\u02b9\u02ba\7@\2\2\u02ba\u02bb\5\u008aF\2\u02bb\u02bd"+
		"\7A\2\2\u02bc\u02be\5\u0092J\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2"+
		"\u02be\u02c0\3\2\2\2\u02bf\u02c1\7I\2\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c8\3\2\2\2\u02c2\u02c5\5\u0086D\2\u02c3\u02c6\5\u0092"+
		"J\2\u02c4\u02c6\7I\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6\u02c8"+
		"\3\2\2\2\u02c7\u02b8\3\2\2\2\u02c7\u02c2\3\2\2\2\u02c8\u0085\3\2\2\2\u02c9"+
		"\u02cb\5\u00be`\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd"+
		"\3\2\2\2\u02cc\u02ce\5\u00b0Y\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2"+
		"\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\t\f\2\2\u02d0\u02d1\5\u0088E\2\u02d1"+
		"\u0087\3\2\2\2\u02d2\u02d3\78\2\2\u02d3\u0089\3\2\2\2\u02d4\u02d6\5\u008c"+
		"G\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7"+
		"\u02d8\7I\2\2\u02d8\u02da\5\u0090I\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3"+
		"\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02dd\5\u0090I\2\u02dc\u02d5\3\2\2\2"+
		"\u02dc\u02db\3\2\2\2\u02dd\u008b\3\2\2\2\u02de\u02e1\5\u008eH\2\u02df"+
		"\u02e0\7G\2\2\u02e0\u02e2\5\u008cG\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3"+
		"\2\2\2\u02e2\u008d\3\2\2\2\u02e3\u02e4\5\u00a2R\2\u02e4\u02e7\5z>\2\u02e5"+
		"\u02e6\7T\2\2\u02e6\u02e8\5\4\3\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u008f\3\2\2\2\u02e9\u02eb\5h\65\2\u02ea\u02e9\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u0091\3\2"+
		"\2\2\u02ee\u02ef\7H\2\2\u02ef\u02f4\5\u00a0Q\2\u02f0\u02f1\7G\2\2\u02f1"+
		"\u02f3\5\u00a0Q\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02fc\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02f9\7@\2\2\u02f8\u02fa\5\u0090I\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3"+
		"\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\7A\2\2\u02fc\u02f7\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u0093\3\2\2\2\u02fe\u0300\5\u00b0Y\2\u02ff\u02fe"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\7\23\2\2"+
		"\u0302\u030f\5\u0096L\2\u0303\u0305\7@\2\2\u0304\u0306\5\u0098M\2\u0305"+
		"\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0309\7I"+
		"\2\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030c\7A\2\2\u030b\u030d\7I\2\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2"+
		"\2\u030d\u0310\3\2\2\2\u030e\u0310\7I\2\2\u030f\u0303\3\2\2\2\u030f\u030e"+
		"\3\2\2\2\u0310\u0095\3\2\2\2\u0311\u0312\78\2\2\u0312\u0097\3\2\2\2\u0313"+
		"\u0316\5\u009aN\2\u0314\u0315\7G\2\2\u0315\u0317\5\u0098M\2\u0316\u0314"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0099\3\2\2\2\u0318\u031b\5z>\2\u0319"+
		"\u031a\7T\2\2\u031a\u031c\5\n\6\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2"+
		"\2\2\u031c\u009b\3\2\2\2\u031d\u031f\5\u00be`\2\u031e\u031d\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u0322\5\u00b0Y\2\u0321\u0320"+
		"\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\7\35\2\2"+
		"\u0324\u032e\5\u00a0Q\2\u0325\u0327\7@\2\2\u0326\u0328\5\u009eP\2\u0327"+
		"\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\7A"+
		"\2\2\u032a\u032c\7I\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032f\3\2\2\2\u032d\u032f\7I\2\2\u032e\u0325\3\2\2\2\u032e\u032d\3\2"+
		"\2\2\u032f\u009d\3\2\2\2\u0330\u0331\5j\66\2\u0331\u0332\7I\2\2\u0332"+
		"\u0334\3\2\2\2\u0333\u0330\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0335\u0336\3\2\2\2\u0336\u009f\3\2\2\2\u0337\u0338\78\2\2\u0338"+
		"\u00a1\3\2\2\2\u0339\u033b\5\u00a6T\2\u033a\u033c\5\u00bc_\2\u033b\u033a"+
		"\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u00a3\3\2\2\2\u033d\u033f\5\u00b0Y"+
		"\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u0342"+
		"\5\u00b2Z\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2"+
		"\2\u0343\u0345\5\u00b4[\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u0347\3\2\2\2\u0346\u0348\5\u00b6\\\2\u0347\u0346\3\2\2\2\u0347\u0348"+
		"\3\2\2\2\u0348\u00a5\3\2\2\2\u0349\u034a\bT\1\2\u034a\u0351\5\u00a8U\2"+
		"\u034b\u0351\5\u00b8]\2\u034c\u034e\5\u00acW\2\u034d\u034f\5\u00c8e\2"+
		"\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u0349"+
		"\3\2\2\2\u0350\u034b\3\2\2\2\u0350\u034c\3\2\2\2\u0351\u035a\3\2\2\2\u0352"+
		"\u0353\f\6\2\2\u0353\u0355\7B\2\2\u0354\u0356\5\n\6\2\u0355\u0354\3\2"+
		"\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\7C\2\2\u0358"+
		"\u0352\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2"+
		"\2\2\u035b\u00a7\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u035e\7D\2\2\u035e"+
		"\u035f\5\u00aaV\2\u035f\u0360\7E\2\2\u0360\u00a9\3\2\2\2\u0361\u0364\5"+
		"\u00a6T\2\u0362\u0363\7G\2\2\u0363\u0365\5\u00aaV\2\u0364\u0362\3\2\2"+
		"\2\u0364\u0365\3\2\2\2\u0365\u00ab\3\2\2\2\u0366\u0369\5\u00ba^\2\u0367"+
		"\u0369\5\u00aeX\2\u0368\u0366\3\2\2\2\u0368\u0367\3\2\2\2\u0369\u00ad"+
		"\3\2\2\2\u036a\u036b\78\2\2\u036b\u00af\3\2\2\2\u036c\u036d\t\r\2\2\u036d"+
		"\u00b1\3\2\2\2\u036e\u036f\7\24\2\2\u036f\u00b3\3\2\2\2\u0370\u0371\7"+
		"\17\2\2\u0371\u00b5\3\2\2\2\u0372\u0373\7*\2\2\u0373\u00b7\3\2\2\2\u0374"+
		"\u038e\7\66\2\2\u0375\u038e\7\t\2\2\u0376\u038e\7\13\2\2\u0377\u038e\7"+
		"\'\2\2\u0378\u038e\7(\2\2\u0379\u038e\7\63\2\2\u037a\u038e\7\34\2\2\u037b"+
		"\u038e\7\60\2\2\u037c\u038e\7\37\2\2\u037d\u038e\7\61\2\2\u037e\u038e"+
		"\7\26\2\2\u037f\u038e\7\21\2\2\u0380\u038e\7\f\2\2\u0381\u0382\7\31\2"+
		"\2\u0382\u0383\7U\2\2\u0383\u0389\5\u00a6T\2\u0384\u0386\7D\2\2\u0385"+
		"\u0387\5\u00caf\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388"+
		"\3\2\2\2\u0388\u038a\7E\2\2\u0389\u0384\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038c\7V\2\2\u038c\u038e\3\2\2\2\u038d\u0374\3\2"+
		"\2\2\u038d\u0375\3\2\2\2\u038d\u0376\3\2\2\2\u038d\u0377\3\2\2\2\u038d"+
		"\u0378\3\2\2\2\u038d\u0379\3\2\2\2\u038d\u037a\3\2\2\2\u038d\u037b\3\2"+
		"\2\2\u038d\u037c\3\2\2\2\u038d\u037d\3\2\2\2\u038d\u037e\3\2\2\2\u038d"+
		"\u037f\3\2\2\2\u038d\u0380\3\2\2\2\u038d\u0381\3\2\2\2\u038e\u00b9\3\2"+
		"\2\2\u038f\u0390\t\f\2\2\u0390\u0391\7@\2\2\u0391\u0392\5\u008cG\2\u0392"+
		"\u0393\7A\2\2\u0393\u00bb\3\2\2\2\u0394\u0396\7L\2\2\u0395\u0394\3\2\2"+
		"\2\u0396\u0397\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039b"+
		"\3\2\2\2\u0399\u039b\7O\2\2\u039a\u0395\3\2\2\2\u039a\u0399\3\2\2\2\u039b"+
		"\u00bd\3\2\2\2\u039c\u039e\7U\2\2\u039d\u039f\5\u00c0a\2\u039e\u039d\3"+
		"\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\7V\2\2\u03a1"+
		"\u00bf\3\2\2\2\u03a2\u03a4\7\65\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3"+
		"\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a8\5\u00c2b\2\u03a6\u03a7\7G\2\2\u03a7"+
		"\u03a9\5\u00c0a\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u00c1"+
		"\3\2\2\2\u03aa\u03ab\5\u00c4c\2\u03ab\u03ac\5\u00c6d\2\u03ac\u00c3\3\2"+
		"\2\2\u03ad\u03af\7/\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u03b3\3\2\2\2\u03b0\u03b3\7\r\2\2\u03b1\u03b3\5\u00b8]\2\u03b2\u03ae"+
		"\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b1\3\2\2\2\u03b3\u00c5\3\2\2\2\u03b4"+
		"\u03b5\78\2\2\u03b5\u00c7\3\2\2\2\u03b6\u03b9\7U\2\2\u03b7\u03ba\5\u00ca"+
		"f\2\u03b8\u03ba\7X\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\7V\2\2\u03bc\u00c9\3\2\2\2\u03bd"+
		"\u03c0\5\u00a6T\2\u03be\u03bf\7G\2\2\u03bf\u03c1\5\u00caf\2\u03c0\u03be"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u00cb\3\2\2\2w\u00cd\u00d5\u00df\u00e7"+
		"\u00ee\u00f3\u00fe\u0103\u0108\u010d\u0114\u011c\u0121\u0129\u0130\u0138"+
		"\u0140\u0145\u014d\u0157\u015f\u0167\u016f\u0177\u0180\u0189\u018f\u0194"+
		"\u019c\u01a1\u01a8\u01b1\u01b6\u01c6\u01ca\u01ce\u01d6\u01dc\u01e0\u01ea"+
		"\u01f3\u0203\u020e\u0220\u0224\u0228\u0239\u023e\u024a\u024d\u0254\u025a"+
		"\u0261\u0268\u026d\u0277\u0280\u0285\u028a\u0290\u0294\u0299\u02a1\u02aa"+
		"\u02b1\u02b6\u02bd\u02c0\u02c5\u02c7\u02ca\u02cd\u02d5\u02d9\u02dc\u02e1"+
		"\u02e7\u02ec\u02f4\u02f9\u02fc\u02ff\u0305\u0308\u030c\u030f\u0316\u031b"+
		"\u031e\u0321\u0327\u032b\u032e\u0335\u033b\u033e\u0341\u0344\u0347\u034e"+
		"\u0350\u0355\u035a\u0364\u0368\u0386\u0389\u038d\u0397\u039a\u039e\u03a3"+
		"\u03a8\u03ae\u03b2\u03b9\u03c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}