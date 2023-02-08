package view;
import javax.swing.*;
import java.awt.*;
public class RequestScreen extends Screen  {
    private JLabel titleLabel = new JLabel();
    private JButton addRequestButton = new JButton();
    private JButton cancelRequestButton = new JButton();

    private JButton viewRequestsButton = new JButton();

    private static final Font FONT = new Font("Open Sans",Font.PLAIN,20);

    public RequestScreen(){
        titleLabel.setBounds(70,50,700,100);
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 50));
        add(titleLabel);

        addRequestButton.setText("Add a request");
        addRequestButton.setOpaque(true);
        addRequestButton.setFont(FONT);
        addRequestButton.setBackground(new Color(54, 47, 217));
        addRequestButton.setForeground(Color.white);
        addRequestButton.setBorder(null);
        addRequestButton.setBounds(600,200,250,125);
        add(addRequestButton);

        cancelRequestButton.setText("Remove a request");
        cancelRequestButton.setOpaque(true);
        cancelRequestButton.setFont(FONT);
        cancelRequestButton.setBackground(new Color(54, 47, 217));
        cancelRequestButton.setForeground(Color.white);
        cancelRequestButton.setBorder(null);
        cancelRequestButton.setBounds(600,200,250,125);
        add(addRequestButton);

        viewRequestsButton.setText("View all requests");
        viewRequestsButton.setOpaque(true);
        viewRequestsButton.setFont(FONT);
        viewRequestsButton.setBackground(new Color(54, 47, 217));
        viewRequestsButton.setForeground(Color.white);
        viewRequestsButton.setBorder(null);
        viewRequestsButton.setBounds(600,200,250,125);
        add(viewRequestsButton);




    }

    public JLabel getTitleLabel(){return titleLabel;}

    public JButton getAddRequestButton(){return addRequestButton;}

    public JButton getCancelRequestButton(){return cancelRequestButton;}

    public JButton getViewRequestsButton(){return viewRequestsButton;}


}
