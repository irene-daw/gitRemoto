/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut06tarea1.ejercicio1;

import java.util.Scanner;

/**
 * Clase que devuelve un caracter determinado de una cadena
 * @author Irene González Cantera
 */
public class DevolverLetra {

    /**
     * Método principal de la clase
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	/**
	 * Objeto Scanner 
         */
	Scanner sc;        
	
	/**
	 * Variable de tipo String que recoge la cadena que el usuario introduzca
	 */
	String cadena;

        sc = new Scanner(System.in);
        System.out.println("Introduce la cadena: ");
	cadena = sc.nextLine();
        
	//capturamos el error
        try{
            //mostrar la letra con el método charAt
            System.out.println(cadena.charAt(7));
        }catch(StringIndexOutOfBoundsException sob){
            //gestor de excepción
            System.out.println("Has intentado recupersr una posición de la "
                    + "cadena de caracteres que no existe.");
        }
    }
}
