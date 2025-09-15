package practica1;
/*
  Pregunta2_Division.java
  - Programa que realiza una división entre dos números enteros.
  - Maneja la excepción ArithmeticException (división por cero).
*/

import java.util.Scanner;

public class Pregunta2_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = sc.nextInt();

            System.out.print("Ingrese el divisor: ");
            int divisor = sc.nextInt();

            int resultado = dividendo / divisor;

            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        } finally {
            sc.close();
        }
    }
}
