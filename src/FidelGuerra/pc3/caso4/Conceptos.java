package FidelGuerra.pc3.caso4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conceptos {
    static List<String> listaProductos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("-------------- Inventario -------------\n");

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.printf("Ingrese el precio de %s: ", nombre);
        Double precio = sc.nextDouble();
        System.out.printf("Ingrese la cantidad de %s: ", nombre);
        int cantidad = sc.nextInt();

        Inventario(nombre);
        Inventario(nombre,precio);
        Inventario(nombre,precio,cantidad);
    }

    private static void Inventario(String nombre) {
        listaProductos.add(nombre);
    }
    private static void Inventario(String nombre,  Double precio) {
        if(!validarValor(precio)) {
           System.out.print("precio invalida, debe ingresar positivo\n");
           return;
        }
        listaProductos.add(nombre);
        System.out.printf("valores de %s validados correctamente\n",nombre);
    }
    private static void Inventario(String nombre,  Double precio, int cantidad) {
        if(!validarValor(precio)) {
            System.out.print("precio invalida, debe ingresar positivo\n");
            return;
        }
        if(!validarValor(Double.parseDouble(String.valueOf(cantidad)))) {
            System.out.print("cantidad invalida, debe ingresar positivo\n");
            return;
        }
        listaProductos.add(nombre);
        System.out.printf("valores de %s validados correctamente\n",nombre);
    }
    private static boolean validarValor(Double cantidad) {
        if(cantidad <= 0){
            return false;
        }
        return true;
    }
}
