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
    //private JButton viewNumberOfEmptyRoomsButton = new JButton();
   // private JButton viewRoomExpensesButton = new JButton();
    private JButton searchRoomButton = new JButton();

    //private JButton addCustomerButton = new JButton();
    private JButton showEmptyRoomsButton = new JButton();

    private JPanel container = new JPanel();


    private static final Font FONT = new Font("Open Sans",Font.PLAIN,20);

    public RoomScreen(){
        /* Example on how to create a room card. This should be moved to a controller class and this comment removed.
        RoomCard roomCard1 = new RoomCard();
        RoomCard roomCard2 = new RoomCard();
        RoomCard roomCard3 = new RoomCard();

         */

        container.setBounds(DefaultScreen.WIDTH/2 - 300,150,700,600);
        container.setBackground(new Color (250, 243, 222));

/*      Example on how to add card to the container. This should be moved to a controller class and this comment removed.
        container.add(roomCard1);
        container.add(roomCard2);
        container.add(roomCard3);

 */

        container.setVisible(true);
        add(container);

        ImageIcon searchIcon = new ImageIcon("HotelManagement/lib/search.png");

        titleLabel.setBounds(DefaultScreen.WIDTH/2 - 200,50,700,100);
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 50));
        add(titleLabel);

        /*
        Redundant button: Keep it for future iterations

        viewEmptyRoomsButton.setText("View empty rooms");
        viewEmptyRoomsButton.setOpaque(true);
        viewEmptyRoomsButton.setFont(FONT);
        viewEmptyRoomsButton.setBackground(new Color(54, 47, 217));
        viewEmptyRoomsButton.setForeground(Color.white);
        viewEmptyRoomsButton.setBorder(null);
        viewEmptyRoomsButton.setBounds(DefaultScreen.WIDTH/2 - 100,200,250,125);
     */
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

        /*
        Redundant button. Keep it for future iteration changes.

        addCustomerButton.setText("Add customer to room");
        addCustomerButton.setOpaque(true);
        addCustomerButton.setFont(FONT);
        addCustomerButton.setBackground(new Color(54, 47, 217));
        addCustomerButton.setForeground(Color.white);
        addCustomerButton.setBounds(DefaultScreen.WIDTH/2 - 100,600,250,125);
*/




        setBackground(new Color(141, 203, 230));


    }

    public JLabel getTitleLabel(){return titleLabel;}

    private JPanel getRoomContainer() {return container;}

    public JButton getEmptyRoomsButton(){return viewEmptyRoomsButton;}
   // public JButton getNumberOfEmptyRoomsButton(){return viewNumberOfEmptyRoomsButton;}

    public JButton getSearchRoomButton(){return searchRoomButton;}



}
