package caso3;

import java.util.Scanner;

// Clase CuentaBancaria con atributos privados y validación
class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso: " + monto);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    // Método para retirar
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso: " + monto);
        } else {
            System.out.println("Saldo insuficiente o monto inválido.");
        }
    }

    // Consultar saldo
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

// Clase pública con método main
public class CuentaBancariaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Ingrese saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);

        System.out.println("\n--- Operaciones ---");
        System.out.print("Ingrese monto a depositar: ");
        double deposito = sc.nextDouble();
        cuenta.depositar(deposito);

        System.out.print("Ingrese monto a retirar: ");
        double retiro = sc.nextDouble();
        cuenta.retirar(retiro);

        System.out.println("\nSaldo final: " + cuenta.getSaldo());

        sc.close();
    }
}



