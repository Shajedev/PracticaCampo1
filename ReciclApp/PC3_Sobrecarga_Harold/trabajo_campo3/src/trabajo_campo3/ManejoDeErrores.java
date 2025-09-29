package trabajo_campo3;

import java.util.Scanner;

public class ManejoDeErrores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Solicitar dos números enteros al usuario
            System.out.print("Ingresa el primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int num2 = scanner.nextInt();
            
            // Realizar la división
            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción si ocurre división entre cero
            System.out.println("Error: división entre cero no permitida");
        } catch (Exception e) {
            // Manejo de otras excepciones
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
