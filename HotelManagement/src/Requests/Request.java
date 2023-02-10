package Requests;

import java.util.List;
import Rooms.Booking;

public class Request {
	private static int idCount;
	private int id;
	private String message;
	private float cost;
	private boolean isCompleted;
	private Booking booking;

	public Request(String message, Booking booking) {
		id = idCount;
		this.booking = booking;
		this.message = message;
		cost = 0;
		isCompleted = false;
		idCount++;
	}
	
	public Request(String message, float cost, Booking booking) {
		id = idCount;
		this.message = message;
		this.cost = 0;
		isCompleted = false;
		idCount++;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	

}
