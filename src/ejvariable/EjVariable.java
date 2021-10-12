/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejvariable;

/**
 *
 * @author Santiago
 */
public class EjVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definimos nuestra primera variable y le asignamos un valor
        int ejVarInt = 10;
        System.out.println(ejVarInt);
        //Asignamos un nuevo valor a la variable
        ejVarInt = 2;
        //Hacemos uso de sout y tab para autocompletar la llamada a nuestra funcion
        System.out.println(ejVarInt);
        //Definimos nuestra variable tipo String y le asignamos un valor
        String ejVarString = "Hola alumnos";
        System.out.println(ejVarString);
        ejVarString = "Adios alumnos";
        System.out.println(ejVarString);
        //Inferencia de tipos: Uso de var en la definicion de variables
        var numEntero = 15;
        System.out.println(numEntero);
        
        var cadenaTexto = "Testando la inferencia en Java";
        System.out.println(cadenaTexto);
        
        var cadenaTexto2 = "en el curso de DAM de CEEP";
        System.out.println("cadenaTexto2 = "+cadenaTexto2);
        
        
    }
    
}
