package com.lexer;

import java.util.HashMap;
import java.util.ArrayList;

public class Funciones
{
    ArrayList<HashMap<String, String>> mapList;
    int bloqueActual;
    
    public Funciones() {
        mapList = new ArrayList<HashMap<String, String>>();
        mapList.add(new HashMap<String, String>());
        bloqueActual=0;
    }

    public void abreLlave(){
        mapList.add(new HashMap<String, String>());
        bloqueActual++;
    }

    public void cierraLlave(){
        mapList.remove(bloqueActual);
        bloqueActual--;
    }
    
    public void agregarVarialble(final String nombre, final String tipovariable) {
        if (buscarVariable(nombre)==-1) {
            mapList.get(bloqueActual).put(nombre, tipovariable);
        }
        else {
            System.out.println(" Variable " + nombre + " duplicada.");
            System.exit(1);
        }
    }

    public int buscarVariable(String nombre){
        for(int i=0; i<bloqueActual+1; i++){
            if (mapList.get(i).get(nombre) != null)
                return i;
        }
        return -1;
    }
    
    public void asignacion(final String nombre, Object valor, final String tipoVariable) {
        boolean correcto = false;
        if (buscarVariable(nombre)==-1) {
            System.out.println(" Variable " + nombre + " inexistente.");
            System.exit(1);
        }
        else {
            if (tipoVariable == null) 
            {
                final String tipo = mapList.get(bloqueActual).get(nombre);
                if(valor==null){
                    correcto = true;
                }
                else if (valor.getClass() == Integer.class && tipo == "int") {
                    correcto = true;
                }
                else if (valor.getClass() == String.class && tipo == "char") {
                    correcto = true;
                }
                else if ((valor.getClass() == Float.class | valor.getClass() == Double.class) && (tipo == "double" | tipo == "float")) {
                    correcto = true;
                }
            }
            else {
                switch (getTipo(nombre)) {
                    case "float": if (tipoVariable == "int" | tipoVariable == "float") 
                        correcto = true;
                    break;
                    case "char": if (tipoVariable == "char") 
                        correcto = true;
                    break;
                    case "int": if (tipoVariable == "int") 
                        correcto = true;
                    break;
                }
            }
            if (!correcto) {
                System.out.println(" Asignacion incorrecta de " + nombre + " a tipo " + tipoVariable);
                System.exit(1);
            }
        }
    }
    
    public String getTipo(final String nombreVariable) {
        String tipo = null;
        if (buscarVariable(nombreVariable)==-1) {
            System.out.println(" Variable " + nombreVariable + " inexistente.");
            System.exit(1);
        }
        else {
            
            for(int i=0; i<bloqueActual+1; i++){
                if (mapList.get(i).get(nombreVariable) != null){
                    tipo = mapList.get(i).get(nombreVariable);
                }
            }
        }
        return tipo;
    }

}