package com.lexer;

import java.time.chrono.HijrahChronology;
import java.util.ArrayList;
import java.util.List;

import com.lexer.idParser.AsignacionContext;
import com.lexer.idParser.Ciclo_forContext;
import com.lexer.idParser.Ciclo_whileContext;
import com.lexer.idParser.Condicion_ifContext;
import com.lexer.idParser.Dec_funcionContext;
import com.lexer.idParser.DeclaracionContext;
import com.lexer.idParser.InstruccionContext;
import com.lexer.idParser.Op_aritmeticaContext;
import com.lexer.idParser.OperacionContext;
import com.lexer.idParser.ProgContext;
import com.lexer.idParser.TipodatoContext;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.RuleContext;

public class MiVisitor extends idBaseVisitor {

    String codigo = "";
    int nomVariables = 0, variableAux = 0;
    int etiquetas = 0, etiquetaAux = 0, etiquetaAux2 = 0;
    ArrayList<String> ifs = new ArrayList<String>();
    ArrayList<String> ciclosFor = new ArrayList<String>();
    ArrayList<String> ciclosWhile = new ArrayList<String>();
    ArrayList<String> funciones = new ArrayList<String>();

    @Override
    public Object visit(org.antlr.v4.runtime.tree.ParseTree tree) {
        return super.visit(tree);
    }

 

