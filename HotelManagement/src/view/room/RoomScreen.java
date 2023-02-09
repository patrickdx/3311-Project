package view.room;

import view.DefaultScreen;
import view.Screen;

import javax.swing.*;
import java.awt.*;

public class RoomScreen extends Screen {
    private JLabel titleLabel = new JLabel("Room Options");
    private JButton viewEmptyRoomsButton = new JButton();
    //private JButton viewNumberOfEmptyRoomsButton = new JButton();
    private JButton viewRoomExpensesButton = new JButton();
    private JButton searchRoomButton = new JButton();

    private static final Font FONT = new Font("Open Sans",Font.PLAIN,20);

    public RoomScreen(){
        setBackground(new Color(141, 203, 230));

        titleLabel.setBounds(DefaultScreen.WIDTH/2 - 200,50,700,100);
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 50));
        add(titleLabel);

        viewEmptyRoomsButton.setText("View empty rooms");
        viewEmptyRoomsButton.setOpaque(true);
        viewEmptyRoomsButton.setFont(FONT);
        viewEmptyRoomsButton.setBackground(new Color(54, 47, 217));
        viewEmptyRoomsButton.setForeground(Color.white);
        viewEmptyRoomsButton.setBorder(null);
        viewEmptyRoomsButton.setBounds(DefaultScreen.WIDTH/2 - 100,200,250,125);
        add(viewEmptyRoomsButton);
        /*
        viewNumberOfEmptyRoomsButton.setText("View number of empty rooms");
        viewNumberOfEmptyRoomsButton.setOpaque(true);
        viewNumberOfEmptyRoomsButton.setFont(FONT);
        viewNumberOfEmptyRoomsButton.setBackground(new Color(54, 47, 217));
        viewNumberOfEmptyRoomsButton.setForeground(Color.white);
        viewNumberOfEmptyRoomsButton.setBorder(null);
        viewNumberOfEmptyRoomsButton.setBounds(DefaultScreen.WIDTH/2 - 100,400,250,125);
        add(viewNumberOfEmptyRoomsButton);
        */
        searchRoomButton.setText("Search a room");
        searchRoomButton.setOpaque(true);
        searchRoomButton.setFont(FONT);
        searchRoomButton.setBackground(new Color(54, 47, 217));
        searchRoomButton.setForeground(Color.white);
        searchRoomButton.setBorder(null);
        searchRoomButton.setBounds(DefaultScreen.WIDTH/2 - 100,400,250,125);
        add(searchRoomButton);

    }

    public JLabel getTitleLabel(){return titleLabel;}
    public JButton getEmptyRoomsButton(){return viewEmptyRoomsButton;}
   // public JButton getNumberOfEmptyRoomsButton(){return viewNumberOfEmptyRoomsButton;}

    public JButton getSearchRoomButton(){return searchRoomButton;}

}
