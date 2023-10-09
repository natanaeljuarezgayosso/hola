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
            //inicio de programa
            import java.util.Scanner;

public class Miguel_Angel_Ruiz_Cruz_multiplicacionMatrices {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int rowsA, colsA, rowsB, colsB;

        System.out.println("ALUMNO:" + " MIGUEL ANGEL RUIZ CRUZ");
        System.out.println("______________MULTIPLICACION DE MATRICES________________");
        System.out.print("Ingrese el número de filas de la matriz A: ");
        rowsA = teclado.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz A: ");
        colsA = teclado.nextInt();
        
        
        System.out.print("Ingrese el número de filas de la matriz B: ");
        rowsB = teclado.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz B: ");
        colsB = teclado.nextInt();

        if (colsA != rowsB) {
            System.out.println("Las matrices no son multiplicables.");
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] resultMatrix = new int[rowsA][colsB];

        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la matriz B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < rowsB; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("El resultado de la multiplicación es:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

        }
    }
    
}
