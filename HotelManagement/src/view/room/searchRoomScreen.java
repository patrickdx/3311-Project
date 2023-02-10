package view.room;

import javax.swing.*;

public class searchRoomScreen{

    private JFrame window = new JFrame();
    private JButton searchButton = new JButton();

    public searchRoomScreen(){
        window.setSize(200,200);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        JOptionPane.showInputDialog(null, "Search  room");
    }


}
