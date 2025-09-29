package trabajo_campo3;

import java.util.Scanner;

//Excepción personalizada para número negativo
class NumeroNegativoException extends Exception {
 public NumeroNegativoException(String mensaje) {
     super(mensaje); // Llama al constructor de la clase base con el mensaje
 }
}

public class ManejoMultiplesExcepciones {

 // Método principal
 public static void main(String[] args) throws NumeroNegativoException { // Declaramos la excepción en el throws
     Scanner scanner = new Scanner(System.in);
     
     try {
         // Solicitar al usuario un número entero
         System.out.print("Ingresa un número entero: ");
         String input = scanner.nextLine();
         
         // Intentar convertir el valor ingresado a entero
         int numero = Integer.parseInt(input);
         
         // Verificar si el número es negativo
         if (numero < 0) {
             throw new NumeroNegativoException("Error: El número no puede ser negativo.");
         }
         
         System.out.println("El número ingresado es: " + numero);
         
     } catch (NumberFormatException e) {
         // Manejar si el usuario ingresa un valor no numérico
         System.out.println("Error: Se esperaba un número entero.");
     } catch (NumeroNegativoException e) {
         // Manejar la excepción personalizada para números negativos
         System.out.println(e.getMessage());
     } catch (Exception e) {
         // Manejo de cualquier otra excepción
         System.out.println("Error inesperado: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
 
