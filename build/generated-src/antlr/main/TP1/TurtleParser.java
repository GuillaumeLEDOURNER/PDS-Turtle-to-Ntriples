// Generated from TurtleParser.g by ANTLR 4.7.1

  package TP1;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MOT=2, TEXTE=3, PTVIRG=4, POINT=5, VIRG=6;
	public static final int
		RULE_document = 0, RULE_listPhrase = 1, RULE_phrase = 2, RULE_listCompl = 3, 
		RULE_compl = 4, RULE_listObjet = 5, RULE_sujet = 6, RULE_predicat = 7, 
		RULE_objet = 8;
	public static final String[] ruleNames = {
		"document", "listPhrase", "phrase", "listCompl", "compl", "listObjet", 
		"sujet", "predicat", "objet"
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

	@Override
	public String getGrammarFileName() { return "TurtleParser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TurtleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public ASD.Turtle out;
		public ListPhraseContext list;
		public ListPhraseContext listPhrase() {
			return getRuleContext(ListPhraseContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((DocumentContext)_localctx).list = listPhrase();
			 ((DocumentContext)_localctx).out =  new ASD.Turtle(((DocumentContext)_localctx).list.out); 
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

	public static class ListPhraseContext extends ParserRuleContext {
		public List<ASD.Phrase> out;
		public PhraseContext p;
		public List<TerminalNode> POINT() { return getTokens(TurtleParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(TurtleParser.POINT, i);
		}
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public ListPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listPhrase; }
	}

	public final ListPhraseContext listPhrase() throws RecognitionException {
		ListPhraseContext _localctx = new ListPhraseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listPhrase);
		List<ASD.Phrase> list = new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOT) {
				{
				{
				setState(21);
				((ListPhraseContext)_localctx).p = phrase();
				setState(22);
				match(POINT);
				list.add(((ListPhraseContext)_localctx).p.out);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ListPhraseContext)_localctx).out =  list ;
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

	public static class PhraseContext extends ParserRuleContext {
		public ASD.Phrase out;
		public SujetContext s;
		public ListComplContext list;
		public SujetContext sujet() {
			return getRuleContext(SujetContext.class,0);
		}
		public ListComplContext listCompl() {
			return getRuleContext(ListComplContext.class,0);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((PhraseContext)_localctx).s = sujet();
			setState(33);
			((PhraseContext)_localctx).list = listCompl();
			 ((PhraseContext)_localctx).out =  new ASD.Phrase(((PhraseContext)_localctx).s.out,((PhraseContext)_localctx).list.out);
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

	public static class ListComplContext extends ParserRuleContext {
		public List<ASD.Compl> out;
		public ComplContext c1;
		public ComplContext c2;
		public List<ComplContext> compl() {
			return getRuleContexts(ComplContext.class);
		}
		public ComplContext compl(int i) {
			return getRuleContext(ComplContext.class,i);
		}
		public List<TerminalNode> PTVIRG() { return getTokens(TurtleParser.PTVIRG); }
		public TerminalNode PTVIRG(int i) {
			return getToken(TurtleParser.PTVIRG, i);
		}
		public ListComplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCompl; }
	}

	public final ListComplContext listCompl() throws RecognitionException {
		ListComplContext _localctx = new ListComplContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listCompl);
		 List<ASD.Compl> list = new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((ListComplContext)_localctx).c1 = compl();
			list.add(((ListComplContext)_localctx).c1.out);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PTVIRG) {
				{
				{
				setState(38);
				match(PTVIRG);
				setState(39);
				((ListComplContext)_localctx).c2 = compl();
				 list.add(((ListComplContext)_localctx).c2.out);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ListComplContext)_localctx).out =  list ; 
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

	public static class ComplContext extends ParserRuleContext {
		public ASD.Compl out;
		public PredicatContext p;
		public ListObjetContext list;
		public PredicatContext predicat() {
			return getRuleContext(PredicatContext.class,0);
		}
		public ListObjetContext listObjet() {
			return getRuleContext(ListObjetContext.class,0);
		}
		public ComplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compl; }
	}

	public final ComplContext compl() throws RecognitionException {
		ComplContext _localctx = new ComplContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((ComplContext)_localctx).p = predicat();
			setState(50);
			((ComplContext)_localctx).list = listObjet();
			 ((ComplContext)_localctx).out =  new ASD.Compl(((ComplContext)_localctx).p.out,((ComplContext)_localctx).list.out);
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

	public static class ListObjetContext extends ParserRuleContext {
		public List<ASD.Objet> out = new ArrayList<>();
		public ObjetContext o1;
		public ObjetContext o2;
		public List<ObjetContext> objet() {
			return getRuleContexts(ObjetContext.class);
		}
		public ObjetContext objet(int i) {
			return getRuleContext(ObjetContext.class,i);
		}
		public List<TerminalNode> VIRG() { return getTokens(TurtleParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(TurtleParser.VIRG, i);
		}
		public ListObjetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listObjet; }
	}

	public final ListObjetContext listObjet() throws RecognitionException {
		ListObjetContext _localctx = new ListObjetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listObjet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((ListObjetContext)_localctx).o1 = objet();
			_localctx.out.add(((ListObjetContext)_localctx).o1.out);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(55);
				match(VIRG);
				setState(56);
				((ListObjetContext)_localctx).o2 = objet();
				_localctx.out.add(((ListObjetContext)_localctx).o2.out);
				}
				}
				setState(63);
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

	public static class SujetContext extends ParserRuleContext {
		public ASD.Sujet out;
		public Token m;
		public TerminalNode MOT() { return getToken(TurtleParser.MOT, 0); }
		public SujetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sujet; }
	}

	public final SujetContext sujet() throws RecognitionException {
		SujetContext _localctx = new SujetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sujet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((SujetContext)_localctx).m = match(MOT);
			 ((SujetContext)_localctx).out =  new ASD.Sujet((((SujetContext)_localctx).m!=null?((SujetContext)_localctx).m.getText():null));
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

	public static class PredicatContext extends ParserRuleContext {
		public ASD.Predicat out;
		public Token m;
		public TerminalNode MOT() { return getToken(TurtleParser.MOT, 0); }
		public PredicatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicat; }
	}

	public final PredicatContext predicat() throws RecognitionException {
		PredicatContext _localctx = new PredicatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_predicat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((PredicatContext)_localctx).m = match(MOT);
			 ((PredicatContext)_localctx).out =  new ASD.Predicat((((PredicatContext)_localctx).m!=null?((PredicatContext)_localctx).m.getText():null));
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

	public static class ObjetContext extends ParserRuleContext {
		public ASD.Objet out;
		public Token m;
		public Token t;
		public TerminalNode MOT() { return getToken(TurtleParser.MOT, 0); }
		public TerminalNode TEXTE() { return getToken(TurtleParser.TEXTE, 0); }
		public ObjetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objet; }
	}

	public final ObjetContext objet() throws RecognitionException {
		ObjetContext _localctx = new ObjetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objet);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(70);
				((ObjetContext)_localctx).m = match(MOT);
				((ObjetContext)_localctx).out =  new ASD.Obj((((ObjetContext)_localctx).m!=null?((ObjetContext)_localctx).m.getText():null));
				}
				}
				break;
			case TEXTE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(72);
				((ObjetContext)_localctx).t = match(TEXTE);
				((ObjetContext)_localctx).out =  new ASD.Text((((ObjetContext)_localctx).t!=null?((ObjetContext)_localctx).t.getText():null));
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\bO\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\5\nM\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2I\2"+
		"\24\3\2\2\2\4\35\3\2\2\2\6\"\3\2\2\2\b&\3\2\2\2\n\63\3\2\2\2\f\67\3\2"+
		"\2\2\16B\3\2\2\2\20E\3\2\2\2\22L\3\2\2\2\24\25\5\4\3\2\25\26\b\2\1\2\26"+
		"\3\3\2\2\2\27\30\5\6\4\2\30\31\7\7\2\2\31\32\b\3\1\2\32\34\3\2\2\2\33"+
		"\27\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35"+
		"\3\2\2\2 !\b\3\1\2!\5\3\2\2\2\"#\5\16\b\2#$\5\b\5\2$%\b\4\1\2%\7\3\2\2"+
		"\2&\'\5\n\6\2\'.\b\5\1\2()\7\6\2\2)*\5\n\6\2*+\b\5\1\2+-\3\2\2\2,(\3\2"+
		"\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\b\5"+
		"\1\2\62\t\3\2\2\2\63\64\5\20\t\2\64\65\5\f\7\2\65\66\b\6\1\2\66\13\3\2"+
		"\2\2\678\5\22\n\28?\b\7\1\29:\7\b\2\2:;\5\22\n\2;<\b\7\1\2<>\3\2\2\2="+
		"9\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r\3\2\2\2A?\3\2\2\2BC\7\4\2\2"+
		"CD\b\b\1\2D\17\3\2\2\2EF\7\4\2\2FG\b\t\1\2G\21\3\2\2\2HI\7\4\2\2IM\b\n"+
		"\1\2JK\7\5\2\2KM\b\n\1\2LH\3\2\2\2LJ\3\2\2\2M\23\3\2\2\2\6\35.?L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}