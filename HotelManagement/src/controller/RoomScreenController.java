package controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import Inventory.Item;
import Inventory.ItemRepository;
import Rooms.Room;
import view.room.RoomCard;
import view.room.RoomScreen;
import javax.swing.*;

public class RoomScreenController implements ActionListener{
	
	public RoomScreen room;
	public DBController db;

	private ArrayList<Room> roomList;

	private ArrayList<RoomCard> roomCards;


	public RoomScreenController(RoomScreen room) {

		roomList = db.getRooms();

		for(int i = 0; i < roomList.size(); i++){
			roomCards.set(i, new RoomCard(roomList.get(i)));
		}

		for(int i = 0; i < roomCards.size(); i++){
			room.getRoomContainer().add(roomCards.get(i));
		}


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





		//RoomScreen.getRoomContainer().add(roomCard1);
		//RoomScreen.getRoomContainer().add(roomCard2);
		//RoomScreen.getRoomContainer().add(roomCard3);



		if(e.getSource() == room.getSearchRoomButton()){
			new OptionPane1();
		}
		else if (e.getSource() == room.getEmptyRoomsButton()){
			room.getRoomContainer().setVisible(false);
		}

		if(room.getSearchRoomButton().isSelected())
		new OptionPane1();

		// Ability to view items in a room

		for(int i = 0; i < roomList.size(); i++){
			if(e.getSource() == roomCards.get(i).getItemListButton()){
				new OptionPane2(roomList.get(i).getItem());
			}
		}
		


		System.out.print("Buton pressed!");
	}
	public class OptionPane1 {
		JFrame f;  
		OptionPane1(){
			f=new JFrame();   
			String name=JOptionPane.showInputDialog(f,"Enter Room");      
		}  



	
		//public void main(String[] args) {  
		//	new OptionPane();  
		//}  

}

public class OptionPane2{
	JFrame f;

	public OptionPane2(ItemRepository item) {
	}


	void OptionPane1(ItemRepository item){
		f = new JFrame();
		JOptionPane.showMessageDialog(null, "Items");
	}
}
}

