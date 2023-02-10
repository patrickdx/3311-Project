/*
    Author: Ramful Devesh
    This screen displays the information for one room.
 */

package view.room;



import view.Screen;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class viewRoomScreen extends  Screen {

    private JLabel roomNumberLabel = new JLabel();

    /*
    private String roomNumber;
    private String name;

    private String status;
    private String dateBooked;

     */

    private JLabel statusLabel = new JLabel();
    private JLabel nameLabel = new JLabel();
    private JLabel dateBookedLabel = new JLabel();


    // private JButton addPersonButton = new JButton(); - To use for future iteration
    private JButton removePersonButton = new JButton();

    private static final Font FONT_1 = new Font("Open Sans",Font.PLAIN,80);
    private static final Font FONT_2 = new Font("Open Sans",Font.PLAIN,30);

    public viewRoomScreen(){

        setBackground(new Color(141, 203, 230));


        roomNumberLabel.setText(" ");
        roomNumberLabel.setFont(FONT_1);
        roomNumberLabel.setForeground(Color.WHITE);
        roomNumberLabel.setBounds(200,100,100,100);
        add(roomNumberLabel);

        nameLabel.setText("Booked under: ");
        nameLabel.setFont(FONT_2);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(200,200,500,100);
        add(nameLabel);

        dateBookedLabel.setText("Date booked: ");
        dateBookedLabel.setFont(FONT_2);
        dateBookedLabel.setForeground(Color.WHITE);
        dateBookedLabel.setBounds(200,300,500,100);
        add(dateBookedLabel);

        statusLabel.setText("Status: ");
        statusLabel.setFont(FONT_2);
        statusLabel.setForeground(Color.WHITE);
        statusLabel.setBounds(200,400,500,100);
        add(statusLabel);

        removePersonButton.setText("Remove Booking");
        removePersonButton.setOpaque(true);
        removePersonButton.setBorder(null);
        removePersonButton.setBackground(new Color(253, 138, 138));
        removePersonButton.setBounds(200,500, 250,100);
        add(removePersonButton);



    }


    public JLabel getRoomNumberLabel(){return roomNumberLabel;
    }
    public JLabel getStatusLabel(){return statusLabel;
    }
    public JLabel getNameLabel(){return nameLabel;
    }
    public JLabel getDateBookedLabel(){return dateBookedLabel;}
    public JButton getRemovePersonButton() {return removePersonButton;}


}
