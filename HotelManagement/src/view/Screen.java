/*
Auhtor: Ramful Devesh
    This class is the default empty screen which every other screens created inherits from.
    This ensures every screen has a back button to go back.
 */

package view;
import javax.swing.*;


public class Screen extends JPanel {
    private JButton backButton;

    public Screen(){
        setLayout(null);
        setBounds(0,0, DefaultScreen.WIDTH, DefaultScreen.HEIGHT);

        ImageIcon backButtonIcon = new ImageIcon("HotelManagement/lib/backButton.png");
        backButton =  new JButton(backButtonIcon);
        backButton.setBounds(525,20,backButtonIcon.getIconWidth(),backButtonIcon.getIconHeight());
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        add(backButton);



    }

    public JButton getBackButton() {return backButton;};
}
