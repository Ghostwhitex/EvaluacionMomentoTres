/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author 503
 */
public class EjercicioDos {
     public static void main(String[] args) {
         
        // Aquí creamos una matriz de 3 x 3 para guardar las edades de los familiares más allegados como se indica 
        int[][] edadesFamiliares = {{35, 32, 28}, {60, 58, 55}, {10, 8, 6}};

        // Aquí creamos un for que recorra la matriz y la imprima
        
        for (int i = 0; i < edadesFamiliares.length; i++) { // Recorrer las filas de la matriz
            for (int j = 0; j < edadesFamiliares[i].length; j++) { // Recorrer las columnas de la matriz
                System.out.print(edadesFamiliares[i][j] + " "); 
            }
            System.out.println(); // Cambiar de línea
        }
    }
}
