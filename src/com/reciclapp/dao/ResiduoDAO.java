package com.reciclapp.dao;

import com.reciclapp.model.Residuo;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ResiduoDAO {
    public void registrarResiduo(Residuo r) throws SQLException {
        String sql = "INSERT INTO Residuo(tipo, cantidad, fecha, usuario_id) VALUES(?,?,?,?)";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, r.getTipo());
            ps.setDouble(2, r.getCantidad());
            ps.setString(3, r.getFecha());
            if (r.getUsuarioId() != null) ps.setInt(4, r.getUsuarioId()); else ps.setNull(4, Types.INTEGER);
            ps.executeUpdate();
        }
    }

    public List<Residuo> listarTodos() throws SQLException {
        List<Residuo> list = new ArrayList<>();
        String sql = "SELECT id, tipo, cantidad, fecha, usuario_id FROM Residuo ORDER BY fecha DESC";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Integer uid = rs.getInt("usuario_id");
                if (rs.wasNull()) uid = null;
                list.add(new Residuo(rs.getInt("id"), rs.getString("tipo"), rs.getDouble("cantidad"), rs.getString("fecha"), uid));
            }
        }
        return list;
    }
}
