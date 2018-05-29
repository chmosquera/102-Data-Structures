/**
* @author Brendan
* @version Lab 01
* @version CPE102-03
*/

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math; 

public class Circle implements Shape {

	private double radius;
	private Color color;
	private Point position; 
	private boolean filled; 


	Circle(double radius, Point position, Color color, boolean filled) {

		this.radius = radius;
		this.position = position; 
		this.color = color;			
		this.filled = filled;

	}


		public double getRadius() {
			return radius; 
		}

		public void setRadius(double radius) {
			this.radius = radius; 
		}

		public Point getPosition() {
			return position;
		}

		public double getArea() {
			double area = Math.PI * Math.pow(radius, 2);
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

			Circle c2 = (Circle)v;

			if (v == null) {
				return false;
			}

			else if (! (this.getClass().equals(v.getClass()))) {
				return false;
			}

			else if (radius == c2.getRadius() && color.equals(c2.getColor()) && filled == c2.getFilled() && position.equals(c2.getPosition()) ) {
				return true;
			}

			else 
				return false; 
		}


}	






