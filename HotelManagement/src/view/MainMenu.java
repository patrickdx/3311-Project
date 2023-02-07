/*
    Author: Ramful Devesh
    This class created the main menu screen that the user sees when they open the program.

 */

package view;
import javax.swing.*;

import java.awt.*;


public class MainMenu extends Screen {
    private JLabel titleLabel = new JLabel("Welcome back user");
    private JButton customerButton = new JButton();
    private JButton roomButton = new JButton();
    private JButton requestButton = new JButton();

    private static final Font FONT = new Font("Open Sans",Font.PLAIN,30);



    public MainMenu(){

            setBackground(new Color(90, 148, 161));

            titleLabel.setBounds(70,50,700,100);
            titleLabel.setForeground(Color.white);
            titleLabel.setFont(new Font("Calibri", Font.BOLD, 50));
            add(titleLabel);

            ImageIcon customerIcon = new ImageIcon("HotelManagement/lib/customer_icon.png");
            ImageIcon roomIcon = new ImageIcon("HotelManagement/lib/room_icon.png");
            ImageIcon requestIcon = new ImageIcon("HotelManagement/lib/request_icon.png");


            customerButton.setText("Customers");
            customerButton.setOpaque(true);
            customerButton.setFont(FONT);
            customerButton.setBackground(new Color(54, 47, 217));
            customerButton.setForeground(Color.WHITE);
            customerButton.setBorder(null);
            customerButton.setBounds(200,400,250,125);
            add(customerButton);


            roomButton.setText("Rooms");
            roomButton.setOpaque(true);
            roomButton.setFont(FONT);
            roomButton.setBackground(new Color(54, 47, 217));
            roomButton.setForeground(Color.WHITE);
            roomButton.setBorder(null);
            roomButton.setBounds(600,400,250,125);
            add(roomButton);


            requestButton.setText("Requests");
            requestButton.setOpaque(true);
            requestButton.setFont(FONT);
            requestButton.setBackground(new Color(54, 47, 217));
            requestButton.setForeground(Color.WHITE);
            requestButton.setBorder(null);
            requestButton.setBounds(1000,400,250,125);
            add(requestButton);












         }

    public JLabel getTitleLabel() {return titleLabel;}
    public JButton getCustomerButton(){return customerButton;}
    public JButton getRoomButton(){return roomButton;}
    public JButton getGetCustomerButton() {return requestButton;}



    }

