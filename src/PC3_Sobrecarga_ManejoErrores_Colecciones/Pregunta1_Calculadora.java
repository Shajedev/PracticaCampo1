/*
  Pregunta1_Calculadora.java
  - Implementa una clase Calculadora con métodos sumar sobrecargados:
    * sumar(int, int)
    * sumar(int, int, int)
    * sumar(double, double)
  - En el main se demuestra el uso de los tres métodos.
*/
package PC3_Sobrecarga_ManejoErrores_Colecciones;

class Calculadora {
    // Suma dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma tres enteros (sobrecarga)
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Suma dos doubles (sobrecarga)
    public double sumar(double a, double b) {
        return a + b;
    }
}

// Clase pública que contiene el main
public class Pregunta1_Calculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int s2 = calc.sumar(5, 7);              // 2 enteros
        int s3 = calc.sumar(1, 2, 3);           // 3 enteros
        double sd = calc.sumar(2.5, 3.75);      // 2 doubles

        System.out.println("Sumar 2 enteros (5 + 7) = " + s2);
        System.out.println("Sumar 3 enteros (1 + 2 + 3) = " + s3);
        System.out.println("Sumar 2 doubles (2.5 + 3.75) = " + sd);
    }
}
