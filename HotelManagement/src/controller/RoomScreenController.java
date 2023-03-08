package controller;

import java.awt.Container;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import view.room.RoomCard;
import view.room.RoomScreen;
import javax.swing.*;

public class RoomScreenController implements ActionListener{
	
	public RoomScreen room;

	public RoomScreenController(RoomScreen room) {
		this.room = room;
		setupListeners();
	}

	private void setupListeners() {
		// TODO Auto-generated method stub
		room.getEmptyRoomsButton().addActionListener(this);
		room.getEmptyRoomsButton().addActionListener(this);
		room.getSearchRoomButton().addActionListener(this);
	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		RoomCard roomCard1 = new RoomCard();
        RoomCard roomCard2 = new RoomCard();
        RoomCard roomCard3 = new RoomCard();

		RoomScreen.getRoomContainer().add(roomCard1);
		RoomScreen.getRoomContainer().add(roomCard2);
		RoomScreen.getRoomContainer().add(roomCard3);

		if(e.getSource() == room.getSearchRoomButton()){
			new OptionPane();
		}
		else if (e.getSource() == room.getEmptyRoomsButton()){
			roomCard1.setVisible(false);
		}

		if(room.getSearchRoomButton().isSelected())
		new OptionPane();
		


		System.out.print("Buton pressed!");
	}
	public class OptionPane {  
		JFrame f;  
		OptionPane(){  
			f=new JFrame();   
			String name=JOptionPane.showInputDialog(f,"Enter Room");      
		}  



	
		//public void main(String[] args) {  
		//	new OptionPane();  
		//}  

}
}

