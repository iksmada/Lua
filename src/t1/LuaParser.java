// Generated from Lua.g4 by ANTLR 4.5.2
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, Nome=48, Numero=49, Cadeia=50;
	public static final int
		RULE_programa = 0, RULE_trecho = 1, RULE_bloco = 2, RULE_comando = 3, 
		RULE_ultimocomando = 4, RULE_nomedafuncao = 5, RULE_listavar = 6, RULE_var = 7, 
		RULE_varTail = 8, RULE_expprefixo = 9, RULE_nomeArgs = 10, RULE_listadenomes = 11, 
		RULE_listaexp = 12, RULE_exp = 13, RULE_args = 14, RULE_funcao = 15, RULE_corpodafuncao = 16, 
		RULE_listapar = 17, RULE_construtortabela = 18, RULE_listadecampos = 19, 
		RULE_campo = 20, RULE_separadordecampos = 21, RULE_opbin = 22, RULE_opunaria = 23;
	public static final String[] ruleNames = {
		"programa", "trecho", "bloco", "comando", "ultimocomando", "nomedafuncao", 
		"listavar", "var", "varTail", "expprefixo", "nomeArgs", "listadenomes", 
		"listaexp", "exp", "args", "funcao", "corpodafuncao", "listapar", "construtortabela", 
		"listadecampos", "campo", "separadordecampos", "opbin", "opunaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "':'", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
		"'if'", "'then'", "'elseif'", "'else'", "'for'", "','", "'in'", "'function'", 
		"'local'", "'return'", "'break'", "'.'", "'['", "']'", "'('", "')'", "'nil'", 
		"'false'", "'true'", "'...'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
		"'^'", "'%'", "'..'", "'<'", "'<='", "'>'", "'>='", "'=='", "'~='", "'and'", 
		"'or'", "'not'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Nome", "Numero", "Cadeia"
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
			setState(48);
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__22) | (1L << Nome))) != 0)) {
				{
				{
				setState(50);
				comando();
				setState(52);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(51);
					match(T__0);
					}
				}

				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(59);
				ultimocomando();
				setState(61);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(60);
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
			setState(65);
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
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				listavar();
				setState(68);
				match(T__1);
				setState(69);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				expprefixo(0);
				setState(72);
				args();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				expprefixo(0);
				setState(75);
				match(T__2);
				setState(76);
				match(Nome);
				setState(77);
				args();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(T__3);
				setState(80);
				bloco();
				setState(81);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(T__5);
				setState(84);
				exp(0);
				setState(85);
				match(T__3);
				setState(86);
				bloco();
				setState(87);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				match(T__6);
				setState(90);
				bloco();
				setState(91);
				match(T__7);
				setState(92);
				exp(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(T__8);
				setState(95);
				exp(0);
				setState(96);
				match(T__9);
				setState(97);
				bloco();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(98);
					match(T__10);
					setState(99);
					exp(0);
					setState(100);
					match(T__9);
					setState(101);
					bloco();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(108);
					match(T__11);
					setState(109);
					bloco();
					}
				}

				setState(112);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				match(T__12);
				setState(115);
				match(Nome);
				setState(116);
				match(T__1);
				setState(117);
				exp(0);
				setState(118);
				match(T__13);
				setState(119);
				exp(0);
				setState(122);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(120);
					match(T__13);
					setState(121);
					exp(0);
					}
				}

				setState(124);
				match(T__3);
				setState(125);
				bloco();
				setState(126);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				match(T__12);
				setState(129);
				listadenomes();
				setState(130);
				match(T__14);
				setState(131);
				listaexp();
				setState(132);
				match(T__3);
				setState(133);
				bloco();
				setState(134);
				match(T__4);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(136);
				match(T__15);
				setState(137);
				nomedafuncao();
				setState(138);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(140);
				match(T__16);
				setState(141);
				match(T__15);
				setState(142);
				match(Nome);
				setState(143);
				corpodafuncao();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				match(T__16);
				setState(145);
				listadenomes();
				setState(148);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(146);
					match(T__1);
					setState(147);
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
			setState(157);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__17);
				setState(154);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(153);
					listaexp();
					}
				}

				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__18);
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
			setState(159);
			match(Nome);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(160);
				match(T__19);
				setState(161);
				match(Nome);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(167);
				match(T__2);
				setState(168);
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
			setState(171);
			var();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(172);
				match(T__13);
				setState(173);
				var();
				}
				}
				setState(178);
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
		public VarTailContext varTail() {
			return getRuleContext(VarTailContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(Nome);
				setState(180);
				varTail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				expprefixo(0);
				setState(182);
				varTail();
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

	public static class VarTailContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarTailContext varTail() {
			return getRuleContext(VarTailContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public VarTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarTail(this);
		}
	}

	public final VarTailContext varTail() throws RecognitionException {
		VarTailContext _localctx = new VarTailContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varTail);
		try {
			setState(195);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__20);
				setState(187);
				exp(0);
				setState(188);
				match(T__21);
				setState(189);
				varTail();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__19);
				setState(192);
				match(Nome);
				setState(193);
				varTail();
				}
				break;
			case T__1:
			case T__2:
			case T__13:
			case T__22:
			case T__28:
			case Cadeia:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ExpprefixoContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public VarTailContext varTail() {
			return getRuleContext(VarTailContext.class,0);
		}
		public NomeArgsContext nomeArgs() {
			return getRuleContext(NomeArgsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
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
		return expprefixo(0);
	}

	private ExpprefixoContext expprefixo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, _parentState);
		ExpprefixoContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expprefixo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			switch (_input.LA(1)) {
			case Nome:
				{
				setState(198);
				match(Nome);
				setState(199);
				varTail();
				setState(200);
				nomeArgs();
				}
				break;
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
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpprefixoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expprefixo);
					setState(208);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(209);
					varTail();
					setState(210);
					nomeArgs();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class NomeArgsContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public NomeArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomeArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomeArgs(this);
		}
	}

	public final NomeArgsContext nomeArgs() throws RecognitionException {
		NomeArgsContext _localctx = new NomeArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nomeArgs);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__2);
				setState(218);
				match(Nome);
				setState(219);
				args();
				}
				break;
			case T__22:
			case T__28:
			case Cadeia:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				args();
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
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(224);
						match(T__13);
						setState(225);
						match(Nome);
						}
						} 
					}
					setState(230);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					exp(0);
					setState(234);
					match(T__13);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(241);
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
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
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
		public OpbinContext opbin() {
			return getRuleContext(OpbinContext.class,0);
		}
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
			setState(256);
			switch (_input.LA(1)) {
			case T__31:
			case T__45:
			case T__46:
				{
				setState(244);
				opunaria();
				setState(245);
				exp(1);
				}
				break;
			case T__24:
				{
				setState(247);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(248);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(249);
				match(T__26);
				}
				break;
			case Numero:
				{
				setState(250);
				match(Numero);
				}
				break;
			case Cadeia:
				{
				setState(251);
				match(Cadeia);
				}
				break;
			case T__27:
				{
				setState(252);
				match(T__27);
				}
				break;
			case T__15:
				{
				setState(253);
				funcao();
				}
				break;
			case T__22:
			case Nome:
				{
				setState(254);
				expprefixo(0);
				}
				break;
			case T__28:
				{
				setState(255);
				construtortabela();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
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
					setState(258);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(259);
					opbin();
					setState(260);
					exp(3);
					}
					} 
				}
				setState(266);
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
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			setState(274);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__22);
				setState(269);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(268);
					listaexp();
					}
				}

				setState(271);
				match(T__23);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				construtortabela();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
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
			setState(276);
			match(T__15);
			setState(277);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__22);
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(280);
				listapar();
				}
				break;
			}
			setState(283);
			match(T__23);
			setState(284);
			bloco();
			setState(285);
			match(T__4);
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
			setState(293);
			switch (_input.LA(1)) {
			case T__13:
			case T__23:
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				listadenomes();
				setState(290);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(288);
					match(T__13);
					setState(289);
					match(T__27);
					}
				}

				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
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
			setState(295);
			match(T__28);
			setState(297);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
				{
				setState(296);
				listadecampos();
				}
			}

			setState(299);
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
		public List<SeparadordecamposContext> separadordecampos() {
			return getRuleContexts(SeparadordecamposContext.class);
		}
		public SeparadordecamposContext separadordecampos(int i) {
			return getRuleContext(SeparadordecamposContext.class,i);
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
			setState(301);
			campo();
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					separadordecampos();
					setState(303);
					campo();
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(311);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__13) {
				{
				setState(310);
				separadordecampos();
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
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(T__20);
				setState(314);
				exp(0);
				setState(315);
				match(T__21);
				setState(316);
				match(T__1);
				setState(317);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(Nome);
				setState(320);
				match(T__1);
				setState(321);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
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

	public static class SeparadordecamposContext extends ParserRuleContext {
		public SeparadordecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadordecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterSeparadordecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitSeparadordecampos(this);
		}
	}

	public final SeparadordecamposContext separadordecampos() throws RecognitionException {
		SeparadordecamposContext _localctx = new SeparadordecamposContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class OpbinContext extends ParserRuleContext {
		public OpbinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpbin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpbin(this);
		}
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class OpunariaContext extends ParserRuleContext {
		public OpunariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opunaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpunaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpunaria(this);
		}
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__45) | (1L << T__46))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expprefixo_sempred((ExpprefixoContext)_localctx, predIndex);
		case 13:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expprefixo_sempred(ExpprefixoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u014e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\5\3\67\n\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\5\3@\n\3\5"+
		"\3B\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\5\5q\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5}\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0097\n\5\5\5\u0099\n\5\3\6\3\6\5\6\u009d\n\6\3\6\5\6\u00a0\n\6\3\7"+
		"\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\7\3\7\5\7\u00ac\n\7\3\b\3"+
		"\b\3\b\7\b\u00b1\n\b\f\b\16\b\u00b4\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u00bb"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c6\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d1\n\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00d7\n\13\f\13\16\13\u00da\13\13\3\f\3\f\3\f\3\f\5\f\u00e0\n\f\3\r\3"+
		"\r\3\r\7\r\u00e5\n\r\f\r\16\r\u00e8\13\r\5\r\u00ea\n\r\3\16\3\16\3\16"+
		"\7\16\u00ef\n\16\f\16\16\16\u00f2\13\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0103\n\17\3\17\3\17"+
		"\3\17\3\17\7\17\u0109\n\17\f\17\16\17\u010c\13\17\3\20\3\20\5\20\u0110"+
		"\n\20\3\20\3\20\3\20\5\20\u0115\n\20\3\21\3\21\3\21\3\22\3\22\5\22\u011c"+
		"\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0125\n\23\3\23\5\23\u0128"+
		"\n\23\3\24\3\24\5\24\u012c\n\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0134"+
		"\n\25\f\25\16\25\u0137\13\25\3\25\5\25\u013a\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0146\n\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\2\4\24\34\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\2\5\4\2\3\3\20\20\3\2!/\4\2\"\"\60\61\u016b\2\62\3\2\2\2\4:\3\2"+
		"\2\2\6C\3\2\2\2\b\u0098\3\2\2\2\n\u009f\3\2\2\2\f\u00a1\3\2\2\2\16\u00ad"+
		"\3\2\2\2\20\u00ba\3\2\2\2\22\u00c5\3\2\2\2\24\u00d0\3\2\2\2\26\u00df\3"+
		"\2\2\2\30\u00e9\3\2\2\2\32\u00f0\3\2\2\2\34\u0102\3\2\2\2\36\u0114\3\2"+
		"\2\2 \u0116\3\2\2\2\"\u0119\3\2\2\2$\u0127\3\2\2\2&\u0129\3\2\2\2(\u012f"+
		"\3\2\2\2*\u0145\3\2\2\2,\u0147\3\2\2\2.\u0149\3\2\2\2\60\u014b\3\2\2\2"+
		"\62\63\5\4\3\2\63\3\3\2\2\2\64\66\5\b\5\2\65\67\7\3\2\2\66\65\3\2\2\2"+
		"\66\67\3\2\2\2\679\3\2\2\28\64\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;"+
		"A\3\2\2\2<:\3\2\2\2=?\5\n\6\2>@\7\3\2\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2"+
		"A=\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CD\5\4\3\2D\7\3\2\2\2EF\5\16\b\2FG\7\4"+
		"\2\2GH\5\32\16\2H\u0099\3\2\2\2IJ\5\24\13\2JK\5\36\20\2K\u0099\3\2\2\2"+
		"LM\5\24\13\2MN\7\5\2\2NO\7\62\2\2OP\5\36\20\2P\u0099\3\2\2\2QR\7\6\2\2"+
		"RS\5\6\4\2ST\7\7\2\2T\u0099\3\2\2\2UV\7\b\2\2VW\5\34\17\2WX\7\6\2\2XY"+
		"\5\6\4\2YZ\7\7\2\2Z\u0099\3\2\2\2[\\\7\t\2\2\\]\5\6\4\2]^\7\n\2\2^_\5"+
		"\34\17\2_\u0099\3\2\2\2`a\7\13\2\2ab\5\34\17\2bc\7\f\2\2ck\5\6\4\2de\7"+
		"\r\2\2ef\5\34\17\2fg\7\f\2\2gh\5\6\4\2hj\3\2\2\2id\3\2\2\2jm\3\2\2\2k"+
		"i\3\2\2\2kl\3\2\2\2lp\3\2\2\2mk\3\2\2\2no\7\16\2\2oq\5\6\4\2pn\3\2\2\2"+
		"pq\3\2\2\2qr\3\2\2\2rs\7\7\2\2s\u0099\3\2\2\2tu\7\17\2\2uv\7\62\2\2vw"+
		"\7\4\2\2wx\5\34\17\2xy\7\20\2\2y|\5\34\17\2z{\7\20\2\2{}\5\34\17\2|z\3"+
		"\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\6\2\2\177\u0080\5\6\4\2\u0080\u0081"+
		"\7\7\2\2\u0081\u0099\3\2\2\2\u0082\u0083\7\17\2\2\u0083\u0084\5\30\r\2"+
		"\u0084\u0085\7\21\2\2\u0085\u0086\5\32\16\2\u0086\u0087\7\6\2\2\u0087"+
		"\u0088\5\6\4\2\u0088\u0089\7\7\2\2\u0089\u0099\3\2\2\2\u008a\u008b\7\22"+
		"\2\2\u008b\u008c\5\f\7\2\u008c\u008d\5\"\22\2\u008d\u0099\3\2\2\2\u008e"+
		"\u008f\7\23\2\2\u008f\u0090\7\22\2\2\u0090\u0091\7\62\2\2\u0091\u0099"+
		"\5\"\22\2\u0092\u0093\7\23\2\2\u0093\u0096\5\30\r\2\u0094\u0095\7\4\2"+
		"\2\u0095\u0097\5\32\16\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098E\3\2\2\2\u0098I\3\2\2\2\u0098L\3\2\2\2\u0098Q\3\2"+
		"\2\2\u0098U\3\2\2\2\u0098[\3\2\2\2\u0098`\3\2\2\2\u0098t\3\2\2\2\u0098"+
		"\u0082\3\2\2\2\u0098\u008a\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u0092\3\2"+
		"\2\2\u0099\t\3\2\2\2\u009a\u009c\7\24\2\2\u009b\u009d\5\32\16\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u00a0\7\25"+
		"\2\2\u009f\u009a\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u00a6"+
		"\7\62\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a5\7\62\2\2\u00a4\u00a2\3\2\2"+
		"\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ab"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ac\7\62\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00b2\5"+
		"\20\t\2\u00ae\u00af\7\20\2\2\u00af\u00b1\5\20\t\2\u00b0\u00ae\3\2\2\2"+
		"\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\17"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\62\2\2\u00b6\u00bb\5\22\n\2"+
		"\u00b7\u00b8\5\24\13\2\u00b8\u00b9\5\22\n\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b5\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\21\3\2\2\2\u00bc\u00bd\7\27\2"+
		"\2\u00bd\u00be\5\34\17\2\u00be\u00bf\7\30\2\2\u00bf\u00c0\5\22\n\2\u00c0"+
		"\u00c6\3\2\2\2\u00c1\u00c2\7\26\2\2\u00c2\u00c3\7\62\2\2\u00c3\u00c6\5"+
		"\22\n\2\u00c4\u00c6\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c8\b\13\1\2\u00c8\u00c9\7\62"+
		"\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb\5\26\f\2\u00cb\u00d1\3\2\2\2\u00cc"+
		"\u00cd\7\31\2\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\7\32\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d8\3\2\2\2\u00d2"+
		"\u00d3\f\5\2\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\5\26\f\2\u00d5\u00d7\3"+
		"\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\25\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\5\2"+
		"\2\u00dc\u00dd\7\62\2\2\u00dd\u00e0\5\36\20\2\u00de\u00e0\5\36\20\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\27\3\2\2\2\u00e1\u00ea\7\62\2"+
		"\2\u00e2\u00e3\7\20\2\2\u00e3\u00e5\7\62\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea"+
		"\31\3\2\2\2\u00eb\u00ec\5\34\17\2\u00ec\u00ed\7\20\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\5\34"+
		"\17\2\u00f4\33\3\2\2\2\u00f5\u00f6\b\17\1\2\u00f6\u00f7\5\60\31\2\u00f7"+
		"\u00f8\5\34\17\3\u00f8\u0103\3\2\2\2\u00f9\u0103\7\33\2\2\u00fa\u0103"+
		"\7\34\2\2\u00fb\u0103\7\35\2\2\u00fc\u0103\7\63\2\2\u00fd\u0103\7\64\2"+
		"\2\u00fe\u0103\7\36\2\2\u00ff\u0103\5 \21\2\u0100\u0103\5\24\13\2\u0101"+
		"\u0103\5&\24\2\u0102\u00f5\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fa\3\2"+
		"\2\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102"+
		"\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2"+
		"\2\2\u0103\u010a\3\2\2\2\u0104\u0105\f\4\2\2\u0105\u0106\5.\30\2\u0106"+
		"\u0107\5\34\17\5\u0107\u0109\3\2\2\2\u0108\u0104\3\2\2\2\u0109\u010c\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\35\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010f\7\31\2\2\u010e\u0110\5\32\16\2\u010f\u010e"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0115\7\32\2\2"+
		"\u0112\u0115\5&\24\2\u0113\u0115\7\64\2\2\u0114\u010d\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115\37\3\2\2\2\u0116\u0117\7\22\2\2\u0117"+
		"\u0118\5\"\22\2\u0118!\3\2\2\2\u0119\u011b\7\31\2\2\u011a\u011c\5$\23"+
		"\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\7\32\2\2\u011e\u011f\5\6\4\2\u011f\u0120\7\7\2\2\u0120#\3\2\2\2\u0121"+
		"\u0124\5\30\r\2\u0122\u0123\7\20\2\2\u0123\u0125\7\36\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0128\7\36\2\2"+
		"\u0127\u0121\3\2\2\2\u0127\u0126\3\2\2\2\u0128%\3\2\2\2\u0129\u012b\7"+
		"\37\2\2\u012a\u012c\5(\25\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\7 \2\2\u012e\'\3\2\2\2\u012f\u0135\5*\26\2"+
		"\u0130\u0131\5,\27\2\u0131\u0132\5*\26\2\u0132\u0134\3\2\2\2\u0133\u0130"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\5,\27\2\u0139\u0138\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a)\3\2\2\2\u013b\u013c\7\27\2\2\u013c\u013d"+
		"\5\34\17\2\u013d\u013e\7\30\2\2\u013e\u013f\7\4\2\2\u013f\u0140\5\34\17"+
		"\2\u0140\u0146\3\2\2\2\u0141\u0142\7\62\2\2\u0142\u0143\7\4\2\2\u0143"+
		"\u0146\5\34\17\2\u0144\u0146\5\34\17\2\u0145\u013b\3\2\2\2\u0145\u0141"+
		"\3\2\2\2\u0145\u0144\3\2\2\2\u0146+\3\2\2\2\u0147\u0148\t\2\2\2\u0148"+
		"-\3\2\2\2\u0149\u014a\t\3\2\2\u014a/\3\2\2\2\u014b\u014c\t\4\2\2\u014c"+
		"\61\3\2\2\2#\66:?Akp|\u0096\u0098\u009c\u009f\u00a6\u00ab\u00b2\u00ba"+
		"\u00c5\u00d0\u00d8\u00df\u00e6\u00e9\u00f0\u0102\u010a\u010f\u0114\u011b"+
		"\u0124\u0127\u012b\u0135\u0139\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}