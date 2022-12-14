/*
    Estudiante:Luis - M1:8.1 M2:7.9 PROM: 8,0000
    Estudiante:Ana - promedio final: 9,1000
    Estudiante:Mónica - promedio final: 9,6000
    Estudiante:José - promedio final: 9,9000
    Estudiante:Juan - promedio final: 9,8000
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int[] edades = {34, 21, 22, 10, 11, 29, 32};
        String[] nombres = {"Alumno 1", "Alumno 2", "Alumno 3", "Alumno 3", 
            "Alumno 4", "Alumno 5", "Alumno 6"};
        int sumaEdades = 0;
        String cadenaFinal = "";
        for (int i = 0; i < edades.length; i++) {
            // solo se sumará las edade de posiciones pares
            if (i % 2 == 0) {
                sumaEdades = sumaEdades + edades[i];
                cadenaFinal = String.format("%sEdad agregada %d pertenece al"
                        + "estudiante de nombre %s\n",
                        cadenaFinal,
                        edades[i],
                        nombres[i]);
            }
        }
        cadenaFinal = String.format("%sSuma de edades es %d\n", 
                cadenaFinal,
                sumaEdades);
        
        System.out.printf("%s\n", cadenaFinal);

    }

}
