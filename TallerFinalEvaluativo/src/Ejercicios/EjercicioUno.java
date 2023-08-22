/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicios;
import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        // Aquí creamos el array para guardar los nombres de los compañeritos
        String[] nombres = new String[6];

        Scanner sc = new Scanner(System.in);

        // Aquí creamis un ciclo for para recorrer el array y pedir los nombres
        // Se repite en base al tamaño del array
   
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre del compañero:" );
            nombres[i] = sc.nextLine(); // Guardar el nombre en el array
        }

        sc.close();
        
        // Mostrar la extensión del array
        System.out.println("La extensión del array es: " + nombres.length);

        // Aquí creammos otro ciclo for para recorrer el array y mostrar los nombres guardados
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El nombre del compañero " + (i + 1) + " es: " + nombres[i]);
        }
    }
}
