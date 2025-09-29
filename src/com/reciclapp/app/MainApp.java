package com.reciclapp.app;

import com.reciclapp.dao.*;
import com.reciclapp.model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MainApp {
    private JFrame frame;
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();
    private final ResiduoDAO residuoDAO = new ResiduoDAO();
    private DefaultTableModel tableModel;

    public static void main(String[] args) {
        // Siempre usar la firma exacta con String[]
        SwingUtilities.invokeLater(() -> {
            try {
                new MainApp().init();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, 
                        "Error al iniciar la aplicación: " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void init() {
        frame = new JFrame("ReciclApp");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        JButton btnUser = new JButton("Crear Usuario");
        JButton btnResiduo = new JButton("Registrar Residuo");
        JButton btnVer = new JButton("Ver Registros");

        JPanel top = new JPanel();
        top.add(btnUser);
        top.add(btnResiduo);
        top.add(btnVer);
        panel.add(top, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new String[]{"Tipo", "Cantidad", "Fecha", "UsuarioId"}, 0);
        JTable table = new JTable(tableModel);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        btnUser.addActionListener(e -> crearUsuario());
        btnResiduo.addActionListener(e -> registrarResiduo());
        btnVer.addActionListener(e -> mostrarResiduos());

        frame.add(panel);
        frame.setLocationRelativeTo(null); // Centra la ventana
        frame.setVisible(true);
    }

    private void crearUsuario() {
        String nombre = JOptionPane.showInputDialog(frame, "Nombre:");
        String correo = JOptionPane.showInputDialog(frame, "Correo:");
        if (nombre == null || correo == null || nombre.isBlank() || correo.isBlank()) return;

        try {
            usuarioDAO.crearUsuario(new Usuario(0, nombre.trim(), correo.trim(), 0));
            JOptionPane.showMessageDialog(frame, "Usuario creado.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }

    private void registrarResiduo() {
        String correo = JOptionPane.showInputDialog(frame, "Correo del usuario:");
        String tipo = JOptionPane.showInputDialog(frame, "Tipo de residuo:");
        String cantStr = JOptionPane.showInputDialog(frame, "Cantidad (kg):");

        if (correo == null || tipo == null || cantStr == null || 
            correo.isBlank() || tipo.isBlank() || cantStr.isBlank()) return;

        try {
            Usuario u = usuarioDAO.buscarPorCorreo(correo.trim());
            if (u == null) {
                JOptionPane.showMessageDialog(frame, "Usuario no encontrado.");
                return;
            }
            double cantidad = Double.parseDouble(cantStr);
            Residuo r = new Residuo(0, tipo.trim(), cantidad, 
                    LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME), 
                    u.getId());
            residuoDAO.registrarResiduo(r);
            JOptionPane.showMessageDialog(frame, "Residuo registrado.");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(frame, "La cantidad debe ser un número válido.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }

    private void mostrarResiduos() {
        try {
            List<Residuo> lista = residuoDAO.listarTodos();
            tableModel.setRowCount(0);
            for (Residuo r : lista) {
                tableModel.addRow(new Object[]{
                        r.getTipo(), r.getCantidad(), r.getFecha(), r.getUsuarioId()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }
}
