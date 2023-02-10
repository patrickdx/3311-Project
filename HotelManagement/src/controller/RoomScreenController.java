package controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

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
		if(room.getSearchRoomButton().isSelected())
			System.out.print("Buton pressed!");
	}

}
