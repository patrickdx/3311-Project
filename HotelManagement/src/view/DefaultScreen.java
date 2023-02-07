package view;

import javax.swing.*;

public class DefaultScreen extends JFrame {



    public static final int WIDTH = 500;
    public static int HEIGHT = 600;

    public DefaultScreen(){
        setTitle("Hotel Management System");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        pack();
    }
}
