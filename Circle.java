package lab1package;


import java.awt.Color;


public class Circle {
	private double radius;
	private Color color;
	
	public Circle() {
		setRadius(1.0);
		setColor(Color.blue);
	}
	public Circle(double radius, Color color) {
		if(radius < 0.0) {
			throw new IllegalArgumentException();
		}
		this.setColor(color);
		this.setRadius(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
}
