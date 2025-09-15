package PC3_Sobrecarga_ManejoErrores_Colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
  Pregunta4_Inventario.java
  - Usa un HashMap para gestionar un inventario de productos.
  - Permite agregar productos con su cantidad y mostrarlos en pantalla.
*/

public class Pregunta4_Inventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> inventario = new HashMap<>();

        System.out.println("*** Registro de Inventario ***");

        // Ingreso de productos
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre del producto " + (i + 1) + ": ");
            String producto = sc.nextLine();

            System.out.print("Ingrese cantidad de " + producto + ": ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            inventario.put(producto, cantidad);
        }

        // Mostrar inventario
        System.out.println("\n*** Inventario registrado ***");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
