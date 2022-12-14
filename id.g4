grammar id;

@parser::header {
    package com.lexer;
}

@members {
    String tipovariable="";
    Funciones funciones= new Funciones();
    String nombreVariable=null;
    Object valor=null;
    String variableAsignada=null;
    String tipoaritmetica="";
    String tipologica="";
}


fragment LETRA : [A-Za-z]; //palabras
fragment DIGITO : [0-9]; //numeros
fragment MAYUSCULA : [A-Z];

PA : '(';
PC : ')';
LA : '{'; 
LC : '}';
CA : '[';
CC : ']';

PYC : ';';
EQ : '=';
COMA : ',';
COMILLA: '"';

INT : 'int ';
CHAR :'char ';
DOUBLE : 'double ';
FLOAT : 'float ';
VOID: 'void ';
RETURN: 'return ';

FOR: 'for';
IF : 'if'|'do';
ELSE: 'else';
WHILE: 'while';

SUM: '+';
RESTA: '-';
MULT: '*';
DIV: '/';
RESTO: '%';

//---------Operadores relacionales-------
COMP: ('<'|'>'|'<='|'>='|'!='|'==');            

//---------Operadores logicos------------
LOGIC : ('&'|'&&'|'|');              

INC_DEC: ( '++' | '--'); 


ID : (LETRA | '_')(LETRA | DIGITO | '_')*;
NUMERO : DIGITO+;
FLOTANTE: DIGITO+'.'DIGITO+;
LETRAMAYUSCULA : MAYUSCULA;


HORA: (('0'[0-2] | '1'[0-9] | '2'[0-3])':'([0-5][0-9]));
FECHA: (('0'[1-9] | '1'[0-9] | '2'[0-9]| '30')'/'(('0'[1-9]) | ('1'[1-2]))'/'([0-9][0-9][0-9][0-9])) ;
EMAIL : (ID | [A-z]) '@' ID '.com';
COMENTARIO : ('/*'(LETRA*DIGITO*)'*/');


WS : [ \n\t\r] -> skip; //Wait space captura el espacio en blanco y -> skip es para que lo descarte

OTRO : . ; //espacios en blanco, \n, \t [Todo lo que no entro en ninguna de las reglas anteriores la matchea al punto que es cualquier cosa]

//tokens en mayusculas y reglas gramaticales en minusculas
/* 
s : ID { System.out.println("ID: " + $ID.getText() + " -- (Linea " + $ID.getLine() + ")"); } s
  | OTRO { System.out.println("Otro: " + $OTRO.getText() + " -- (Linea " + $OTRO.getLine() + ")"); } s
  | NUMERO { System.out.println("Numero: " + $NUMERO.getText() + " -- (Linea " + $NUMERO.getLine() + ")"); } s
  | EMAIL { System.out.println("Email: " + $EMAIL.getText() + " -- (Linea " + $EMAIL.getLine() + ")"); } s
  | HORA { System.out.println("Hora: " + $HORA.getText() + " -- (Linea " + $HORA.getLine() + ")"); } s
  | FECHA { System.out.println("Fecha: " + $FECHA.getText() + " -- (Linea " + $FECHA.getLine() + ")"); } s
  | 
  ; 
*/

balance :  PA { System.out.println("PA: " + $PA.getText() + " -- (Linea " + $PA.getLine() + ")"); } balance PC { System.out.println("PC: " + $PC.getText() + " -- (Linea " + $PC.getLine() + ")"); } balance
        |  LA { System.out.println("LA: " + $LA.getText() + " -- (Linea " + $LA.getLine() + ")"); } balance LC { System.out.println("LC: " + $LC.getText() + " -- (Linea " + $LC.getLine() + ")"); } balance
        |  CA { System.out.println("CA: " + $CA.getText() + " -- (Linea " + $CA.getLine() + ")"); } balance CC { System.out.println("CC: " + $CC.getText() + " -- (Linea " + $CC.getLine() + ")"); } balance
        ;


prog : instruccion+
     ;

instruccion: (operacion | estructuras)
             ;

operacion : declaracion PYC
          | ID  asignacion PYC { funciones.asignacion($ID.getText(),null,tipovariable);} 
          | RETURN ID PYC 
          ;

declaracion : tipodato ID asignacion { funciones.agregarVarialble($ID.getText(),tipovariable); funciones.asignacion($ID.getText(),valor,null);}
            | tipodato ID { funciones.agregarVarialble($ID.getText(),tipovariable);}
            ;

tipodato : INT {tipovariable="int";}
         | DOUBLE {tipovariable="float";}
         | FLOAT {tipovariable="float";}
         | CHAR {tipovariable="char";}
         ;

tipoaritmetica : SUM {tipoaritmetica="+";}
               | RESTA {tipoaritmetica="-";}
               | MULT {tipoaritmetica="*";}
               | DIV {tipoaritmetica="/";}
               | RESTO {tipoaritmetica="%";}
               ;

tipologica : COMP {tipologica=$COMP.getText();}
           | LOGIC {tipologica=$LOGIC.getText();}
           ;

asignacion : EQ op_aritmetica
           | EQ valor 
           | EQ ID {tipovariable=funciones.getTipo($ID.getText());}
           | EQ ID PA valor PC {tipovariable=funciones.getTipo($ID.getText());}
           | EQ ID PA (valor COMA)+ valor PC {tipovariable=funciones.getTipo($ID.getText());}
           | INC_DEC
           ;


valor: FLOTANTE { valor = Float.parseFloat($FLOTANTE.getText()); tipovariable="float";}
     | NUMERO  { valor = Integer.parseInt($NUMERO.getText()); tipovariable="int";}
     | COMILLA ID COMILLA { valor = $ID.getText(); tipovariable="char";} //Se toma "ID" como una palabra
     | ID { tipovariable=funciones.getTipo($ID.getText()); valor = $ID.getText();}
     | llamada_funcion
     ;

op_aritmetica : (valor tipoaritmetica )+ valor 
              ;
              
op_logica : (valor  tipologica)+ valor 
          ;

tipo_funcion : tipodato
             | VOID {tipovariable="void";}
             ;

dec_funcion : tipo_funcion ID { funciones.agregarVarialble($ID.getText(),tipovariable); }
                PA PC bloque_instruccion 
            | tipo_funcion ID { funciones.agregarVarialble($ID.getText(),tipovariable); }
                PA (dec_parametros) PC bloque_instruccion 
            ;

llamada_funcion :  ID PA PC { tipovariable=funciones.getTipo($ID.getText()); }
                |  ID PA (dec_parametros) PC { tipovariable=funciones.getTipo($ID.getText()); }
                ;

dec_parametros : (tipodato ID COMA { funciones.agregarVarialble($ID.getText(),tipovariable); })* 
                  (tipodato ID { funciones.agregarVarialble($ID.getText(),tipovariable); })
               ;

estructuras : ciclo_for
            | ciclo_while
            | condicion_if
            | dec_funcion
            ;

ciclo_for : FOR PA declaracion PYC op_logica PYC ID INC_DEC PC bloque_instruccion
          ;

bloque_instruccion: LA{{ funciones.abreLlave();}}(instruccion)+ LC{{ funciones.cierraLlave();}}
                  ;


ciclo_while : WHILE PA op_logica PC bloque_instruccion
            ;

condicion_if : IF PA op_logica PC bloque_instruccion 
             | IF PA op_logica PC bloque_instruccion ELSE bloque_instruccion
             ;