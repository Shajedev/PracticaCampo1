package trabajo_campo3;

//Clase Calculadora con métodos sobrecargados
public class Calculadora {

 // Método para sumar dos enteros
 public int sumar(int a, int b) {
     return a + b;
 }

 // Método para sumar tres enteros
 public int sumar(int a, int b, int c) {
     return a + b + c;
 }

 // Método para sumar dos números decimales (double)
 public double sumar(double a, double b) {
     return a + b;
 }

 public static void main(String[] args) {
     // Crear un objeto de la clase Calculadora
     Calculadora calc = new Calculadora();
     
     // Usar los tres métodos sobrecargados
     System.out.println("Suma de dos enteros: " + calc.sumar(5, 10));
     System.out.println("Suma de tres enteros: " + calc.sumar(5, 10, 15));
     System.out.println("Suma de dos decimales: " + calc.sumar(5.5, 10.3));
 }
}
