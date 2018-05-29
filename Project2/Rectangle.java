/**
* @author Brendan
* @version Lab 01
* @version CPE102-03
*/

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math; 

public class Rectangle implements Shape {

	private double width;
	private double height;
	private Point position; 
	private Color color;
	private boolean filled; 

	public Rectangle(double width, double height, Point position, Color color, boolean filled) {
		this.width = width;
		this.height = height;
		this.position = position; 
		this.color = color;			
		this.filled = filled;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height; 
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Point getPosition() {
		return position;
	}

	public double getArea() {
		double area = width * height; 
		return area; 
	}

	public Color getColor() {
		return color; 
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean getFilled() {
		return filled; 
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public void move(Point point) {
		this.position.x += point.x;
		this.position.y += point.y;
	}

	public boolean equals(Object v) {

		Rectangle r2 = (Rectangle)v; 

		if (v == null) {
			return false;
		}

		else if (! (this.getClass().equals(v.getClass()))) {
			return false;
		}

		return (width == r2.getWidth() &&  height == r2.getHeight() && position.equals(r2.getPosition()) && color.equals(r2.getColor()) && filled == r2.getFilled()); 
		
		


	}
}





