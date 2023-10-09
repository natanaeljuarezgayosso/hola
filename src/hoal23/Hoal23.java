/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoal23;

import java.util.Scanner;

/**
 *
 * @author natan
 */
public class Hoal23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola soy nuevo ");
        System.out.println("hola");
        for (int i = 0; i < 10; i++) {
            System.out.println("yair");
            System.out.println("prueba 2 penudo");
             System.out.println("numero decimal a binario");
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Ingrese un nÃºmero decimal que quiera convertir a binario: ");
        int decimal=teclado.nextInt();
        String Numerobin = decimalbinario(decimal);
        System.out.println("RepresentaciÃ³n binaria de " + decimal + " es: " + Numerobin);
        }
    }

    private static String decimalbinario(int decimal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
