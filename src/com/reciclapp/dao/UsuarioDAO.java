package com.reciclapp.dao;

import com.reciclapp.model.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public void crearUsuario(Usuario u) throws SQLException {
        String sql = "INSERT INTO Usuario(nombre, correo, puntos) VALUES(?,?,?)";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getCorreo());
            ps.setInt(3, u.getPuntos());
            ps.executeUpdate();
        }
    }

    public Usuario buscarPorCorreo(String correo) throws SQLException {
        String sql = "SELECT id, nombre, correo, puntos FROM Usuario WHERE correo = ?";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("correo"), rs.getInt("puntos"));
            }
        }
        return null;
    }

    public List<Usuario> listar() throws SQLException {
        List<Usuario> list = new ArrayList<>();
        String sql = "SELECT id, nombre, correo, puntos FROM Usuario ORDER BY nombre";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("correo"), rs.getInt("puntos")));
            }
        }
        return list;
    }

    public void actualizarPuntos(int userId, int nuevosPuntos) throws SQLException {
        String sql = "UPDATE Usuario SET puntos = ? WHERE id = ?";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, nuevosPuntos);
            ps.setInt(2, userId);
            ps.executeUpdate();
        }
    }
}
