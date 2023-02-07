/*
Author: Ramful Devesh

This class is used as a template for other screens.
 */

package view;
import javax.swing.*;

public class DefaultScreen extends JFrame {



    public static final int WIDTH = 1600;
    public static int HEIGHT = 900;

    public DefaultScreen(){
        setTitle("Hotel Management System");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    }
}
