// Generated from c:/Users/kalmi/CSCI4020/CSCI4020-Project/antlr_project/src/antlr/Expr.g4 by ANTLR 4.13.1

	package antlr;
	import backend.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, STRING=2, DOUBLE=3, FLOAT=4, BOOLEAN=5, NULL=6, ID=7, PLUS=8, SEMICOLON=9, 
		WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "STRING", "DOUBLE", "FLOAT", "BOOLEAN", "NULL", "ID", "PLUS", 
			"SEMICOLON", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'string'", "'double'", "'float'", "'boolean'", "'null'", 
			null, "'+'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "STRING", "DOUBLE", "FLOAT", "BOOLEAN", "NULL", "ID", "PLUS", 
			"SEMICOLON", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\nJ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004"+
		"\u0006<\b\u0006\u000b\u0006\f\u0006=\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0004\tE\b\t\u000b\t\f\tF\u0001\t\u0001\t\u0000\u0000\n\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0001\u0000\u0002\u0002\u0000AZaz\u0003\u0000"+
		"\t\n\r\r  K\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0001\u0015\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000"+
		"\u0005 \u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000\t-\u0001"+
		"\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000"+
		"\u0000\u000f?\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013"+
		"D\u0001\u0000\u0000\u0000\u0015\u0016\u0005i\u0000\u0000\u0016\u0017\u0005"+
		"n\u0000\u0000\u0017\u0018\u0005t\u0000\u0000\u0018\u0002\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005s\u0000\u0000\u001a\u001b\u0005t\u0000\u0000\u001b"+
		"\u001c\u0005r\u0000\u0000\u001c\u001d\u0005i\u0000\u0000\u001d\u001e\u0005"+
		"n\u0000\u0000\u001e\u001f\u0005g\u0000\u0000\u001f\u0004\u0001\u0000\u0000"+
		"\u0000 !\u0005d\u0000\u0000!\"\u0005o\u0000\u0000\"#\u0005u\u0000\u0000"+
		"#$\u0005b\u0000\u0000$%\u0005l\u0000\u0000%&\u0005e\u0000\u0000&\u0006"+
		"\u0001\u0000\u0000\u0000\'(\u0005f\u0000\u0000()\u0005l\u0000\u0000)*"+
		"\u0005o\u0000\u0000*+\u0005a\u0000\u0000+,\u0005t\u0000\u0000,\b\u0001"+
		"\u0000\u0000\u0000-.\u0005b\u0000\u0000./\u0005o\u0000\u0000/0\u0005o"+
		"\u0000\u000001\u0005l\u0000\u000012\u0005e\u0000\u000023\u0005a\u0000"+
		"\u000034\u0005n\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005n\u0000"+
		"\u000067\u0005u\u0000\u000078\u0005l\u0000\u000089\u0005l\u0000\u0000"+
		"9\f\u0001\u0000\u0000\u0000:<\u0007\u0000\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005+\u0000\u0000@\u0010"+
		"\u0001\u0000\u0000\u0000AB\u0005;\u0000\u0000B\u0012\u0001\u0000\u0000"+
		"\u0000CE\u0007\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HI\u0006\t\u0000\u0000I\u0014\u0001\u0000\u0000\u0000"+
		"\u0003\u0000=F\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}