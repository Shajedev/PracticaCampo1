package com.reciclapp.model;

public class Residuo {
    private int id;
    private String tipo;
    private double cantidad;
    private String fecha;
    private Integer usuarioId;

    public Residuo() {}

    public Residuo(int id, String tipo, double cantidad, String fecha, Integer usuarioId) {
        this.id = id; this.tipo = tipo; this.cantidad = cantidad; this.fecha = fecha; this.usuarioId = usuarioId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public Integer getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Integer usuarioId) { this.usuarioId = usuarioId; }

    @Override
    public String toString() {
        return tipo + " — " + cantidad + " kg — " + fecha;
    }
}
