package trabajo_campo3;

import java.util.ArrayList;

class Inventario {

    // ArrayList para almacenar productos
    private ArrayList<String> productos = new ArrayList<>();

    // Método sobrecargado para agregar solo el nombre del producto
    public void agregarProducto(String nombre) {
        productos.add(nombre);
    }

    // Método sobrecargado para agregar nombre y precio del producto
    public void agregarProducto(String nombre, double precio) {
        if (precio < 0) {
            System.out.println("Error: El precio no puede ser negativo.");
        } else {
            productos.add(nombre + " - Precio: " + precio);
        }
    }

    // Método sobrecargado para agregar nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            System.out.println("Error: El precio o la cantidad no pueden ser negativos.");
        } else {
            productos.add(nombre + " - Precio: " + precio + " - Cantidad: " + cantidad);
        }
    }

    // Mostrar todos los productos
    public void mostrarProductos() {
        for (String producto : productos) {
            System.out.println(producto);
        }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar productos
        inventario.agregarProducto("Producto1");
        inventario.agregarProducto("Producto2", 20.5);
        inventario.agregarProducto("Producto3", 15.0, 10);

        // Mostrar productos
        inventario.mostrarProductos();
    }
}
