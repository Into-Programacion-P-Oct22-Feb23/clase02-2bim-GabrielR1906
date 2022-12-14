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
public class Ejemplo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] edades = {34, 21, 22, 10, 11, 29, 32};
        double sumaEdades = 0;

        for (int i = 0; i < edades.length; i++) {
            // solo se sumará las edade de posiciones pares
            if (i % 2 == 0) {
                sumaEdades = sumaEdades + edades[i];
            }

        }

        System.out.printf("La suma de las edades es: %.2f\n", sumaEdades);

    }

}
