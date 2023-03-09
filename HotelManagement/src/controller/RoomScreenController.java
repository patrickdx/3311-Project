package controller;

//import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Rooms.Room;
import view.room.RoomCard;
import view.room.RoomScreen;

import javax.swing.*;


public class RoomScreenController implements ActionListener{
	
	public RoomScreen room;
	private ArrayList<Room> allRooms;

	
	public RoomScreenController(RoomScreen room) {
		this.room = room;
		setupListeners();

		allRooms = DBController.getRooms();

		for (Room r : allRooms) {
            RoomCard roomCard = new RoomCard(r);
            room.getRoomContainer().add(roomCard);
        }
	}

	

	private void setupListeners() {
		// TODO Auto-generated method stub
		room.getEmptyRoomsButton().addActionListener(this);
		//room.getEmptyRoomsButton().addActionListener(this);
		room.getSearchRoomButton().addActionListener(this);
	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*RoomCard roomCard1 = new RoomCard();
        RoomCard roomCard2 = new RoomCard();
        RoomCard roomCard3 = new RoomCard();

		RoomScreen.getRoomContainer().add(roomCard1);
		RoomScreen.getRoomContainer().add(roomCard2);
		RoomScreen.getRoomContainer().add(roomCard3);*/

		if(e.getSource() == room.getSearchRoomButton()){
			try{
                int room_num = Integer.parseInt(JOptionPane.showInputDialog("Enter Room Number: "));
                RoomScreen.getRoomContainer().removeAll();
                for (Room r : allRooms) {
                    if (r.getRoomID() == room_num) {
                        RoomCard roomCard = new RoomCard(r);
                        RoomScreen.getRoomContainer().add(roomCard);
                    }
                }
                room.revalidate();
                room.repaint();
            }catch (Exception ex){
                System.out.println(ex);
            }
		}
		else if (e.getSource() == room.getEmptyRoomsButton()){
			RoomScreen.getRoomContainer().removeAll();
            for (Room r : allRooms) {
                if (!r.isBooked()) {
                    RoomCard roomCard = new RoomCard(r);
                    RoomScreen.getRoomContainer().add(roomCard);
                }
            }
            room.revalidate();
            room.repaint();
        }
		}

	}
	

	
	

