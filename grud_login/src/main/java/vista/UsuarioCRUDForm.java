package vista;

import crud_login.UsuarioDAO;
import crud_login.Usuario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UsuarioCRUDForm {
    private JPanel mainPanel;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JTextField txtRol;
    private JButton btnNuevo;
    private JButton btnGuardar;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnActualizar;
    private JTable tblUsuarios;

    private UsuarioDAO usuarioDAO;
    private DefaultTableModel modeloTabla;

    public UsuarioCRUDForm() {
        usuarioDAO = new UsuarioDAO();
        configurarTabla();
        cargarUsuarios();

        btnNuevo.addActionListener(e -> limpiarCampos());
        btnGuardar.addActionListener(e -> guardarUsuario());
        btnEditar.addActionListener(e -> editarUsuario());
        btnEliminar.addActionListener(e -> eliminarUsuario());
        btnActualizar.addActionListener(e -> cargarUsuarios());

        tblUsuarios.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                seleccionarUsuarioDeTabla();
            }
        });
    }

    private void configurarTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Usuario");
        modeloTabla.addColumn("password");
        modeloTabla.addColumn("Rol");
        tblUsuarios.setModel(modeloTabla);
    }

    private void cargarUsuarios() {
        modeloTabla.setRowCount(0);
        List<Usuario> usuarios = usuarioDAO.listarUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);

            modeloTabla.addRow(new Object[]{
                    usuario.getId(),
                    usuario.getNombre(),
                    usuario.getApellido(),
                    usuario.getUsuario(),
                    usuario.getPassword(),
                    usuario.getRol()
            });


        }
    }

    private void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtUsuario.setText("");
        txtPassword.setText("");
        txtRol.setText("");
    }

    private void guardarUsuario() {
        if (validarCampos()) {
            Usuario usuario = new Usuario(
                    txtNombre.getText(),
                    txtApellido.getText(),
                    txtUsuario.getText(),
                    new String(txtPassword.getPassword()),
                    txtRol.getText()
            );

            System.out.println(usuario);

            if (usuarioDAO.agregarUsuario(usuario)) {
                JOptionPane.showMessageDialog(mainPanel, "Usuario guardado correctamente");
                limpiarCampos();
                cargarUsuarios();
            } else {
                JOptionPane.showMessageDialog(mainPanel, "Error al guardar usuario", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void editarUsuario() {

        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(mainPanel, "Seleccione un usuario para editar", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (validarCampos()) {
            Usuario usuario = new Usuario(
                    Integer.parseInt(txtId.getText()),
                    txtNombre.getText(),
                    txtApellido.getText(),
                    txtUsuario.getText(),
                    new String(txtPassword.getPassword()),
                    txtRol.getText()
            );

            if (usuarioDAO.modificarUsuario(usuario)) {
                JOptionPane.showMessageDialog(mainPanel, "Usuario modificado correctamente");
                limpiarCampos();
                cargarUsuarios();
            } else {
                JOptionPane.showMessageDialog(mainPanel, "Error al modificar usuario", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void eliminarUsuario() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(mainPanel, "Seleccione un usuario para eliminar", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(mainPanel, 
            "¿Está seguro de eliminar este usuario?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            Usuario usuario = new Usuario(Integer.parseInt(txtId.getText()));
            if (usuarioDAO.eliminarUsuario(usuario)) {
                JOptionPane.showMessageDialog(mainPanel, "Usuario eliminado correctamente");
                limpiarCampos();
                cargarUsuarios();
            } else {
                JOptionPane.showMessageDialog(mainPanel, "Error al eliminar usuario", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void seleccionarUsuarioDeTabla() {
        int filaSeleccionada = tblUsuarios.getSelectedRow();
        if (filaSeleccionada >= 0) {
            txtId.setText(modeloTabla.getValueAt(filaSeleccionada, 0).toString());
            txtNombre.setText(modeloTabla.getValueAt(filaSeleccionada, 1).toString());
            txtApellido.setText(modeloTabla.getValueAt(filaSeleccionada, 2).toString());
            txtUsuario.setText(modeloTabla.getValueAt(filaSeleccionada, 3).toString());
            txtPassword.setText(modeloTabla.getValueAt(filaSeleccionada, 4).toString());
            txtRol.setText(modeloTabla.getValueAt(filaSeleccionada, 5).toString());

            //txtPassword.setText(""); // Por seguridad no mostramos la contraseña

        }
    }

    private boolean validarCampos() {
        if (txtNombre.getText().isEmpty() || 
            txtApellido.getText().isEmpty() || 
            txtUsuario.getText().isEmpty() || 
            txtPassword.getPassword().length == 0 || 
            txtRol.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(mainPanel, "Todos los campos son obligatorios", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}