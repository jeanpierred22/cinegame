package vista;

import javax.swing.*;

public class MenuCliente extends JFrame {

    public MenuCliente(){
        setTitle("Menú Cliente");
        setSize(300,200);
        setLocationRelativeTo(null);

        JPanel p = new JPanel();
        p.add(new JLabel("Aquí comprará películas y videojuegos"));

        add(p);
    }
}
