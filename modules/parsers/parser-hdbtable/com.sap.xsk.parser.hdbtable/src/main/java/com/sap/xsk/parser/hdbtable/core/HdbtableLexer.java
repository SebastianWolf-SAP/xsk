// Generated from com/sap/xsk/parser/hdbtable/core/Hdbtable.g4 by ANTLR 4.3
package com.sap.xsk.parser.hdbtable.core;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HdbtableLexer extends Lexer {

  public static final int
      T__26 = 1, T__25 = 2, T__24 = 3, T__23 = 4, T__22 = 5, T__21 = 6, T__20 = 7, T__19 = 8,
      T__18 = 9, T__17 = 10, T__16 = 11, T__15 = 12, T__14 = 13, T__13 = 14, T__12 = 15, T__11 = 16,
      T__10 = 17, T__9 = 18, T__8 = 19, T__7 = 20, T__6 = 21, T__5 = 22, T__4 = 23, T__3 = 24,
      T__2 = 25, T__1 = 26, T__0 = 27, STRING = 28, WS = 29, TABLE = 30, DOT = 31, EQ = 32,
      SEMICOLON = 33, SQLTYPES = 34, BOOLEAN = 35, ORDER = 36, INDEXTYPE = 37, INT = 38,
      TABLETYPE = 39, TABLELOGGINGTYPE = 40, DATETIMEDEFAULTVALUES = 41, LINE_COMMENT = 42,
      COMMENT = 43;
  public static final String[] tokenNames = {
      "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'",
      "'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'",
      "'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
      "'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'",
      "'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'",
      "'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''",
      "'('", "')'", "'*'", "'+'"
  };
  public static final String[] ruleNames = {
      "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19",
      "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11",
      "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2",
      "T__1", "T__0", "STRING", "WS", "TABLE", "DOT", "EQ", "SEMICOLON", "SQLTYPES",
      "BOOLEAN", "ORDER", "INDEXTYPE", "INT", "TABLETYPE", "TABLELOGGINGTYPE",
      "DATETIMEDEFAULTVALUES", "LINE_COMMENT", "COMMENT"
  };
  public static final String _serializedATN =
      "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u02a7\b\1\4\2\t" +
          "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
          "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
          "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
          "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
          "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
          ",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3" +
          "\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6" +
          "\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3" +
          "\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f" +
          "\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3" +
          "\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3" +
          "\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3" +
          "\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3" +
          "\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3" +
          "\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3" +
          "\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3" +
          "\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3" +
          "\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3" +
          "\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3" +
          "\34\3\35\3\35\7\35\u012f\n\35\f\35\16\35\u0132\13\35\3\35\3\35\3\36\6" +
          "\36\u0137\n\36\r\36\16\36\u0138\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37" +
          "\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3" +
          "#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3" +
          "#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3" +
          "#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3" +
          "#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3" +
          "#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3" +
          "#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01dc\n#\3$\3$\3$\3" +
          "$\3$\3$\3$\3$\3$\5$\u01e7\n$\3%\3%\3%\3%\3%\3%\5%\u01ef\n%\3&\3&\3&\3" +
          "&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01ff\n&\3\'\6\'\u0202\n\'\r\'\16\'" +
          "\u0203\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0219" +
          "\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u022b\n)\3*\3*" +
          "\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*" +
          "\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*" +
          "\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*" +
          "\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0288" +
          "\n*\3+\3+\3+\3+\7+\u028e\n+\f+\16+\u0291\13+\3+\5+\u0294\n+\3+\3+\3+\3" +
          "+\3,\3,\3,\3,\7,\u029e\n,\f,\16,\u02a1\13,\3,\3,\3,\3,\3,\5\u0130\u028f" +
          "\u029f\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33" +
          "\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67" +
          "\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\4\5\2\13\f\17\17\"\"\3\2" +
          "\62;\u02cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2" +
          "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27" +
          "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2" +
          "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2" +
          "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2" +
          "\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2" +
          "\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S" +
          "\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5e\3\2\2\2\7m\3\2\2\2\tr\3\2" +
          "\2\2\13y\3\2\2\2\r\177\3\2\2\2\17\u0089\3\2\2\2\21\u008b\3\2\2\2\23\u0091" +
          "\3\2\2\2\25\u0093\3\2\2\2\27\u009b\3\2\2\2\31\u00a4\3\2\2\2\33\u00ae\3" +
          "\2\2\2\35\u00b8\3\2\2\2\37\u00c5\3\2\2\2!\u00d1\3\2\2\2#\u00d3\3\2\2\2" +
          "%\u00da\3\2\2\2\'\u00e5\3\2\2\2)\u00ed\3\2\2\2+\u00f7\3\2\2\2-\u0104\3" +
          "\2\2\2/\u0106\3\2\2\2\61\u0108\3\2\2\2\63\u010f\3\2\2\2\65\u0117\3\2\2" +
          "\2\67\u0121\3\2\2\29\u012c\3\2\2\2;\u0136\3\2\2\2=\u013c\3\2\2\2?\u0142" +
          "\3\2\2\2A\u0144\3\2\2\2C\u0146\3\2\2\2E\u01db\3\2\2\2G\u01e6\3\2\2\2I" +
          "\u01ee\3\2\2\2K\u01fe\3\2\2\2M\u0201\3\2\2\2O\u0218\3\2\2\2Q\u022a\3\2" +
          "\2\2S\u0287\3\2\2\2U\u0289\3\2\2\2W\u0299\3\2\2\2YZ\7n\2\2Z[\7q\2\2[\\" +
          "\7i\2\2\\]\7i\2\2]^\7k\2\2^_\7p\2\2_`\7i\2\2`a\7V\2\2ab\7{\2\2bc\7r\2" +
          "\2cd\7g\2\2d\4\3\2\2\2ef\7u\2\2fg\7s\2\2gh\7n\2\2hi\7V\2\2ij\7{\2\2jk" +
          "\7r\2\2kl\7g\2\2l\6\3\2\2\2mn\7p\2\2no\7c\2\2op\7o\2\2pq\7g\2\2q\b\3\2" +
          "\2\2rs\7n\2\2st\7g\2\2tu\7p\2\2uv\7i\2\2vw\7v\2\2wx\7j\2\2x\n\3\2\2\2" +
          "yz\7u\2\2z{\7e\2\2{|\7c\2\2|}\7n\2\2}~\7g\2\2~\f\3\2\2\2\177\u0080\7v" +
          "\2\2\u0080\u0081\7c\2\2\u0081\u0082\7d\2\2\u0082\u0083\7n\2\2\u0083\u0084" +
          "\7g\2\2\u0084\u0085\7V\2\2\u0085\u0086\7{\2\2\u0086\u0087\7r\2\2\u0087" +
          "\u0088\7g\2\2\u0088\16\3\2\2\2\u0089\u008a\7}\2\2\u008a\20\3\2\2\2\u008b" +
          "\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d\u008e\7f\2\2\u008e\u008f\7g\2\2" +
          "\u008f\u0090\7t\2\2\u0090\22\3\2\2\2\u0091\u0092\7\177\2\2\u0092\24\3" +
          "\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7f\2\2\u0096" +
          "\u0097\7g\2\2\u0097\u0098\7z\2\2\u0098\u0099\7g\2\2\u0099\u009a\7u\2\2" +
          "\u009a\26\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d\7w\2\2\u009d\u009e\7" +
          "n\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2" +
          "\7n\2\2\u00a2\u00a3\7g\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6" +
          "\7m\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7n\2\2\u00a9" +
          "\u00aa\7w\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7u\2\2" +
          "\u00ad\32\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7" +
          "f\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7z\2\2\u00b3\u00b4\7V\2\2\u00b4\u00b5" +
          "\7{\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7g\2\2\u00b7\34\3\2\2\2\u00b8\u00b9" +
          "\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7g\2\2\u00bc" +
          "\u00bd\7z\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7n\2\2" +
          "\u00c0\u00c1\7w\2\2\u00c1\u00c2\7o\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4" +
          "\7u\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7f\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8" +
          "\7u\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7k\2\2\u00cb" +
          "\u00cc\7r\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7q\2\2" +
          "\u00cf\u00d0\7p\2\2\u00d0 \3\2\2\2\u00d1\u00d2\7.\2\2\u00d2\"\3\2\2\2" +
          "\u00d3\u00d4\7w\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7" +
          "\7s\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7g\2\2\u00d9$\3\2\2\2\u00da\u00db" +
          "\7r\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7o\2\2\u00de" +
          "\u00df\7c\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7{\2\2\u00e1\u00e2\7M\2\2" +
          "\u00e2\u00e3\7g\2\2\u00e3\u00e4\7{\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7e\2" +
          "\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea" +
          "\7o\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7u\2\2\u00ec(\3\2\2\2\u00ed\u00ee" +
          "\7r\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7e\2\2\u00f1" +
          "\u00f2\7k\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7q\2\2" +
          "\u00f5\u00f6\7p\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9\7g\2" +
          "\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd" +
          "\7n\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7X\2\2\u00ff\u0100\7c\2\2\u0100" +
          "\u0101\7n\2\2\u0101\u0102\7w\2\2\u0102\u0103\7g\2\2\u0103,\3\2\2\2\u0104" +
          "\u0105\7]\2\2\u0105.\3\2\2\2\u0106\u0107\7_\2\2\u0107\60\3\2\2\2\u0108" +
          "\u0109\7r\2\2\u0109\u010a\7w\2\2\u010a\u010b\7d\2\2\u010b\u010c\7n\2\2" +
          "\u010c\u010d\7k\2\2\u010d\u010e\7e\2\2\u010e\62\3\2\2\2\u010f\u0110\7" +
          "e\2\2\u0110\u0111\7q\2\2\u0111\u0112\7o\2\2\u0112\u0113\7o\2\2\u0113\u0114" +
          "\7g\2\2\u0114\u0115\7p\2\2\u0115\u0116\7v\2\2\u0116\64\3\2\2\2\u0117\u0118" +
          "\7v\2\2\u0118\u0119\7g\2\2\u0119\u011a\7o\2\2\u011a\u011b\7r\2\2\u011b" +
          "\u011c\7q\2\2\u011c\u011d\7t\2\2\u011d\u011e\7c\2\2\u011e\u011f\7t\2\2" +
          "\u011f\u0120\7{\2\2\u0120\66\3\2\2\2\u0121\u0122\7u\2\2\u0122\u0123\7" +
          "e\2\2\u0123\u0124\7j\2\2\u0124\u0125\7g\2\2\u0125\u0126\7o\2\2\u0126\u0127" +
          "\7c\2\2\u0127\u0128\7P\2\2\u0128\u0129\7c\2\2\u0129\u012a\7o\2\2\u012a" +
          "\u012b\7g\2\2\u012b8\3\2\2\2\u012c\u0130\7$\2\2\u012d\u012f\13\2\2\2\u012e" +
          "\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131\3\2\2\2\u0130\u012e\3\2" +
          "\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7$\2\2\u0134" +
          ":\3\2\2\2\u0135\u0137\t\2\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2" +
          "\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b" +
          "\b\36\2\2\u013b<\3\2\2\2\u013c\u013d\7v\2\2\u013d\u013e\7c\2\2\u013e\u013f" +
          "\7d\2\2\u013f\u0140\7n\2\2\u0140\u0141\7g\2\2\u0141>\3\2\2\2\u0142\u0143" +
          "\7\60\2\2\u0143@\3\2\2\2\u0144\u0145\7?\2\2\u0145B\3\2\2\2\u0146\u0147" +
          "\7=\2\2\u0147D\3\2\2\2\u0148\u0149\7X\2\2\u0149\u014a\7C\2\2\u014a\u014b" +
          "\7T\2\2\u014b\u014c\7E\2\2\u014c\u014d\7J\2\2\u014d\u014e\7C\2\2\u014e" +
          "\u01dc\7T\2\2\u014f\u0150\7K\2\2\u0150\u0151\7P\2\2\u0151\u0152\7V\2\2" +
          "\u0152\u0153\7G\2\2\u0153\u0154\7I\2\2\u0154\u0155\7G\2\2\u0155\u01dc" +
          "\7T\2\2\u0156\u0157\7P\2\2\u0157\u0158\7X\2\2\u0158\u0159\7C\2\2\u0159" +
          "\u015a\7T\2\2\u015a\u015b\7E\2\2\u015b\u015c\7J\2\2\u015c\u015d\7C\2\2" +
          "\u015d\u01dc\7T\2\2\u015e\u015f\7F\2\2\u015f\u0160\7G\2\2\u0160\u0161" +
          "\7E\2\2\u0161\u0162\7K\2\2\u0162\u0163\7O\2\2\u0163\u0164\7C\2\2\u0164" +
          "\u01dc\7N\2\2\u0165\u0166\7F\2\2\u0166\u0167\7C\2\2\u0167\u0168\7V\2\2" +
          "\u0168\u01dc\7G\2\2\u0169\u016a\7V\2\2\u016a\u016b\7K\2\2\u016b\u016c" +
          "\7O\2\2\u016c\u01dc\7G\2\2\u016d\u016e\7V\2\2\u016e\u016f\7K\2\2\u016f" +
          "\u0170\7O\2\2\u0170\u0171\7G\2\2\u0171\u0172\7U\2\2\u0172\u0173\7V\2\2" +
          "\u0173\u0174\7C\2\2\u0174\u0175\7O\2\2\u0175\u01dc\7R\2\2\u0176\u0177" +
          "\7U\2\2\u0177\u0178\7G\2\2\u0178\u0179\7E\2\2\u0179\u017a\7Q\2\2\u017a" +
          "\u017b\7P\2\2\u017b\u017c\7F\2\2\u017c\u017d\7F\2\2\u017d\u017e\7C\2\2" +
          "\u017e\u017f\7V\2\2\u017f\u01dc\7G\2\2\u0180\u0181\7V\2\2\u0181\u0182" +
          "\7K\2\2\u0182\u0183\7P\2\2\u0183\u0184\7[\2\2\u0184\u0185\7K\2\2\u0185" +
          "\u0186\7P\2\2\u0186\u01dc\7V\2\2\u0187\u0188\7U\2\2\u0188\u0189\7O\2\2" +
          "\u0189\u018a\7C\2\2\u018a\u018b\7N\2\2\u018b\u018c\7N\2\2\u018c\u018d" +
          "\7K\2\2\u018d\u018e\7P\2\2\u018e\u01dc\7V\2\2\u018f\u0190\7D\2\2\u0190" +
          "\u0191\7K\2\2\u0191\u0192\7I\2\2\u0192\u0193\7K\2\2\u0193\u0194\7P\2\2" +
          "\u0194\u01dc\7V\2\2\u0195\u0196\7T\2\2\u0196\u0197\7G\2\2\u0197\u0198" +
          "\7C\2\2\u0198\u01dc\7N\2\2\u0199\u019a\7F\2\2\u019a\u019b\7Q\2\2\u019b" +
          "\u019c\7W\2\2\u019c\u019d\7D\2\2\u019d\u019e\7N\2\2\u019e\u01dc\7G\2\2" +
          "\u019f\u01a0\7H\2\2\u01a0\u01a1\7N\2\2\u01a1\u01a2\7Q\2\2\u01a2\u01a3" +
          "\7C\2\2\u01a3\u01dc\7V\2\2\u01a4\u01a5\7U\2\2\u01a5\u01a6\7O\2\2\u01a6" +
          "\u01a7\7C\2\2\u01a7\u01a8\7N\2\2\u01a8\u01a9\7N\2\2\u01a9\u01aa\7F\2\2" +
          "\u01aa\u01ab\7G\2\2\u01ab\u01ac\7E\2\2\u01ac\u01ad\7K\2\2\u01ad\u01ae" +
          "\7O\2\2\u01ae\u01af\7C\2\2\u01af\u01dc\7N\2\2\u01b0\u01b1\7E\2\2\u01b1" +
          "\u01b2\7N\2\2\u01b2\u01b3\7Q\2\2\u01b3\u01dc\7D\2\2\u01b4\u01b5\7P\2\2" +
          "\u01b5\u01b6\7E\2\2\u01b6\u01b7\7N\2\2\u01b7\u01b8\7Q\2\2\u01b8\u01dc" +
          "\7D\2\2\u01b9\u01ba\7C\2\2\u01ba\u01bb\7N\2\2\u01bb\u01bc\7R\2\2\u01bc" +
          "\u01bd\7J\2\2\u01bd\u01be\7C\2\2\u01be\u01bf\7P\2\2\u01bf\u01c0\7W\2\2" +
          "\u01c0\u01dc\7O\2\2\u01c1\u01c2\7V\2\2\u01c2\u01c3\7G\2\2\u01c3\u01c4" +
          "\7Z\2\2\u01c4\u01dc\7V\2\2\u01c5\u01c6\7U\2\2\u01c6\u01c7\7J\2\2\u01c7" +
          "\u01c8\7Q\2\2\u01c8\u01c9\7T\2\2\u01c9\u01ca\7V\2\2\u01ca\u01cb\7V\2\2" +
          "\u01cb\u01cc\7G\2\2\u01cc\u01cd\7Z\2\2\u01cd\u01dc\7V\2\2\u01ce\u01cf" +
          "\7D\2\2\u01cf\u01d0\7N\2\2\u01d0\u01d1\7Q\2\2\u01d1\u01dc\7D\2\2\u01d2" +
          "\u01d3\7X\2\2\u01d3\u01d4\7C\2\2\u01d4\u01d5\7T\2\2\u01d5\u01d6\7D\2\2" +
          "\u01d6\u01d7\7K\2\2\u01d7\u01d8\7P\2\2\u01d8\u01d9\7C\2\2\u01d9\u01da" +
          "\7T\2\2\u01da\u01dc\7[\2\2\u01db\u0148\3\2\2\2\u01db\u014f\3\2\2\2\u01db" +
          "\u0156\3\2\2\2\u01db\u015e\3\2\2\2\u01db\u0165\3\2\2\2\u01db\u0169\3\2" +
          "\2\2\u01db\u016d\3\2\2\2\u01db\u0176\3\2\2\2\u01db\u0180\3\2\2\2\u01db" +
          "\u0187\3\2\2\2\u01db\u018f\3\2\2\2\u01db\u0195\3\2\2\2\u01db\u0199\3\2" +
          "\2\2\u01db\u019f\3\2\2\2\u01db\u01a4\3\2\2\2\u01db\u01b0\3\2\2\2\u01db" +
          "\u01b4\3\2\2\2\u01db\u01b9\3\2\2\2\u01db\u01c1\3\2\2\2\u01db\u01c5\3\2" +
          "\2\2\u01db\u01ce\3\2\2\2\u01db\u01d2\3\2\2\2\u01dcF\3\2\2\2\u01dd\u01de" +
          "\7v\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7w\2\2\u01e0\u01e7\7g\2\2\u01e1" +
          "\u01e2\7h\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4\7n\2\2\u01e4\u01e5\7u\2\2" +
          "\u01e5\u01e7\7g\2\2\u01e6\u01dd\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e7H\3\2" +
          "\2\2\u01e8\u01e9\7C\2\2\u01e9\u01ea\7U\2\2\u01ea\u01ef\7E\2\2\u01eb\u01ec" +
          "\7F\2\2\u01ec\u01ed\7U\2\2\u01ed\u01ef\7E\2\2\u01ee\u01e8\3\2\2\2\u01ee" +
          "\u01eb\3\2\2\2\u01efJ\3\2\2\2\u01f0\u01f1\7D\2\2\u01f1\u01f2\7a\2\2\u01f2" +
          "\u01f3\7V\2\2\u01f3\u01f4\7T\2\2\u01f4\u01f5\7G\2\2\u01f5\u01ff\7G\2\2" +
          "\u01f6\u01f7\7E\2\2\u01f7\u01f8\7R\2\2\u01f8\u01f9\7D\2\2\u01f9\u01fa" +
          "\7a\2\2\u01fa\u01fb\7V\2\2\u01fb\u01fc\7T\2\2\u01fc\u01fd\7G\2\2\u01fd" +
          "\u01ff\7G\2\2\u01fe\u01f0\3\2\2\2\u01fe\u01f6\3\2\2\2\u01ffL\3\2\2\2\u0200" +
          "\u0202\t\3\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2" +
          "\2\2\u0203\u0204\3\2\2\2\u0204N\3\2\2\2\u0205\u0206\7E\2\2\u0206\u0207" +
          "\7Q\2\2\u0207\u0208\7N\2\2\u0208\u0209\7W\2\2\u0209\u020a\7O\2\2\u020a" +
          "\u020b\7P\2\2\u020b\u020c\7U\2\2\u020c\u020d\7V\2\2\u020d\u020e\7Q\2\2" +
          "\u020e\u020f\7T\2\2\u020f\u0219\7G\2\2\u0210\u0211\7T\2\2\u0211\u0212" +
          "\7Q\2\2\u0212\u0213\7Y\2\2\u0213\u0214\7U\2\2\u0214\u0215\7V\2\2\u0215" +
          "\u0216\7Q\2\2\u0216\u0217\7T\2\2\u0217\u0219\7G\2\2\u0218\u0205\3\2\2" +
          "\2\u0218\u0210\3\2\2\2\u0219P\3\2\2\2\u021a\u021b\7N\2\2\u021b\u021c\7" +
          "Q\2\2\u021c\u021d\7I\2\2\u021d\u021e\7I\2\2\u021e\u021f\7K\2\2\u021f\u0220" +
          "\7P\2\2\u0220\u022b\7I\2\2\u0221\u0222\7P\2\2\u0222\u0223\7Q\2\2\u0223" +
          "\u0224\7N\2\2\u0224\u0225\7Q\2\2\u0225\u0226\7I\2\2\u0226\u0227\7I\2\2" +
          "\u0227\u0228\7K\2\2\u0228\u0229\7P\2\2\u0229\u022b\7I\2\2\u022a\u021a" +
          "\3\2\2\2\u022a\u0221\3\2\2\2\u022bR\3\2\2\2\u022c\u022d\7E\2\2\u022d\u022e" +
          "\7W\2\2\u022e\u022f\7T\2\2\u022f\u0230\7T\2\2\u0230\u0231\7G\2\2\u0231" +
          "\u0232\7P\2\2\u0232\u0233\7V\2\2\u0233\u0234\7a\2\2\u0234\u0235\7F\2\2" +
          "\u0235\u0236\7C\2\2\u0236\u0237\7V\2\2\u0237\u0288\7G\2\2\u0238\u0239" +
          "\7E\2\2\u0239\u023a\7W\2\2\u023a\u023b\7T\2\2\u023b\u023c\7T\2\2\u023c" +
          "\u023d\7G\2\2\u023d\u023e\7P\2\2\u023e\u023f\7V\2\2\u023f\u0240\7a\2\2" +
          "\u0240\u0241\7V\2\2\u0241\u0242\7K\2\2\u0242\u0243\7O\2\2\u0243\u0288" +
          "\7G\2\2\u0244\u0245\7E\2\2\u0245\u0246\7W\2\2\u0246\u0247\7T\2\2\u0247" +
          "\u0248\7T\2\2\u0248\u0249\7G\2\2\u0249\u024a\7P\2\2\u024a\u024b\7V\2\2" +
          "\u024b\u024c\7a\2\2\u024c\u024d\7V\2\2\u024d\u024e\7K\2\2\u024e\u024f" +
          "\7O\2\2\u024f\u0250\7G\2\2\u0250\u0251\7U\2\2\u0251\u0252\7V\2\2\u0252" +
          "\u0253\7C\2\2\u0253\u0254\7O\2\2\u0254\u0288\7R\2\2\u0255\u0256\7E\2\2" +
          "\u0256\u0257\7W\2\2\u0257\u0258\7T\2\2\u0258\u0259\7T\2\2\u0259\u025a" +
          "\7G\2\2\u025a\u025b\7P\2\2\u025b\u025c\7V\2\2\u025c\u025d\7a\2\2\u025d" +
          "\u025e\7W\2\2\u025e\u025f\7V\2\2\u025f\u0260\7E\2\2\u0260\u0261\7F\2\2" +
          "\u0261\u0262\7C\2\2\u0262\u0263\7V\2\2\u0263\u0288\7G\2\2\u0264\u0265" +
          "\7E\2\2\u0265\u0266\7W\2\2\u0266\u0267\7T\2\2\u0267\u0268\7T\2\2\u0268" +
          "\u0269\7G\2\2\u0269\u026a\7P\2\2\u026a\u026b\7V\2\2\u026b\u026c\7a\2\2" +
          "\u026c\u026d\7W\2\2\u026d\u026e\7V\2\2\u026e\u026f\7E\2\2\u026f\u0270" +
          "\7V\2\2\u0270\u0271\7K\2\2\u0271\u0272\7O\2\2\u0272\u0288\7G\2\2\u0273" +
          "\u0274\7E\2\2\u0274\u0275\7W\2\2\u0275\u0276\7T\2\2\u0276\u0277\7T\2\2" +
          "\u0277\u0278\7G\2\2\u0278\u0279\7P\2\2\u0279\u027a\7V\2\2\u027a\u027b" +
          "\7a\2\2\u027b\u027c\7W\2\2\u027c\u027d\7V\2\2\u027d\u027e\7E\2\2\u027e" +
          "\u027f\7V\2\2\u027f\u0280\7K\2\2\u0280\u0281\7O\2\2\u0281\u0282\7G\2\2" +
          "\u0282\u0283\7U\2\2\u0283\u0284\7V\2\2\u0284\u0285\7C\2\2\u0285\u0286" +
          "\7O\2\2\u0286\u0288\7R\2\2\u0287\u022c\3\2\2\2\u0287\u0238\3\2\2\2\u0287" +
          "\u0244\3\2\2\2\u0287\u0255\3\2\2\2\u0287\u0264\3\2\2\2\u0287\u0273\3\2" +
          "\2\2\u0288T\3\2\2\2\u0289\u028a\7\61\2\2\u028a\u028b\7\61\2\2\u028b\u028f" +
          "\3\2\2\2\u028c\u028e\13\2\2\2\u028d\u028c\3\2\2\2\u028e\u0291\3\2\2\2" +
          "\u028f\u0290\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f" +
          "\3\2\2\2\u0292\u0294\7\17\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2" +
          "\u0294\u0295\3\2\2\2\u0295\u0296\7\f\2\2\u0296\u0297\3\2\2\2\u0297\u0298" +
          "\b+\2\2\u0298V\3\2\2\2\u0299\u029a\7\61\2\2\u029a\u029b\7,\2\2\u029b\u029f" +
          "\3\2\2\2\u029c\u029e\13\2\2\2\u029d\u029c\3\2\2\2\u029e\u02a1\3\2\2\2" +
          "\u029f\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029f" +
          "\3\2\2\2\u02a2\u02a3\7,\2\2\u02a3\u02a4\7\61\2\2\u02a4\u02a5\3\2\2\2\u02a5" +
          "\u02a6\b,\2\2\u02a6X\3\2\2\2\20\2\u0130\u0138\u01db\u01e6\u01ee\u01fe" +
          "\u0203\u0218\u022a\u0287\u028f\u0293\u029f\3\b\2\2";
  public static final ATN _ATN =
      new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
      new PredictionContextCache();
  public static String[] modeNames = {
      "DEFAULT_MODE"
  };

  static {
    RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION);
  }

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }

  public HdbtableLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @Override
  public String getGrammarFileName() {
    return "Hdbtable.g4";
  }

  @Override
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }
}