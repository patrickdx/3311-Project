package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import view.RoomScreen;


public class RoomScreenController implements ActionListener{
	
	public RoomScreen room;
	
	public RoomScreenController(RoomScreen room) {
		this.room = room;
		setupListeners();
	}

	private void setupListeners() {
		// TODO Auto-generated method stub
		room.getEmptyRoomsButton().addActionListener(this);
		room.getNumberOfEmptyRoomsButton().addActionListener(this);
		room.getSearchRoomButton().addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
