/*
    Author: Ramful Devesh
    This class displays the request window.
    Methods: getAddRequestButton() - Returns the button object to add a request.
             getRequestContainer() - Returns the container object that holds all the request cards.

 */

package view.request;
import view.DefaultScreen;
import view.Screen;

import javax.swing.*;
import java.awt.*;
public class RequestScreen extends Screen {
    private JLabel titleLabel = new JLabel("Requests");
    private JButton addRequestButton = new JButton();

    private JPanel container = new JPanel();

    private static final Font FONT = new Font("Open Sans",Font.PLAIN,20);

    public RequestScreen(){

        setBackground(new Color(141, 203, 230));

        int X = DefaultScreen.WIDTH/2 - 200;
        ImageIcon addIcon = new ImageIcon("HotelManagement/lib/addIcon.png");

        container.setBounds(DefaultScreen.WIDTH/2 - 300,150,700,600);
        container.setBackground(new Color (250, 243, 222));



        container.setVisible(true);
        add(container);



        titleLabel.setBounds(X,50,700,100);
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 50));
        add(titleLabel);

        addRequestButton.setIcon(addIcon);
        addRequestButton.setOpaque(true);
        addRequestButton.setFont(FONT);
        addRequestButton.setBackground(Color.GREEN);
        addRequestButton.setForeground(Color.WHITE);
        addRequestButton.setBorder(null);
        addRequestButton.setBounds(X+400,100,50,50);
        add(addRequestButton);

    }

    public JLabel getTitleLabel(){return titleLabel;}

    public JButton getAddRequestButton(){return addRequestButton;}
    public JPanel getRequestContainer() {return container;}


}
