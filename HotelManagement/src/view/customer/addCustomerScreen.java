package view.customer;

import view.DefaultScreen;
import view.Screen;

import javax.swing.*;
import java.awt.*;

public class addCustomerScreen extends Screen {

    private static final Font FONT = new Font("Open Sans",Font.PLAIN,20);

    private JTextField nameField = new JTextField();

    private JTextField roomField = new JTextField();
    private JTextField ageField = new JTextField();
    private JTextField sinField = new JTextField();
    private JTextField durationOfStayField = new JTextField();
    private JTextField dateBookedField = new JTextField();
    private JTextField checkInDateField = new JTextField();
    private JTextField checkOutDateField = new JTextField();

    private JLabel nameLabel = new JLabel("Name: ");
    private JLabel roomLabel = new JLabel("Room id: ");
    private JLabel ageLabel = new JLabel("Age: ");
    private JLabel sinLabel = new JLabel("SIN: ");
    private JLabel durationOfStayLabel = new JLabel("Duration: ");
    private JLabel dateBookedLabel = new JLabel("Date booked: ");
    private JLabel checkInDateLabel = new JLabel("Check-in Date ");
    private JLabel checkOutDateLabel = new JLabel("Check-out Date: ");

    private JButton addCustomerInfoButton = new JButton();

    public addCustomerScreen(){
        int LABEL_X = DefaultScreen.WIDTH / 2 - 250;
        int LABEL_Y = 50;

        int FIELD_X = LABEL_X + 250;
        int FIELD_Y = 80;

        int BUTTON_X = DefaultScreen.WIDTH/2 - 75;
        int BUTTON_Y = 675;

        setBackground(new Color(102, 153, 204));

        nameLabel.setBounds(LABEL_X,LABEL_Y,700,100);
        nameLabel.setForeground(Color.white);
        nameLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        add(nameLabel);

        ageLabel.setBounds(LABEL_X,LABEL_Y+75,700,100);
        ageLabel.setForeground(Color.white);
        ageLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        add(ageLabel);

        sinLabel.setBounds(LABEL_X,LABEL_Y+150,700,100);
        sinLabel.setForeground(Color.white);
        sinLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        add(sinLabel);

        durationOfStayLabel.setBounds(LABEL_X,LABEL_Y+225,700,100);
        durationOfStayLabel.setForeground(Color.white);
        durationOfStayLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        add(durationOfStayLabel);

        dateBookedLabel.setBounds(LABEL_X,LABEL_Y+300,700,100);
        dateBookedLabel.setForeground(Color.white);
        dateBookedLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        add(dateBookedLabel);

        checkInDateLabel.setBounds(LABEL_X,LABEL_Y+375,700,100);
        checkInDateLabel.setForeground(Color.white);
        checkInDateLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        add(checkInDateLabel);


        checkOutDateLabel.setBounds(LABEL_X,LABEL_Y+450,700,100);
        checkOutDateLabel.setForeground(Color.white);
        checkOutDateLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        add(checkOutDateLabel);

        roomLabel.setBounds(LABEL_X,LABEL_Y+525,700,100);
        roomLabel.setForeground(Color.white);
        roomLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        add(roomLabel);



        nameField.setForeground(Color.GRAY);
        nameField.setBounds(FIELD_X, FIELD_Y, 200,40);
        add(nameField);
        nameField.setColumns(10);



        ageField.setForeground(Color.GRAY);
        ageField.setBounds(FIELD_X, FIELD_Y+75, 200,40);
        add(ageField);
        ageField.setColumns(10);

        sinField.setForeground(Color.GRAY);
        sinField.setBounds(FIELD_X, FIELD_Y+150, 200,40);
        add(sinField);
        sinField.setColumns(10);

        durationOfStayField.setForeground(Color.GRAY);
        durationOfStayField.setBounds(FIELD_X, FIELD_Y+225, 200,40);
        add(durationOfStayField);
        durationOfStayField.setColumns(10);

        dateBookedField.setForeground(Color.GRAY);
        dateBookedField.setBounds(FIELD_X, FIELD_Y+300, 200,40);
        add(dateBookedField);
        dateBookedField.setColumns(10);

        checkInDateField.setForeground(Color.GRAY);
        checkInDateField.setBounds(FIELD_X, FIELD_Y+375, 200,40);
        add(checkInDateField);
        dateBookedField.setColumns(10);

        checkOutDateField.setForeground(Color.GRAY);
        checkOutDateField.setBounds(FIELD_X, FIELD_Y+450, 200,40);
        add(checkOutDateField);
        dateBookedField.setColumns(10);

        roomField.setForeground(Color.GRAY);
        roomField.setBounds(FIELD_X, FIELD_Y+525, 200,40);
        add(roomField);
        roomField.setColumns(10);

        addCustomerInfoButton.setText("ADD");
        addCustomerInfoButton.setOpaque(true);
        addCustomerInfoButton.setFont(FONT);
        addCustomerInfoButton.setBackground(new Color(54, 47, 217));
        addCustomerInfoButton.setForeground(Color.white);
        addCustomerInfoButton.setBorder(null);
        addCustomerInfoButton.setBounds(BUTTON_X,BUTTON_Y,150,75);
        add(addCustomerInfoButton);




    }

    public JTextField getNameField(){return nameField;}
    public JTextField getAgeField(){return ageField;}
    public JTextField getSinField(){return sinField;}
    public JTextField getDurationOfStayField(){return durationOfStayField;}
    public JTextField getDateBookedField(){return dateBookedField;}
    public JTextField getCheckInDateField(){return checkInDateField;}
    public JTextField getCheckOutDateField(){return checkOutDateField;}

    public JButton getAddCustomerInfoButton(){ return addCustomerInfoButton;}

}
