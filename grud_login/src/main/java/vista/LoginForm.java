package vista;

import crud_login.UsuarioDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JPanel mainPanel;
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnCancelar;
    private JLabel lblUsuario;
    private JLabel lblPassword;

    public LoginForm() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String password = new String(txtPassword.getPassword());

                UsuarioDAO usuarioDAO = new UsuarioDAO();
                boolean credencialesValidas = usuarioDAO.buscarUsuarioPorCredenciales(usuario, password);

                if (credencialesValidas) {
                    JOptionPane.showMessageDialog(mainPanel, "Login exitoso");
                    abrirCRUDUsuarios();
                    // solo cierra la ventana login
                    //((JFrame) SwingUtilities.getWindowAncestor(mainPanel)).dispose();

                    Window ventanaPadre = SwingUtilities.getWindowAncestor(mainPanel);
                    if (ventanaPadre != null) {
                        ventanaPadre.dispose(); // Cierra la ventana padre de manera segura
                    }

                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Usuario o contraseña incorrectos",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnCancelar.addActionListener(e -> {
            System.exit(0);
        });
    }

    private void abrirCRUDUsuarios() {
        JFrame frame = new JFrame("CRUD Usuarios");
        frame.setContentPane(new UsuarioCRUDForm().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new LoginForm().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
