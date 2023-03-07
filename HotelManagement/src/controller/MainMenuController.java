package controller;
import view.MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Rooms.Search.TypeOfScreen;

public class MainMenuController implements ActionListener {

	private MainMenu main;

	public MainMenuController(MainMenu main) {
		this.main = main;
		setupListeners();
	}


	public void setupListeners(){
		main.getRoomButton().addActionListener(this);
		main.getRequestButton().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource() == main.getRoomButton()){
			ApplicationController.screenSwitching(ApplicationController.screens[TypeOfScreen.ROOM_SCREEN.getNumber()]);
			//Example on how to create a room card. This should be moved to a controller class and this comment removed.
        /*RoomCard roomCard1 = new RoomCard();
        RoomCard roomCard2 = new RoomCard();
        RoomCard roomCard3 = new RoomCard();

		container.add(roomCard1);
        container.add(roomCard2);
        container.add(roomCard3);
*/
         
		}else if(e.getSource() == main.getRequestButton()){
			ApplicationController.screenSwitching(ApplicationController.screens[TypeOfScreen.REQUEST_SCREEN.getNumber()]);
		}

	}

}
////push