/**
 * Characteristics of Circle
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

public class Circle implements Shape
{
   // Instance variables
   private double radius;
   private Point position;
   private Color color;
   private boolean filled;


   // Constructor
   public Circle(double radius, Point position, Color color, boolean filled)
   {
      this.radius = radius;
      this.position = position;
      this.color = color;
      this.filled = filled;
   }

   // Shape Methods 
   public double getArea() 
   {
      double area = Math.PI * Math.pow(radius,2);
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
      ((Point)position).translate((int)point.getX(), (int)point.getY());
   }

   // Circle Methods
   public double getRadius() {return radius;}
   
   public void setRadius(double radius) {this.radius = radius;}

   public Point getPosition() {return position;}

   public boolean equals(Object other)
   {
      if (other == null) {return false;}

      if (!this.getClass().equals(other.getClass())) {return false;}

      return radius == ((Circle)other).getRadius() && 
             position.equals( ((Circle)other).getPosition() ) &&
             color.equals( ((Circle)other).getColor() ) && 
             filled == ((Circle)other).getFilled(); 
             
   }

}
