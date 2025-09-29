package com.reciclapp.model;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private int puntos;

    public Usuario() {}

    public Usuario(int id, String nombre, String correo, int puntos) {
        this.id = id; this.nombre = nombre; this.correo = correo; this.puntos = puntos;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }

    @Override
    public String toString() {
        return nombre + " (" + correo + ") - Puntos: " + puntos;
    }
}
