// Generated from /home/dsl/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/dsl/myapplication/g.g4 by ANTLR 4.7
package team2.lksh.p.formuland.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, PLUS=2, MINUS=3, MULT=4, DIV=5, LBR=6, RBR=7, NUMBER=8, UNDL=9, 
		DOLL=10, AND=11, DOT=12, COMMA=13, EQ=14, CAP=15;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_func = 2, RULE_con = 3, RULE_variable = 4;
	public static final String[] ruleNames = {
		"root", "expr", "func", "con", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", null, "'_'", "'$'", 
		"'&'", "'.'", "','", "'='", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "PLUS", "MINUS", "MULT", "DIV", "LBR", "RBR", "NUMBER", "UNDL", 
		"DOLL", "AND", "DOT", "COMMA", "EQ", "CAP"
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQ() { return getToken(GenParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor) return ((IVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			variable();
			setState(11);
			match(EQ);
			setState(12);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode MINUS() { return getToken(GenParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode LBR() { return getToken(GenParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(GenParser.RBR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GenParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GenParser.COMMA, i);
		}
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(GenParser.NUMBER, 0); }
		public TerminalNode CAP() { return getToken(GenParser.CAP, 0); }
		public TerminalNode MULT() { return getToken(GenParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GenParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(GenParser.PLUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor) return ((IVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(15);
				match(MINUS);
				setState(16);
				expr(9);
				}
				break;
			case UNDL:
				{
				setState(17);
				func();
				setState(18);
				match(LBR);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LBR) | (1L << NUMBER) | (1L << UNDL) | (1L << DOLL) | (1L << AND))) != 0)) {
					{
					setState(19);
					expr(0);
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(20);
						match(COMMA);
						setState(21);
						expr(0);
						}
						}
						setState(26);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(29);
				match(RBR);
				}
				break;
			case AND:
				{
				setState(31);
				con();
				}
				break;
			case DOLL:
				{
				setState(32);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(33);
				match(NUMBER);
				}
				break;
			case LBR:
				{
				setState(34);
				match(LBR);
				setState(35);
				expr(0);
				setState(36);
				match(RBR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(41);
						match(CAP);
						setState(42);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(44);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(45);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(47);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(48);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode UNDL() { return getToken(GenParser.UNDL, 0); }
		public TerminalNode ID() { return getToken(GenParser.ID, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor) return ((IVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(UNDL);
			setState(55);
			match(ID);
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

	public static class ConContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GenParser.AND, 0); }
		public TerminalNode ID() { return getToken(GenParser.ID, 0); }
		public ConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor) return ((IVisitor<? extends T>)visitor).visitCon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConContext con() throws RecognitionException {
		ConContext _localctx = new ConContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_con);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(AND);
			setState(58);
			match(ID);
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
		public TerminalNode DOLL() { return getToken(GenParser.DOLL, 0); }
		public TerminalNode ID() { return getToken(GenParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IVisitor) return ((IVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(DOLL);
			setState(61);
			match(ID);
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
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\5\3\36\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3)\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64\n\3\f\3"+
		"\16\3\67\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\2\3\4\7\2\4\6\b"+
		"\n\2\4\3\2\6\7\3\2\4\5\2F\2\f\3\2\2\2\4(\3\2\2\2\68\3\2\2\2\b;\3\2\2\2"+
		"\n>\3\2\2\2\f\r\5\n\6\2\r\16\7\20\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21"+
		"\b\3\1\2\21\22\7\5\2\2\22)\5\4\3\13\23\24\5\6\4\2\24\35\7\b\2\2\25\32"+
		"\5\4\3\2\26\27\7\17\2\2\27\31\5\4\3\2\30\26\3\2\2\2\31\34\3\2\2\2\32\30"+
		"\3\2\2\2\32\33\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\35\25\3\2\2\2\35\36"+
		"\3\2\2\2\36\37\3\2\2\2\37 \7\t\2\2 )\3\2\2\2!)\5\b\5\2\")\5\n\6\2#)\7"+
		"\n\2\2$%\7\b\2\2%&\5\4\3\2&\'\7\t\2\2\')\3\2\2\2(\20\3\2\2\2(\23\3\2\2"+
		"\2(!\3\2\2\2(\"\3\2\2\2(#\3\2\2\2($\3\2\2\2)\65\3\2\2\2*+\f\n\2\2+,\7"+
		"\21\2\2,\64\5\4\3\13-.\f\t\2\2./\t\2\2\2/\64\5\4\3\n\60\61\f\b\2\2\61"+
		"\62\t\3\2\2\62\64\5\4\3\t\63*\3\2\2\2\63-\3\2\2\2\63\60\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\289\7\13"+
		"\2\29:\7\3\2\2:\7\3\2\2\2;<\7\r\2\2<=\7\3\2\2=\t\3\2\2\2>?\7\f\2\2?@\7"+
		"\3\2\2@\13\3\2\2\2\7\32\35(\63\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}