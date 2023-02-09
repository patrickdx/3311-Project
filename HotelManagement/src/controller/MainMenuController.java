package controller;
import view.MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController implements ActionListener {

	private MainMenu screen;
	
	public MainMenuController(MainMenu main) {
		screen = main;
		screen.getCustomerButton().addActionListener(this);
		screen.getRoomButton().addActionListener(this);
		screen.getGetCustomerButton().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
