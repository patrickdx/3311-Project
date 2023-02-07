package view;
import javax.swing.*;


public class Screen extends JPanel {
    private JButton backButton;

    public Screen(){
        setLayout(null);
        setBounds(0,0, DefaultScreen.WIDTH, DefaultScreen.HEIGHT);

        ImageIcon backButtonIcon = new ImageIcon("HotelManagement/lib/back.png");
        backButton =  new JButton(backButtonIcon);
        backButton.setBounds(1540,20,backButtonIcon.getIconWidth(),backButtonIcon.getIconHeight());
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        add(backButton);



    }

    public JButton getBackButton() {return backButton;};
}
