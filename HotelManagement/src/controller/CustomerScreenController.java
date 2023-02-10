package controller;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import view.customer.CustomerScreen;




public class CustomerScreenController implements ActionListener{
	
	public CustomerScreen customer;
	
	public CustomerScreenController(CustomerScreen customer) {
		this.customer = customer;
		setupListeners();
	}
	
	

	private void setupListeners() {
		// TODO Auto-generated method stub
		customer.getAddCustomerButton().addActionListener(this);
		customer.getRemoveCustomerButton().addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