    @Override
    public Object visitOperacion(OperacionContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i).getClass() == DeclaracionContext.class) {
                codigo += ctx.getChild(i).getChild(1).getText();
                if (ctx.getChild(i).getChildCount() > 2)
                    if(ctx.getChild(i).getChild(2).getChild(2).getText().compareTo("(")>1)
                        codigo += ctx.getChild(i).getChild(2).getText();
            }
            if (ctx.getChild(i).getClass() == AsignacionContext.class) {
                String op = ctx.getChild(i).getChild(0).getText();
                if (op.compareTo("++") == 0) {
                    codigo += ctx.getText().substring(0, ctx.getText().length() - 3) + "=";
                    codigo += ctx.getText().substring(0, ctx.getText().length() - 2) + "1";
                }
                else if (op.compareTo("--") == 0) {
                    codigo += ctx.getText().substring(0, ctx.getText().length() - 3) + "=";
                    codigo += ctx.getText().substring(0, ctx.getText().length() - 2) + "1";
                }
                else if (ctx.getChild(i).getChild(1).getClass()==Op_aritmeticaContext.class){
                    visitOparitmetica(ctx.getChild(i).getChild(1));
                }
            }
            if(ctx.getChild(i).getChildCount()>2 && ctx.getChild(i).getChild(2).getChildCount()>1){
                if(ctx.getChild(i).getChild(2).getChild(2).getText().compareTo("(")==0){
                    for(int j=3; j<ctx.getChild(i).getChild(2).getChildCount()-1; j++){
                        codigo += "\npush "+ ctx.getChild(i).getChild(2).getChild(3).getText()+ "\n";
                    }
                    codigo += "push t"+etiquetaAux + "\n";
                    etiquetaAux2 = etiquetas;
                    etiquetas++;
                    codigo += "jmp "+etiquetaAux + "\n";
                    codigo += "lable l"+etiquetaAux2 + "\n";
                    codigo += "pop "+ ctx.getChild(i).getChild(2).getChild(1).getText() + "\n";

                }
            }
        }
        ParseTree parent = ctx.getParent().getParent();
        if(parent.getClass()!=ProgContext.class){
            if(parent.getParent().getClass()==Ciclo_forContext.class 
               && 
               parent.getChild(parent.getChildCount()-2).getChild(0)==ctx
              ){
                codigo += ciclosFor.remove(ciclosFor.size()-1);
            }
            if(parent.getParent().getClass()==Ciclo_whileContext.class 
               && 
               parent.getChild(parent.getChildCount()-2).getChild(0)==ctx
              ){
                codigo += ciclosWhile.remove(ciclosWhile.size()-1);
            }
            if(parent.getParent().getClass()==Condicion_ifContext.class 
               && 
               parent.getChild(parent.getChildCount()-2).getChild(0)==ctx
              ){
                codigo += ifs.remove(ifs.size()-1);
            }
            if(parent.getParent().getClass()==Dec_funcionContext.class 
               && 
               parent.getChild(parent.getChildCount()-2).getChild(0)==ctx
              ){
                codigo += funciones.remove(funciones.size()-1);
            }
        }
        codigo += "\n";
        return super.visitOperacion(ctx);
    }


    //@Override
    public void visitOparitmetica(ParseTree ctx) {
        ParseTree rc = ctx.getParent().getParent();
        if (ctx.getChildCount() > 3) {
            codigo += "t" + nomVariables + "=";
            codigo += ctx.getChild(0).getText();
            codigo += ctx.getChild(1).getText();
            codigo += ctx.getChild(2).getText();
            codigo += "\n";
            nomVariables++;
            for (int i = 3; i < ctx.getChildCount(); i++) {
                codigo += "t" + nomVariables + "=t" + (nomVariables - 1);
                codigo += ctx.getChild(i).getText();
                codigo += ctx.getChild(i + 1).getText();
                codigo += "\n";
                i++;
                nomVariables++;
            }
            codigo += rc.getChild(0).getText() + "=t" + (nomVariables - 1) + "\n";
        } else {
            codigo += rc.getChild(0).getText() + "=";
            codigo += ctx.getChild(0).getText();
            codigo += ctx.getChild(1).getText();
            codigo += ctx.getChild(2).getText();
        }
        
    }

    @Override
    public Object visitCiclo_for(Ciclo_forContext ctx) {
        codigo += ctx.getChild(2).getChild(1).getText();
        codigo += ctx.getChild(2).getChild(2).getText() + " \n";
        codigo += "label l" + etiquetas + "\n";
        etiquetaAux = etiquetas;
        etiquetas++;
        codigo += "t" + nomVariables + "=" + ctx.getChild(4).getText() + "\n";
        codigo += "ifnjmp t" + nomVariables + ", l" + etiquetas+ "\n";
        etiquetaAux2 = etiquetas;
        nomVariables++;
        etiquetas++;
        String ciclo="";
        ciclo += "\n" + ctx.getChild(2).getChild(1).getText();
        ciclo += "=" + ctx.getChild(2).getChild(1).getText() + "+1" + "\n";
        ciclo += "jmp l" + etiquetaAux + "\n";
        ciclo += "label l" + etiquetaAux2 + " \n";
        ciclosFor.add(new String(ciclo));

        return super.visitCiclo_for(ctx);
    }

    @Override
    public Object visitCiclo_while(Ciclo_whileContext ctx) {

        codigo += "label l" + etiquetas + "\n";
        etiquetaAux = etiquetas;
        etiquetas++;
        codigo += "t" + nomVariables + "=" + ctx.getChild(2).getText() + "\n";
        codigo += "ifnjmp t" + nomVariables + ", l" + etiquetas+ "\n";
        etiquetaAux2 = etiquetas;
        nomVariables++;

        String ciclo="";
        ciclo += "\njmp l" + etiquetaAux + "\n";
        ciclo += "label l" + etiquetaAux2 + "\n";
        ciclosWhile.add(new String(ciclo));
        return super.visitCiclo_while(ctx);
    }

  

    @Override
    public Object visitCondicion_if(Condicion_ifContext ctx) {
        codigo += "t" + nomVariables + "=" + ctx.getChild(2).getText() + "\n";
        codigo += "ifnjmp t" + nomVariables + ", l" + etiquetas+ "\n";
        etiquetaAux = etiquetas;
        variableAux = nomVariables;
        nomVariables++;
        etiquetas++;

        String ciclo="";
        ciclo += "\nlabel l" + etiquetaAux + "\n";
        ifs.add(new String(ciclo));

        return super.visitCondicion_if(ctx);
    }

    @Override
    public Object visitDec_funcion(Dec_funcionContext ctx) {
        codigo += "label l" + etiquetas + " \n";
        etiquetaAux = etiquetas;
        etiquetas++;
        codigo += "pop t" + nomVariables + "\n";
        variableAux=nomVariables;
        nomVariables++;
        int cantParametros=ctx.getChildCount()-2;
        for(int i=3; i<cantParametros; i+=3){
            codigo += "pop " + ctx.getChild(1).getChild(i).getText() + "\n";
        }

        String ciclo="";
        ciclo += "t" + nomVariables +"=";
        ciclo += ctx.getChild(5).getChild(ctx.getChild(5).getChildCount()-2).getChild(0).getChild(1).getText()+ "\n";
        ciclo += "push t" + nomVariables + "\n";
        nomVariables++;
        ciclo += "jmp t" + variableAux + " \n";;
        funciones.add(new String(ciclo));

        return super.visitDec_funcion(ctx);
    }



}
