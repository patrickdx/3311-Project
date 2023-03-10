/*
    Author: Ramful Devesh
    This class displays the room window.

 */

package view.room;


import view.DefaultScreen;
import view.Screen;

import javax.swing.*;
import java.awt.*;

public class RoomScreen extends Screen {
    private JLabel titleLabel = new JLabel("Room ");
    private JButton viewEmptyRoomsButton = new JButton();

    private JButton searchRoomButton = new JButton();

    private JButton showEmptyRoomsButton = new JButton();

    private  JPanel container = new JPanel();


    private static final Font FONT = new Font("Open Sans",Font.PLAIN,20);

    public RoomScreen(){


        container.setBounds(DefaultScreen.WIDTH/2 - 300,150,700,600);
        container.setBackground(new Color (250, 243, 222));



        //container.setVisible(true);
        add(container);

        ImageIcon searchIcon = new ImageIcon("HotelManagement/lib/search.png");

        titleLabel.setBounds(DefaultScreen.WIDTH/2 - 200,50,700,100);
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 50));
        add(titleLabel);


        searchRoomButton.setIcon(searchIcon);
        searchRoomButton.setOpaque(true);
        searchRoomButton.setFont(FONT);
        searchRoomButton.setBackground(new Color(141, 203, 230));
        searchRoomButton.setForeground(Color.white);
        searchRoomButton.setBorder(null);
        searchRoomButton.setBounds(DefaultScreen.WIDTH/2 - 400,100,64,64);
        add(searchRoomButton);

        showEmptyRoomsButton.setText("EMPTY");
        showEmptyRoomsButton.setOpaque(true);
        showEmptyRoomsButton.setFont(FONT);
        showEmptyRoomsButton.setBackground(new  Color(157, 241, 223));
        showEmptyRoomsButton.setBorder(null);
        showEmptyRoomsButton.setBounds(DefaultScreen.WIDTH/2 - 450, 200, 100,50);
        add(showEmptyRoomsButton);



        setBackground(new Color(141, 203, 230));


    }

    public JLabel getTitleLabel(){return titleLabel;}

    public  JPanel getRoomContainer() {return container;}

    public JButton getEmptyRoomsButton(){return viewEmptyRoomsButton;}
   // public JButton getNumberOfEmptyRoomsButton(){return viewNumberOfEmptyRoomsButton;}

    public JButton getSearchRoomButton(){return searchRoomButton;}



}
