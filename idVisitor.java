// Generated from /home/martin/Documentos/Projects/Ubp/TC/LexerFinal/al/src/main/java/com/lexer/id.g4 by ANTLR 4.8

    package com.lexer;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link idParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface idVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link idParser#balance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalance(idParser.BalanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(idParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(idParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(idParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#tipodato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipodato(idParser.TipodatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#tipoaritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoaritmetica(idParser.TipoaritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#tipologica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipologica(idParser.TipologicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(idParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(idParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#op_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_aritmetica(idParser.Op_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#op_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logica(idParser.Op_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#tipo_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_funcion(idParser.Tipo_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#dec_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_funcion(idParser.Dec_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(idParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#dec_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_parametros(idParser.Dec_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#estructuras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuras(idParser.EstructurasContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#ciclo_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_for(idParser.Ciclo_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#bloque_instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_instruccion(idParser.Bloque_instruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#ciclo_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_while(idParser.Ciclo_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link idParser#condicion_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion_if(idParser.Condicion_ifContext ctx);
}