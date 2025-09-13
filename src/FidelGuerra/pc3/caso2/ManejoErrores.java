package FidelGuerra.pc3.caso2;

import java.util.Scanner;

public class ManejoErrores {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("-------------- CALCULADORA CON MANEJO DE ERRORES--------------\n");

            System.out.print("Ingrese el primer numero: ");
            int a = sc.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            int b = sc.nextInt();

            int resultado = division(a, b);

            System.out.print("El resultado es: " + resultado);
        }catch (Exception e){
            if (e.getClass().getSimpleName().equals("ArithmeticException")) {
                System.err.println("Error: división entre cero no permitida");
            }else{
                System.err.println("Error: " + e.getMessage());
            }
        }

    }

    private static int division(int a, int b) {
        return a / b;
    }
}
