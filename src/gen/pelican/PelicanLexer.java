// Generated from D:/IdeaProjects/Crone/src/main/kotlin/pelican\PelicanLexer.g4 by ANTLR 4.9
package pelican;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PelicanLexer extends Lexer {
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
		COMMENTS_CHANNEL=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "COMMENTS_CHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINGLE_LINE_DOC_COMMENT", "EMPTY_DELIMITED_DOC_COMMENT", "DELIMITED_DOC_COMMENT", 
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
			"OP_COALESCING_ASSIGN", "OP_RANGE", "OP_SPREAD", "InputCharacter", "NewLineCharacter", 
			"NumberLiteral", "HexDigit", "IntegerTypeSuffix", "ExponentPart", "RegularCharacter", 
			"EscapeCharacter", "SimpleEscapeSequence", "UnicodeEscapeSequence", "NewLine", 
			"Whitespace", "IdentifierOrKeyword", "IdentifierStartCharacter", "IdentifierPartCharacter"
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


	public PelicanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PelicanLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2r\u0387\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\3\2\3\2\3\2\3\2\3\2\7\2\u0107\n\2\f\2\16\2\u010a\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u011c\n\4\f\4\16"+
		"\4\u011f\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u012a\n\5\f\5\16"+
		"\5\u012d\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u0135\n\6\f\6\16\6\u0138\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u0141\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\58\u026e\n8\38\38\38\39\39\5"+
		"9\u0275\n9\3:\3:\3:\7:\u027a\n:\f:\16:\u027d\13:\3:\6:\u0280\n:\r:\16"+
		":\u0281\3:\5:\u0285\n:\3;\3;\3;\7;\u028a\n;\f;\16;\u028d\13;\3;\6;\u0290"+
		"\n;\r;\16;\u0291\3;\5;\u0295\n;\3<\5<\u0298\n<\3<\3<\3<\5<\u029d\n<\3"+
		"<\3<\3<\3<\3<\5<\u02a4\n<\3=\3=\3=\3=\3>\3>\7>\u02ac\n>\f>\16>\u02af\13"+
		">\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3"+
		"T\3U\3U\3V\3V\3V\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\"+
		"\3]\3]\3]\3^\3^\3^\3_\3_\3_\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\3b\3c\3c\3c"+
		"\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\3i\3j\3j\3j\3k\3k"+
		"\3k\3l\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3o\3o\3o\3o\3p\3p\3p\3q\3q\3q\3q"+
		"\3r\3r\3s\3s\3t\3t\7t\u0340\nt\ft\16t\u0343\13t\3t\7t\u0346\nt\ft\16t"+
		"\u0349\13t\3u\5u\u034c\nu\3v\5v\u034f\nv\3v\3v\5v\u0353\nv\3v\5v\u0356"+
		"\nv\5v\u0358\nv\3w\3w\5w\u035c\nw\3w\3w\3x\3x\5x\u0362\nx\3y\3y\5y\u0366"+
		"\ny\3z\3z\5z\u036a\nz\3{\3{\3{\3{\3{\3{\3{\3{\3|\3|\3|\5|\u0377\n|\3}"+
		"\3}\3~\3~\7~\u037d\n~\f~\16~\u0380\13~\3\177\5\177\u0383\n\177\3\u0080"+
		"\5\u0080\u0386\n\u0080\4\u011d\u0136\2\u0081\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd"+
		"`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1"+
		"j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3\2\u00e5"+
		"\2\u00e7\2\u00e9\2\u00eb\2\u00ed\2\u00ef\2\u00f1\2\u00f3\2\u00f5\2\u00f7"+
		"\2\u00f9\2\u00fb\2\u00fd\2\u00ff\2\3\2\24\3\2\61\61\4\2ZZzz\4\2DDdd\3"+
		"\2\62\63\6\2FFHHffhh\6\2\f\f\17\17\u0087\u0087\u202a\u202b\3\2\62;\4\2"+
		"\62;ch\4\2NNnn\4\2WWww\4\2GGgg\4\2--//\7\2\f\f\17\17^^\u0087\u0087\u202a"+
		"\u202b\13\2$$))\62;cdhhppttvvxx\5\2\f\f\17\17\u0087\u0087\5\2\13\13\16"+
		"\16\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u0393\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2"+
		"\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9"+
		"\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2"+
		"\2\3\u0101\3\2\2\2\5\u010d\3\2\2\2\7\u0115\3\2\2\2\t\u0125\3\2\2\2\13"+
		"\u0130\3\2\2\2\r\u0140\3\2\2\2\17\u0144\3\2\2\2\21\u0149\3\2\2\2\23\u014f"+
		"\3\2\2\2\25\u0154\3\2\2\2\27\u0159\3\2\2\2\31\u015f\3\2\2\2\33\u0168\3"+
		"\2\2\2\35\u016e\3\2\2\2\37\u0171\3\2\2\2!\u0178\3\2\2\2#\u017d\3\2\2\2"+
		"%\u0182\3\2\2\2\'\u0189\3\2\2\2)\u018f\3\2\2\2+\u0195\3\2\2\2-\u0199\3"+
		"\2\2\2/\u01a1\3\2\2\2\61\u01aa\3\2\2\2\63\u01af\3\2\2\2\65\u01b2\3\2\2"+
		"\2\67\u01b6\3\2\2\29\u01c0\3\2\2\2;\u01c9\3\2\2\2=\u01ce\3\2\2\2?\u01d2"+
		"\3\2\2\2A\u01d7\3\2\2\2C\u01df\3\2\2\2E\u01e8\3\2\2\2G\u01f2\3\2\2\2I"+
		"\u01f9\3\2\2\2K\u0200\3\2\2\2M\u0206\3\2\2\2O\u020c\3\2\2\2Q\u0213\3\2"+
		"\2\2S\u021a\3\2\2\2U\u0221\3\2\2\2W\u0228\3\2\2\2Y\u022d\3\2\2\2[\u0232"+
		"\3\2\2\2]\u023b\3\2\2\2_\u0240\3\2\2\2a\u0246\3\2\2\2c\u024c\3\2\2\2e"+
		"\u0253\3\2\2\2g\u0257\3\2\2\2i\u025e\3\2\2\2k\u0263\3\2\2\2m\u0269\3\2"+
		"\2\2o\u026b\3\2\2\2q\u0272\3\2\2\2s\u0276\3\2\2\2u\u0286\3\2\2\2w\u02a3"+
		"\3\2\2\2y\u02a5\3\2\2\2{\u02a9\3\2\2\2}\u02b2\3\2\2\2\177\u02b4\3\2\2"+
		"\2\u0081\u02b6\3\2\2\2\u0083\u02b8\3\2\2\2\u0085\u02ba\3\2\2\2\u0087\u02bc"+
		"\3\2\2\2\u0089\u02be\3\2\2\2\u008b\u02c0\3\2\2\2\u008d\u02c2\3\2\2\2\u008f"+
		"\u02c4\3\2\2\2\u0091\u02c6\3\2\2\2\u0093\u02c8\3\2\2\2\u0095\u02ca\3\2"+
		"\2\2\u0097\u02cc\3\2\2\2\u0099\u02ce\3\2\2\2\u009b\u02d0\3\2\2\2\u009d"+
		"\u02d2\3\2\2\2\u009f\u02d4\3\2\2\2\u00a1\u02d6\3\2\2\2\u00a3\u02d8\3\2"+
		"\2\2\u00a5\u02da\3\2\2\2\u00a7\u02dc\3\2\2\2\u00a9\u02de\3\2\2\2\u00ab"+
		"\u02e0\3\2\2\2\u00ad\u02e3\3\2\2\2\u00af\u02e5\3\2\2\2\u00b1\u02e8\3\2"+
		"\2\2\u00b3\u02eb\3\2\2\2\u00b5\u02ee\3\2\2\2\u00b7\u02f1\3\2\2\2\u00b9"+
		"\u02f4\3\2\2\2\u00bb\u02f7\3\2\2\2\u00bd\u02fa\3\2\2\2\u00bf\u02fd\3\2"+
		"\2\2\u00c1\u0300\3\2\2\2\u00c3\u0304\3\2\2\2\u00c5\u0308\3\2\2\2\u00c7"+
		"\u030b\3\2\2\2\u00c9\u030e\3\2\2\2\u00cb\u0311\3\2\2\2\u00cd\u0314\3\2"+
		"\2\2\u00cf\u0317\3\2\2\2\u00d1\u031a\3\2\2\2\u00d3\u031d\3\2\2\2\u00d5"+
		"\u0320\3\2\2\2\u00d7\u0323\3\2\2\2\u00d9\u0326\3\2\2\2\u00db\u032a\3\2"+
		"\2\2\u00dd\u032e\3\2\2\2\u00df\u0332\3\2\2\2\u00e1\u0335\3\2\2\2\u00e3"+
		"\u0339\3\2\2\2\u00e5\u033b\3\2\2\2\u00e7\u033d\3\2\2\2\u00e9\u034b\3\2"+
		"\2\2\u00eb\u0357\3\2\2\2\u00ed\u0359\3\2\2\2\u00ef\u0361\3\2\2\2\u00f1"+
		"\u0365\3\2\2\2\u00f3\u0367\3\2\2\2\u00f5\u036b\3\2\2\2\u00f7\u0376\3\2"+
		"\2\2\u00f9\u0378\3\2\2\2\u00fb\u037a\3\2\2\2\u00fd\u0382\3\2\2\2\u00ff"+
		"\u0385\3\2\2\2\u0101\u0102\7\61\2\2\u0102\u0103\7\61\2\2\u0103\u0104\7"+
		"\61\2\2\u0104\u0108\3\2\2\2\u0105\u0107\5\u00e3r\2\u0106\u0105\3\2\2\2"+
		"\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\b\2\2\2\u010c\4\3\2\2\2\u010d"+
		"\u010e\7\61\2\2\u010e\u010f\7,\2\2\u010f\u0110\7,\2\2\u0110\u0111\7,\2"+
		"\2\u0111\u0112\7\61\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b\3\2\2\u0114"+
		"\6\3\2\2\2\u0115\u0116\7\61\2\2\u0116\u0117\7,\2\2\u0117\u0118\7,\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u011d\n\2\2\2\u011a\u011c\13\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7,\2\2\u0121\u0122\7\61"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b\4\2\2\u0124\b\3\2\2\2\u0125\u0126"+
		"\7\61\2\2\u0126\u0127\7\61\2\2\u0127\u012b\3\2\2\2\u0128\u012a\5\u00e3"+
		"r\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\b\5"+
		"\2\2\u012f\n\3\2\2\2\u0130\u0131\7\61\2\2\u0131\u0132\7,\2\2\u0132\u0136"+
		"\3\2\2\2\u0133\u0135\13\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2"+
		"\u0136\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0139\u013a\7,\2\2\u013a\u013b\7\61\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\b\6\2\2\u013d\f\3\2\2\2\u013e\u0141\5\u00f9}\2\u013f\u0141\5\u00f7"+
		"|\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\b\7\3\2\u0143\16\3\2\2\2\u0144\u0145\7d\2\2\u0145\u0146\7q\2\2"+
		"\u0146\u0147\7q\2\2\u0147\u0148\7n\2\2\u0148\20\3\2\2\2\u0149\u014a\7"+
		"d\2\2\u014a\u014b\7t\2\2\u014b\u014c\7g\2\2\u014c\u014d\7c\2\2\u014d\u014e"+
		"\7m\2\2\u014e\22\3\2\2\2\u014f\u0150\7d\2\2\u0150\u0151\7{\2\2\u0151\u0152"+
		"\7v\2\2\u0152\u0153\7g\2\2\u0153\24\3\2\2\2\u0154\u0155\7e\2\2\u0155\u0156"+
		"\7j\2\2\u0156\u0157\7c\2\2\u0157\u0158\7t\2\2\u0158\26\3\2\2\2\u0159\u015a"+
		"\7e\2\2\u015a\u015b\7n\2\2\u015b\u015c\7c\2\2\u015c\u015d\7u\2\2\u015d"+
		"\u015e\7u\2\2\u015e\30\3\2\2\2\u015f\u0160\7e\2\2\u0160\u0161\7q\2\2\u0161"+
		"\u0162\7p\2\2\u0162\u0163\7v\2\2\u0163\u0164\7k\2\2\u0164\u0165\7p\2\2"+
		"\u0165\u0166\7w\2\2\u0166\u0167\7g\2\2\u0167\32\3\2\2\2\u0168\u0169\7"+
		"e\2\2\u0169\u016a\7q\2\2\u016a\u016b\7p\2\2\u016b\u016c\7u\2\2\u016c\u016d"+
		"\7v\2\2\u016d\34\3\2\2\2\u016e\u016f\7f\2\2\u016f\u0170\7q\2\2\u0170\36"+
		"\3\2\2\2\u0171\u0172\7f\2\2\u0172\u0173\7q\2\2\u0173\u0174\7w\2\2\u0174"+
		"\u0175\7d\2\2\u0175\u0176\7n\2\2\u0176\u0177\7g\2\2\u0177 \3\2\2\2\u0178"+
		"\u0179\7g\2\2\u0179\u017a\7n\2\2\u017a\u017b\7u\2\2\u017b\u017c\7g\2\2"+
		"\u017c\"\3\2\2\2\u017d\u017e\7g\2\2\u017e\u017f\7p\2\2\u017f\u0180\7w"+
		"\2\2\u0180\u0181\7o\2\2\u0181$\3\2\2\2\u0182\u0183\7g\2\2\u0183\u0184"+
		"\7z\2\2\u0184\u0185\7v\2\2\u0185\u0186\7g\2\2\u0186\u0187\7t\2\2\u0187"+
		"\u0188\7p\2\2\u0188&\3\2\2\2\u0189\u018a\7h\2\2\u018a\u018b\7c\2\2\u018b"+
		"\u018c\7n\2\2\u018c\u018d\7u\2\2\u018d\u018e\7g\2\2\u018e(\3\2\2\2\u018f"+
		"\u0190\7h\2\2\u0190\u0191\7n\2\2\u0191\u0192\7q\2\2\u0192\u0193\7c\2\2"+
		"\u0193\u0194\7v\2\2\u0194*\3\2\2\2\u0195\u0196\7h\2\2\u0196\u0197\7q\2"+
		"\2\u0197\u0198\7t\2\2\u0198,\3\2\2\2\u0199\u019a\7h\2\2\u019a\u019b\7"+
		"q\2\2\u019b\u019c\7t\2\2\u019c\u019d\7G\2\2\u019d\u019e\7c\2\2\u019e\u019f"+
		"\7e\2\2\u019f\u01a0\7j\2\2\u01a0.\3\2\2\2\u01a1\u01a2\7h\2\2\u01a2\u01a3"+
		"\7w\2\2\u01a3\u01a4\7p\2\2\u01a4\u01a5\7e\2\2\u01a5\u01a6\7v\2\2\u01a6"+
		"\u01a7\7k\2\2\u01a7\u01a8\7q\2\2\u01a8\u01a9\7p\2\2\u01a9\60\3\2\2\2\u01aa"+
		"\u01ab\7i\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7q\2\2"+
		"\u01ae\62\3\2\2\2\u01af\u01b0\7k\2\2\u01b0\u01b1\7h\2\2\u01b1\64\3\2\2"+
		"\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7p\2\2\u01b4\u01b5\7v\2\2\u01b5\66\3"+
		"\2\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9\7v\2\2\u01b9"+
		"\u01ba\7g\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7h\2\2\u01bc\u01bd\7c\2\2"+
		"\u01bd\u01be\7e\2\2\u01be\u01bf\7g\2\2\u01bf8\3\2\2\2\u01c0\u01c1\7k\2"+
		"\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7v\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5"+
		"\7t\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7\7c\2\2\u01c7\u01c8\7n\2\2\u01c8"+
		":\3\2\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7p\2\2\u01cc"+
		"\u01cd\7i\2\2\u01cd<\3\2\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0\7g\2\2\u01d0"+
		"\u01d1\7y\2\2\u01d1>\3\2\2\2\u01d2\u01d3\7p\2\2\u01d3\u01d4\7w\2\2\u01d4"+
		"\u01d5\7n\2\2\u01d5\u01d6\7n\2\2\u01d6@\3\2\2\2\u01d7\u01d8\7r\2\2\u01d8"+
		"\u01d9\7t\2\2\u01d9\u01da\7k\2\2\u01da\u01db\7x\2\2\u01db\u01dc\7c\2\2"+
		"\u01dc\u01dd\7v\2\2\u01dd\u01de\7g\2\2\u01deB\3\2\2\2\u01df\u01e0\7r\2"+
		"\2\u01e0\u01e1\7t\2\2\u01e1\u01e2\7q\2\2\u01e2\u01e3\7r\2\2\u01e3\u01e4"+
		"\7g\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7v\2\2\u01e6\u01e7\7{\2\2\u01e7"+
		"D\3\2\2\2\u01e8\u01e9\7r\2\2\u01e9\u01ea\7t\2\2\u01ea\u01eb\7q\2\2\u01eb"+
		"\u01ec\7v\2\2\u01ec\u01ed\7g\2\2\u01ed\u01ee\7e\2\2\u01ee\u01ef\7v\2\2"+
		"\u01ef\u01f0\7g\2\2\u01f0\u01f1\7f\2\2\u01f1F\3\2\2\2\u01f2\u01f3\7r\2"+
		"\2\u01f3\u01f4\7w\2\2\u01f4\u01f5\7d\2\2\u01f5\u01f6\7n\2\2\u01f6\u01f7"+
		"\7k\2\2\u01f7\u01f8\7e\2\2\u01f8H\3\2\2\2\u01f9\u01fa\7t\2\2\u01fa\u01fb"+
		"\7g\2\2\u01fb\u01fc\7v\2\2\u01fc\u01fd\7w\2\2\u01fd\u01fe\7t\2\2\u01fe"+
		"\u01ff\7p\2\2\u01ffJ\3\2\2\2\u0200\u0201\7u\2\2\u0201\u0202\7d\2\2\u0202"+
		"\u0203\7{\2\2\u0203\u0204\7v\2\2\u0204\u0205\7g\2\2\u0205L\3\2\2\2\u0206"+
		"\u0207\7u\2\2\u0207\u0208\7j\2\2\u0208\u0209\7q\2\2\u0209\u020a\7t\2\2"+
		"\u020a\u020b\7v\2\2\u020bN\3\2\2\2\u020c\u020d\7u\2\2\u020d\u020e\7k\2"+
		"\2\u020e\u020f\7|\2\2\u020f\u0210\7g\2\2\u0210\u0211\7q\2\2\u0211\u0212"+
		"\7h\2\2\u0212P\3\2\2\2\u0213\u0214\7u\2\2\u0214\u0215\7v\2\2\u0215\u0216"+
		"\7c\2\2\u0216\u0217\7v\2\2\u0217\u0218\7k\2\2\u0218\u0219\7e\2\2\u0219"+
		"R\3\2\2\2\u021a\u021b\7u\2\2\u021b\u021c\7v\2\2\u021c\u021d\7t\2\2\u021d"+
		"\u021e\7w\2\2\u021e\u021f\7e\2\2\u021f\u0220\7v\2\2\u0220T\3\2\2\2\u0221"+
		"\u0222\7u\2\2\u0222\u0223\7y\2\2\u0223\u0224\7k\2\2\u0224\u0225\7v\2\2"+
		"\u0225\u0226\7e\2\2\u0226\u0227\7j\2\2\u0227V\3\2\2\2\u0228\u0229\7v\2"+
		"\2\u0229\u022a\7j\2\2\u022a\u022b\7k\2\2\u022b\u022c\7u\2\2\u022cX\3\2"+
		"\2\2\u022d\u022e\7v\2\2\u022e\u022f\7t\2\2\u022f\u0230\7w\2\2\u0230\u0231"+
		"\7g\2\2\u0231Z\3\2\2\2\u0232\u0233\7v\2\2\u0233\u0234\7{\2\2\u0234\u0235"+
		"\7r\2\2\u0235\u0236\7g\2\2\u0236\u0237\7p\2\2\u0237\u0238\7c\2\2\u0238"+
		"\u0239\7o\2\2\u0239\u023a\7g\2\2\u023a\\\3\2\2\2\u023b\u023c\7w\2\2\u023c"+
		"\u023d\7k\2\2\u023d\u023e\7p\2\2\u023e\u023f\7v\2\2\u023f^\3\2\2\2\u0240"+
		"\u0241\7w\2\2\u0241\u0242\7n\2\2\u0242\u0243\7q\2\2\u0243\u0244\7p\2\2"+
		"\u0244\u0245\7i\2\2\u0245`\3\2\2\2\u0246\u0247\7w\2\2\u0247\u0248\7p\2"+
		"\2\u0248\u0249\7k\2\2\u0249\u024a\7q\2\2\u024a\u024b\7p\2\2\u024bb\3\2"+
		"\2\2\u024c\u024d\7w\2\2\u024d\u024e\7u\2\2\u024e\u024f\7j\2\2\u024f\u0250"+
		"\7q\2\2\u0250\u0251\7t\2\2\u0251\u0252\7v\2\2\u0252d\3\2\2\2\u0253\u0254"+
		"\7x\2\2\u0254\u0255\7c\2\2\u0255\u0256\7t\2\2\u0256f\3\2\2\2\u0257\u0258"+
		"\7x\2\2\u0258\u0259\7c\2\2\u0259\u025a\7t\2\2\u025a\u025b\7c\2\2\u025b"+
		"\u025c\7t\2\2\u025c\u025d\7i\2\2\u025dh\3\2\2\2\u025e\u025f\7x\2\2\u025f"+
		"\u0260\7q\2\2\u0260\u0261\7k\2\2\u0261\u0262\7f\2\2\u0262j\3\2\2\2\u0263"+
		"\u0264\7y\2\2\u0264\u0265\7j\2\2\u0265\u0266\7k\2\2\u0266\u0267\7n\2\2"+
		"\u0267\u0268\7g\2\2\u0268l\3\2\2\2\u0269\u026a\5\u00fb~\2\u026an\3\2\2"+
		"\2\u026b\u026d\5\u00e7t\2\u026c\u026e\5\u00ebv\2\u026d\u026c\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7\60\2\2\u0270\u0271\5"+
		"\u00fb~\2\u0271p\3\2\2\2\u0272\u0274\5\u00e7t\2\u0273\u0275\5\u00ebv\2"+
		"\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275r\3\2\2\2\u0276\u0277\7"+
		"\62\2\2\u0277\u027f\t\3\2\2\u0278\u027a\7a\2\2\u0279\u0278\3\2\2\2\u027a"+
		"\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2"+
		"\2\2\u027d\u027b\3\2\2\2\u027e\u0280\5\u00e9u\2\u027f\u027b\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284\3\2"+
		"\2\2\u0283\u0285\5\u00ebv\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"t\3\2\2\2\u0286\u0287\7\62\2\2\u0287\u028f\t\4\2\2\u0288\u028a\7a\2\2"+
		"\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c"+
		"\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0290\t\5\2\2\u028f"+
		"\u028b\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292\u0294\3\2\2\2\u0293\u0295\5\u00ebv\2\u0294\u0293\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295v\3\2\2\2\u0296\u0298\5\u00e7t\2\u0297\u0296\3\2\2"+
		"\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\7\60\2\2\u029a"+
		"\u029c\5\u00e7t\2\u029b\u029d\5\u00edw\2\u029c\u029b\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\t\6\2\2\u029f\u02a4\3\2\2\2\u02a0"+
		"\u02a1\5\u00e7t\2\u02a1\u02a2\t\6\2\2\u02a2\u02a4\3\2\2\2\u02a3\u0297"+
		"\3\2\2\2\u02a3\u02a0\3\2\2\2\u02a4x\3\2\2\2\u02a5\u02a6\7)\2\2\u02a6\u02a7"+
		"\5\u00efx\2\u02a7\u02a8\7)\2\2\u02a8z\3\2\2\2\u02a9\u02ad\7$\2\2\u02aa"+
		"\u02ac\5\u00efx\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0"+
		"\u02b1\7$\2\2\u02b1|\3\2\2\2\u02b2\u02b3\7}\2\2\u02b3~\3\2\2\2\u02b4\u02b5"+
		"\7\177\2\2\u02b5\u0080\3\2\2\2\u02b6\u02b7\7]\2\2\u02b7\u0082\3\2\2\2"+
		"\u02b8\u02b9\7_\2\2\u02b9\u0084\3\2\2\2\u02ba\u02bb\7*\2\2\u02bb\u0086"+
		"\3\2\2\2\u02bc\u02bd\7+\2\2\u02bd\u0088\3\2\2\2\u02be\u02bf\7\60\2\2\u02bf"+
		"\u008a\3\2\2\2\u02c0\u02c1\7.\2\2\u02c1\u008c\3\2\2\2\u02c2\u02c3\7<\2"+
		"\2\u02c3\u008e\3\2\2\2\u02c4\u02c5\7=\2\2\u02c5\u0090\3\2\2\2\u02c6\u02c7"+
		"\7-\2\2\u02c7\u0092\3\2\2\2\u02c8\u02c9\7/\2\2\u02c9\u0094\3\2\2\2\u02ca"+
		"\u02cb\7,\2\2\u02cb\u0096\3\2\2\2\u02cc\u02cd\7\61\2\2\u02cd\u0098\3\2"+
		"\2\2\u02ce\u02cf\7\'\2\2\u02cf\u009a\3\2\2\2\u02d0\u02d1\7(\2\2\u02d1"+
		"\u009c\3\2\2\2\u02d2\u02d3\7~\2\2\u02d3\u009e\3\2\2\2\u02d4\u02d5\7`\2"+
		"\2\u02d5\u00a0\3\2\2\2\u02d6\u02d7\7#\2\2\u02d7\u00a2\3\2\2\2\u02d8\u02d9"+
		"\7\u0080\2\2\u02d9\u00a4\3\2\2\2\u02da\u02db\7?\2\2\u02db\u00a6\3\2\2"+
		"\2\u02dc\u02dd\7>\2\2\u02dd\u00a8\3\2\2\2\u02de\u02df\7@\2\2\u02df\u00aa"+
		"\3\2\2\2\u02e0\u02e1\7?\2\2\u02e1\u02e2\7@\2\2\u02e2\u00ac\3\2\2\2\u02e3"+
		"\u02e4\7A\2\2\u02e4\u00ae\3\2\2\2\u02e5\u02e6\7<\2\2\u02e6\u02e7\7<\2"+
		"\2\u02e7\u00b0\3\2\2\2\u02e8\u02e9\7A\2\2\u02e9\u02ea\7A\2\2\u02ea\u00b2"+
		"\3\2\2\2\u02eb\u02ec\7-\2\2\u02ec\u02ed\7-\2\2\u02ed\u00b4\3\2\2\2\u02ee"+
		"\u02ef\7/\2\2\u02ef\u02f0\7/\2\2\u02f0\u00b6\3\2\2\2\u02f1\u02f2\7(\2"+
		"\2\u02f2\u02f3\7(\2\2\u02f3\u00b8\3\2\2\2\u02f4\u02f5\7~\2\2\u02f5\u02f6"+
		"\7~\2\2\u02f6\u00ba\3\2\2\2\u02f7\u02f8\7/\2\2\u02f8\u02f9\7@\2\2\u02f9"+
		"\u00bc\3\2\2\2\u02fa\u02fb\7?\2\2\u02fb\u02fc\7?\2\2\u02fc\u00be\3\2\2"+
		"\2\u02fd\u02fe\7#\2\2\u02fe\u02ff\7?\2\2\u02ff\u00c0\3\2\2\2\u0300\u0301"+
		"\7?\2\2\u0301\u0302\7?\2\2\u0302\u0303\7?\2\2\u0303\u00c2\3\2\2\2\u0304"+
		"\u0305\7#\2\2\u0305\u0306\7?\2\2\u0306\u0307\7?\2\2\u0307\u00c4\3\2\2"+
		"\2\u0308\u0309\7>\2\2\u0309\u030a\7?\2\2\u030a\u00c6\3\2\2\2\u030b\u030c"+
		"\7@\2\2\u030c\u030d\7?\2\2\u030d\u00c8\3\2\2\2\u030e\u030f\7-\2\2\u030f"+
		"\u0310\7?\2\2\u0310\u00ca\3\2\2\2\u0311\u0312\7/\2\2\u0312\u0313\7?\2"+
		"\2\u0313\u00cc\3\2\2\2\u0314\u0315\7,\2\2\u0315\u0316\7?\2\2\u0316\u00ce"+
		"\3\2\2\2\u0317\u0318\7\61\2\2\u0318\u0319\7?\2\2\u0319\u00d0\3\2\2\2\u031a"+
		"\u031b\7\'\2\2\u031b\u031c\7?\2\2\u031c\u00d2\3\2\2\2\u031d\u031e\7(\2"+
		"\2\u031e\u031f\7?\2\2\u031f\u00d4\3\2\2\2\u0320\u0321\7`\2\2\u0321\u0322"+
		"\7?\2\2\u0322\u00d6\3\2\2\2\u0323\u0324\7~\2\2\u0324\u0325\7?\2\2\u0325"+
		"\u00d8\3\2\2\2\u0326\u0327\7>\2\2\u0327\u0328\7>\2\2\u0328\u0329\7?\2"+
		"\2\u0329\u00da\3\2\2\2\u032a\u032b\7@\2\2\u032b\u032c\7@\2\2\u032c\u032d"+
		"\7?\2\2\u032d\u00dc\3\2\2\2\u032e\u032f\7A\2\2\u032f\u0330\7A\2\2\u0330"+
		"\u0331\7?\2\2\u0331\u00de\3\2\2\2\u0332\u0333\7\60\2\2\u0333\u0334\7\60"+
		"\2\2\u0334\u00e0\3\2\2\2\u0335\u0336\7\60\2\2\u0336\u0337\7\60\2\2\u0337"+
		"\u0338\7\60\2\2\u0338\u00e2\3\2\2\2\u0339\u033a\n\7\2\2\u033a\u00e4\3"+
		"\2\2\2\u033b\u033c\t\7\2\2\u033c\u00e6\3\2\2\2\u033d\u0347\t\b\2\2\u033e"+
		"\u0340\7a\2\2\u033f\u033e\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2"+
		"\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344"+
		"\u0346\t\b\2\2\u0345\u0341\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0347\u0348\3\2\2\2\u0348\u00e8\3\2\2\2\u0349\u0347\3\2\2\2\u034a"+
		"\u034c\t\t\2\2\u034b\u034a\3\2\2\2\u034c\u00ea\3\2\2\2\u034d\u034f\t\n"+
		"\2\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u0358\t\13\2\2\u0351\u0353\t\13\2\2\u0352\u0351\3\2\2\2\u0352\u0353\3"+
		"\2\2\2\u0353\u0355\3\2\2\2\u0354\u0356\t\n\2\2\u0355\u0354\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u034e\3\2\2\2\u0357\u0352\3\2"+
		"\2\2\u0358\u00ec\3\2\2\2\u0359\u035b\t\f\2\2\u035a\u035c\t\r\2\2\u035b"+
		"\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\5\u00e7"+
		"t\2\u035e\u00ee\3\2\2\2\u035f\u0362\n\16\2\2\u0360\u0362\5\u00f1y\2\u0361"+
		"\u035f\3\2\2\2\u0361\u0360\3\2\2\2\u0362\u00f0\3\2\2\2\u0363\u0366\5\u00f3"+
		"z\2\u0364\u0366\5\u00f5{\2\u0365\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366"+
		"\u00f2\3\2\2\2\u0367\u0369\7^\2\2\u0368\u036a\t\17\2\2\u0369\u0368\3\2"+
		"\2\2\u036a\u00f4\3\2\2\2\u036b\u036c\7^\2\2\u036c\u036d\7w\2\2\u036d\u036e"+
		"\3\2\2\2\u036e\u036f\5\u00e9u\2\u036f\u0370\5\u00e9u\2\u0370\u0371\5\u00e9"+
		"u\2\u0371\u0372\5\u00e9u\2\u0372\u00f6\3\2\2\2\u0373\u0374\7\17\2\2\u0374"+
		"\u0377\7\f\2\2\u0375\u0377\t\20\2\2\u0376\u0373\3\2\2\2\u0376\u0375\3"+
		"\2\2\2\u0377\u00f8\3\2\2\2\u0378\u0379\t\21\2\2\u0379\u00fa\3\2\2\2\u037a"+
		"\u037e\5\u00fd\177\2\u037b\u037d\5\u00ff\u0080\2\u037c\u037b\3\2\2\2\u037d"+
		"\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u00fc\3\2"+
		"\2\2\u0380\u037e\3\2\2\2\u0381\u0383\t\22\2\2\u0382\u0381\3\2\2\2\u0383"+
		"\u00fe\3\2\2\2\u0384\u0386\t\23\2\2\u0385\u0384\3\2\2\2\u0386\u0100\3"+
		"\2\2\2#\2\u0108\u011d\u012b\u0136\u0140\u026d\u0274\u027b\u0281\u0284"+
		"\u028b\u0291\u0294\u0297\u029c\u02a3\u02ad\u0341\u0347\u034b\u034e\u0352"+
		"\u0355\u0357\u035b\u0361\u0365\u0369\u0376\u037e\u0382\u0385\4\2\4\2\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}