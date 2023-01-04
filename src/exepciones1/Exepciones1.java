/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones1;

import java.util.Scanner;

/**
 *
 * @author hola
 */
public class Exepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {1,2};
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Ingrese el index:");
            int i = input.nextInt();
            System.out.println(numeros[i]);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException ex2){
            System.out.println("El ìndice està fuera de rango");
        }
        catch(RuntimeException ex1){
            System.out.println("Otra excepciòn durante la ejecución");
        }
        finally{
            System.out.println("Còdigo con manejo de excepciones");
        }
    }
    
}
