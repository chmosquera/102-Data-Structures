/**
* @author Brendan
* @version Lab 01
* @version CPE102-03
*/

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math; 

public class Triangle implements Shape {

	private Point a;
	private Point b;
	private Point c;
	private Color color;
	private boolean filled; 

	public Triangle(Point a, Point b, Point c, Color color, boolean filled) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.color = color;
		this.filled = filled; 
	}

	public Point getVertexA() {
		return a;
	}
 
	public void setVertexA(Point point){
		a = point; 
	}

	public Point getVertexB() {
		return b;
	}

	public void setVertexB(Point point) {
		b = point; 
	}

	public Point getVertexC() {
		return c;
	}

	public void setVertexC(Point point) {
		c = point; 
	}

	public double getArea() {
		double area = Math.abs((a.getX()*(b.getY() - c.getY()) + b.getX()*(c.getY() - a.getY()) + c.getX()*(a.getY() - b.getY())) / 2);
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
		a.x += point.x;
		a.y += point.y;
		b.x += point.x;
		b.y += point.y;
		c.x += point.x;
		c.y += point.y; 
	}


	public boolean equals(Object v) {

		Triangle t2 = (Triangle)v;

		if (v == null) {
			return false;
		}
		
		if (! (this.getClass().equals(v.getClass()))) {
			return false;
		}

		return (a.equals(t2.getVertexA()) && b.equals(t2.getVertexB()) && c.equals(t2.getVertexC()) && color.equals(t2.getColor()) && filled == t2.getFilled());  
			
		


	}






}