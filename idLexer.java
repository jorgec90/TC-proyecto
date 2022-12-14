// Generated from /home/martin/Documentos/Projects/Ubp/TC/LexerFinal/al/src/main/java/com/lexer/id.g4 by ANTLR 4.8
package com.lexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, LA=3, LC=4, CA=5, CC=6, PYC=7, EQ=8, COMA=9, COMILLA=10, INT=11, 
		CHAR=12, DOUBLE=13, FLOAT=14, VOID=15, RETURN=16, FOR=17, IF=18, ELSE=19, 
		WHILE=20, SUM=21, RESTA=22, MULT=23, DIV=24, RESTO=25, COMP=26, LOGIC=27, 
		INC_DEC=28, ID=29, NUMERO=30, FLOTANTE=31, LETRAMAYUSCULA=32, HORA=33, 
		FECHA=34, EMAIL=35, COMENTARIO=36, WS=37, OTRO=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "MAYUSCULA", "PA", "PC", "LA", "LC", "CA", "CC", "PYC", 
			"EQ", "COMA", "COMILLA", "INT", "CHAR", "DOUBLE", "FLOAT", "VOID", "RETURN", 
			"FOR", "IF", "ELSE", "WHILE", "SUM", "RESTA", "MULT", "DIV", "RESTO", 
			"COMP", "LOGIC", "INC_DEC", "ID", "NUMERO", "FLOTANTE", "LETRAMAYUSCULA", 
			"HORA", "FECHA", "EMAIL", "COMENTARIO", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'='", "','", 
			"'\"'", "'int '", "'char '", "'double '", "'float '", "'void '", "'return '", 
			"'for'", null, "'else'", "'while'", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LA", "LC", "CA", "CC", "PYC", "EQ", "COMA", "COMILLA", 
			"INT", "CHAR", "DOUBLE", "FLOAT", "VOID", "RETURN", "FOR", "IF", "ELSE", 
			"WHILE", "SUM", "RESTA", "MULT", "DIV", "RESTO", "COMP", "LOGIC", "INC_DEC", 
			"ID", "NUMERO", "FLOTANTE", "LETRAMAYUSCULA", "HORA", "FECHA", "EMAIL", 
			"COMENTARIO", "WS", "OTRO"
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


	    String tipovariable="";
	    Funciones funciones= new Funciones();
	    String nombreVariable=null;
	    Object valor=null;
	    String variableAsignada=null;
	    String tipoaritmetica="";
	    String tipologica="";


	public idLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "id.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0131\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00a0"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u00c0\n\36\3\37\3\37\3\37\3\37\5\37\u00c6\n\37\3"+
		" \3 \3 \3 \5 \u00cc\n \3!\3!\5!\u00d0\n!\3!\3!\3!\7!\u00d5\n!\f!\16!\u00d8"+
		"\13!\3\"\6\"\u00db\n\"\r\"\16\"\u00dc\3#\6#\u00e0\n#\r#\16#\u00e1\3#\3"+
		"#\6#\u00e6\n#\r#\16#\u00e7\3$\3$\3%\3%\3%\3%\3%\3%\5%\u00f2\n%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0100\n&\3&\3&\3&\3&\3&\5&\u0107\n&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\5\'\u0111\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\7(\u011e\n(\f(\16(\u0121\13(\3(\7(\u0124\n(\f(\16(\u0127\13"+
		"(\3(\3(\3(\3)\3)\3)\3)\3*\3*\2\2+\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23"+
		"\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61"+
		"\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(\3\2\r\4"+
		"\2C\\c|\3\2\62;\3\2C\\\4\2>>@@\3\2\62\64\3\2\62\65\3\2\62\67\3\2\63;\3"+
		"\2\63\64\3\2C|\5\2\13\f\17\17\"\"\2\u0145\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2"+
		"\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31k\3\2"+
		"\2\2\33m\3\2\2\2\35o\3\2\2\2\37t\3\2\2\2!z\3\2\2\2#\u0082\3\2\2\2%\u0089"+
		"\3\2\2\2\'\u008f\3\2\2\2)\u0097\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2"+
		"/\u00a6\3\2\2\2\61\u00ac\3\2\2\2\63\u00ae\3\2\2\2\65\u00b0\3\2\2\2\67"+
		"\u00b2\3\2\2\29\u00b4\3\2\2\2;\u00bf\3\2\2\2=\u00c5\3\2\2\2?\u00cb\3\2"+
		"\2\2A\u00cf\3\2\2\2C\u00da\3\2\2\2E\u00df\3\2\2\2G\u00e9\3\2\2\2I\u00f1"+
		"\3\2\2\2K\u00ff\3\2\2\2M\u0110\3\2\2\2O\u0119\3\2\2\2Q\u012b\3\2\2\2S"+
		"\u012f\3\2\2\2UV\t\2\2\2V\4\3\2\2\2WX\t\3\2\2X\6\3\2\2\2YZ\t\4\2\2Z\b"+
		"\3\2\2\2[\\\7*\2\2\\\n\3\2\2\2]^\7+\2\2^\f\3\2\2\2_`\7}\2\2`\16\3\2\2"+
		"\2ab\7\177\2\2b\20\3\2\2\2cd\7]\2\2d\22\3\2\2\2ef\7_\2\2f\24\3\2\2\2g"+
		"h\7=\2\2h\26\3\2\2\2ij\7?\2\2j\30\3\2\2\2kl\7.\2\2l\32\3\2\2\2mn\7$\2"+
		"\2n\34\3\2\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2rs\7\"\2\2s\36\3\2\2\2tu\7e\2"+
		"\2uv\7j\2\2vw\7c\2\2wx\7t\2\2xy\7\"\2\2y \3\2\2\2z{\7f\2\2{|\7q\2\2|}"+
		"\7w\2\2}~\7d\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\u0081\7\"\2\2\u0081"+
		"\"\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7n\2\2\u0084\u0085\7q\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7v\2\2\u0087\u0088\7\"\2\2\u0088$\3\2\2\2\u0089"+
		"\u008a\7x\2\2\u008a\u008b\7q\2\2\u008b\u008c\7k\2\2\u008c\u008d\7f\2\2"+
		"\u008d\u008e\7\"\2\2\u008e&\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g"+
		"\2\2\u0091\u0092\7v\2\2\u0092\u0093\7w\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7p\2\2\u0095\u0096\7\"\2\2\u0096(\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7t\2\2\u009a*\3\2\2\2\u009b\u009c\7k\2\2\u009c\u00a0"+
		"\7h\2\2\u009d\u009e\7f\2\2\u009e\u00a0\7q\2\2\u009f\u009b\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3"+
		"\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5.\3\2\2\2\u00a6\u00a7\7y\2\2\u00a7"+
		"\u00a8\7j\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\60\3\2\2\2\u00ac\u00ad\7-\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7/\2"+
		"\2\u00af\64\3\2\2\2\u00b0\u00b1\7,\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7"+
		"\61\2\2\u00b38\3\2\2\2\u00b4\u00b5\7\'\2\2\u00b5:\3\2\2\2\u00b6\u00c0"+
		"\t\5\2\2\u00b7\u00b8\7>\2\2\u00b8\u00c0\7?\2\2\u00b9\u00ba\7@\2\2\u00ba"+
		"\u00c0\7?\2\2\u00bb\u00bc\7#\2\2\u00bc\u00c0\7?\2\2\u00bd\u00be\7?\2\2"+
		"\u00be\u00c0\7?\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b9"+
		"\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0<\3\2\2\2\u00c1"+
		"\u00c6\7(\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c6\7(\2\2\u00c4\u00c6\7~\2\2"+
		"\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6>\3"+
		"\2\2\2\u00c7\u00c8\7-\2\2\u00c8\u00cc\7-\2\2\u00c9\u00ca\7/\2\2\u00ca"+
		"\u00cc\7/\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc@\3\2\2\2\u00cd"+
		"\u00d0\5\3\2\2\u00ce\u00d0\7a\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d6\3\2\2\2\u00d1\u00d5\5\3\2\2\u00d2\u00d5\5\5\3\2\u00d3"+
		"\u00d5\7a\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"B\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\5\5\3\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddD\3"+
		"\2\2\2\u00de\u00e0\5\5\3\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\7\60"+
		"\2\2\u00e4\u00e6\5\5\3\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8F\3\2\2\2\u00e9\u00ea\5\7\4\2"+
		"\u00eaH\3\2\2\2\u00eb\u00ec\7\62\2\2\u00ec\u00f2\t\6\2\2\u00ed\u00ee\7"+
		"\63\2\2\u00ee\u00f2\t\3\2\2\u00ef\u00f0\7\64\2\2\u00f0\u00f2\t\7\2\2\u00f1"+
		"\u00eb\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f4\7<\2\2\u00f4\u00f5\t\b\2\2\u00f5\u00f6\t\3\2\2\u00f6"+
		"J\3\2\2\2\u00f7\u00f8\7\62\2\2\u00f8\u0100\t\t\2\2\u00f9\u00fa\7\63\2"+
		"\2\u00fa\u0100\t\3\2\2\u00fb\u00fc\7\64\2\2\u00fc\u0100\t\3\2\2\u00fd"+
		"\u00fe\7\65\2\2\u00fe\u0100\7\62\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f9\3"+
		"\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0106\7\61\2\2\u0102\u0103\7\62\2\2\u0103\u0107\t\t\2\2\u0104\u0105\7"+
		"\63\2\2\u0105\u0107\t\n\2\2\u0106\u0102\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\7\61\2\2\u0109\u010a\t\3\2\2\u010a\u010b\t"+
		"\3\2\2\u010b\u010c\t\3\2\2\u010c\u010d\t\3\2\2\u010dL\3\2\2\2\u010e\u0111"+
		"\5A!\2\u010f\u0111\t\13\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\7B\2\2\u0113\u0114\5A!\2\u0114\u0115\7\60\2"+
		"\2\u0115\u0116\7e\2\2\u0116\u0117\7q\2\2\u0117\u0118\7o\2\2\u0118N\3\2"+
		"\2\2\u0119\u011a\7\61\2\2\u011a\u011b\7,\2\2\u011b\u011f\3\2\2\2\u011c"+
		"\u011e\5\3\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0125\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0124\5\5\3\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0129\7,\2\2\u0129\u012a\7\61\2\2\u012aP\3\2\2\2\u012b\u012c\t\f\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012e\b)\2\2\u012eR\3\2\2\2\u012f\u0130\13"+
		"\2\2\2\u0130T\3\2\2\2\23\2\u009f\u00bf\u00c5\u00cb\u00cf\u00d4\u00d6\u00dc"+
		"\u00e1\u00e7\u00f1\u00ff\u0106\u0110\u011f\u0125\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}