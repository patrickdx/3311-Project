package controller;
import view.MainMenu;
import view.customer.CustomerScreen;
import view.DefaultScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Rooms.Search.TypeOfScreen;

public class MainMenuController implements ActionListener {

	private static DefaultScreen defaultScreen;
	private MainMenu main;
	private CustomerScreen customScreen;
	
	/*public MainMenuController(MainMenu main) {
		screen = main;
		screen.getCustomerButton().addActionListener(this);
		screen.getRoomButton().addActionListener(this);
		screen.getGetCustomerButton().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (screen.getCustomerButton().isSelected()){
			CustomerScreen screen = new CustomerScreen();
        	defaultScreen.add(screen);
        	defaultScreen.setVisible(true);
			//customScreen().setEnabled(true);

		}

	}*/


	public MainMenuController(MainMenu main){
		this.main=main;
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
			//ApplicationController.screenSwitching(ApplicationController.screens[TypeOfScreen.ROOM_SCREEN.getNumber()]);

		}
		
	}



}
