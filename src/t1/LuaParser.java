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
		T__45=46, T__46=47, NOME=48, NUMERO=49, CADEIA=50, WS=51, COMENTARIO=52, 
		SEPARADORDECAMPOS=53;
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
		"NOME", "NUMERO", "CADEIA", "WS", "COMENTARIO", "SEPARADORDECAMPOS"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__39) | (1L << NOME))) != 0)) {
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
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
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
				match(NOME);
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
				match(NOME);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__16) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << NOME) | (1L << NUMERO) | (1L << CADEIA))) != 0)) {
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
		public Token NOME;
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
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
			((NomedafuncaoContext)_localctx).NOME = match(NOME);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(155);
				match(T__35);
				setState(156);
				((NomedafuncaoContext)_localctx).NOME = match(NOME);
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
				((NomedafuncaoContext)_localctx).NOME = match(NOME);
				}
			}

			 TabelaDeSimbolos.adicionarSimbolo((((NomedafuncaoContext)_localctx).NOME!=null?((NomedafuncaoContext)_localctx).NOME.getText():null),Tipo.FUNCAO); 
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
			setState(168);
			var();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(169);
				match(T__29);
				setState(170);
				var();
				}
				}
				setState(175);
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
		public Token NOME;
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				((VarContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((VarContext)_localctx).NOME!=null?((VarContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				expprefixo();
				setState(179);
				match(T__37);
				setState(180);
				exp(0);
				setState(181);
				match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				expprefixo();
				setState(184);
				match(T__35);
				setState(185);
				match(NOME);
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
		public Token NOME;
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				((ChamadadefuncaoContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((ChamadadefuncaoContext)_localctx).NOME!=null?((ChamadadefuncaoContext)_localctx).NOME.getText():null),Tipo.FUNCAO); 
				setState(191);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				expprefixo();
				setState(193);
				match(T__36);
				setState(194);
				match(NOME);
				setState(195);
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
		public Token NOME;
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((ExpprefixoContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((ExpprefixoContext)_localctx).NOME!=null?((ExpprefixoContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__39);
				setState(202);
				exp(0);
				setState(203);
				match(T__40);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(NOME);
				setState(206);
				expprefixoTail();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(T__39);
				setState(208);
				exp(0);
				setState(209);
				match(T__40);
				setState(210);
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
		public Token NOME;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__37);
				setState(215);
				exp(0);
				setState(216);
				match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(T__35);
				setState(219);
				((ExpprefixoTailContext)_localctx).NOME = match(NOME);
				 TabelaDeSimbolos.adicionarSimbolo((((ExpprefixoTailContext)_localctx).NOME!=null?((ExpprefixoTailContext)_localctx).NOME.getText():null),Tipo.FUNCAO); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				args();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(T__36);
				setState(223);
				match(NOME);
				setState(224);
				args();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(T__37);
				setState(226);
				exp(0);
				setState(227);
				match(T__38);
				setState(228);
				expprefixoTail();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				match(T__35);
				setState(231);
				match(NOME);
				setState(232);
				expprefixoTail();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				args();
				setState(234);
				expprefixoTail();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(236);
				match(T__36);
				setState(237);
				match(NOME);
				setState(238);
				args();
				setState(239);
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
		public Token NOME;
		public List<TerminalNode> NOME() { return getTokens(LuaParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(LuaParser.NOME, i);
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
			setState(243);
			((ListadenomesContext)_localctx).NOME = match(NOME);
			 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					match(T__29);
					setState(246);
					((ListadenomesContext)_localctx).NOME = match(NOME);
					 TabelaDeSimbolos.adicionarSimbolo((((ListadenomesContext)_localctx).NOME!=null?((ListadenomesContext)_localctx).NOME.getText():null),Tipo.VARIAVEL); 
					}
					} 
				}
				setState(252);
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
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					exp(0);
					setState(254);
					match(T__29);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(261);
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
		public TerminalNode NUMERO() { return getToken(LuaParser.NUMERO, 0); }
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
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
			setState(276);
			switch (_input.LA(1)) {
			case T__41:
				{
				setState(264);
				match(T__41);
				}
				break;
			case T__42:
				{
				setState(265);
				match(T__42);
				}
				break;
			case T__43:
				{
				setState(266);
				match(T__43);
				}
				break;
			case NUMERO:
				{
				setState(267);
				match(NUMERO);
				}
				break;
			case CADEIA:
				{
				setState(268);
				match(CADEIA);
				}
				break;
			case T__44:
				{
				setState(269);
				match(T__44);
				}
				break;
			case T__31:
				{
				setState(270);
				funcao();
				}
				break;
			case T__39:
			case NOME:
				{
				setState(271);
				expprefixo();
				}
				break;
			case T__45:
				{
				setState(272);
				construtortabela();
				}
				break;
			case T__1:
			case T__15:
			case T__16:
				{
				setState(273);
				opunaria();
				setState(274);
				exp(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
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
					setState(278);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(279);
					opbin();
					setState(280);
					exp(3);
					}
					} 
				}
				setState(286);
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
		public TerminalNode CADEIA() { return getToken(LuaParser.CADEIA, 0); }
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
			setState(294);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__39);
				setState(289);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__16) | (1L << T__31) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << NOME) | (1L << NUMERO) | (1L << CADEIA))) != 0)) {
					{
					setState(288);
					listaexp();
					}
				}

				setState(291);
				match(T__40);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				construtortabela();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(CADEIA);
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
			setState(296);
			match(T__31);
			setState(297);
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
			setState(299);
			match(T__39);
			setState(301);
			_la = _input.LA(1);
			if (_la==T__44 || _la==NOME) {
				{
				setState(300);
				listapar();
				}
			}

			setState(303);
			match(T__40);
			setState(304);
			bloco();
			setState(305);
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
			setState(313);
			switch (_input.LA(1)) {
			case NOME:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				listadenomes();
				setState(310);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(308);
					match(T__29);
					setState(309);
					match(T__44);
					}
				}

				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
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
			setState(315);
			match(T__45);
			setState(317);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__16) | (1L << T__31) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << NOME) | (1L << NUMERO) | (1L << CADEIA))) != 0)) {
				{
				setState(316);
				listadecampos();
				}
			}

			setState(319);
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
		public List<TerminalNode> SEPARADORDECAMPOS() { return getTokens(LuaParser.SEPARADORDECAMPOS); }
		public TerminalNode SEPARADORDECAMPOS(int i) {
			return getToken(LuaParser.SEPARADORDECAMPOS, i);
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
			setState(321);
			campo();
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					match(SEPARADORDECAMPOS);
					setState(323);
					campo();
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(330);
			_la = _input.LA(1);
			if (_la==SEPARADORDECAMPOS) {
				{
				setState(329);
				match(SEPARADORDECAMPOS);
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
		public TerminalNode NOME() { return getToken(LuaParser.NOME, 0); }
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
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(T__37);
				setState(333);
				exp(0);
				setState(334);
				match(T__38);
				setState(335);
				match(T__18);
				setState(336);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(NOME);
				setState(339);
				match(T__18);
				setState(340);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u015b\4\2\t\2"+
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
		"\t\16\t\u00a3\13\t\3\t\3\t\5\t\u00a7\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u00ae"+
		"\n\n\f\n\16\n\u00b1\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00be\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c8\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d7\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f4"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u00fb\n\17\f\17\16\17\u00fe\13\17"+
		"\3\20\3\20\3\20\7\20\u0103\n\20\f\20\16\20\u0106\13\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0117"+
		"\n\21\3\21\3\21\3\21\3\21\7\21\u011d\n\21\f\21\16\21\u0120\13\21\3\22"+
		"\3\22\5\22\u0124\n\22\3\22\3\22\3\22\5\22\u0129\n\22\3\23\3\23\3\23\3"+
		"\24\3\24\5\24\u0130\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0139"+
		"\n\25\3\25\5\25\u013c\n\25\3\26\3\26\5\26\u0140\n\26\3\26\3\26\3\27\3"+
		"\27\3\27\7\27\u0147\n\27\f\27\16\27\u014a\13\27\3\27\5\27\u014d\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0159\n\30\3\30"+
		"\2\3 \31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\4\3\2\3\21"+
		"\4\2\4\4\22\23\u017e\2\60\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b<\3\2\2\2"+
		"\nE\3\2\2\2\f\u0093\3\2\2\2\16\u009a\3\2\2\2\20\u009c\3\2\2\2\22\u00aa"+
		"\3\2\2\2\24\u00bd\3\2\2\2\26\u00c7\3\2\2\2\30\u00d6\3\2\2\2\32\u00f3\3"+
		"\2\2\2\34\u00f5\3\2\2\2\36\u0104\3\2\2\2 \u0116\3\2\2\2\"\u0128\3\2\2"+
		"\2$\u012a\3\2\2\2&\u012d\3\2\2\2(\u013b\3\2\2\2*\u013d\3\2\2\2,\u0143"+
		"\3\2\2\2.\u0158\3\2\2\2\60\61\t\2\2\2\61\3\3\2\2\2\62\63\t\3\2\2\63\5"+
		"\3\2\2\2\64\65\5\b\5\2\65\7\3\2\2\2\668\5\f\7\2\679\7\24\2\28\67\3\2\2"+
		"\289\3\2\2\29;\3\2\2\2:\66\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=C\3\2"+
		"\2\2><\3\2\2\2?A\5\16\b\2@B\7\24\2\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2C?\3"+
		"\2\2\2CD\3\2\2\2D\t\3\2\2\2EF\5\b\5\2F\13\3\2\2\2GH\5\22\n\2HI\7\25\2"+
		"\2IJ\5\36\20\2J\u0094\3\2\2\2K\u0094\5\26\f\2LM\7\26\2\2MN\5\n\6\2NO\7"+
		"\27\2\2O\u0094\3\2\2\2PQ\7\30\2\2QR\5 \21\2RS\7\26\2\2ST\5\n\6\2TU\7\27"+
		"\2\2U\u0094\3\2\2\2VW\7\31\2\2WX\5\n\6\2XY\7\32\2\2YZ\5 \21\2Z\u0094\3"+
		"\2\2\2[\\\7\33\2\2\\]\5 \21\2]^\7\34\2\2^f\5\n\6\2_`\7\35\2\2`a\5 \21"+
		"\2ab\7\34\2\2bc\5\n\6\2ce\3\2\2\2d_\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gk\3\2\2\2hf\3\2\2\2ij\7\36\2\2jl\5\n\6\2ki\3\2\2\2kl\3\2\2\2lm\3"+
		"\2\2\2mn\7\27\2\2n\u0094\3\2\2\2op\7\37\2\2pq\7\62\2\2qr\7\25\2\2rs\5"+
		" \21\2st\7 \2\2tw\5 \21\2uv\7 \2\2vx\5 \21\2wu\3\2\2\2wx\3\2\2\2xy\3\2"+
		"\2\2yz\7\26\2\2z{\5\n\6\2{|\7\27\2\2|\u0094\3\2\2\2}~\7\37\2\2~\177\5"+
		"\34\17\2\177\u0080\7!\2\2\u0080\u0081\5\36\20\2\u0081\u0082\7\26\2\2\u0082"+
		"\u0083\5\n\6\2\u0083\u0084\7\27\2\2\u0084\u0094\3\2\2\2\u0085\u0086\7"+
		"\"\2\2\u0086\u0087\5\20\t\2\u0087\u0088\5&\24\2\u0088\u0094\3\2\2\2\u0089"+
		"\u008a\7#\2\2\u008a\u008b\7\"\2\2\u008b\u008c\7\62\2\2\u008c\u0094\5&"+
		"\24\2\u008d\u008e\7#\2\2\u008e\u0091\5\34\17\2\u008f\u0090\7\25\2\2\u0090"+
		"\u0092\5\36\20\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3"+
		"\2\2\2\u0093G\3\2\2\2\u0093K\3\2\2\2\u0093L\3\2\2\2\u0093P\3\2\2\2\u0093"+
		"V\3\2\2\2\u0093[\3\2\2\2\u0093o\3\2\2\2\u0093}\3\2\2\2\u0093\u0085\3\2"+
		"\2\2\u0093\u0089\3\2\2\2\u0093\u008d\3\2\2\2\u0094\r\3\2\2\2\u0095\u0097"+
		"\7$\2\2\u0096\u0098\5\36\20\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u009b\7%\2\2\u009a\u0095\3\2\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\17\3\2\2\2\u009c\u00a1\7\62\2\2\u009d\u009e\7&\2\2\u009e"+
		"\u00a0\7\62\2\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7\'\2\2\u00a5\u00a7\7\62\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\t\1\2\u00a9\21\3\2\2\2\u00aa"+
		"\u00af\5\24\13\2\u00ab\u00ac\7 \2\2\u00ac\u00ae\5\24\13\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\23\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\62\2\2\u00b3\u00be\b\13"+
		"\1\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\5 \21\2\u00b7"+
		"\u00b8\7)\2\2\u00b8\u00be\3\2\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\7&"+
		"\2\2\u00bb\u00bc\7\62\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd"+
		"\u00b4\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\25\3\2\2\2\u00bf\u00c0\7\62\2"+
		"\2\u00c0\u00c1\b\f\1\2\u00c1\u00c8\5\"\22\2\u00c2\u00c3\5\30\r\2\u00c3"+
		"\u00c4\7\'\2\2\u00c4\u00c5\7\62\2\2\u00c5\u00c6\5\"\22\2\u00c6\u00c8\3"+
		"\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8\27\3\2\2\2\u00c9"+
		"\u00ca\7\62\2\2\u00ca\u00d7\b\r\1\2\u00cb\u00cc\7*\2\2\u00cc\u00cd\5 "+
		"\21\2\u00cd\u00ce\7+\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00d0\7\62\2\2\u00d0"+
		"\u00d7\5\32\16\2\u00d1\u00d2\7*\2\2\u00d2\u00d3\5 \21\2\u00d3\u00d4\7"+
		"+\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d7\3\2\2\2\u00d6\u00c9\3\2\2\2\u00d6"+
		"\u00cb\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7\31\3\2\2"+
		"\2\u00d8\u00d9\7(\2\2\u00d9\u00da\5 \21\2\u00da\u00db\7)\2\2\u00db\u00f4"+
		"\3\2\2\2\u00dc\u00dd\7&\2\2\u00dd\u00de\7\62\2\2\u00de\u00f4\b\16\1\2"+
		"\u00df\u00f4\5\"\22\2\u00e0\u00e1\7\'\2\2\u00e1\u00e2\7\62\2\2\u00e2\u00f4"+
		"\5\"\22\2\u00e3\u00e4\7(\2\2\u00e4\u00e5\5 \21\2\u00e5\u00e6\7)\2\2\u00e6"+
		"\u00e7\5\32\16\2\u00e7\u00f4\3\2\2\2\u00e8\u00e9\7&\2\2\u00e9\u00ea\7"+
		"\62\2\2\u00ea\u00f4\5\32\16\2\u00eb\u00ec\5\"\22\2\u00ec\u00ed\5\32\16"+
		"\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\7\'\2\2\u00ef\u00f0\7\62\2\2\u00f0"+
		"\u00f1\5\"\22\2\u00f1\u00f2\5\32\16\2\u00f2\u00f4\3\2\2\2\u00f3\u00d8"+
		"\3\2\2\2\u00f3\u00dc\3\2\2\2\u00f3\u00df\3\2\2\2\u00f3\u00e0\3\2\2\2\u00f3"+
		"\u00e3\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ee\3\2"+
		"\2\2\u00f4\33\3\2\2\2\u00f5\u00f6\7\62\2\2\u00f6\u00fc\b\17\1\2\u00f7"+
		"\u00f8\7 \2\2\u00f8\u00f9\7\62\2\2\u00f9\u00fb\b\17\1\2\u00fa\u00f7\3"+
		"\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\35\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5 \21\2\u0100\u0101\7 \2\2"+
		"\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0108\5 \21\2\u0108\37\3\2\2\2\u0109\u010a\b\21\1\2\u010a\u0117\7,\2"+
		"\2\u010b\u0117\7-\2\2\u010c\u0117\7.\2\2\u010d\u0117\7\63\2\2\u010e\u0117"+
		"\7\64\2\2\u010f\u0117\7/\2\2\u0110\u0117\5$\23\2\u0111\u0117\5\30\r\2"+
		"\u0112\u0117\5*\26\2\u0113\u0114\5\4\3\2\u0114\u0115\5 \21\3\u0115\u0117"+
		"\3\2\2\2\u0116\u0109\3\2\2\2\u0116\u010b\3\2\2\2\u0116\u010c\3\2\2\2\u0116"+
		"\u010d\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0110\3\2"+
		"\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0117"+
		"\u011e\3\2\2\2\u0118\u0119\f\4\2\2\u0119\u011a\5\2\2\2\u011a\u011b\5 "+
		"\21\5\u011b\u011d\3\2\2\2\u011c\u0118\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f!\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0121\u0123\7*\2\2\u0122\u0124\5\36\20\2\u0123\u0122\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0129\7+\2\2\u0126\u0129\5*\26\2\u0127"+
		"\u0129\7\64\2\2\u0128\u0121\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3"+
		"\2\2\2\u0129#\3\2\2\2\u012a\u012b\7\"\2\2\u012b\u012c\5&\24\2\u012c%\3"+
		"\2\2\2\u012d\u012f\7*\2\2\u012e\u0130\5(\25\2\u012f\u012e\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7+\2\2\u0132\u0133\5\n"+
		"\6\2\u0133\u0134\7\27\2\2\u0134\'\3\2\2\2\u0135\u0138\5\34\17\2\u0136"+
		"\u0137\7 \2\2\u0137\u0139\7/\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2"+
		"\2\u0139\u013c\3\2\2\2\u013a\u013c\7/\2\2\u013b\u0135\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013c)\3\2\2\2\u013d\u013f\7\60\2\2\u013e\u0140\5,\27\2\u013f"+
		"\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\61"+
		"\2\2\u0142+\3\2\2\2\u0143\u0148\5.\30\2\u0144\u0145\7\67\2\2\u0145\u0147"+
		"\5.\30\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\7\67"+
		"\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d-\3\2\2\2\u014e\u014f"+
		"\7(\2\2\u014f\u0150\5 \21\2\u0150\u0151\7)\2\2\u0151\u0152\7\25\2\2\u0152"+
		"\u0153\5 \21\2\u0153\u0159\3\2\2\2\u0154\u0155\7\62\2\2\u0155\u0156\7"+
		"\25\2\2\u0156\u0159\5 \21\2\u0157\u0159\5 \21\2\u0158\u014e\3\2\2\2\u0158"+
		"\u0154\3\2\2\2\u0158\u0157\3\2\2\2\u0159/\3\2\2\2!8<ACfkw\u0091\u0093"+
		"\u0097\u009a\u00a1\u00a6\u00af\u00bd\u00c7\u00d6\u00f3\u00fc\u0104\u0116"+
		"\u011e\u0123\u0128\u012f\u0138\u013b\u013f\u0148\u014c\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}