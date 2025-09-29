package FidelGuerra.pc3.caso1;

import java.util.Scanner;

public class SobrecargaMetodos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("-------------- CALCULADORA CON SOBRECARGA --------------\n");

        System.out.print("Ingrese el primer numero: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double c = sc.nextDouble();

        int sobreCargaInt = Suma((int)a,(int)b);
        int sobreCargaInt2 = Suma((int)a, (int)b, (int)c);
        double sobreCargaDouble = Suma(a,b);

        System.out.print("1 suma sobrecarga 2 valores: " + sobreCargaInt);
        System.out.print("\n2 suma sobrecarga 3 valores: " + sobreCargaInt2 );
        System.out.print("\n3 suma sobrecarga double: " + sobreCargaDouble);
    }
    private static int Suma(int a, int b){
        return a+b;
    }
    private static int Suma(int a, int b, int c){
        return a+b+c;
    }
    private static double Suma(double a, double b){
        return a+b;
    }
}
