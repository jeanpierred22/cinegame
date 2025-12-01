package vista;

import javax.swing.*;
import java.awt.*;
import controladores.LoginController;

public class LoginForm extends JFrame {

    private JTextField campoUsuario;
    private JPasswordField campoPassword;
    private JButton btnLogin;

    public LoginForm() {

        setTitle("LOGIN - Proyecto Almacén");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        panel.add(new JLabel("Usuario:"));
        campoUsuario = new JTextField();
        panel.add(campoUsuario);

        panel.add(new JLabel("Contraseña:"));
        campoPassword = new JPasswordField();
        panel.add(campoPassword);

        btnLogin = new JButton("Ingresar");
        panel.add(new JLabel());
        panel.add(btnLogin);

        add(panel);

        btnLogin.addActionListener(e -> {
            String user = campoUsuario.getText();
            String pass = String.valueOf(campoPassword.getPassword());

            String tipo = LoginController.validarLogin(user, pass);

            if(tipo.equals("ADMIN")){
                dispose();
                new MenuAdmin().setVisible(true);
            }
            else if(tipo.equals("CLIENTE")){
                dispose();
                new MenuCliente().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this,"Datos incorrectos");
            }
        });

    }
}
