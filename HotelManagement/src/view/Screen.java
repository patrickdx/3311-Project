package view;

import javax.swing.*;
import java.awt.*;
public class Screen extends JFrame {

    public static final int WIDTH = 500;
    public static int HEIGHT = 800;

    public Screen(){
        setTitle("Hotel Management System");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    }
}
