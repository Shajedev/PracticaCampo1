package trabajo_campo3;

import java.util.ArrayList;

public class Colecciones {

    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres
        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregar 5 nombres
        estudiantes.add("Carlos");
        estudiantes.add("Maria");
        estudiantes.add("Juan");
        estudiantes.add("Ana");
        estudiantes.add("Pedro");

        // Mostrar la lista completa
        System.out.println("Lista de estudiantes: " + estudiantes);

        // Eliminar el tercer nombre ingresado (índice 2)
        estudiantes.remove(2);

        // Mostrar la lista después de la eliminación
        System.out.println("Lista después de eliminar el tercer nombre: " + estudiantes);
    }
}