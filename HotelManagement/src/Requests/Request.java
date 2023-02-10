package Requests;

public class Request {
	private int id;
	private String message;
	private float cost;
	private boolean isCompleted;

	public Request(int id, String message) {
		this.id = id;
		this.message = message;
		cost = 0;
		isCompleted = false;
	}
	
	public Request(int id, String message, float cost) {
		this.id = id;
		this.message = message;
		this.cost = 0;
		isCompleted = false;
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
