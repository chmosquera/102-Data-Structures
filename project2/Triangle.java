/**
 * Characteristics of a Triangle
 *
 * @author Chanelle Mosquera
 * @version Project2
 * @version CPE102-15
 * @version Spring 2016
 */

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math;

public class Triangle implements Shape
{
   // Instance variables
   private Point a;
   private Point b;
   private Point c;
   private Color color;
   private boolean filled;

   // Constructor
   public Triangle(Point a, Point b, Point c, Color color, boolean filled)
   {
      this.a = a;
      this.b = b;
      this.c = c;
      this.color = color;
      this.filled = filled;
   }

   // Shape methods
   public double getArea() 
   {
      int Ax = (int)a.getX(); 
      int Ay = (int)a.getY();    
      int Bx = (int)b.getX();    
      int By = (int)b.getY();  
      int Cx = (int)c.getX();     
      int Cy = (int)c.getY();       
      double area = Math.abs( ( (Ax*(By-Cy)) + (Bx*(Cy-Ay)) + (Cx*(Ay - By)) ) / 2.0 );
      return area;
   }

   public Color getColor() {return color;}

   public void setColor(Color color) 
   {
      this.color = color;
   }

   public boolean getFilled() {return filled;}

   public void setFilled(boolean filled) 
   {
      this.filled = filled;
   }

   public void move(Point point) 
   {
      ((Point)a).translate((int)point.getX(), (int)point.getY());
      ((Point)b).translate((int)point.getX(), (int)point.getY());
      ((Point)c).translate((int)point.getX(), (int)point.getY());
   }

   // Triangle methods
   public Point getVertexA() {return a;}
   
   public void setVertexA(Point point) { a = point;}

   public Point getVertexB() {return b;}

   public void setVertexB(Point point) {b = point;}

   public Point getVertexC() {return c;}

   public void setVertexC(Point point) {c = point;}

   public boolean equals(Object other)
   {
      if (other == null) {return false;}

      if (!this.getClass().equals(other.getClass())) {return false;}

      Triangle t = ((Triangle)other);
      return a.equals(t.getVertexA()) &&
             b.equals(t.getVertexB()) &&
             c.equals(t.getVertexC()) &&
             color.equals(t.getColor()) &&
             filled == t.getFilled();
   }

}
