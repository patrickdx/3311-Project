package Controller;

import view.RequestScreen;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RequestController  implements ActionListener{
	
	public RequestScreen request;
		
	
	public RequestController(RequestScreen request) {
		this.request = request;
		setupListeners();
	}

	private void setupListeners() {
		// TODO Auto-generated method stub
		request.getAddRequestButton().addActionListener(this);
		request.getCancelRequestButton().addActionListener(this);
		request.getViewRequestsButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
