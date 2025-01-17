// Generated from com/sap/xsk/parser/hdbsequence/core/Hdbsequence.g4 by ANTLR 4.3
package com.sap.xsk.parser.hdbsequence.core;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HdbsequenceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, STRING=15, INT=16, BOOLEAN=17, 
		TRUE=18, FALSE=19, WS=20, LB=21, RB=22, EQ=23, SC=24, SIGNED_INT=25, LINE_COMMENT=26, 
		COMMENT=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "STRING", "INT", "BOOLEAN", "TRUE", 
		"FALSE", "WS", "LB", "RB", "EQ", "SC", "SIGNED_INT", "LINE_COMMENT", "COMMENT", 
		"EscapeSequence", "HexDigits", "HexDigit"
	};


	public HdbsequenceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hdbsequence.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00cf\n\20\f\20\16\20\u00d2"+
		"\13\20\3\20\3\20\3\21\5\21\u00d7\n\21\3\21\6\21\u00da\n\21\r\21\16\21"+
		"\u00db\3\22\3\22\5\22\u00e0\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\6\25\u00ee\n\25\r\25\16\25\u00ef\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33"+
		"\u0102\n\33\f\33\16\33\u0105\13\33\3\33\5\33\u0108\n\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\7\34\u0112\n\34\f\34\16\34\u0115\13\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0120\n\35\3\35\5\35\u0123"+
		"\n\35\3\35\3\35\3\35\6\35\u0128\n\35\r\35\16\35\u0129\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0131\n\35\3\36\3\36\3\36\7\36\u0136\n\36\f\36\16\36\u0139"+
		"\13\36\3\36\5\36\u013c\n\36\3\37\3\37\4\u0103\u0113\2 \3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\2=\2\3\2\t\6\2\f\f\17"+
		"\17$$^^\3\2\62;\6\2\13\f\17\17\"\"^^\n\2$$))^^ddhhppttvv\3\2\62\65\3\2"+
		"\629\5\2\62;CHch\u014c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\3?\3\2\2\2\5J\3\2\2\2\7[\3\2\2\2\tf\3\2\2\2\13v\3\2\2\2\r}\3\2"+
		"\2\2\17\u0086\3\2\2\2\21\u008d\3\2\2\2\23\u0098\3\2\2\2\25\u009f\3\2\2"+
		"\2\27\u00a8\3\2\2\2\31\u00aa\3\2\2\2\33\u00b7\3\2\2\2\35\u00c2\3\2\2\2"+
		"\37\u00cb\3\2\2\2!\u00d6\3\2\2\2#\u00df\3\2\2\2%\u00e1\3\2\2\2\'\u00e6"+
		"\3\2\2\2)\u00ed\3\2\2\2+\u00f3\3\2\2\2-\u00f5\3\2\2\2/\u00f7\3\2\2\2\61"+
		"\u00f9\3\2\2\2\63\u00fb\3\2\2\2\65\u00fd\3\2\2\2\67\u010d\3\2\2\29\u0130"+
		"\3\2\2\2;\u0132\3\2\2\2=\u013d\3\2\2\2?@\7p\2\2@A\7q\2\2AB\7o\2\2BC\7"+
		"k\2\2CD\7p\2\2DE\7x\2\2EF\7c\2\2FG\7n\2\2GH\7w\2\2HI\7g\2\2I\4\3\2\2\2"+
		"JK\7f\2\2KL\7g\2\2LM\7r\2\2MN\7g\2\2NO\7p\2\2OP\7f\2\2PQ\7u\2\2QR\7a\2"+
		"\2RS\7q\2\2ST\7p\2\2TU\7a\2\2UV\7v\2\2VW\7c\2\2WX\7d\2\2XY\7n\2\2YZ\7"+
		"g\2\2Z\6\3\2\2\2[\\\7f\2\2\\]\7g\2\2]^\7r\2\2^_\7g\2\2_`\7p\2\2`a\7f\2"+
		"\2ab\7u\2\2bc\7a\2\2cd\7q\2\2de\7p\2\2e\b\3\2\2\2fg\7f\2\2gh\7g\2\2hi"+
		"\7r\2\2ij\7g\2\2jk\7p\2\2kl\7f\2\2lm\7u\2\2mn\7a\2\2no\7q\2\2op\7p\2\2"+
		"pq\7a\2\2qr\7x\2\2rs\7k\2\2st\7g\2\2tu\7y\2\2u\n\3\2\2\2vw\7r\2\2wx\7"+
		"w\2\2xy\7d\2\2yz\7n\2\2z{\7k\2\2{|\7e\2\2|\f\3\2\2\2}~\7t\2\2~\177\7g"+
		"\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\7a\2\2\u0083\u0084\7d\2\2\u0084\u0085\7{\2\2\u0085\16\3\2\2\2\u0086\u0087"+
		"\7u\2\2\u0087\u0088\7e\2\2\u0088\u0089\7j\2\2\u0089\u008a\7g\2\2\u008a"+
		"\u008b\7o\2\2\u008b\u008c\7c\2\2\u008c\20\3\2\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7c\2\2\u0090\u0091\7t\2\2\u0091\u0092\7v\2\2"+
		"\u0092\u0093\7a\2\2\u0093\u0094\7y\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7v\2\2\u0096\u0097\7j\2\2\u0097\22\3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a"+
		"\7{\2\2\u009a\u009b\7e\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7u\2\2\u009e\24\3\2\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7z\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2"+
		"\u00a5\u00a6\7w\2\2\u00a6\u00a7\7g\2\2\u00a7\26\3\2\2\2\u00a8\u00a9\7"+
		".\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad"+
		"\7e\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7o\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7a\2\2"+
		"\u00b4\u00b5\7d\2\2\u00b5\u00b6\7{\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7"+
		"p\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7z\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7n\2\2\u00bf"+
		"\u00c0\7w\2\2\u00c0\u00c1\7g\2\2\u00c1\34\3\2\2\2\u00c2\u00c3\7o\2\2\u00c3"+
		"\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7c\2\2"+
		"\u00c7\u00c8\7n\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2\u00ca\36\3\2"+
		"\2\2\u00cb\u00d0\7$\2\2\u00cc\u00cf\n\2\2\2\u00cd\u00cf\59\35\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\7$\2\2\u00d4 \3\2\2\2\u00d5\u00d7\5\63\32\2\u00d6\u00d5\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\t\3\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\"\3\2\2\2\u00dd\u00e0\5%\23\2\u00de\u00e0\5\'\24\2\u00df\u00dd\3\2\2"+
		"\2\u00df\u00de\3\2\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7"+
		"t\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7g\2\2\u00e5&\3\2\2\2\u00e6\u00e7"+
		"\7h\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7u\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb(\3\2\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\b\25\2\2\u00f2*\3\2\2\2\u00f3\u00f4\7]\2\2\u00f4,\3\2"+
		"\2\2\u00f5\u00f6\7_\2\2\u00f6.\3\2\2\2\u00f7\u00f8\7?\2\2\u00f8\60\3\2"+
		"\2\2\u00f9\u00fa\7=\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc\64\3"+
		"\2\2\2\u00fd\u00fe\7\61\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0103\3\2\2\2\u0100"+
		"\u0102\13\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0108\7\17\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u010a\7\f\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\33\2\2\u010c"+
		"\66\3\2\2\2\u010d\u010e\7\61\2\2\u010e\u010f\7,\2\2\u010f\u0113\3\2\2"+
		"\2\u0110\u0112\13\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\7,\2\2\u0117\u0118\7\61\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\b\34\2\2\u011a8\3\2\2\2\u011b\u011c\7^\2\2\u011c\u0131\t\5\2\2"+
		"\u011d\u0122\7^\2\2\u011e\u0120\t\6\2\2\u011f\u011e\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\t\7\2\2\u0122\u011f\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0131\t\7\2\2\u0125\u0127\7^"+
		"\2\2\u0126\u0128\7w\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5="+
		"\37\2\u012c\u012d\5=\37\2\u012d\u012e\5=\37\2\u012e\u012f\5=\37\2\u012f"+
		"\u0131\3\2\2\2\u0130\u011b\3\2\2\2\u0130\u011d\3\2\2\2\u0130\u0125\3\2"+
		"\2\2\u0131:\3\2\2\2\u0132\u013b\5=\37\2\u0133\u0136\5=\37\2\u0134\u0136"+
		"\7a\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013c\5=\37\2\u013b\u0137\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"<\3\2\2\2\u013d\u013e\t\b\2\2\u013e>\3\2\2\2\23\2\u00ce\u00d0\u00d6\u00db"+
		"\u00df\u00ef\u0103\u0107\u0113\u011f\u0122\u0129\u0130\u0135\u0137\u013b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}