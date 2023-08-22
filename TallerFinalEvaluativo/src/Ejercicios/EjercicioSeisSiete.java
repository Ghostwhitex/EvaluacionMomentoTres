/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioSeisSiete {

    public static void main(String[] args) {
        // Aquí creamos una lista para almacenar los números
        ArrayList<Integer> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int contador = 0;

        // Aquí creamos un bucle do-while para agregar números a la lista
        do {

            System.out.print("Ingrese un número: ");
            // Leer el número y agregarlo a la lista
            int numero = sc.nextInt();
            lista.add(numero);
            contador++;
            // Repetir el bucle mientras el contador sea menor que 7
        } while (contador < 7);

        sc.close();

        System.out.println("Ejercicio 7");
        //Aqui creamos un loop para imprimir los números guardados de la lista
        System.out.println("Los números guardados fueron:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
