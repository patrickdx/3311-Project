/*
    Author: Ramful Devesh
    This class is the window for a main menu. It has options so the user can select between rooms and requests.
    Methods: MainMenu() : Creates an instance of the main menu screen

 */

package view;
import javax.swing.*;

import view.request.RequestScreen;
import view.room.RoomScreen;

import java.awt.*;
import java.awt.event.ActionListener;


public class MainMenu extends Screen {
    private JLabel titleLabel = new JLabel("Welcome back user");
    //private JButton customerButton = new JButton();
    private JButton roomButton = new JButton();
    private JButton requestButton = new JButton();

    private static final Font FONT = new Font("Open Sans",Font.PLAIN,30);



    public MainMenu(){

            getBackButton().setVisible(false);

            setBackground(new Color(141, 203, 230));
            int titleX = DefaultScreen.WIDTH/2 - 350;
            int titleY = 50;

            int buttonX = DefaultScreen.WIDTH / 2 - 225;
            int buttonY = 250;


            titleLabel.setBounds(titleX,titleY,700,100);
            titleLabel.setForeground(Color.white);
            titleLabel.setFont(new Font("Calibri", Font.BOLD, 50));
            add(titleLabel);

            ImageIcon customerIcon = new ImageIcon("HotelManagement/lib/customer_icon.png");
            ImageIcon roomIcon = new ImageIcon("HotelManagement/lib/room_icon.png");
            ImageIcon requestIcon = new ImageIcon("HotelManagement/lib/request_icon.png");


            //ActionListener ae;
            roomButton.addActionListener((e)-> {
                view.room.RoomScreen rooms = new RoomScreen();
                this.setVisible(false);
                rooms.setVisible(true);
                
            });

            requestButton.addActionListener((e)->{
                view.request.RequestScreen request = new RequestScreen();
                this.setVisible(false);
                request.setVisible(true);

                
            });





/*
            customerButton.setText("Customers");
            customerButton.setOpaque(true);
            customerButton.setFont(FONT);
            customerButton.setBackground(new Color(54, 47, 217));
            customerButton.setForeground(Color.WHITE);
            customerButton.setBorder(null);
            customerButton.setBounds(buttonX,buttonY,250,125);
            add(customerButton);
*/

            roomButton.setText("Rooms");
            roomButton.setOpaque(true);
            roomButton.setFont(FONT);
            roomButton.setBackground(new Color(157, 241, 223));
            roomButton.setForeground(Color.WHITE);
            roomButton.setBorder(null);
            roomButton.setBounds(buttonX,buttonY,250,125);
            add(roomButton);


            requestButton.setText("Requests");
            requestButton.setOpaque(true);
            requestButton.setFont(FONT);
            requestButton.setBackground(new Color(255, 234, 32));
            requestButton.setForeground(Color.WHITE);
            requestButton.setBorder(null);
            requestButton.setBounds(buttonX,buttonY + 150,250,125);
            add(requestButton);


         }

    public JLabel getTitleLabel() {return titleLabel;}
    //public JButton getCustomerButton(){return customerButton;}
    public JButton getRoomButton(){return roomButton;}
    public JButton getRequestButton() {return requestButton;}



    }

