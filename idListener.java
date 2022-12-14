// Generated from /home/martin/Documentos/Projects/Ubp/TC/LexerFinal/al/src/main/java/com/lexer/id.g4 by ANTLR 4.8

    package com.lexer;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link idParser}.
 */
public interface idListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link idParser#balance}.
	 * @param ctx the parse tree
	 */
	void enterBalance(idParser.BalanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#balance}.
	 * @param ctx the parse tree
	 */
	void exitBalance(idParser.BalanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(idParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(idParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(idParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(idParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(idParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(idParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void enterTipodato(idParser.TipodatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void exitTipodato(idParser.TipodatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#tipoaritmetica}.
	 * @param ctx the parse tree
	 */
	void enterTipoaritmetica(idParser.TipoaritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#tipoaritmetica}.
	 * @param ctx the parse tree
	 */
	void exitTipoaritmetica(idParser.TipoaritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#tipologica}.
	 * @param ctx the parse tree
	 */
	void enterTipologica(idParser.TipologicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#tipologica}.
	 * @param ctx the parse tree
	 */
	void exitTipologica(idParser.TipologicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(idParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(idParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(idParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(idParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#op_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOp_aritmetica(idParser.Op_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#op_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOp_aritmetica(idParser.Op_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void enterOp_logica(idParser.Op_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void exitOp_logica(idParser.Op_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#tipo_funcion}.
	 * @param ctx the parse tree
	 */
	void enterTipo_funcion(idParser.Tipo_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#tipo_funcion}.
	 * @param ctx the parse tree
	 */
	void exitTipo_funcion(idParser.Tipo_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#dec_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDec_funcion(idParser.Dec_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#dec_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDec_funcion(idParser.Dec_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(idParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(idParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#dec_parametros}.
	 * @param ctx the parse tree
	 */
	void enterDec_parametros(idParser.Dec_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#dec_parametros}.
	 * @param ctx the parse tree
	 */
	void exitDec_parametros(idParser.Dec_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#estructuras}.
	 * @param ctx the parse tree
	 */
	void enterEstructuras(idParser.EstructurasContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#estructuras}.
	 * @param ctx the parse tree
	 */
	void exitEstructuras(idParser.EstructurasContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_for(idParser.Ciclo_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_for(idParser.Ciclo_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#bloque_instruccion}.
	 * @param ctx the parse tree
	 */
	void enterBloque_instruccion(idParser.Bloque_instruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#bloque_instruccion}.
	 * @param ctx the parse tree
	 */
	void exitBloque_instruccion(idParser.Bloque_instruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_while(idParser.Ciclo_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#ciclo_while}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_while(idParser.Ciclo_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#condicion_if}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_if(idParser.Condicion_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#condicion_if}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_if(idParser.Condicion_ifContext ctx);
}