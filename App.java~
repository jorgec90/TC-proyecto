package com.lexer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



public class App {
    public static void main(final String[] args) throws Exception {

      // Create a CharStream that reads from file
      final CharStream input = CharStreams.fromFileName("al/src/main/java/com/lexer/codigo.c");

      // Create a lexer that feeds off of input CharStream
      final idLexer lexer = new idLexer(input);

      // Create a buffer of tokens pulled from the lexer
      final CommonTokenStream tokens = new CommonTokenStream(lexer);

      // Create a parser that feeds off the tokens buffer
      final idParser parser = new idParser(tokens);

      System.out.println("");
      System.out.println("");
      System.out.println("Inicio Compiler ...");
      System.out.println("");

      ParseTree tree = parser.prog();

      if(parser.getNumberOfSyntaxErrors()>0){
        System.out.println("Compilacon fallida...");
        System.exit(1);
      }
      System.out.println("");
      System.out.println("Compilacon finalizada...");
      System.out.println("");

      MiVisitor miVisitor = new MiVisitor();
      miVisitor.visit(tree);
      System.out.println(tree.toStringTree(parser));
      System.out.println("");
      System.out.println(miVisitor.codigo);
      

      //Fileing(parser.ensamblador.inicio + parser.ensamblador.proceso + parser.ensamblador.funciones);*/
    }

    public static void Fileing(final String cod) {
      try {
        final File myObj = new File("3drieccion.txt");
        if (myObj.createNewFile()) {
          System.out.println("Archivo de assembler creado: " + myObj.getName());
        } else {
          System.out.println("Archivo de assembler a actualizadar.");
        }
        final FileWriter myObj2 = new FileWriter("assembler.txt");
        myObj2.write(cod);
        myObj2.close();
      } catch (final IOException e) {
          System.out.println("Error al escribir archivo assembler.");
          e.printStackTrace();
        }
        System.out.println("Assembler creado correctamente.");
      }
}
