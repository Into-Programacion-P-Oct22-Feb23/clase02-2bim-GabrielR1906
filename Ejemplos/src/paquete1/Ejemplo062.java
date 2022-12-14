/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejemplo062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double dato;
        double suma = 0;
        // arreglo de tipo entero
        double[] arreglo1 = new double[5];
        
        // Se asigna valores al arreglo, pidiendo valores por teclado
        // se usa un ciclo repetitivo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese un valor para el arreglo");
            dato = entrada.nextDouble();
            // se asigna la variable dato a la posición del arreglo
            // de acuerdo al valor de i
            arreglo1[i] = dato;
        }
        
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            // agrego el valor de la posición del arreglo a la variable
            // acumuladora  suma
            suma = suma + arreglo1[i];
        }
        
        System.out.printf("La suma de los valores del arreglo es: %.2f\n", suma);
        
    }

}
