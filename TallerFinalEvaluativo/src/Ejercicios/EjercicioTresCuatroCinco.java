/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author 503
 */
public class EjercicioTresCuatroCinco {

    public static void main(String[] args) {
        // Creamos el array con toda la info que dio el profe de los jugadores
        String[][] jugadores = {{"Jugador 1", "Juan", "15 años", "delantero"},
        {"Jugador 2", "Pedro", "16 años", "defensa"},
        {"Jugador 3", "Luis", "17 años", "arquero"}};

// Aquí creamos un  for para recorrer el arreglo y imprimir la información de cada jugador

        for (int i = 0; i < jugadores.length; i++) {
            // Imprimir el nombre del jugador 
            System.out.println(jugadores[i][0] + ": " + jugadores[i][1]);
            
            //Imprimir la posición del jugador
            System.out.println("Posición: " + jugadores[i][3]);
            
            // Imprimir la Edad del jugadorr
            System.out.println("Edad: " + jugadores[i][2]);
            
            // Salto de linea
            System.out.println();
            
         
        }
           System.out.println("Ejercicio 4:");
           //Aquí imprimi la posición arquero con la posición del jugador correspondiente
           System.out.println("La posición del " + jugadores[2][0] + " es " + jugadores[2][3]);
           
           // Salto de linea
           System.out.println();
           
           System.out.println("Ejercicio 5:");
            //Aquí imprimi la posición 16 años con el jugador correspondiente a esa edad
           System.out.println("La edad del " + jugadores[1][0] + " es " + jugadores[1][2]);
    }
}
