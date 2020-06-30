// Generated from /Users/cristhiancamilogomezneira/Documents/proyectos/linear language/grammar/LinearLanguage.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinearLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinearLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LinearLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(LinearLanguageParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(LinearLanguageParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#deduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeduct(LinearLanguageParser.DeductContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#deduct_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeduct_rule(LinearLanguageParser.Deduct_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(LinearLanguageParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(LinearLanguageParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#val_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal_id(LinearLanguageParser.Val_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(LinearLanguageParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#lin_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLin_expr(LinearLanguageParser.Lin_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#log_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_op(LinearLanguageParser.Log_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#log_term_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_term_op(LinearLanguageParser.Log_term_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LinearLanguageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#transformed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformed(LinearLanguageParser.TransformedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(LinearLanguageParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr(LinearLanguageParser.Func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(LinearLanguageParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#lin_func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLin_func_expr(LinearLanguageParser.Lin_func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#deduct_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeduct_def(LinearLanguageParser.Deduct_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#term_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_id(LinearLanguageParser.Term_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#proc_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_def(LinearLanguageParser.Proc_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#proc_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_body(LinearLanguageParser.Proc_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(LinearLanguageParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LinearLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#type_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_var(LinearLanguageParser.Type_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(LinearLanguageParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LinearLanguageParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinearLanguageParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LinearLanguageParser.IdContext ctx);
}