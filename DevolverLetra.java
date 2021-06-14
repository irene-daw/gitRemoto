/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut06tarea1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author AlumnoDAW
 */
public class DevolverLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //objeto escaner
        Scanner sc = new Scanner(System.in);
        //objeto String
        System.out.println("Introduce la cadena: ");
        String cadena = sc.nextLine();
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
