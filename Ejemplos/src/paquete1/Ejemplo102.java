/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        
        // Se declara un arreglo de tipo double, llamado promedios
        double[] promedios = {8.1, 9, 9.5, 10, 9.9};
        String[] estudiantes = {"Luis", "Ana", "Mónica", "José", "Juan"};
        String nombre;
        String mensajeFinal = ""; // variable que acumula un reporte final
        // Se hace uso del ciclo repetitivo for para recorrer los arreglos
        // y presentar los valore de las posiciones
        
        for (int i = 0; i < promedios.length; i++) { // estudiantes.length 
            // Se agrega los valores al reporte siempe y cuando
            // el valor del nombre del estudiante sea:
            // Luis o Ana
            nombre = estudiantes[i];
            if (nombre.equals("Luis")) {
            
                mensajeFinal = String.format("%sEstudiante:%s - promedio: "
                        + "%.4f\n", 
                        mensajeFinal,
                        estudiantes[i],
                        promedios[i]);
            }
        }
        
        System.out.printf("%s\n", mensajeFinal);
        
    }

}
