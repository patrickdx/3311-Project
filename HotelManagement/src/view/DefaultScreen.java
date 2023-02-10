/*
Author: Ramful Devesh

This class is used as a template for other screens. It set ups the window frame's height and width that other
window uses.
 */

package view;
import javax.swing.*;

public class DefaultScreen extends JFrame {

    public static final int WIDTH = 1600;
    public static int HEIGHT = 1000;

    public DefaultScreen(){
        setTitle("Hotel Management System");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    }
}
