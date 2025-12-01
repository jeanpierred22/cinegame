package vista;

import javax.swing.*;
import java.awt.*;

public class MenuAdmin extends JFrame {

    public MenuAdmin(){
        setTitle("Menú Administrador");
        setSize(300,200);
        setLocationRelativeTo(null);

        JPanel p = new JPanel(new GridLayout(3,1,10,10));

        p.add(new JButton("Gestionar Películas"));
        p.add(new JButton("Gestionar Videojuegos"));
        p.add(new JButton("Ver Reportes"));

        add(p);
    }
}
