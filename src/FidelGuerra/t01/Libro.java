package FidelGuerra.t01;

public class Libro {
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private String isbn;

    public Libro(String titulo, Autor autor, int anioPublicacion) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título del libro no puede estar vacío");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = "No especificado";
    }

    public Libro(String titulo, Autor autor, int anioPublicacion, String isbn) {
        this(titulo, autor, anioPublicacion);
        this.isbn = isbn != null ? isbn : "No especificado";
    }

    public void mostrarInformacion() {
        System.out.println("=== Información del Libro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.getNombreCompleto());
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("ISBN: " + isbn);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título del libro no puede estar vacío");
        }
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn != null ? isbn : "No especificado";
    }
}
