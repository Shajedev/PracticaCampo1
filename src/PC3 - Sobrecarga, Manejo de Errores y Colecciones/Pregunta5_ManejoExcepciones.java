package practica1;

import java.util.Scanner;

/*
  Pregunta5_ManejoExcepciones.java
  - Demuestra el uso de múltiples excepciones con try-catch-finally.
  - Se lee un número y se convierte a entero, controlando errores.
*/

public class Pregunta5_ManejoExcepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            String entrada = sc.nextLine();

            int numero = Integer.parseInt(entrada);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número válido.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Ejecución finalizada.");
            sc.close();
        }
    }
}
