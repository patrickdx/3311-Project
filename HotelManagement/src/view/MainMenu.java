package view;
import javax.swing.*;

import java.awt.*;


public class MainMenu extends JFrame {



    public MainMenu(){
            JButton customerButton = new JButton();
            JButton roomButton = new JButton();
            JButton requestButton = new JButton();

            customerButton.setText("Customers");
            roomButton.setText("Rooms");
            requestButton.setText("Requests");

            customerButton.setFocusable(false);
            roomButton.setFocusable(false);
            requestButton.setFocusable(false);

            customerButton.setBounds(125,400,250,100);
            roomButton.setBounds(125,200,250,100);
            requestButton.setBounds(125,0,250,100);

             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             this.setLayout(null);
             this.setSize(500,600);
             this.setVisible(true);
             this.setTitle("Hotel Management");
             this.add(customerButton);
             this.add(roomButton);
             this.add(requestButton);
         }



    }

