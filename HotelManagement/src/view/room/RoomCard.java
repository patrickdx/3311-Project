package view.room;

/*
Author: Ramful Devesh
    This class renders the room card in the room window container.

    Methods: RoomCard - Constructor to create a new room card.
            renderRoomCard - Passes either a room object or individual room data types to this render object so that it can be changed or updated

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

    RoomCard(int number, boolean status, int bedNumber, int rate){

        this.number = Integer.toString(number);
        if (status == false){
            this.status = "EMPTY";
            setBackground(green);

        } else if (status = true){
            this.status = "BOOKED";
            setBackground(red);
        }

        this.bedNumber = Integer.toString(bedNumber);
        this.rate = Integer.toString(rate);

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

    public void  renderRoomCard(int number, boolean status, int bedNumber, int rate){
        this.number = Integer.toString(number);
        if (status == false){
            this.status = "EMPTY";

        } else if (status = true){
            this.status = "BOOKED";
        }

        this.bedNumber = Integer.toString(bedNumber);
        this.rate = Integer.toString(rate);
    }

    public void renderRoomCard (Room r){
        this.number = Integer.toString(r.getRoomID());
        this.bedNumber = Integer.toString(r.getType().getSize());
        this.rate = Integer.toString(r.getType().getRate());
    }

    public void setRoomNumber(int number){
        this.number = Integer.toString(number);
    }

    public void setRoomStatus(boolean status){
        if (status == false){
            this.status = "EMPTY";

        } else if (status = true){
            this.status = "BOOKED";
        }
    }

    public void setBedNumber(int bedNumber){
        this.bedNumber = Integer.toString(bedNumber);
    }

    public void setRate(int rate){
        this.rate = Integer.toString(rate);
    }

}
