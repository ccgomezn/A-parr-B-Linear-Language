// Generated from /Users/cristhiancamilogomezneira/Documents/proyectos/linear language/grammar/LinearLanguage.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinearLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		BOOLEAN=39, ID=40, SKIP_=41, INTEGER=42, STRING=43, SPACES=44, NEWLINE=45;
	public static final int
		RULE_program = 0, RULE_func_call = 1, RULE_parameter = 2, RULE_deduct = 3, 
		RULE_deduct_rule = 4, RULE_type_def = 5, RULE_var_def = 6, RULE_val_id = 7, 
		RULE_func_def = 8, RULE_lin_expr = 9, RULE_log_op = 10, RULE_log_term_op = 11, 
		RULE_value = 12, RULE_transformed = 13, RULE_assignation = 14, RULE_func_expr = 15, 
		RULE_proc_call = 16, RULE_lin_func_expr = 17, RULE_deduct_def = 18, RULE_term_id = 19, 
		RULE_proc_def = 20, RULE_proc_body = 21, RULE_stmt = 22, RULE_type = 23, 
		RULE_type_var = 24, RULE_operator = 25, RULE_literal = 26, RULE_id = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func_call", "parameter", "deduct", "deduct_rule", "type_def", 
			"var_def", "val_id", "func_def", "lin_expr", "log_op", "log_term_op", 
			"value", "transformed", "assignation", "func_expr", "proc_call", "lin_func_expr", 
			"deduct_def", "term_id", "proc_def", "proc_body", "stmt", "type", "type_var", 
			"operator", "literal", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'['", "']'", "'->'", "'cut'", "'&'", 
			"'first (+)'", "'second (+)'", "'(x)'", "'-&'", "'='", "'def'", "'func'", 
			"'-o'", "'(+)'", "'not'", "'!'", "'?'", "'deduct'", "'-|'", "'proc'", 
			"'{'", "'}'", "'return'", "'print('", "');'", "'string'", "'int'", "'bool'", 
			"'float'", "'+'", "'-'", "'*'", "'**'", "'/'", null, null, null, null, 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BOOLEAN", "ID", "SKIP_", "INTEGER", "STRING", "SPACES", 
			"NEWLINE"
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

	@Override
	public String getGrammarFileName() { return "LinearLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinearLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Type_defContext> type_def() {
			return getRuleContexts(Type_defContext.class);
		}
		public Type_defContext type_def(int i) {
			return getRuleContext(Type_defContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LinearLanguageParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LinearLanguageParser.NEWLINE, i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<Proc_defContext> proc_def() {
			return getRuleContexts(Proc_defContext.class);
		}
		public Proc_defContext proc_def(int i) {
			return getRuleContext(Proc_defContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_callContext> func_call() {
			return getRuleContexts(Func_callContext.class);
		}
		public Func_callContext func_call(int i) {
			return getRuleContext(Func_callContext.class,i);
		}
		public List<Deduct_defContext> deduct_def() {
			return getRuleContexts(Deduct_defContext.class);
		}
		public Deduct_defContext deduct_def(int i) {
			return getRuleContext(Deduct_defContext.class,i);
		}
		public List<DeductContext> deduct() {
			return getRuleContexts(DeductContext.class);
		}
		public DeductContext deduct(int i) {
			return getRuleContext(DeductContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(60);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__29:
					case T__30:
					case T__31:
					case T__32:
						{
						setState(56);
						type_def();
						setState(57);
						match(T__0);
						}
						break;
					case NEWLINE:
						{
						setState(59);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(65);
						func_def();
						}
						break;
					case 2:
						{
						setState(66);
						proc_def();
						}
						break;
					case 3:
						{
						setState(67);
						match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(77);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(73);
						var_def();
						setState(74);
						match(T__0);
						}
						break;
					case NEWLINE:
						{
						setState(76);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__14) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(82);
					func_call();
					}
					break;
				case T__14:
					{
					setState(83);
					deduct_def();
					}
					break;
				case T__4:
					{
					setState(84);
					deduct();
					}
					break;
				case NEWLINE:
					{
					setState(85);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90);
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

	public static class Func_callContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			id();
			setState(92);
			match(T__1);
			setState(93);
			parameter();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(94);
				match(T__2);
				setState(95);
				parameter();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__3);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(102);
				match(T__0);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(LinearLanguageParser.BOOLEAN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameter);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(BOOLEAN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				id();
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

	public static class DeductContext extends ParserRuleContext {
		public Deduct_ruleContext deduct_rule() {
			return getRuleContext(Deduct_ruleContext.class,0);
		}
		public List<DeductContext> deduct() {
			return getRuleContexts(DeductContext.class);
		}
		public DeductContext deduct(int i) {
			return getRuleContext(DeductContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public DeductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterDeduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitDeduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitDeduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeductContext deduct() throws RecognitionException {
		DeductContext _localctx = new DeductContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__4);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(110);
				deduct();
				}
				break;
			case ID:
				{
				setState(111);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(114);
				match(T__2);
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(115);
					deduct();
					}
					break;
				case ID:
					{
					setState(116);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__5);
			setState(125);
			match(T__6);
			setState(126);
			deduct_rule();
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

	public static class Deduct_ruleContext extends ParserRuleContext {
		public Deduct_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deduct_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterDeduct_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitDeduct_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitDeduct_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deduct_ruleContext deduct_rule() throws RecognitionException {
		Deduct_ruleContext _localctx = new Deduct_ruleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deduct_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Type_defContext extends ParserRuleContext {
		public Type_varContext type_var() {
			return getRuleContext(Type_varContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			type_var();
			setState(131);
			id();
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

	public static class Var_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Val_idContext val_id() {
			return getRuleContext(Val_idContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			type();
			setState(134);
			id();
			setState(135);
			match(T__13);
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case STRING:
				{
				setState(136);
				literal();
				}
				break;
			case ID:
				{
				setState(137);
				val_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Val_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Val_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterVal_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitVal_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitVal_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Val_idContext val_id() throws RecognitionException {
		Val_idContext _localctx = new Val_idContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_val_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			id();
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

	public static class Func_defContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Lin_exprContext lin_expr() {
			return getRuleContext(Lin_exprContext.class,0);
		}
		public Lin_func_exprContext lin_func_expr() {
			return getRuleContext(Lin_func_exprContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__14);
			setState(143);
			match(T__15);
			setState(144);
			id();
			setState(145);
			lin_expr();
			setState(146);
			match(T__16);
			setState(147);
			lin_func_expr();
			setState(148);
			match(T__0);
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

	public static class Lin_exprContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<Log_term_opContext> log_term_op() {
			return getRuleContexts(Log_term_opContext.class);
		}
		public Log_term_opContext log_term_op(int i) {
			return getRuleContext(Log_term_opContext.class,i);
		}
		public List<Log_opContext> log_op() {
			return getRuleContexts(Log_opContext.class);
		}
		public Log_opContext log_op(int i) {
			return getRuleContext(Log_opContext.class,i);
		}
		public List<Lin_exprContext> lin_expr() {
			return getRuleContexts(Lin_exprContext.class);
		}
		public Lin_exprContext lin_expr(int i) {
			return getRuleContext(Lin_exprContext.class,i);
		}
		public Lin_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lin_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterLin_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitLin_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitLin_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lin_exprContext lin_expr() throws RecognitionException {
		Lin_exprContext _localctx = new Lin_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lin_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__1);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(151);
				log_term_op();
				}
				break;
			}
			setState(154);
			type();
			setState(155);
			id();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__17))) != 0)) {
				{
				{
				setState(156);
				log_op();
				setState(164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
				case T__20:
				case ID:
					{
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(157);
						log_term_op();
						}
						break;
					}
					setState(160);
					type();
					setState(161);
					id();
					}
					break;
				case T__1:
					{
					setState(163);
					lin_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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

	public static class Log_opContext extends ParserRuleContext {
		public Log_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterLog_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitLog_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitLog_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_opContext log_op() throws RecognitionException {
		Log_opContext _localctx = new Log_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_log_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Log_term_opContext extends ParserRuleContext {
		public Log_term_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_term_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterLog_term_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitLog_term_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitLog_term_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_term_opContext log_term_op() throws RecognitionException {
		Log_term_opContext _localctx = new Log_term_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_log_term_op);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(T__20);
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

	public static class ValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TransformedContext transformed() {
			return getRuleContext(TransformedContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				id();
				setState(183);
				match(T__1);
				setState(184);
				id();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(185);
					match(T__2);
					setState(186);
					id();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				transformed();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				id();
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

	public static class TransformedContext extends ParserRuleContext {
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TransformedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterTransformed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitTransformed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitTransformed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformedContext transformed() throws RecognitionException {
		TransformedContext _localctx = new TransformedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_transformed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(198);
				id();
				}
				break;
			case BOOLEAN:
			case INTEGER:
			case STRING:
				{
				setState(199);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			operator();
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(203);
				id();
				}
				break;
			case BOOLEAN:
			case INTEGER:
			case STRING:
				{
				setState(204);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				{
				setState(207);
				operator();
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(208);
					id();
					}
					break;
				case BOOLEAN:
				case INTEGER:
				case STRING:
					{
					setState(209);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(216);
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

	public static class AssignationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			type();
			setState(218);
			id();
			setState(219);
			match(T__13);
			setState(220);
			value();
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

	public static class Func_exprContext extends ParserRuleContext {
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Func_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterFunc_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitFunc_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitFunc_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_exprContext func_expr() throws RecognitionException {
		Func_exprContext _localctx = new Func_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_expr);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				assignation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				proc_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				func_call();
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

	public static class Proc_callContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_proc_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			id();
			setState(228);
			match(T__6);
			setState(229);
			parameter();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(230);
				match(T__2);
				setState(231);
				parameter();
				}
				}
				setState(236);
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

	public static class Lin_func_exprContext extends ParserRuleContext {
		public List<Lin_func_exprContext> lin_func_expr() {
			return getRuleContexts(Lin_func_exprContext.class);
		}
		public Lin_func_exprContext lin_func_expr(int i) {
			return getRuleContext(Lin_func_exprContext.class,i);
		}
		public List<Func_exprContext> func_expr() {
			return getRuleContexts(Func_exprContext.class);
		}
		public Func_exprContext func_expr(int i) {
			return getRuleContext(Func_exprContext.class,i);
		}
		public List<Log_opContext> log_op() {
			return getRuleContexts(Log_opContext.class);
		}
		public Log_opContext log_op(int i) {
			return getRuleContext(Log_opContext.class,i);
		}
		public Lin_func_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lin_func_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterLin_func_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitLin_func_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitLin_func_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lin_func_exprContext lin_func_expr() throws RecognitionException {
		Lin_func_exprContext _localctx = new Lin_func_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lin_func_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__1);
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(238);
				lin_func_expr();
				}
				break;
			case ID:
				{
				setState(239);
				func_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__17))) != 0)) {
				{
				{
				setState(242);
				log_op();
				setState(245);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(243);
					lin_func_expr();
					}
					break;
				case ID:
					{
					setState(244);
					func_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
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

	public static class Deduct_defContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Term_idContext> term_id() {
			return getRuleContexts(Term_idContext.class);
		}
		public Term_idContext term_id(int i) {
			return getRuleContext(Term_idContext.class,i);
		}
		public Deduct_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deduct_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterDeduct_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitDeduct_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitDeduct_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deduct_defContext deduct_def() throws RecognitionException {
		Deduct_defContext _localctx = new Deduct_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_deduct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__14);
			setState(255);
			match(T__21);
			setState(256);
			id();
			setState(257);
			match(T__22);
			setState(258);
			term_id();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(259);
				match(T__2);
				setState(260);
				term_id();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(T__0);
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

	public static class Term_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Log_term_opContext log_term_op() {
			return getRuleContext(Log_term_opContext.class,0);
		}
		public Term_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterTerm_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitTerm_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitTerm_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_idContext term_id() throws RecognitionException {
		Term_idContext _localctx = new Term_idContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(268);
				log_term_op();
				}
				break;
			}
			setState(271);
			id();
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

	public static class Proc_defContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Proc_bodyContext proc_body() {
			return getRuleContext(Proc_bodyContext.class,0);
		}
		public Proc_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterProc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitProc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitProc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_defContext proc_def() throws RecognitionException {
		Proc_defContext _localctx = new Proc_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_proc_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__14);
			setState(274);
			match(T__23);
			setState(275);
			id();
			setState(276);
			match(T__1);
			setState(277);
			id();
			setState(278);
			id();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(279);
				match(T__2);
				setState(280);
				id();
				setState(281);
				id();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(T__3);
			setState(289);
			match(T__24);
			setState(290);
			proc_body();
			setState(291);
			match(T__25);
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

	public static class Proc_bodyContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Proc_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterProc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitProc_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitProc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_bodyContext proc_body() throws RecognitionException {
		Proc_bodyContext _localctx = new Proc_bodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_proc_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(293);
				stmt();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(299);
				match(T__26);
				setState(300);
				id();
				setState(301);
				match(T__0);
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

	public static class StmtContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Val_idContext val_id() {
			return getRuleContext(Val_idContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LinearLanguageParser.NEWLINE, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stmt);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__27);
				setState(308);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case INTEGER:
				case STRING:
					{
					setState(306);
					literal();
					}
					break;
				case ID:
					{
					setState(307);
					val_id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(310);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				id();
				setState(313);
				match(T__1);
				setState(314);
				id();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(315);
					match(T__2);
					setState(316);
					id();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				match(T__3);
				setState(323);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				assignation();
				setState(326);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(NEWLINE);
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

	public static class TypeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			id();
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

	public static class Type_varContext extends ParserRuleContext {
		public Type_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterType_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitType_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitType_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_varContext type_var() throws RecognitionException {
		Type_varContext _localctx = new Type_varContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LinearLanguageParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(LinearLanguageParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(LinearLanguageParser.BOOLEAN, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinearLanguageParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearLanguageListener ) ((LinearLanguageListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearLanguageVisitor ) return ((LinearLanguageVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\2\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\2\3\2\7\2P\n"+
		"\2\f\2\16\2S\13\2\3\2\3\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\7\3c\n\3\f\3\16\3f\13\3\3\3\3\3\5\3j\n\3\3\4\3\4\5\4n\n\4\3\5"+
		"\3\5\3\5\5\5s\n\5\3\5\3\5\3\5\5\5x\n\5\7\5z\n\5\f\5\16\5}\13\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u009b\n\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00a1\n\13\3\13\3\13\3\13\3\13\5\13\u00a7\n\13\7\13\u00a9"+
		"\n\13\f\13\16\13\u00ac\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00b6"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00be\n\16\f\16\16\16\u00c1\13"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00c7\n\16\3\17\3\17\5\17\u00cb\n\17\3\17"+
		"\3\17\3\17\5\17\u00d0\n\17\3\17\3\17\3\17\5\17\u00d5\n\17\7\17\u00d7\n"+
		"\17\f\17\16\17\u00da\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u00e4\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u00eb\n\22\f\22\16\22\u00ee"+
		"\13\22\3\23\3\23\3\23\5\23\u00f3\n\23\3\23\3\23\3\23\5\23\u00f8\n\23\7"+
		"\23\u00fa\n\23\f\23\16\23\u00fd\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u0108\n\24\f\24\16\24\u010b\13\24\3\24\3\24\3\25\5"+
		"\25\u0110\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u011e\n\26\f\26\16\26\u0121\13\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\7\27\u0129\n\27\f\27\16\27\u012c\13\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0132\n\27\3\30\3\30\3\30\5\30\u0137\n\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\7\30\u0140\n\30\f\30\16\30\u0143\13\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u014c\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668\2\7\3\2\n\17\5\2\13\13\16\17\24\24\3\2 #\3\2$(\4\2)),-"+
		"\2\u016c\2@\3\2\2\2\4]\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2\n\u0082\3\2\2\2\f"+
		"\u0084\3\2\2\2\16\u0087\3\2\2\2\20\u008e\3\2\2\2\22\u0090\3\2\2\2\24\u0098"+
		"\3\2\2\2\26\u00af\3\2\2\2\30\u00b5\3\2\2\2\32\u00c6\3\2\2\2\34\u00ca\3"+
		"\2\2\2\36\u00db\3\2\2\2 \u00e3\3\2\2\2\"\u00e5\3\2\2\2$\u00ef\3\2\2\2"+
		"&\u0100\3\2\2\2(\u010f\3\2\2\2*\u0113\3\2\2\2,\u012a\3\2\2\2.\u014b\3"+
		"\2\2\2\60\u014d\3\2\2\2\62\u014f\3\2\2\2\64\u0151\3\2\2\2\66\u0153\3\2"+
		"\2\28\u0155\3\2\2\2:;\5\f\7\2;<\7\3\2\2<?\3\2\2\2=?\7/\2\2>:\3\2\2\2>"+
		"=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AH\3\2\2\2B@\3\2\2\2CG\5\22\n\2"+
		"DG\5*\26\2EG\7/\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2"+
		"HI\3\2\2\2IQ\3\2\2\2JH\3\2\2\2KL\5\16\b\2LM\7\3\2\2MP\3\2\2\2NP\7/\2\2"+
		"OK\3\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RZ\3\2\2\2SQ\3\2\2\2"+
		"TY\5\4\3\2UY\5&\24\2VY\5\b\5\2WY\7/\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2"+
		"XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\3\3\2\2\2\\Z\3\2\2\2]^\58\35"+
		"\2^_\7\4\2\2_d\5\6\4\2`a\7\5\2\2ac\5\6\4\2b`\3\2\2\2cf\3\2\2\2db\3\2\2"+
		"\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gi\7\6\2\2hj\7\3\2\2ih\3\2\2\2ij\3\2\2"+
		"\2j\5\3\2\2\2kn\7)\2\2ln\58\35\2mk\3\2\2\2ml\3\2\2\2n\7\3\2\2\2or\7\7"+
		"\2\2ps\5\b\5\2qs\58\35\2rp\3\2\2\2rq\3\2\2\2s{\3\2\2\2tw\7\5\2\2ux\5\b"+
		"\5\2vx\58\35\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2yt\3\2\2\2z}\3\2\2\2{y\3\2"+
		"\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\b\2\2\177\u0080\7\t\2\2\u0080"+
		"\u0081\5\n\6\2\u0081\t\3\2\2\2\u0082\u0083\t\2\2\2\u0083\13\3\2\2\2\u0084"+
		"\u0085\5\62\32\2\u0085\u0086\58\35\2\u0086\r\3\2\2\2\u0087\u0088\5\60"+
		"\31\2\u0088\u0089\58\35\2\u0089\u008c\7\20\2\2\u008a\u008d\5\66\34\2\u008b"+
		"\u008d\5\20\t\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\17\3\2\2"+
		"\2\u008e\u008f\58\35\2\u008f\21\3\2\2\2\u0090\u0091\7\21\2\2\u0091\u0092"+
		"\7\22\2\2\u0092\u0093\58\35\2\u0093\u0094\5\24\13\2\u0094\u0095\7\23\2"+
		"\2\u0095\u0096\5$\23\2\u0096\u0097\7\3\2\2\u0097\23\3\2\2\2\u0098\u009a"+
		"\7\4\2\2\u0099\u009b\5\30\r\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009d\5\60\31\2\u009d\u00aa\58\35\2\u009e\u00a6"+
		"\5\26\f\2\u009f\u00a1\5\30\r\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5\60\31\2\u00a3\u00a4\58\35\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a7\5\24\13\2\u00a6\u00a0\3\2\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a7\u00a9\3\2\2\2\u00a8\u009e\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7\6\2\2\u00ae\25\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0\27\3\2\2\2\u00b1"+
		"\u00b6\3\2\2\2\u00b2\u00b6\7\25\2\2\u00b3\u00b6\7\26\2\2\u00b4\u00b6\7"+
		"\27\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00c7\5\66\34\2\u00b8\u00b9\58\35"+
		"\2\u00b9\u00ba\7\4\2\2\u00ba\u00bf\58\35\2\u00bb\u00bc\7\5\2\2\u00bc\u00be"+
		"\58\35\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\6"+
		"\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c7\5\34\17\2\u00c5\u00c7\58\35\2\u00c6"+
		"\u00b7\3\2\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\33\3\2\2\2\u00c8\u00cb\58\35\2\u00c9\u00cb\5\66\34\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\5\64"+
		"\33\2\u00cd\u00d0\58\35\2\u00ce\u00d0\5\66\34\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d8\3\2\2\2\u00d1\u00d4\5\64\33\2\u00d2\u00d5\5"+
		"8\35\2\u00d3\u00d5\5\66\34\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc"+
		"\5\60\31\2\u00dc\u00dd\58\35\2\u00dd\u00de\7\20\2\2\u00de\u00df\5\32\16"+
		"\2\u00df\37\3\2\2\2\u00e0\u00e4\5\36\20\2\u00e1\u00e4\5\"\22\2\u00e2\u00e4"+
		"\5\4\3\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"!\3\2\2\2\u00e5\u00e6\58\35\2\u00e6\u00e7\7\t\2\2\u00e7\u00ec\5\6\4\2"+
		"\u00e8\u00e9\7\5\2\2\u00e9\u00eb\5\6\4\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed#\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f2\7\4\2\2\u00f0\u00f3\5$\23\2\u00f1\u00f3\5 "+
		"\21\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00fb\3\2\2\2\u00f4"+
		"\u00f7\5\26\f\2\u00f5\u00f8\5$\23\2\u00f6\u00f8\5 \21\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f4\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\6\2\2\u00ff%\3\2\2\2\u0100\u0101"+
		"\7\21\2\2\u0101\u0102\7\30\2\2\u0102\u0103\58\35\2\u0103\u0104\7\31\2"+
		"\2\u0104\u0109\5(\25\2\u0105\u0106\7\5\2\2\u0106\u0108\5(\25\2\u0107\u0105"+
		"\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\3\2\2\u010d\'\3\2\2\2"+
		"\u010e\u0110\5\30\r\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\58\35\2\u0112)\3\2\2\2\u0113\u0114\7\21\2\2\u0114"+
		"\u0115\7\32\2\2\u0115\u0116\58\35\2\u0116\u0117\7\4\2\2\u0117\u0118\5"+
		"8\35\2\u0118\u011f\58\35\2\u0119\u011a\7\5\2\2\u011a\u011b\58\35\2\u011b"+
		"\u011c\58\35\2\u011c\u011e\3\2\2\2\u011d\u0119\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7\6\2\2\u0123\u0124\7\33\2\2\u0124\u0125\5"+
		",\27\2\u0125\u0126\7\34\2\2\u0126+\3\2\2\2\u0127\u0129\5.\30\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u0131\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\35\2\2\u012e\u012f\5"+
		"8\35\2\u012f\u0130\7\3\2\2\u0130\u0132\3\2\2\2\u0131\u012d\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132-\3\2\2\2\u0133\u0136\7\36\2\2\u0134\u0137\5\66\34"+
		"\2\u0135\u0137\5\20\t\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\7\37\2\2\u0139\u014c\3\2\2\2\u013a\u013b\5"+
		"8\35\2\u013b\u013c\7\4\2\2\u013c\u0141\58\35\2\u013d\u013e\7\5\2\2\u013e"+
		"\u0140\58\35\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7\6\2\2\u0145\u0146\7\3\2\2\u0146\u014c\3\2\2\2\u0147\u0148\5\36"+
		"\20\2\u0148\u0149\7\3\2\2\u0149\u014c\3\2\2\2\u014a\u014c\7/\2\2\u014b"+
		"\u0133\3\2\2\2\u014b\u013a\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u014a\3\2"+
		"\2\2\u014c/\3\2\2\2\u014d\u014e\58\35\2\u014e\61\3\2\2\2\u014f\u0150\t"+
		"\4\2\2\u0150\63\3\2\2\2\u0151\u0152\t\5\2\2\u0152\65\3\2\2\2\u0153\u0154"+
		"\t\6\2\2\u0154\67\3\2\2\2\u0155\u0156\7*\2\2\u01569\3\2\2\2)>@FHOQXZd"+
		"imrw{\u008c\u009a\u00a0\u00a6\u00aa\u00b5\u00bf\u00c6\u00ca\u00cf\u00d4"+
		"\u00d8\u00e3\u00ec\u00f2\u00f7\u00fb\u0109\u010f\u011f\u012a\u0131\u0136"+
		"\u0141\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}