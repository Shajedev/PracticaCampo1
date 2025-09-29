package FidelGuerra.t01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Libro> libros;
    private List<Autor> autores;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public static void main(String[] args) {
        // Crear una instancia de la biblioteca
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        try {
            int option = 0;
            do {
                System.out.println("\n--------------- BIBLIOTECA VIRTUAL ---------------");
                System.out.println("Seleccione alguna de las opciones:");
                System.out.println("1. Registrar Autor");
                System.out.println("2. Registrar Libro");
                System.out.println("3. Mostrar Libros");
                System.out.println("4. Mostrar Autores");
                System.out.println("5. Salir");
                System.out.print("Opción: ");

                    option = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    
                    switch (option) {
                        case 1:
                            biblioteca.interfaceCreateAutor(sc);
                            break;
                        case 2:
                            biblioteca.interfaceCreateLibro(sc);
                            break;
                        case 3:
                            biblioteca.mostrarLibros();
                            break;
                        case 4:
                            biblioteca.mostrarAutores();
                            break;
                        case 5:
                            System.out.println("¡Hasta luego!");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    }
                
            } while (option != 5);

        } catch (Exception e) {
            System.err.println("Se produjo un error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void interfaceCreateAutor(Scanner sc) {
        System.out.println("Ingrese el nombre del autor: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del autor: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la nacionalidad del autor: ");
        String nacionalidad = sc.nextLine();
        System.out.println("Ingrese la edad del autor: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        registrarAutor(nombre, apellido, nacionalidad, edad);
    }

    public void interfaceCreateLibro(Scanner sc) {
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = sc.nextLine();
        
        System.out.print("Ingrese el autor del libro: ");
        String autor = sc.nextLine();

        System.out.print("Ingrese el año de publicación del libro: ");
        int anioPublicacion = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el ISBN del libro (opcional, presione Enter para omitir): ");
        String isbn = sc.nextLine().trim();

        Autor autorBuscado = buscarAutor(autor);
        
        if (autorBuscado == null) {
            System.out.println("Error: El autor no existe. Por favor registre el autor primero.");
            return;
        }
        
        if (isbn.isEmpty()) {
            registrarLibro(titulo, autorBuscado, anioPublicacion);
            System.out.println("Libro registrado exitosamente sin ISBN.");
        } else {
            registrarLibro(titulo, autorBuscado, anioPublicacion, isbn);
            System.out.println("Libro registrado exitosamente con ISBN: " + isbn);
        }
    }
    
    public Autor buscarAutor(String nombre) {
        for (Autor autor : autores) {
            if (autor.getNombre().equals(nombre)) {
                return autor;
            }
        }
        return null;
    }

    public void registrarLibro(String titulo, Autor autor, int anioPublicacion) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título del libro no puede estar vacío");
        }
        if (autor == null) {
            throw new IllegalArgumentException("El autor no puede ser nulo");
        }
        
        Libro libro = new Libro(titulo, autor, anioPublicacion);
        libros.add(libro);

    }


    public void registrarLibro(String titulo, Autor autor, int anioPublicacion, String isbn) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título del libro no puede estar vacío");
        }
        if (autor == null) {
            throw new IllegalArgumentException("El autor no puede ser nulo");
        }
        
        Libro libro = new Libro(titulo, autor, anioPublicacion, isbn);
        libros.add(libro);
    }

    public void registrarAutor(String nombre, String apellido, String nacionalidad, int edad) {
        Autor autor = new Autor(nombre, apellido, nacionalidad, edad);
        autores.add(autor);
    }
    public void mostrarAutores() {
        if (autores.isEmpty()) {
            System.out.println("No hay autores registrados en la biblioteca.");
            return;
        }

        System.out.println("\n=== AUTORES EN LA BIBLIOTECA ===");
        for (int i = 0; i < autores.size(); i++) {
            System.out.printf("\nAutor #%d\n", i + 1);
            autores.get(i).mostrarInformacion();
        }
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados en la biblioteca.");
            return;
        }

        System.out.println("\n=== LIBROS EN LA BIBLIOTECA ===");
        for (int i = 0; i < libros.size(); i++) {
            System.out.printf("\nLibro #%d\n", i + 1);
            libros.get(i).mostrarInformacion();
        }
    }


}
