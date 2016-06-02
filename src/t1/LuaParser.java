package t1;// Generated from Lua.g4 by ANTLR 4.5.2
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
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, Nome=31, Palavrasreservadas=32, 
		Numero=33, Cadeia=34, Ws=35, Comentario=36, Separadordecampos=37, Opbin=38, 
		Opunaria=39;
	public static final int
		RULE_programa = 0, RULE_trecho = 1, RULE_bloco = 2, RULE_comando = 3, 
		RULE_ultimocomando = 4, RULE_nomedafuncao = 5, RULE_listavar = 6, RULE_var = 7, 
		RULE_expprefixo = 8, RULE_empprefixoTail = 9, RULE_chamadadefuncao = 10, 
		RULE_chamadaTail = 11, RULE_listadenomes = 12, RULE_listaexp = 13, RULE_exp = 14, 
		RULE_args = 15, RULE_funcao = 16, RULE_corpodafuncao = 17, RULE_listapar = 18, 
		RULE_construtortabela = 19, RULE_listadecampos = 20, RULE_campo = 21;
	public static final String[] ruleNames = {
		"programa", "trecho", "bloco", "comando", "ultimocomando", "nomedafuncao", 
		"listavar", "var", "expprefixo", "empprefixoTail", "chamadadefuncao", 
		"chamadaTail", "listadenomes", "listaexp", "exp", "args", "funcao", "corpodafuncao", 
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
		null, null, null, null, null, null, null, "Nome", "Palavrasreservadas", 
		"Numero", "Cadeia", "Ws", "Comentario", "Separadordecampos", "Opbin", 
		"Opunaria"
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


	   public static String grupo="495913";

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
			setState(44);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << Nome))) != 0)) {
				{
				{
				setState(46);
				comando();
				setState(48);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(47);
					match(T__0);
					}
				}

				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__17) {
				{
				setState(55);
				ultimocomando();
				setState(57);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(56);
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
			setState(61);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				listavar();
				setState(64);
				match(T__1);
				setState(65);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(T__2);
				setState(69);
				bloco();
				setState(70);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(T__4);
				setState(73);
				exp(0);
				setState(74);
				match(T__2);
				setState(75);
				bloco();
				setState(76);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(T__5);
				setState(79);
				bloco();
				setState(80);
				match(T__6);
				setState(81);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(T__7);
				setState(84);
				exp(0);
				setState(85);
				match(T__8);
				setState(86);
				bloco();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(87);
					match(T__9);
					setState(88);
					exp(0);
					setState(89);
					match(T__8);
					setState(90);
					bloco();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(97);
					match(T__10);
					setState(98);
					bloco();
					}
				}

				setState(101);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				match(T__11);
				setState(104);
				match(Nome);
				setState(105);
				match(T__1);
				setState(106);
				exp(0);
				setState(107);
				match(T__12);
				setState(108);
				exp(0);
				setState(111);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(109);
					match(T__12);
					setState(110);
					exp(0);
					}
				}

				setState(113);
				match(T__2);
				setState(114);
				bloco();
				setState(115);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				match(T__11);
				setState(118);
				listadenomes();
				setState(119);
				match(T__13);
				setState(120);
				listaexp();
				setState(121);
				match(T__2);
				setState(122);
				bloco();
				setState(123);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(125);
				match(T__14);
				setState(126);
				nomedafuncao();
				setState(127);
				corpodafuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(129);
				match(T__15);
				setState(130);
				match(T__14);
				setState(131);
				match(Nome);
				setState(132);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(133);
				match(T__15);
				setState(134);
				listadenomes();
				setState(137);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(135);
					match(T__1);
					setState(136);
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
			setState(146);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__16);
				setState(143);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << Nome) | (1L << Numero) | (1L << Cadeia) | (1L << Opunaria))) != 0)) {
					{
					setState(142);
					listaexp();
					}
				}

				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
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
			setState(148);
			match(Nome);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(149);
				match(T__18);
				setState(150);
				match(Nome);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(156);
				match(T__19);
				setState(157);
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
			setState(160);
			var();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(161);
				match(T__12);
				setState(162);
				var();
				}
				}
				setState(167);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				expprefixo();
				setState(170);
				match(T__20);
				setState(171);
				exp(0);
				setState(172);
				match(T__21);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				expprefixo();
				setState(175);
				match(T__18);
				setState(176);
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

	public static class ExpprefixoContext extends ParserRuleContext {
		public EmpprefixoTailContext empprefixoTail() {
			return getRuleContext(EmpprefixoTailContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
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
		enterRule(_localctx, 16, RULE_expprefixo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(180);
				chamadadefuncao();
				}
				break;
			case 2:
				{
				setState(181);
				match(T__22);
				setState(182);
				exp(0);
				setState(183);
				match(T__23);
				}
				break;
			case 3:
				{
				setState(185);
				match(Nome);
				}
				break;
			}
			setState(188);
			empprefixoTail();
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

	public static class EmpprefixoTailContext extends ParserRuleContext {
		public EmpprefixoTailContext empprefixoTail() {
			return getRuleContext(EmpprefixoTailContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public EmpprefixoTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empprefixoTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterEmpprefixoTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitEmpprefixoTail(this);
		}
	}

	public final EmpprefixoTailContext empprefixoTail() throws RecognitionException {
		EmpprefixoTailContext _localctx = new EmpprefixoTailContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_empprefixoTail);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(190);
					match(T__20);
					setState(191);
					exp(0);
					setState(192);
					match(T__21);
					}
					break;
				case T__18:
					{
					setState(194);
					match(T__18);
					setState(195);
					match(Nome);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198);
				empprefixoTail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		public ChamadaTailContext chamadaTail() {
			return getRuleContext(ChamadaTailContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		enterRule(_localctx, 20, RULE_chamadadefuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(202);
				match(T__22);
				setState(203);
				exp(0);
				setState(204);
				match(T__23);
				}
				break;
			case Nome:
				{
				setState(206);
				match(Nome);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
			chamadaTail();
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

	public static class ChamadaTailContext extends ParserRuleContext {
		public EmpprefixoTailContext empprefixoTail() {
			return getRuleContext(EmpprefixoTailContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ChamadaTailContext chamadaTail() {
			return getRuleContext(ChamadaTailContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ChamadaTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadaTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadaTail(this);
		}
	}

	public final ChamadaTailContext chamadaTail() throws RecognitionException {
		ChamadaTailContext _localctx = new ChamadaTailContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chamadaTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			empprefixoTail();
			setState(214);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(212);
				match(T__19);
				setState(213);
				match(Nome);
				}
			}

			setState(216);
			args();
			setState(217);
			chamadaTail();
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
		enterRule(_localctx, 24, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(Nome);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					match(T__12);
					setState(221);
					match(Nome);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 26, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					exp(0);
					setState(228);
					match(T__12);
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(235);
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
		public TerminalNode Opunaria() { return getToken(LuaParser.Opunaria, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			switch (_input.LA(1)) {
			case Opunaria:
				{
				setState(238);
				match(Opunaria);
				setState(239);
				exp(1);
				}
				break;
			case T__24:
				{
				setState(240);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(241);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(242);
				match(T__26);
				}
				break;
			case Numero:
				{
				setState(243);
				match(Numero);
				}
				break;
			case Cadeia:
				{
				setState(244);
				match(Cadeia);
				}
				break;
			case T__27:
				{
				setState(245);
				match(T__27);
				}
				break;
			case T__14:
				{
				setState(246);
				funcao();
				}
				break;
			case T__22:
			case Nome:
				{
				setState(247);
				expprefixo();
				}
				break;
			case T__28:
				{
				setState(248);
				construtortabela();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(251);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(252);
					match(Opbin);
					setState(253);
					exp(3);
					}
					} 
				}
				setState(258);
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
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			setState(266);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__22);
				setState(261);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << Nome) | (1L << Numero) | (1L << Cadeia) | (1L << Opunaria))) != 0)) {
					{
					setState(260);
					listaexp();
					}
				}

				setState(263);
				match(T__23);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				construtortabela();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
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
		enterRule(_localctx, 32, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__14);
			setState(269);
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
		enterRule(_localctx, 34, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__22);
			setState(273);
			_la = _input.LA(1);
			if (_la==T__27 || _la==Nome) {
				{
				setState(272);
				listapar();
				}
			}

			setState(275);
			match(T__23);
			setState(276);
			bloco();
			setState(277);
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
		enterRule(_localctx, 36, RULE_listapar);
		int _la;
		try {
			setState(285);
			switch (_input.LA(1)) {
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				listadenomes();
				setState(282);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(280);
					match(T__12);
					setState(281);
					match(T__27);
					}
				}

				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
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
		enterRule(_localctx, 38, RULE_construtortabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__28);
			setState(289);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << Nome) | (1L << Numero) | (1L << Cadeia) | (1L << Opunaria))) != 0)) {
				{
				setState(288);
				listadecampos();
				}
			}

			setState(291);
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
		enterRule(_localctx, 40, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			campo();
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					match(Separadordecampos);
					setState(295);
					campo();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(302);
			_la = _input.LA(1);
			if (_la==Separadordecampos) {
				{
				setState(301);
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
		enterRule(_localctx, 42, RULE_campo);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(T__20);
				setState(305);
				exp(0);
				setState(306);
				match(T__21);
				setState(307);
				match(T__1);
				setState(308);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(Nome);
				setState(311);
				match(T__1);
				setState(312);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
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
		case 14:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u013f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\5\3"+
		"\63\n\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\5\3<\n\3\5\3>\n\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3"+
		"\5\3\5\5\5f\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u008c\n\5\5\5\u008e\n\5\3\6\3\6\5\6\u0092\n\6"+
		"\3\6\5\6\u0095\n\6\3\7\3\7\3\7\7\7\u009a\n\7\f\7\16\7\u009d\13\7\3\7\3"+
		"\7\5\7\u00a1\n\7\3\b\3\b\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00bd\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c7\n\13\3"+
		"\13\3\13\5\13\u00cb\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00d2\n\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u00d9\n\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00e1\n\16\f\16"+
		"\16\16\u00e4\13\16\3\17\3\17\3\17\7\17\u00e9\n\17\f\17\16\17\u00ec\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00fc\n\20\3\20\3\20\3\20\7\20\u0101\n\20\f\20\16\20\u0104\13"+
		"\20\3\21\3\21\5\21\u0108\n\21\3\21\3\21\3\21\5\21\u010d\n\21\3\22\3\22"+
		"\3\22\3\23\3\23\5\23\u0114\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24"+
		"\u011d\n\24\3\24\5\24\u0120\n\24\3\25\3\25\5\25\u0124\n\25\3\25\3\25\3"+
		"\26\3\26\3\26\7\26\u012b\n\26\f\26\16\26\u012e\13\26\3\26\5\26\u0131\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013d\n\27"+
		"\3\27\2\3\36\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u015e"+
		"\2.\3\2\2\2\4\66\3\2\2\2\6?\3\2\2\2\b\u008d\3\2\2\2\n\u0094\3\2\2\2\f"+
		"\u0096\3\2\2\2\16\u00a2\3\2\2\2\20\u00b4\3\2\2\2\22\u00bc\3\2\2\2\24\u00ca"+
		"\3\2\2\2\26\u00d1\3\2\2\2\30\u00d5\3\2\2\2\32\u00dd\3\2\2\2\34\u00ea\3"+
		"\2\2\2\36\u00fb\3\2\2\2 \u010c\3\2\2\2\"\u010e\3\2\2\2$\u0111\3\2\2\2"+
		"&\u011f\3\2\2\2(\u0121\3\2\2\2*\u0127\3\2\2\2,\u013c\3\2\2\2./\5\4\3\2"+
		"/\3\3\2\2\2\60\62\5\b\5\2\61\63\7\3\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63"+
		"\65\3\2\2\2\64\60\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67="+
		"\3\2\2\28\66\3\2\2\29;\5\n\6\2:<\7\3\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2"+
		"=9\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?@\5\4\3\2@\7\3\2\2\2AB\5\16\b\2BC\7\4"+
		"\2\2CD\5\34\17\2D\u008e\3\2\2\2E\u008e\5\26\f\2FG\7\5\2\2GH\5\6\4\2HI"+
		"\7\6\2\2I\u008e\3\2\2\2JK\7\7\2\2KL\5\36\20\2LM\7\5\2\2MN\5\6\4\2NO\7"+
		"\6\2\2O\u008e\3\2\2\2PQ\7\b\2\2QR\5\6\4\2RS\7\t\2\2ST\5\36\20\2T\u008e"+
		"\3\2\2\2UV\7\n\2\2VW\5\36\20\2WX\7\13\2\2X`\5\6\4\2YZ\7\f\2\2Z[\5\36\20"+
		"\2[\\\7\13\2\2\\]\5\6\4\2]_\3\2\2\2^Y\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3"+
		"\2\2\2ae\3\2\2\2b`\3\2\2\2cd\7\r\2\2df\5\6\4\2ec\3\2\2\2ef\3\2\2\2fg\3"+
		"\2\2\2gh\7\6\2\2h\u008e\3\2\2\2ij\7\16\2\2jk\7!\2\2kl\7\4\2\2lm\5\36\20"+
		"\2mn\7\17\2\2nq\5\36\20\2op\7\17\2\2pr\5\36\20\2qo\3\2\2\2qr\3\2\2\2r"+
		"s\3\2\2\2st\7\5\2\2tu\5\6\4\2uv\7\6\2\2v\u008e\3\2\2\2wx\7\16\2\2xy\5"+
		"\32\16\2yz\7\20\2\2z{\5\34\17\2{|\7\5\2\2|}\5\6\4\2}~\7\6\2\2~\u008e\3"+
		"\2\2\2\177\u0080\7\21\2\2\u0080\u0081\5\f\7\2\u0081\u0082\5$\23\2\u0082"+
		"\u008e\3\2\2\2\u0083\u0084\7\22\2\2\u0084\u0085\7\21\2\2\u0085\u0086\7"+
		"!\2\2\u0086\u008e\5$\23\2\u0087\u0088\7\22\2\2\u0088\u008b\5\32\16\2\u0089"+
		"\u008a\7\4\2\2\u008a\u008c\5\34\17\2\u008b\u0089\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008e\3\2\2\2\u008dA\3\2\2\2\u008dE\3\2\2\2\u008dF\3\2\2"+
		"\2\u008dJ\3\2\2\2\u008dP\3\2\2\2\u008dU\3\2\2\2\u008di\3\2\2\2\u008dw"+
		"\3\2\2\2\u008d\177\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u0087\3\2\2\2\u008e"+
		"\t\3\2\2\2\u008f\u0091\7\23\2\2\u0090\u0092\5\34\17\2\u0091\u0090\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0095\7\24\2\2\u0094"+
		"\u008f\3\2\2\2\u0094\u0093\3\2\2\2\u0095\13\3\2\2\2\u0096\u009b\7!\2\2"+
		"\u0097\u0098\7\25\2\2\u0098\u009a\7!\2\2\u0099\u0097\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7\26\2\2\u009f\u00a1\7!\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a7\5\20\t\2\u00a3\u00a4"+
		"\7\17\2\2\u00a4\u00a6\5\20\t\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00b5\7!\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\7\27\2\2"+
		"\u00ad\u00ae\5\36\20\2\u00ae\u00af\7\30\2\2\u00af\u00b5\3\2\2\2\u00b0"+
		"\u00b1\5\22\n\2\u00b1\u00b2\7\25\2\2\u00b2\u00b3\7!\2\2\u00b3\u00b5\3"+
		"\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5"+
		"\21\3\2\2\2\u00b6\u00bd\5\26\f\2\u00b7\u00b8\7\31\2\2\u00b8\u00b9\5\36"+
		"\20\2\u00b9\u00ba\7\32\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\7!\2\2\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\5\24\13\2\u00bf\23\3\2\2\2\u00c0\u00c1\7\27\2\2\u00c1"+
		"\u00c2\5\36\20\2\u00c2\u00c3\7\30\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c5"+
		"\7\25\2\2\u00c5\u00c7\7!\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00cb\5\24\13\2\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3"+
		"\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\25\3\2\2\2\u00cc\u00cd\7\31\2\2\u00cd"+
		"\u00ce\5\36\20\2\u00ce\u00cf\7\32\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2"+
		"\7!\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\5\30\r\2\u00d4\27\3\2\2\2\u00d5\u00d8\5\24\13\2\u00d6\u00d7\7\26"+
		"\2\2\u00d7\u00d9\7!\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\5 \21\2\u00db\u00dc\5\30\r\2\u00dc\31\3\2\2"+
		"\2\u00dd\u00e2\7!\2\2\u00de\u00df\7\17\2\2\u00df\u00e1\7!\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\33\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\36\20\2\u00e6\u00e7\7\17"+
		"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00ee\5\36\20\2\u00ee\35\3\2\2\2\u00ef\u00f0\b\20\1\2\u00f0"+
		"\u00f1\7)\2\2\u00f1\u00fc\5\36\20\3\u00f2\u00fc\7\33\2\2\u00f3\u00fc\7"+
		"\34\2\2\u00f4\u00fc\7\35\2\2\u00f5\u00fc\7#\2\2\u00f6\u00fc\7$\2\2\u00f7"+
		"\u00fc\7\36\2\2\u00f8\u00fc\5\"\22\2\u00f9\u00fc\5\22\n\2\u00fa\u00fc"+
		"\5(\25\2\u00fb\u00ef\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb"+
		"\u00f4\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2"+
		"\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u0102\3\2\2\2\u00fd\u00fe\f\4\2\2\u00fe\u00ff\7(\2\2\u00ff\u0101\5\36"+
		"\20\5\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\37\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\7\31\2"+
		"\2\u0106\u0108\5\34\17\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010d\7\32\2\2\u010a\u010d\5(\25\2\u010b\u010d\7"+
		"$\2\2\u010c\u0105\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"!\3\2\2\2\u010e\u010f\7\21\2\2\u010f\u0110\5$\23\2\u0110#\3\2\2\2\u0111"+
		"\u0113\7\31\2\2\u0112\u0114\5&\24\2\u0113\u0112\3\2\2\2\u0113\u0114\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\32\2\2\u0116\u0117\5\6\4\2\u0117"+
		"\u0118\7\6\2\2\u0118%\3\2\2\2\u0119\u011c\5\32\16\2\u011a\u011b\7\17\2"+
		"\2\u011b\u011d\7\36\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u0120\7\36\2\2\u011f\u0119\3\2\2\2\u011f\u011e\3"+
		"\2\2\2\u0120\'\3\2\2\2\u0121\u0123\7\37\2\2\u0122\u0124\5*\26\2\u0123"+
		"\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7 "+
		"\2\2\u0126)\3\2\2\2\u0127\u012c\5,\27\2\u0128\u0129\7\'\2\2\u0129\u012b"+
		"\5,\27\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\7\'"+
		"\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131+\3\2\2\2\u0132\u0133"+
		"\7\27\2\2\u0133\u0134\5\36\20\2\u0134\u0135\7\30\2\2\u0135\u0136\7\4\2"+
		"\2\u0136\u0137\5\36\20\2\u0137\u013d\3\2\2\2\u0138\u0139\7!\2\2\u0139"+
		"\u013a\7\4\2\2\u013a\u013d\5\36\20\2\u013b\u013d\5\36\20\2\u013c\u0132"+
		"\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u013b\3\2\2\2\u013d-\3\2\2\2#\62\66"+
		";=`eq\u008b\u008d\u0091\u0094\u009b\u00a0\u00a7\u00b4\u00bc\u00c6\u00ca"+
		"\u00d1\u00d8\u00e2\u00ea\u00fb\u0102\u0107\u010c\u0113\u011c\u011f\u0123"+
		"\u012c\u0130\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}