package view;
import javax.swing.*;

import java.awt.*;

public class CustomerScreen extends Screen{
    private JLabel titleLabel = new JLabel("Customer Options");
    private JButton addCustomerButton = new JButton();
    private JButton removeCustomerButton = new JButton();

    private static final Font FONT = new Font("Open Sans",Font.PLAIN,20);

    public CustomerScreen(){
        setBackground(new Color(141, 203, 230));

        titleLabel.setBounds(70,50,700,100);
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 50));
        add(titleLabel);

        addCustomerButton.setText("Add a customer");
        addCustomerButton.setOpaque(true);
        addCustomerButton.setFont(FONT);
        addCustomerButton.setBackground(new Color(54, 47, 217));
        addCustomerButton.setForeground(Color.white);
        addCustomerButton.setBorder(null);
        addCustomerButton.setBounds(600,200,250,125);
        add(addCustomerButton);

        removeCustomerButton.setText("Remove customer");
        removeCustomerButton.setOpaque(true);
        removeCustomerButton.setFont(FONT);
        removeCustomerButton.setBackground(new Color(54, 47, 217));
        removeCustomerButton.setForeground(Color.white);
        removeCustomerButton.setBorder(null);
        removeCustomerButton.setBounds(600,400,250,125);
        add(removeCustomerButton);



    }

    public JLabel getTitleLabel(){return titleLabel;}
    public JButton getAddCustomerButton(){return addCustomerButton;}
    public JButton getRemoveCustomerButton(){return removeCustomerButton;}
}
