package view;
import javax.swing.*;

import java.awt.*;


public class MainMenu extends Screen {
    private JLabel titleLabel = new JLabel("Welcome back user");
    private JButton customerButton = new JButton();
    private JButton roomButton = new JButton();
    private JButton requestButton = new JButton();



    public MainMenu(){



            titleLabel.setBounds(70,50,700,100);
            titleLabel.setForeground(Color.white);
            titleLabel.setFont(new Font("Calibri", Font.BOLD, 50));
            add(titleLabel);

            ImageIcon customerIcon = new ImageIcon("HotelManagement/lib/customer_icon.png");
            ImageIcon roomIcon = new ImageIcon("HotelManagement/lib/room_icon.png");
            ImageIcon requestIcon = new ImageIcon("HotelManagement/lib/request_icon.png");

            customerButton = new JButton(customerIcon);
            customerButton.setText("Customers");
            customerButton.setBorder(null);
            customerButton.setBounds(300,500,250,125);
            add(customerButton);

            roomButton = new JButton(roomIcon);
            roomButton.setText("Rooms");
            roomButton.setBorder(null);
            roomButton.setBounds(700,400,250,125);
            add(roomButton);

            requestButton = new JButton(requestIcon);
            requestButton.setText("Requests");
            requestButton.setBorder(null);
            requestButton.setBounds(700,400,250,125);
            add(requestButton);












         }

    public JLabel getTitleLabel() {return titleLabel;}
    public JButton getCustomerButton(){return customerButton;}
    public JButton getRoomButton(){return roomButton;}
    public JButton getGetCustomerButton() {return requestButton;}



    }

