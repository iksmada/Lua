package t1;

// Generated from Lua.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, Nome=31, Numero=32, 
		Cadeia=33, Ws=34, Comentario=35, Separadordecampos=36, Opbin=37, Opunaria=38;
	public static final int
		RULE_programa = 0, RULE_trecho = 1, RULE_bloco = 2, RULE_comando = 3, 
		RULE_ultimocomando = 4, RULE_nomedafuncao = 5, RULE_listavar = 6, RULE_var = 7, 
		RULE_chamadadefuncao = 8, RULE_expprefixo = 9, RULE_expprefixoTail = 10, 
		RULE_listadenomes = 11, RULE_listaexp = 12, RULE_exp = 13, RULE_args = 14, 
		RULE_funcao = 15, RULE_corpodafuncao = 16, RULE_listapar = 17, RULE_construtortabela = 18, 
		RULE_listadecampos = 19, RULE_campo = 20;
	public static final String[] ruleNames = {
		"programa", "trecho", "bloco", "comando", "ultimocomando", "nomedafuncao", 
		"listavar", "var", "chamadadefuncao", "expprefixo", "expprefixoTail", 
		"listadenomes", "listaexp", "exp", "args", "funcao", "corpodafuncao", 
		"listapar", "construtortabela", "listadecampos", "campo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
		"'if'", "'then'", "'elseif'", "'else'", "'for'", "','", "'in'", "'function'", 
		"'local'", "'return'", "'break'", "'.'", "':'", "'['", "']'", "'('", "')'", 
		"'nil'", "'false'", "'true'", "'...'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Nome", "Numero", "Cadeia", 
		"Ws", "Comentario", "Separadordecampos", "Opbin", "Opunaria"
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="495913, 495719";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			trecho();
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

	public static class TrechoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public UltimocomandoContext ultimocomando() {
			return getRuleContext(UltimocomandoContext.class,0);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTrecho(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << Nome))) != 0)) {
				{
				{
				setState(44);
				comando();
				setState(46);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(45);
					match(T__0);
					}
				}

				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__17) {
				{
				setState(53);
				ultimocomando();
				setState(55);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(54);
					match(T__0);
					}
				}

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

	public static class BlocoContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			trecho();
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

	public static class ComandoContext extends ParserRuleContext {
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				listavar();
				setState(62);
				match(T__1);
				setState(63);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__2);
				setState(67);
				bloco();
				setState(68);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(T__4);
				setState(71);
				exp(0);
				setState(72);
				match(T__2);
				setState(73);
				bloco();
				setState(74);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(T__5);
				setState(77);
				bloco();
				setState(78);
				match(T__6);
				setState(79);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				match(T__7);
				setState(82);
				exp(0);
				setState(83);
				match(T__8);
				setState(84);
				bloco();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(85);
					match(T__9);
					setState(86);
					exp(0);
					setState(87);
					match(T__8);
					setState(88);
					bloco();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(95);
					match(T__10);
					setState(96);
					bloco();
					}
				}

				setState(99);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				match(T__11);
				setState(102);
				match(Nome);
				setState(103);
				match(T__1);
				setState(104);
				exp(0);
				setState(105);
				match(T__12);
				setState(106);
				exp(0);
				setState(109);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(107);
					match(T__12);
					setState(108);
					exp(0);
					}
				}

				setState(111);
				match(T__2);
				setState(112);
				bloco();
				setState(113);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				match(T__11);
				setState(116);
				listadenomes();
				setState(117);
				match(T__13);
				setState(118);
				listaexp();
				setState(119);
				match(T__2);
				setState(120);
				bloco();
				setState(121);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				match(T__14);
				setState(124);
				nomedafuncao();
				setState(125);
				corpodafuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(127);
				match(T__15);
				setState(128);
				match(T__14);
				setState(129);
				match(Nome);
				setState(130);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(131);
				match(T__15);
				setState(132);
				listadenomes();
				setState(135);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(133);
					match(T__1);
					setState(134);
					listaexp();
					}
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

	public static class UltimocomandoContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public UltimocomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimocomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterUltimocomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitUltimocomando(this);
		}
	}

	public final UltimocomandoContext ultimocomando() throws RecognitionException {
		UltimocomandoContext _localctx = new UltimocomandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ultimocomando);
		int _la;
		try {
			setState(144);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__16);
				setState(141);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << Nome) | (1L << Numero) | (1L << Cadeia) | (1L << Opunaria))) != 0)) {
					{
					setState(140);
					listaexp();
					}
				}

				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__17);
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

	public static class NomedafuncaoContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public NomedafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomedafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomedafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomedafuncao(this);
		}
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(Nome);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(147);
				match(T__18);
				setState(148);
				match(Nome);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(154);
				match(T__19);
				setState(155);
				match(Nome);
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

	public static class ListavarContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ListavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListavar(this);
		}
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			var();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(159);
				match(T__12);
				setState(160);
				var();
				}
				}
				setState(165);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				expprefixo();
				setState(168);
				match(T__20);
				setState(169);
				exp(0);
				setState(170);
				match(T__21);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				expprefixo();
				setState(173);
				match(T__18);
				setState(174);
				match(Nome);
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

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ChamadadefuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadadefuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadadefuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadadefuncao(this);
		}
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chamadadefuncao);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				expprefixo();
				setState(179);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				expprefixo();
				setState(182);
				match(T__19);
				setState(183);
				match(Nome);
				setState(184);
				args();
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

	public static class ExpprefixoContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpprefixoTailContext expprefixoTail() {
			return getRuleContext(ExpprefixoTailContext.class,0);
		}
		public ExpprefixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixo(this);
		}
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expprefixo);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__22);
				setState(190);
				exp(0);
				setState(191);
				match(T__23);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(Nome);
				setState(194);
				expprefixoTail();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(T__22);
				setState(196);
				exp(0);
				setState(197);
				match(T__23);
				setState(198);
				expprefixoTail();
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

	public static class ExpprefixoTailContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExpprefixoTailContext expprefixoTail() {
			return getRuleContext(ExpprefixoTailContext.class,0);
		}
		public ExpprefixoTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixoTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExpprefixoTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExpprefixoTail(this);
		}
	}

	public final ExpprefixoTailContext expprefixoTail() throws RecognitionException {
		ExpprefixoTailContext _localctx = new ExpprefixoTailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expprefixoTail);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__20);
				setState(203);
				exp(0);
				setState(204);
				match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__18);
				setState(207);
				match(Nome);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				args();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(T__19);
				setState(210);
				match(Nome);
				setState(211);
				args();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(T__20);
				setState(213);
				exp(0);
				setState(214);
				match(T__21);
				setState(215);
				expprefixoTail();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(T__18);
				setState(218);
				match(Nome);
				setState(219);
				expprefixoTail();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				args();
				setState(221);
				expprefixoTail();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
				match(T__19);
				setState(224);
				match(Nome);
				setState(225);
				args();
				setState(226);
				expprefixoTail();
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

	public static class ListadenomesContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public ListadenomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadenomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadenomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadenomes(this);
		}
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(Nome);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(T__12);
					setState(232);
					match(Nome);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaexp(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					exp(0);
					setState(239);
					match(T__12);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(246);
			exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode Numero() { return getToken(LuaParser.Numero, 0); }
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public TerminalNode Opunaria() { return getToken(LuaParser.Opunaria, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Opbin() { return getToken(LuaParser.Opbin, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			switch (_input.LA(1)) {
			case T__24:
				{
				setState(249);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(250);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(251);
				match(T__26);
				}
				break;
			case Numero:
				{
				setState(252);
				match(Numero);
				}
				break;
			case Cadeia:
				{
				setState(253);
				match(Cadeia);
				}
				break;
			case T__27:
				{
				setState(254);
				match(T__27);
				}
				break;
			case T__14:
				{
				setState(255);
				funcao();
				}
				break;
			case T__22:
			case Nome:
				{
				setState(256);
				expprefixo();
				}
				break;
			case T__28:
				{
				setState(257);
				construtortabela();
				}
				break;
			case Opunaria:
				{
				setState(258);
				match(Opunaria);
				setState(259);
				exp(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(262);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(263);
					match(Opbin);
					setState(264);
					exp(3);
					}
					} 
				}
				setState(269);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			setState(277);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__22);
				setState(272);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << Nome) | (1L << Numero) | (1L << Cadeia) | (1L << Opunaria))) != 0)) {
					{
					setState(271);
					listaexp();
					}
				}

				setState(274);
				match(T__23);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				construtortabela();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(Cadeia);
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

	public static class FuncaoContext extends ParserRuleContext {
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__14);
			setState(280);
			corpodafuncao();
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

	public static class CorpodafuncaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ListaparContext listapar() {
			return getRuleContext(ListaparContext.class,0);
		}
		public CorpodafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpodafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCorpodafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCorpodafuncao(this);
		}
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__22);
			setState(284);
			_la = _input.LA(1);
			if (_la==T__27 || _la==Nome) {
				{
				setState(283);
				listapar();
				}
			}

			setState(286);
			match(T__23);
			setState(287);
			bloco();
			setState(288);
			match(T__3);
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

	public static class ListaparContext extends ParserRuleContext {
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public ListaparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listapar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListapar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListapar(this);
		}
	}

	public final ListaparContext listapar() throws RecognitionException {
		ListaparContext _localctx = new ListaparContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listapar);
		int _la;
		try {
			setState(296);
			switch (_input.LA(1)) {
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				listadenomes();
				setState(293);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(291);
					match(T__12);
					setState(292);
					match(T__27);
					}
				}

				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(T__27);
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

	public static class ConstrutortabelaContext extends ParserRuleContext {
		public ListadecamposContext listadecampos() {
			return getRuleContext(ListadecamposContext.class,0);
		}
		public ConstrutortabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtortabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConstrutortabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConstrutortabela(this);
		}
	}

	public final ConstrutortabelaContext construtortabela() throws RecognitionException {
		ConstrutortabelaContext _localctx = new ConstrutortabelaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_construtortabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__28);
			setState(300);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << Nome) | (1L << Numero) | (1L << Cadeia) | (1L << Opunaria))) != 0)) {
				{
				setState(299);
				listadecampos();
				}
			}

			setState(302);
			match(T__29);
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

	public static class ListadecamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<TerminalNode> Separadordecampos() { return getTokens(LuaParser.Separadordecampos); }
		public TerminalNode Separadordecampos(int i) {
			return getToken(LuaParser.Separadordecampos, i);
		}
		public ListadecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadecampos(this);
		}
	}

	public final ListadecamposContext listadecampos() throws RecognitionException {
		ListadecamposContext _localctx = new ListadecamposContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			campo();
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					match(Separadordecampos);
					setState(306);
					campo();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(313);
			_la = _input.LA(1);
			if (_la==Separadordecampos) {
				{
				setState(312);
				match(Separadordecampos);
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

	public static class CampoContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCampo(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_campo);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(T__20);
				setState(316);
				exp(0);
				setState(317);
				match(T__21);
				setState(318);
				match(T__1);
				setState(319);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(Nome);
				setState(322);
				match(T__1);
				setState(323);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				exp(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\5\3\61\n\3\7"+
		"\3\63\n\3\f\3\16\3\66\13\3\3\3\3\3\5\3:\n\3\5\3<\n\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\5\3\5\5"+
		"\5d\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u008a\n\5\5\5\u008c\n\5\3\6\3\6\5\6\u0090\n\6\3\6\5\6"+
		"\u0093\n\6\3\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\7\3\7\5\7\u009f"+
		"\n\7\3\b\3\b\3\b\7\b\u00a4\n\b\f\b\16\b\u00a7\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00bd\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00cb\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e7\n\f\3\r\3"+
		"\r\3\r\7\r\u00ec\n\r\f\r\16\r\u00ef\13\r\3\16\3\16\3\16\7\16\u00f4\n\16"+
		"\f\16\16\16\u00f7\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0107\n\17\3\17\3\17\3\17\7\17\u010c\n\17"+
		"\f\17\16\17\u010f\13\17\3\20\3\20\5\20\u0113\n\20\3\20\3\20\3\20\5\20"+
		"\u0118\n\20\3\21\3\21\3\21\3\22\3\22\5\22\u011f\n\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\5\23\u0128\n\23\3\23\5\23\u012b\n\23\3\24\3\24\5\24"+
		"\u012f\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u0136\n\25\f\25\16\25\u0139"+
		"\13\25\3\25\5\25\u013c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0148\n\26\3\26\2\3\34\27\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*\2\2\u016f\2,\3\2\2\2\4\64\3\2\2\2\6=\3\2\2\2\b\u008b"+
		"\3\2\2\2\n\u0092\3\2\2\2\f\u0094\3\2\2\2\16\u00a0\3\2\2\2\20\u00b2\3\2"+
		"\2\2\22\u00bc\3\2\2\2\24\u00ca\3\2\2\2\26\u00e6\3\2\2\2\30\u00e8\3\2\2"+
		"\2\32\u00f5\3\2\2\2\34\u0106\3\2\2\2\36\u0117\3\2\2\2 \u0119\3\2\2\2\""+
		"\u011c\3\2\2\2$\u012a\3\2\2\2&\u012c\3\2\2\2(\u0132\3\2\2\2*\u0147\3\2"+
		"\2\2,-\5\4\3\2-\3\3\2\2\2.\60\5\b\5\2/\61\7\3\2\2\60/\3\2\2\2\60\61\3"+
		"\2\2\2\61\63\3\2\2\2\62.\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\65;\3\2\2\2\66\64\3\2\2\2\679\5\n\6\28:\7\3\2\298\3\2\2\29:\3\2\2"+
		"\2:<\3\2\2\2;\67\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=>\5\4\3\2>\7\3\2\2\2?@\5"+
		"\16\b\2@A\7\4\2\2AB\5\32\16\2B\u008c\3\2\2\2C\u008c\5\22\n\2DE\7\5\2\2"+
		"EF\5\6\4\2FG\7\6\2\2G\u008c\3\2\2\2HI\7\7\2\2IJ\5\34\17\2JK\7\5\2\2KL"+
		"\5\6\4\2LM\7\6\2\2M\u008c\3\2\2\2NO\7\b\2\2OP\5\6\4\2PQ\7\t\2\2QR\5\34"+
		"\17\2R\u008c\3\2\2\2ST\7\n\2\2TU\5\34\17\2UV\7\13\2\2V^\5\6\4\2WX\7\f"+
		"\2\2XY\5\34\17\2YZ\7\13\2\2Z[\5\6\4\2[]\3\2\2\2\\W\3\2\2\2]`\3\2\2\2^"+
		"\\\3\2\2\2^_\3\2\2\2_c\3\2\2\2`^\3\2\2\2ab\7\r\2\2bd\5\6\4\2ca\3\2\2\2"+
		"cd\3\2\2\2de\3\2\2\2ef\7\6\2\2f\u008c\3\2\2\2gh\7\16\2\2hi\7!\2\2ij\7"+
		"\4\2\2jk\5\34\17\2kl\7\17\2\2lo\5\34\17\2mn\7\17\2\2np\5\34\17\2om\3\2"+
		"\2\2op\3\2\2\2pq\3\2\2\2qr\7\5\2\2rs\5\6\4\2st\7\6\2\2t\u008c\3\2\2\2"+
		"uv\7\16\2\2vw\5\30\r\2wx\7\20\2\2xy\5\32\16\2yz\7\5\2\2z{\5\6\4\2{|\7"+
		"\6\2\2|\u008c\3\2\2\2}~\7\21\2\2~\177\5\f\7\2\177\u0080\5\"\22\2\u0080"+
		"\u008c\3\2\2\2\u0081\u0082\7\22\2\2\u0082\u0083\7\21\2\2\u0083\u0084\7"+
		"!\2\2\u0084\u008c\5\"\22\2\u0085\u0086\7\22\2\2\u0086\u0089\5\30\r\2\u0087"+
		"\u0088\7\4\2\2\u0088\u008a\5\32\16\2\u0089\u0087\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u008c\3\2\2\2\u008b?\3\2\2\2\u008bC\3\2\2\2\u008bD\3\2\2"+
		"\2\u008bH\3\2\2\2\u008bN\3\2\2\2\u008bS\3\2\2\2\u008bg\3\2\2\2\u008bu"+
		"\3\2\2\2\u008b}\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0085\3\2\2\2\u008c"+
		"\t\3\2\2\2\u008d\u008f\7\23\2\2\u008e\u0090\5\32\16\2\u008f\u008e\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0093\7\24\2\2\u0092"+
		"\u008d\3\2\2\2\u0092\u0091\3\2\2\2\u0093\13\3\2\2\2\u0094\u0099\7!\2\2"+
		"\u0095\u0096\7\25\2\2\u0096\u0098\7!\2\2\u0097\u0095\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009d\7\26\2\2\u009d\u009f\7!\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\r\3\2\2\2\u00a0\u00a5\5\20\t\2\u00a1\u00a2"+
		"\7\17\2\2\u00a2\u00a4\5\20\t\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\17\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00b3\7!\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\7\27\2\2"+
		"\u00ab\u00ac\5\34\17\2\u00ac\u00ad\7\30\2\2\u00ad\u00b3\3\2\2\2\u00ae"+
		"\u00af\5\24\13\2\u00af\u00b0\7\25\2\2\u00b0\u00b1\7!\2\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3"+
		"\21\3\2\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\5\36\20\2\u00b6\u00bd\3"+
		"\2\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba\7!\2\2\u00ba"+
		"\u00bb\5\36\20\2\u00bb\u00bd\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b7\3"+
		"\2\2\2\u00bd\23\3\2\2\2\u00be\u00cb\7!\2\2\u00bf\u00c0\7\31\2\2\u00c0"+
		"\u00c1\5\34\17\2\u00c1\u00c2\7\32\2\2\u00c2\u00cb\3\2\2\2\u00c3\u00c4"+
		"\7!\2\2\u00c4\u00cb\5\26\f\2\u00c5\u00c6\7\31\2\2\u00c6\u00c7\5\34\17"+
		"\2\u00c7\u00c8\7\32\2\2\u00c8\u00c9\5\26\f\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00be\3\2\2\2\u00ca\u00bf\3\2\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00c5\3\2"+
		"\2\2\u00cb\25\3\2\2\2\u00cc\u00cd\7\27\2\2\u00cd\u00ce\5\34\17\2\u00ce"+
		"\u00cf\7\30\2\2\u00cf\u00e7\3\2\2\2\u00d0\u00d1\7\25\2\2\u00d1\u00e7\7"+
		"!\2\2\u00d2\u00e7\5\36\20\2\u00d3\u00d4\7\26\2\2\u00d4\u00d5\7!\2\2\u00d5"+
		"\u00e7\5\36\20\2\u00d6\u00d7\7\27\2\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9"+
		"\7\30\2\2\u00d9\u00da\5\26\f\2\u00da\u00e7\3\2\2\2\u00db\u00dc\7\25\2"+
		"\2\u00dc\u00dd\7!\2\2\u00dd\u00e7\5\26\f\2\u00de\u00df\5\36\20\2\u00df"+
		"\u00e0\5\26\f\2\u00e0\u00e7\3\2\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3\7"+
		"!\2\2\u00e3\u00e4\5\36\20\2\u00e4\u00e5\5\26\f\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00cc\3\2\2\2\u00e6\u00d0\3\2\2\2\u00e6\u00d2\3\2\2\2\u00e6\u00d3\3\2"+
		"\2\2\u00e6\u00d6\3\2\2\2\u00e6\u00db\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6"+
		"\u00e1\3\2\2\2\u00e7\27\3\2\2\2\u00e8\u00ed\7!\2\2\u00e9\u00ea\7\17\2"+
		"\2\u00ea\u00ec\7!\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\5\34\17\2\u00f1\u00f2\7\17\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f0"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\5\34\17\2\u00f9\33\3\2"+
		"\2\2\u00fa\u00fb\b\17\1\2\u00fb\u0107\7\33\2\2\u00fc\u0107\7\34\2\2\u00fd"+
		"\u0107\7\35\2\2\u00fe\u0107\7\"\2\2\u00ff\u0107\7#\2\2\u0100\u0107\7\36"+
		"\2\2\u0101\u0107\5 \21\2\u0102\u0107\5\24\13\2\u0103\u0107\5&\24\2\u0104"+
		"\u0105\7(\2\2\u0105\u0107\5\34\17\3\u0106\u00fa\3\2\2\2\u0106\u00fc\3"+
		"\2\2\2\u0106\u00fd\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0106"+
		"\u0100\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u010d\3\2\2\2\u0108\u0109\f\4\2\2\u0109"+
		"\u010a\7\'\2\2\u010a\u010c\5\34\17\5\u010b\u0108\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\35\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0112\7\31\2\2\u0111\u0113\5\32\16\2\u0112\u0111"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\7\32\2\2"+
		"\u0115\u0118\5&\24\2\u0116\u0118\7#\2\2\u0117\u0110\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0116\3\2\2\2\u0118\37\3\2\2\2\u0119\u011a\7\21\2\2\u011a"+
		"\u011b\5\"\22\2\u011b!\3\2\2\2\u011c\u011e\7\31\2\2\u011d\u011f\5$\23"+
		"\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\7\32\2\2\u0121\u0122\5\6\4\2\u0122\u0123\7\6\2\2\u0123#\3\2\2\2\u0124"+
		"\u0127\5\30\r\2\u0125\u0126\7\17\2\2\u0126\u0128\7\36\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012b\7\36\2\2"+
		"\u012a\u0124\3\2\2\2\u012a\u0129\3\2\2\2\u012b%\3\2\2\2\u012c\u012e\7"+
		"\37\2\2\u012d\u012f\5(\25\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\7 \2\2\u0131\'\3\2\2\2\u0132\u0137\5*\26\2"+
		"\u0133\u0134\7&\2\2\u0134\u0136\5*\26\2\u0135\u0133\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013c\7&\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c)\3\2\2\2\u013d\u013e\7\27\2\2\u013e\u013f\5\34\17\2\u013f\u0140"+
		"\7\30\2\2\u0140\u0141\7\4\2\2\u0141\u0142\5\34\17\2\u0142\u0148\3\2\2"+
		"\2\u0143\u0144\7!\2\2\u0144\u0145\7\4\2\2\u0145\u0148\5\34\17\2\u0146"+
		"\u0148\5\34\17\2\u0147\u013d\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0146\3"+
		"\2\2\2\u0148+\3\2\2\2!\60\649;^co\u0089\u008b\u008f\u0092\u0099\u009e"+
		"\u00a5\u00b2\u00bc\u00ca\u00e6\u00ed\u00f5\u0106\u010d\u0112\u0117\u011e"+
		"\u0127\u012a\u012e\u0137\u013b\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}