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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, Nome=48, Numero=49, Cadeia=50, Ws=51, Comentario=52, 
		Separadordecampos=53;
	public static final int
		RULE_opbin = 0, RULE_opunaria = 1, RULE_programa = 2, RULE_trecho = 3, 
		RULE_bloco = 4, RULE_comando = 5, RULE_ultimocomando = 6, RULE_nomedafuncao = 7, 
		RULE_listavar = 8, RULE_var = 9, RULE_chamadadefuncao = 10, RULE_expprefixo = 11, 
		RULE_expprefixoTail = 12, RULE_listadenomes = 13, RULE_listaexp = 14, 
		RULE_exp = 15, RULE_args = 16, RULE_funcao = 17, RULE_corpodafuncao = 18, 
		RULE_listapar = 19, RULE_construtortabela = 20, RULE_listadecampos = 21, 
		RULE_campo = 22;
	public static final String[] ruleNames = {
		"opbin", "opunaria", "programa", "trecho", "bloco", "comando", "ultimocomando", 
		"nomedafuncao", "listavar", "var", "chamadadefuncao", "expprefixo", "expprefixoTail", 
		"listadenomes", "listaexp", "exp", "args", "funcao", "corpodafuncao", 
		"listapar", "construtortabela", "listadecampos", "campo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'..'", "'<'", "'<='", 
		"'>'", "'>='", "'=='", "'~='", "'and'", "'or'", "'not'", "'#'", "';'", 
		"'='", "'do'", "'end'", "'while'", "'repeat'", "'until'", "'if'", "'then'", 
		"'elseif'", "'else'", "'for'", "','", "'in'", "'function'", "'local'", 
		"'return'", "'break'", "'.'", "':'", "'['", "']'", "'('", "')'", "'nil'", 
		"'false'", "'true'", "'...'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Nome", "Numero", "Cadeia", "Ws", "Comentario", "Separadordecampos"
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
		enterRule(_localctx, 0, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		enterRule(_localctx, 2, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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
		enterRule(_localctx, 4, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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
		enterRule(_localctx, 6, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__39) | (1L << Nome))) != 0)) {
				{
				{
				setState(52);
				comando();
				setState(54);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(53);
					match(T__17);
					}
				}

				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_la = _input.LA(1);
			if (_la==T__33 || _la==T__34) {
				{
				setState(61);
				ultimocomando();
				setState(63);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(62);
					match(T__17);
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
		enterRule(_localctx, 8, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
		enterRule(_localctx, 10, RULE_comando);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				listavar();
				setState(70);
				match(T__18);
				setState(71);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				chamadadefuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(T__19);
				setState(75);
				bloco();
				setState(76);
				match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(T__21);
				setState(79);
				exp(0);
				setState(80);
				match(T__19);
				setState(81);
				bloco();
				setState(82);
				match(T__20);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(T__22);
				setState(85);
				bloco();
				setState(86);
				match(T__23);
				setState(87);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				match(T__24);
				setState(90);
				exp(0);
				setState(91);
				match(T__25);
				setState(92);
				bloco();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__26) {
					{
					{
					setState(93);
					match(T__26);
					setState(94);
					exp(0);
					setState(95);
					match(T__25);
					setState(96);
					bloco();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(103);
					match(T__27);
					setState(104);
					bloco();
					}
				}

				setState(107);
				match(T__20);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109);
				match(T__28);
				setState(110);
				match(Nome);
				setState(111);
				match(T__18);
				setState(112);
				exp(0);
				setState(113);
				match(T__29);
				setState(114);
				exp(0);
				setState(117);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(115);
					match(T__29);
					setState(116);
					exp(0);
					}
				}

				setState(119);
				match(T__19);
				setState(120);
				bloco();
				setState(121);
				match(T__20);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				match(T__28);
				setState(124);
				listadenomes();
				setState(125);
				match(T__30);
				setState(126);
				listaexp();
				setState(127);
				match(T__19);
				setState(128);
				bloco();
				setState(129);
				match(T__20);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(131);
				match(T__31);
				setState(132);
				nomedafuncao();
				setState(133);
				corpodafuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(135);
				match(T__32);
				setState(136);
				match(T__31);
				setState(137);
				match(Nome);
				setState(138);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(139);
				match(T__32);
				setState(140);
				listadenomes();
				setState(143);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(141);
					match(T__18);
					setState(142);
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
		enterRule(_localctx, 12, RULE_ultimocomando);
		int _la;
		try {
			setState(152);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__33);
				setState(149);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__16) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(148);
					listaexp();
					}
				}

				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__34);
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
		enterRule(_localctx, 14, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(Nome);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(155);
				match(T__35);
				setState(156);
				match(Nome);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(162);
				match(T__36);
				setState(163);
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
		enterRule(_localctx, 16, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			var();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(167);
				match(T__29);
				setState(168);
				var();
				}
				}
				setState(173);
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
		enterRule(_localctx, 18, RULE_var);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				expprefixo();
				setState(176);
				match(T__37);
				setState(177);
				exp(0);
				setState(178);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				expprefixo();
				setState(181);
				match(T__35);
				setState(182);
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
		enterRule(_localctx, 20, RULE_chamadadefuncao);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				expprefixo();
				setState(187);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				expprefixo();
				setState(190);
				match(T__36);
				setState(191);
				match(Nome);
				setState(192);
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
		enterRule(_localctx, 22, RULE_expprefixo);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__39);
				setState(198);
				exp(0);
				setState(199);
				match(T__40);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(Nome);
				setState(202);
				expprefixoTail();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(T__39);
				setState(204);
				exp(0);
				setState(205);
				match(T__40);
				setState(206);
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
		enterRule(_localctx, 24, RULE_expprefixoTail);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__37);
				setState(211);
				exp(0);
				setState(212);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__35);
				setState(215);
				match(Nome);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				args();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(T__36);
				setState(218);
				match(Nome);
				setState(219);
				args();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(T__37);
				setState(221);
				exp(0);
				setState(222);
				match(T__38);
				setState(223);
				expprefixoTail();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(T__35);
				setState(226);
				match(Nome);
				setState(227);
				expprefixoTail();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				args();
				setState(229);
				expprefixoTail();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(231);
				match(T__36);
				setState(232);
				match(Nome);
				setState(233);
				args();
				setState(234);
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
		enterRule(_localctx, 26, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(Nome);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					match(T__29);
					setState(240);
					match(Nome);
					}
					} 
				}
				setState(245);
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
		enterRule(_localctx, 28, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					exp(0);
					setState(247);
					match(T__29);
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(254);
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
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			switch (_input.LA(1)) {
			case T__41:
				{
				setState(257);
				match(T__41);
				}
				break;
			case T__42:
				{
				setState(258);
				match(T__42);
				}
				break;
			case T__43:
				{
				setState(259);
				match(T__43);
				}
				break;
			case Numero:
				{
				setState(260);
				match(Numero);
				}
				break;
			case Cadeia:
				{
				setState(261);
				match(Cadeia);
				}
				break;
			case T__44:
				{
				setState(262);
				match(T__44);
				}
				break;
			case T__31:
				{
				setState(263);
				funcao();
				}
				break;
			case T__39:
			case Nome:
				{
				setState(264);
				expprefixo();
				}
				break;
			case T__45:
				{
				setState(265);
				construtortabela();
				}
				break;
			case T__1:
			case T__15:
			case T__16:
				{
				setState(266);
				opunaria();
				setState(267);
				exp(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
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
					setState(271);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(272);
					opbin();
					setState(273);
					exp(3);
					}
					} 
				}
				setState(279);
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
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			setState(287);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__39);
				setState(282);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__16) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(281);
					listaexp();
					}
				}

				setState(284);
				match(T__40);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				construtortabela();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
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
		enterRule(_localctx, 34, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__31);
			setState(290);
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
		enterRule(_localctx, 36, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__39);
			setState(294);
			_la = _input.LA(1);
			if (_la==T__44 || _la==Nome) {
				{
				setState(293);
				listapar();
				}
			}

			setState(296);
			match(T__40);
			setState(297);
			bloco();
			setState(298);
			match(T__20);
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
		enterRule(_localctx, 38, RULE_listapar);
		int _la;
		try {
			setState(306);
			switch (_input.LA(1)) {
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				listadenomes();
				setState(303);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(301);
					match(T__29);
					setState(302);
					match(T__44);
					}
				}

				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__44);
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
		enterRule(_localctx, 40, RULE_construtortabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__45);
			setState(310);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__16) | (1L << T__31) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
				{
				setState(309);
				listadecampos();
				}
			}

			setState(312);
			match(T__46);
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
		enterRule(_localctx, 42, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			campo();
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					match(Separadordecampos);
					setState(316);
					campo();
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(323);
			_la = _input.LA(1);
			if (_la==Separadordecampos) {
				{
				setState(322);
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
		enterRule(_localctx, 44, RULE_campo);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(T__37);
				setState(326);
				exp(0);
				setState(327);
				match(T__38);
				setState(328);
				match(T__18);
				setState(329);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(Nome);
				setState(332);
				match(T__18);
				setState(333);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
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
		case 15:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u0154\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\5\59\n\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\5\5B\n"+
		"\5\5\5D\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"e\n\7\f\7\16\7h\13\7\3\7\3\7\5\7l\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7x\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\5\7\u0094\n"+
		"\7\3\b\3\b\5\b\u0098\n\b\3\b\5\b\u009b\n\b\3\t\3\t\3\t\7\t\u00a0\n\t\f"+
		"\t\16\t\u00a3\13\t\3\t\3\t\5\t\u00a7\n\t\3\n\3\n\3\n\7\n\u00ac\n\n\f\n"+
		"\16\n\u00af\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00bb\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c5\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d3\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ef\n\16\3\17\3\17\3\17"+
		"\7\17\u00f4\n\17\f\17\16\17\u00f7\13\17\3\20\3\20\3\20\7\20\u00fc\n\20"+
		"\f\20\16\20\u00ff\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u0110\n\21\3\21\3\21\3\21\3\21\7\21"+
		"\u0116\n\21\f\21\16\21\u0119\13\21\3\22\3\22\5\22\u011d\n\22\3\22\3\22"+
		"\3\22\5\22\u0122\n\22\3\23\3\23\3\23\3\24\3\24\5\24\u0129\n\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\5\25\u0132\n\25\3\25\5\25\u0135\n\25\3\26"+
		"\3\26\5\26\u0139\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u0140\n\27\f\27\16"+
		"\27\u0143\13\27\3\27\5\27\u0146\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0152\n\30\3\30\2\3 \31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\4\3\2\3\21\4\2\4\4\22\23\u0177\2\60\3\2\2\2\4"+
		"\62\3\2\2\2\6\64\3\2\2\2\b<\3\2\2\2\nE\3\2\2\2\f\u0093\3\2\2\2\16\u009a"+
		"\3\2\2\2\20\u009c\3\2\2\2\22\u00a8\3\2\2\2\24\u00ba\3\2\2\2\26\u00c4\3"+
		"\2\2\2\30\u00d2\3\2\2\2\32\u00ee\3\2\2\2\34\u00f0\3\2\2\2\36\u00fd\3\2"+
		"\2\2 \u010f\3\2\2\2\"\u0121\3\2\2\2$\u0123\3\2\2\2&\u0126\3\2\2\2(\u0134"+
		"\3\2\2\2*\u0136\3\2\2\2,\u013c\3\2\2\2.\u0151\3\2\2\2\60\61\t\2\2\2\61"+
		"\3\3\2\2\2\62\63\t\3\2\2\63\5\3\2\2\2\64\65\5\b\5\2\65\7\3\2\2\2\668\5"+
		"\f\7\2\679\7\24\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:\66\3\2\2\2;>\3\2"+
		"\2\2<:\3\2\2\2<=\3\2\2\2=C\3\2\2\2><\3\2\2\2?A\5\16\b\2@B\7\24\2\2A@\3"+
		"\2\2\2AB\3\2\2\2BD\3\2\2\2C?\3\2\2\2CD\3\2\2\2D\t\3\2\2\2EF\5\b\5\2F\13"+
		"\3\2\2\2GH\5\22\n\2HI\7\25\2\2IJ\5\36\20\2J\u0094\3\2\2\2K\u0094\5\26"+
		"\f\2LM\7\26\2\2MN\5\n\6\2NO\7\27\2\2O\u0094\3\2\2\2PQ\7\30\2\2QR\5 \21"+
		"\2RS\7\26\2\2ST\5\n\6\2TU\7\27\2\2U\u0094\3\2\2\2VW\7\31\2\2WX\5\n\6\2"+
		"XY\7\32\2\2YZ\5 \21\2Z\u0094\3\2\2\2[\\\7\33\2\2\\]\5 \21\2]^\7\34\2\2"+
		"^f\5\n\6\2_`\7\35\2\2`a\5 \21\2ab\7\34\2\2bc\5\n\6\2ce\3\2\2\2d_\3\2\2"+
		"\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gk\3\2\2\2hf\3\2\2\2ij\7\36\2\2jl\5\n"+
		"\6\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\27\2\2n\u0094\3\2\2\2op\7\37\2"+
		"\2pq\7\62\2\2qr\7\25\2\2rs\5 \21\2st\7 \2\2tw\5 \21\2uv\7 \2\2vx\5 \21"+
		"\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\26\2\2z{\5\n\6\2{|\7\27\2\2|\u0094"+
		"\3\2\2\2}~\7\37\2\2~\177\5\34\17\2\177\u0080\7!\2\2\u0080\u0081\5\36\20"+
		"\2\u0081\u0082\7\26\2\2\u0082\u0083\5\n\6\2\u0083\u0084\7\27\2\2\u0084"+
		"\u0094\3\2\2\2\u0085\u0086\7\"\2\2\u0086\u0087\5\20\t\2\u0087\u0088\5"+
		"&\24\2\u0088\u0094\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008b\7\"\2\2\u008b"+
		"\u008c\7\62\2\2\u008c\u0094\5&\24\2\u008d\u008e\7#\2\2\u008e\u0091\5\34"+
		"\17\2\u008f\u0090\7\25\2\2\u0090\u0092\5\36\20\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093G\3\2\2\2\u0093K\3\2\2\2\u0093"+
		"L\3\2\2\2\u0093P\3\2\2\2\u0093V\3\2\2\2\u0093[\3\2\2\2\u0093o\3\2\2\2"+
		"\u0093}\3\2\2\2\u0093\u0085\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u008d\3"+
		"\2\2\2\u0094\r\3\2\2\2\u0095\u0097\7$\2\2\u0096\u0098\5\36\20\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u009b\7%"+
		"\2\2\u009a\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b\17\3\2\2\2\u009c\u00a1"+
		"\7\62\2\2\u009d\u009e\7&\2\2\u009e\u00a0\7\62\2\2\u009f\u009d\3\2\2\2"+
		"\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\'\2\2\u00a5\u00a7\7\62\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\21\3\2\2\2\u00a8\u00ad"+
		"\5\24\13\2\u00a9\u00aa\7 \2\2\u00aa\u00ac\5\24\13\2\u00ab\u00a9\3\2\2"+
		"\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\23"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00bb\7\62\2\2\u00b1\u00b2\5\30\r\2"+
		"\u00b2\u00b3\7(\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7)\2\2\u00b5\u00bb"+
		"\3\2\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\7&\2\2\u00b8\u00b9\7\62\2\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b6"+
		"\3\2\2\2\u00bb\25\3\2\2\2\u00bc\u00bd\5\30\r\2\u00bd\u00be\5\"\22\2\u00be"+
		"\u00c5\3\2\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\7"+
		"\62\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c5\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c5\27\3\2\2\2\u00c6\u00d3\7\62\2\2\u00c7\u00c8\7*\2"+
		"\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\7+\2\2\u00ca\u00d3\3\2\2\2\u00cb\u00cc"+
		"\7\62\2\2\u00cc\u00d3\5\32\16\2\u00cd\u00ce\7*\2\2\u00ce\u00cf\5 \21\2"+
		"\u00cf\u00d0\7+\2\2\u00d0\u00d1\5\32\16\2\u00d1\u00d3\3\2\2\2\u00d2\u00c6"+
		"\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3"+
		"\31\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5\u00d6\5 \21\2\u00d6\u00d7\7)\2\2"+
		"\u00d7\u00ef\3\2\2\2\u00d8\u00d9\7&\2\2\u00d9\u00ef\7\62\2\2\u00da\u00ef"+
		"\5\"\22\2\u00db\u00dc\7\'\2\2\u00dc\u00dd\7\62\2\2\u00dd\u00ef\5\"\22"+
		"\2\u00de\u00df\7(\2\2\u00df\u00e0\5 \21\2\u00e0\u00e1\7)\2\2\u00e1\u00e2"+
		"\5\32\16\2\u00e2\u00ef\3\2\2\2\u00e3\u00e4\7&\2\2\u00e4\u00e5\7\62\2\2"+
		"\u00e5\u00ef\5\32\16\2\u00e6\u00e7\5\"\22\2\u00e7\u00e8\5\32\16\2\u00e8"+
		"\u00ef\3\2\2\2\u00e9\u00ea\7\'\2\2\u00ea\u00eb\7\62\2\2\u00eb\u00ec\5"+
		"\"\22\2\u00ec\u00ed\5\32\16\2\u00ed\u00ef\3\2\2\2\u00ee\u00d4\3\2\2\2"+
		"\u00ee\u00d8\3\2\2\2\u00ee\u00da\3\2\2\2\u00ee\u00db\3\2\2\2\u00ee\u00de"+
		"\3\2\2\2\u00ee\u00e3\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ef"+
		"\33\3\2\2\2\u00f0\u00f5\7\62\2\2\u00f1\u00f2\7 \2\2\u00f2\u00f4\7\62\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\35\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\5 \21\2\u00f9"+
		"\u00fa\7 \2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\5 \21\2\u0101\37\3\2\2\2\u0102\u0103\b\21\1"+
		"\2\u0103\u0110\7,\2\2\u0104\u0110\7-\2\2\u0105\u0110\7.\2\2\u0106\u0110"+
		"\7\63\2\2\u0107\u0110\7\64\2\2\u0108\u0110\7/\2\2\u0109\u0110\5$\23\2"+
		"\u010a\u0110\5\30\r\2\u010b\u0110\5*\26\2\u010c\u010d\5\4\3\2\u010d\u010e"+
		"\5 \21\3\u010e\u0110\3\2\2\2\u010f\u0102\3\2\2\2\u010f\u0104\3\2\2\2\u010f"+
		"\u0105\3\2\2\2\u010f\u0106\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u0108\3\2"+
		"\2\2\u010f\u0109\3\2\2\2\u010f\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u010f"+
		"\u010c\3\2\2\2\u0110\u0117\3\2\2\2\u0111\u0112\f\4\2\2\u0112\u0113\5\2"+
		"\2\2\u0113\u0114\5 \21\5\u0114\u0116\3\2\2\2\u0115\u0111\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118!\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u011a\u011c\7*\2\2\u011b\u011d\5\36\20\2\u011c\u011b"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0122\7+\2\2\u011f"+
		"\u0122\5*\26\2\u0120\u0122\7\64\2\2\u0121\u011a\3\2\2\2\u0121\u011f\3"+
		"\2\2\2\u0121\u0120\3\2\2\2\u0122#\3\2\2\2\u0123\u0124\7\"\2\2\u0124\u0125"+
		"\5&\24\2\u0125%\3\2\2\2\u0126\u0128\7*\2\2\u0127\u0129\5(\25\2\u0128\u0127"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7+\2\2\u012b"+
		"\u012c\5\n\6\2\u012c\u012d\7\27\2\2\u012d\'\3\2\2\2\u012e\u0131\5\34\17"+
		"\2\u012f\u0130\7 \2\2\u0130\u0132\7/\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0135\7/\2\2\u0134\u012e\3\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0135)\3\2\2\2\u0136\u0138\7\60\2\2\u0137\u0139\5,\27\2"+
		"\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\7\61\2\2\u013b+\3\2\2\2\u013c\u0141\5.\30\2\u013d\u013e\7\67\2\2\u013e"+
		"\u0140\5.\30\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0146\7\67\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146-\3\2\2\2"+
		"\u0147\u0148\7(\2\2\u0148\u0149\5 \21\2\u0149\u014a\7)\2\2\u014a\u014b"+
		"\7\25\2\2\u014b\u014c\5 \21\2\u014c\u0152\3\2\2\2\u014d\u014e\7\62\2\2"+
		"\u014e\u014f\7\25\2\2\u014f\u0152\5 \21\2\u0150\u0152\5 \21\2\u0151\u0147"+
		"\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u0150\3\2\2\2\u0152/\3\2\2\2!8<ACf"+
		"kw\u0091\u0093\u0097\u009a\u00a1\u00a6\u00ad\u00ba\u00c4\u00d2\u00ee\u00f5"+
		"\u00fd\u010f\u0117\u011c\u0121\u0128\u0131\u0134\u0138\u0141\u0145\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}