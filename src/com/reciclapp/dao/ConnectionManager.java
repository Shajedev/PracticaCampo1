package com.reciclapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
    private static final String DB_FILE = "reciclaje.db";
    private static final String URL = "jdbc:sqlite:" + DB_FILE;

    static {
        try { Class.forName("org.sqlite.JDBC"); } catch (ClassNotFoundException e) {}
    }

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection(URL);
        initializeIfNeeded(c);
        return c;
    }

    private static void initializeIfNeeded(Connection c) {
        try (Statement st = c.createStatement()) {
            st.execute("PRAGMA foreign_keys = ON;");
            st.execute("CREATE TABLE IF NOT EXISTS Usuario (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT NOT NULL, correo TEXT UNIQUE NOT NULL, puntos INTEGER DEFAULT 0);");
            st.execute("CREATE TABLE IF NOT EXISTS Residuo (id INTEGER PRIMARY KEY AUTOINCREMENT, tipo TEXT NOT NULL, cantidad REAL NOT NULL, fecha TEXT NOT NULL, usuario_id INTEGER, FOREIGN KEY (usuario_id) REFERENCES Usuario(id) ON DELETE SET NULL);");
            st.execute("CREATE TABLE IF NOT EXISTS PuntoReciclaje (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT NOT NULL, lat REAL, lon REAL, tipos_aceptados TEXT);");
            st.execute("CREATE TABLE IF NOT EXISTS Recompensa (id INTEGER PRIMARY KEY AUTOINCREMENT, descripcion TEXT NOT NULL, puntosNecesarios INTEGER NOT NULL);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
