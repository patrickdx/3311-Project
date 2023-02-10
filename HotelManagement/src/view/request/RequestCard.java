/*
    Author: Ramful Devesh
    This class is a small gui component that displays information about requests.

     Methods: getRequestTypeLabel() : Returns the label that displays the type of request
              getRoomNumberLabel() : Returns the label that displays the room number
              getCancelButtonLabel() : Returns the button object that removes a request card from the container.
 */

package view.request;

import javax.swing.*;
import java.awt.*;

public class RequestCard extends JPanel {
    private String roomNumber;
    private String requestType;

    private JLabel roomNumberLabel =  new JLabel();
    private JLabel requestTypeLabel = new JLabel();


    private JButton cancelRequestButton = new JButton();

    private static final Font FONT = new Font("Open Sans",Font.PLAIN,25);

    RequestCard(){
        setLayout(null);
        setBackground(new Color(0,255,127));

        ImageIcon closeIcon = new ImageIcon("HotelManagement/lib/close.png");
        setPreferredSize(new Dimension(500,100));
        setForeground(Color.white);
        setBorder(null);


        roomNumberLabel.setFont(FONT);
        roomNumberLabel.setForeground(Color.WHITE);
        roomNumberLabel.setBackground(new Color(54, 47, 217));
        roomNumberLabel.setOpaque(true);
        roomNumberLabel.setBounds(0,0,100,100);
        add(roomNumberLabel);


        requestTypeLabel.setFont(FONT);
        requestTypeLabel.setForeground(Color.WHITE);
        requestTypeLabel.setBounds(200,0,100,100);
        add(requestTypeLabel);

        cancelRequestButton.setIcon(closeIcon);
        cancelRequestButton.setBounds(400,0,100,100);
        add(cancelRequestButton);

    }

    public JLabel getRequestTypeLabel() { return requestTypeLabel;}
    public JLabel getRoomNumberLabel(){return roomNumberLabel;}
    public JButton getCancelButtonRequest(){return cancelRequestButton;}
}
