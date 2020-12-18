package oopp1;

public class GeometricObjects {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObjects() {
		dateCreated = new java.util.Date();
	}
	
	public GeometricObjects(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public String toString() {
		return "Created on " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
	}
}
