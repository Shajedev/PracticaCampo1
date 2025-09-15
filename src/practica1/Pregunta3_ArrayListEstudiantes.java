package practica1;

import java.util.ArrayList;
import java.util.Scanner;

/*
  Pregunta3_ArrayListEstudiantes.java
  - Usa ArrayList para almacenar nombres de estudiantes.
  - Permite agregar estudiantes y mostrarlos en pantalla.
*/

public class Pregunta3_ArrayListEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        System.out.println("*** Registro de Estudiantes ***");

        // Ingreso de estudiantes
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre del estudiante " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            estudiantes.add(nombre);
        }

        // Mostrar lista de estudiantes
        System.out.println("\n*** Lista de estudiantes registrados ***");
        for (String est : estudiantes) {
            System.out.println(est);
        }

        sc.close();
    }
}
