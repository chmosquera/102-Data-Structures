/**
* @author Brendan
* @version Lab 01
* @version CPE102-03
*/

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math; 

public class WorkSpace {

	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	private ArrayList<Circle> cList = new ArrayList<Circle>();
	private ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
	private ArrayList<Triangle> tList = new ArrayList<Triangle>();
	private ArrayList<ConvexPolygon> cpList = new ArrayList<ConvexPolygon>();
	private ArrayList<Shape> areaList = new ArrayList<Shape>();



	public WorkSpace() {

	}

	public void add(Shape shape) {
		shapeList.add(shape);
	}

	public Shape remove(int index) {
		if (index > shapeList.size()) {
			return null; 
		}

		else {
			Shape shapeCopy = shapeList.get(index);
			shapeList.remove(index);
			return shapeCopy;
			} 
	}

	public Shape get(int index) {
		return shapeList.get(index);
	}

	public int size() {
		return shapeList.size();
	}

	public ArrayList<Circle> getCircles() {
		for (Shape s: shapeList) {
			if (s instanceof Circle) {
				cList.add((Circle)s);
			}
		}

		return cList;
	}

	public ArrayList<Rectangle> getRectangles() {
		for (Shape r: shapeList) {
			if (r instanceof Rectangle) {
				rList.add((Rectangle)r);
			}
		}

		return rList;

	}

	public ArrayList<Triangle> getTriangles() {
		for (Shape t: shapeList) {
			if (t instanceof Triangle) {
				tList.add((Triangle)t);
			}
		}

		return tList;

	}

	public ArrayList<ConvexPolygon> getConvexPolygons() {
		for (Shape cp: shapeList) {
			if (cp instanceof ConvexPolygon) {
				cpList.add((ConvexPolygon)cp);
				
			}

		}

			return cpList;

	}

	public ArrayList<Shape> getShapesByColor(Color color) {
		
		ArrayList<Shape> colorList = new ArrayList<Shape>();

		for (Shape s: shapeList) {
			if (s.getColor().equals(color)) {
				colorList.add(s);
			}
		}

		return colorList; 

	}

	public double getAreaOfAllShapes() {
		double a = 0; 
		for (Shape s: shapeList) {
			a += s.getArea(); 
		}

		return a; 

	}















}