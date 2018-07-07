// Generated from /home/dsl/AndroidStudioProjects/Team2Project/app/src/main/java/team2/lksh/p/formuland/parser/g.g4 by ANTLR 4.7
package team2.lksh.p.formuland.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GenParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(GenParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GenParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(GenParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon(GenParser.ConContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GenParser.VariableContext ctx);
}