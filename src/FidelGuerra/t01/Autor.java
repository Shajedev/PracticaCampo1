package FidelGuerra.t01;

public class Autor {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;

    public Autor() {
        this("", "", "Desconocida", 0);
    }

    public Autor(String nombre, String apellido, String nacionalidad, int edad) {
        this.nombre = nombre != null ? nombre : "";
        this.apellido = apellido != null ? apellido : "";
        this.nacionalidad = nacionalidad != null ? nacionalidad : "Desconocida";
        this.edad = Math.max(0, edad);
    }

    public String getNombreCompleto() {
        return String.format("%s %s", nombre, apellido).trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre != null ? nombre : "";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido != null ? apellido : "";
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad != null ? nacionalidad : "Desconocida";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = Math.max(0, edad);
    }


    public void mostrarInformacion() {
        System.out.println("=== Información del Autor ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Edad: " + edad);
    }


}
