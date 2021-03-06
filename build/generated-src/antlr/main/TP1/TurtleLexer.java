// Generated from TurtleLexer.g by ANTLR 4.7.1

  package TP1;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MOT=2, TEXTE=3, PTVIRG=4, POINT=5, VIRG=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "ASCII", "MOT", "TEXTE", "PTVIRG", "POINT", "VIRG"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "';'", "'.'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "MOT", "TEXTE", "PTVIRG", "POINT", "VIRG"
	};
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


	public TurtleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TurtleLexer.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\62\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2\16"+
		"\2\24\3\2\3\2\3\3\3\3\3\4\3\4\7\4\35\n\4\f\4\16\4 \13\4\3\4\3\4\3\5\3"+
		"\5\7\5&\n\5\f\5\16\5)\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\2\2\t\3\3\5"+
		"\2\7\4\t\5\13\6\r\7\17\b\3\2\4\5\2\13\f\16\17\"\"\b\2\f\f$$..\60\60=>"+
		"@@\2\63\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\3\22\3\2\2\2\5\30\3\2\2\2\7\32\3\2\2\2\t#\3\2\2\2\13,\3\2"+
		"\2\2\r.\3\2\2\2\17\60\3\2\2\2\21\23\t\2\2\2\22\21\3\2\2\2\23\24\3\2\2"+
		"\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\b\2\2\2\27\4\3\2\2"+
		"\2\30\31\n\3\2\2\31\6\3\2\2\2\32\36\7>\2\2\33\35\5\5\3\2\34\33\3\2\2\2"+
		"\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7"+
		"@\2\2\"\b\3\2\2\2#\'\7$\2\2$&\5\5\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'"+
		"(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7$\2\2+\n\3\2\2\2,-\7=\2\2-\f\3\2\2\2"+
		"./\7\60\2\2/\16\3\2\2\2\60\61\7.\2\2\61\20\3\2\2\2\6\2\24\36\'\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}