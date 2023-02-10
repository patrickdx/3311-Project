package view.room;

/*
Author: Ramful Devesh
    This class renders the room card in the room window container.

    Methods: RoomCard - Constructor to create a new room card.
             getRoomNumberLabel() - return the label (text) that is used to show room number
             getRoomRateLabel() - return the label (text) that is used to show room rate
             getRoomStatus() - return the label (text) that is used to show room status (BOOKED or OCCUPIED)
             getRoomBedNumberLabel() -  return the label that is used to show number of beds in the room

 */

import Rooms.Room;
import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;

public class RoomCard extends JPanel{

    private String number;
    private String status;
    private String bedNumber;
    private String rate ;


    private JLabel roomNumberLabel = new JLabel();
    private JLabel roomStatusLabel = new JLabel();
    private JLabel roomBedNumberLabel = new JLabel();
    private JLabel roomRateLabel = new JLabel();

    private Color green = new Color(0,255,127);
    private Color red = new Color(253, 138, 138);




    private static final Font FONT = new Font("Open Sans",Font.PLAIN,20);

    RoomCard(){



        setPreferredSize(new Dimension(500,50));
        setForeground(Color.white);
        setBorder(null);


        roomNumberLabel.setText("Number: " + this.number);
        roomNumberLabel.setFont(FONT);
        roomNumberLabel.setBounds(50,50,20,20);
        add(roomNumberLabel);

        roomBedNumberLabel.setText("Bed: " + this.bedNumber);
        roomBedNumberLabel.setFont(FONT);
        roomNumberLabel.setBounds(50,75,20,20);
        add(roomBedNumberLabel);

        roomRateLabel.setText("Rate: " + this.rate);
        roomRateLabel.setFont(FONT);
        roomNumberLabel.setBounds(50,100,20,20);
        add(roomRateLabel);

        roomStatusLabel.setText("Status: " + this.status);
        roomStatusLabel.setFont(FONT);
        roomNumberLabel.setBounds(50,125,20,20);
        add(roomStatusLabel);


        setOpaque(true);
        setVisible(true);


    }

    public JLabel getRoomNumberLabel(){return roomNumberLabel;}
    public JLabel getRoomRateLabel(){return roomRateLabel;}
    public JLabel getRoomStatusLabel(){return roomStatusLabel;}
    public JLabel getRoomBedNumberLabel(){return roomBedNumberLabel;}






}
