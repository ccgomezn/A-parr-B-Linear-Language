// Generated from /Users/cristhiancamilogomezneira/Documents/proyectos/linear language/grammar/LinearLanguage.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinearLanguageParser}.
 */
public interface LinearLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LinearLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LinearLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(LinearLanguageParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(LinearLanguageParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(LinearLanguageParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(LinearLanguageParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#deduct}.
	 * @param ctx the parse tree
	 */
	void enterDeduct(LinearLanguageParser.DeductContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#deduct}.
	 * @param ctx the parse tree
	 */
	void exitDeduct(LinearLanguageParser.DeductContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#deduct_rule}.
	 * @param ctx the parse tree
	 */
	void enterDeduct_rule(LinearLanguageParser.Deduct_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#deduct_rule}.
	 * @param ctx the parse tree
	 */
	void exitDeduct_rule(LinearLanguageParser.Deduct_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(LinearLanguageParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(LinearLanguageParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(LinearLanguageParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(LinearLanguageParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#val_id}.
	 * @param ctx the parse tree
	 */
	void enterVal_id(LinearLanguageParser.Val_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#val_id}.
	 * @param ctx the parse tree
	 */
	void exitVal_id(LinearLanguageParser.Val_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(LinearLanguageParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(LinearLanguageParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#lin_expr}.
	 * @param ctx the parse tree
	 */
	void enterLin_expr(LinearLanguageParser.Lin_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#lin_expr}.
	 * @param ctx the parse tree
	 */
	void exitLin_expr(LinearLanguageParser.Lin_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#log_op}.
	 * @param ctx the parse tree
	 */
	void enterLog_op(LinearLanguageParser.Log_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#log_op}.
	 * @param ctx the parse tree
	 */
	void exitLog_op(LinearLanguageParser.Log_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#log_term_op}.
	 * @param ctx the parse tree
	 */
	void enterLog_term_op(LinearLanguageParser.Log_term_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#log_term_op}.
	 * @param ctx the parse tree
	 */
	void exitLog_term_op(LinearLanguageParser.Log_term_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LinearLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LinearLanguageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#transformed}.
	 * @param ctx the parse tree
	 */
	void enterTransformed(LinearLanguageParser.TransformedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#transformed}.
	 * @param ctx the parse tree
	 */
	void exitTransformed(LinearLanguageParser.TransformedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(LinearLanguageParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(LinearLanguageParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr(LinearLanguageParser.Func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr(LinearLanguageParser.Func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(LinearLanguageParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(LinearLanguageParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#lin_func_expr}.
	 * @param ctx the parse tree
	 */
	void enterLin_func_expr(LinearLanguageParser.Lin_func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#lin_func_expr}.
	 * @param ctx the parse tree
	 */
	void exitLin_func_expr(LinearLanguageParser.Lin_func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#deduct_def}.
	 * @param ctx the parse tree
	 */
	void enterDeduct_def(LinearLanguageParser.Deduct_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#deduct_def}.
	 * @param ctx the parse tree
	 */
	void exitDeduct_def(LinearLanguageParser.Deduct_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#term_id}.
	 * @param ctx the parse tree
	 */
	void enterTerm_id(LinearLanguageParser.Term_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#term_id}.
	 * @param ctx the parse tree
	 */
	void exitTerm_id(LinearLanguageParser.Term_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#proc_def}.
	 * @param ctx the parse tree
	 */
	void enterProc_def(LinearLanguageParser.Proc_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#proc_def}.
	 * @param ctx the parse tree
	 */
	void exitProc_def(LinearLanguageParser.Proc_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#proc_body}.
	 * @param ctx the parse tree
	 */
	void enterProc_body(LinearLanguageParser.Proc_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#proc_body}.
	 * @param ctx the parse tree
	 */
	void exitProc_body(LinearLanguageParser.Proc_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(LinearLanguageParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(LinearLanguageParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LinearLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LinearLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#type_var}.
	 * @param ctx the parse tree
	 */
	void enterType_var(LinearLanguageParser.Type_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#type_var}.
	 * @param ctx the parse tree
	 */
	void exitType_var(LinearLanguageParser.Type_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(LinearLanguageParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(LinearLanguageParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LinearLanguageParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LinearLanguageParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinearLanguageParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(LinearLanguageParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinearLanguageParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(LinearLanguageParser.IdContext ctx);
}