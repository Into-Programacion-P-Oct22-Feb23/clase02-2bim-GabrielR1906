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
public class Ejemplo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] sueldos;
        int numeroElementos;
        double sueldoIngresado;
        double sumaSueldos = 0;
        System.out.println("Ingrese el número de elementos del arreglo");
        numeroElementos = entrada.nextInt();

        if (numeroElementos > 5) {
            sueldos = new double[numeroElementos];

            for (int i = 0; i < numeroElementos; i++) {
                // se solicita el los datos por teclado
                System.out.println("Ingrese el sueldo de un empleado");
                sueldoIngresado = entrada.nextDouble();
                sueldos[i] = sueldoIngresado;
            }

            for (int i = 0; i < numeroElementos; i++) {
                sumaSueldos = sumaSueldos + sueldos[i];

            }

            System.out.printf("La suma de los sueldos es: %.2f\n", sumaSueldos);
        } else {
            System.out.println("Número de elementos fuera de rango");
        }
    }

}
