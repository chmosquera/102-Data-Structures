/**
* @author Brendan
* @version Lab 01
* @version CPE102-03
*/

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math; 

public class ConvexPolygon implements Shape {

	private Color color;
	private boolean filled; 
	private Point[] vertices;


	public ConvexPolygon(Point[] vertices, Color color, boolean filled) {
		this.color = color; 
		this.filled = filled;
		this.vertices = vertices;   
	}

	public Point getVertex(int index) {
		return vertices[index];
	}

	public void setVertex(int index, Point point) {
		vertices[index] = point;
	}

	public double getArea() {

		double area = 0;
		double t1 = 0;
		double t2 = 0;

		for(int i = 0; i < vertices.length; i ++) {

			if (i == (vertices.length -1)) {
				double xcoord  = vertices[i].getX();
				double ycoord  = vertices[0].getY();
				double xcoord2 = vertices[0].getX();
				double ycoord2 = vertices[i].getY();
				t1 += (xcoord  * ycoord);
				t2 += (xcoord2 * ycoord2);
				}

			else {
				double xcoord = vertices[i].getX();
				double ycoord = vertices[i + 1].getY();
				double xcoord2 = vertices[i + 1].getX();
				double ycoord2 = vertices[i].getY();
				t1 += (xcoord * ycoord);
				t2 += (xcoord2 * ycoord2);
				} 

			}

			area = Math.abs(.5 * (t1 - t2));
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
		for(int i = 0; i < vertices.length; i++) {
			((Point)vertices[i]).translate((int)point.getX(), (int)point.getY());
		}
	}

	public boolean equals(Object v) {

		ConvexPolygon cp2 = (ConvexPolygon)v;

		if (v == null) {
			return false;
		}
		
		else if (! (this.getClass().equals(v.getClass()))) {
			return false;
		}

		for (int i = 0; i < vertices.length; i ++) {
			if (! (vertices[i].equals(cp2.getVertex(i)))) {
				return false; 
			}
		}	   

		if (color.equals(cp2.getColor()) &&  filled == cp2.getFilled()) {
			return true;
		}

		else 
			return false; 
	}


}