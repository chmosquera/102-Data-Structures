/**
 * Characteristics of Rectangle
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

public class Rectangle implements Shape
{
   // Instance variables
   private double width;
   private double height;
   private Point position;
   private Color color;
   private boolean filled;

   // Constructor 
   public Rectangle(double width, double height, Point position, Color color, boolean filled)
   {
      this.width = width;
      this.height = height;
      this.position = position;
      this.color = color;
      this.filled = filled;
   }

   // Shape methods
   public double getArea() 
   {
      double area = Math.abs(width*height);
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

   // Rectangle methods
   public double getWidth() {return width;}

   public void setWidth(double width) {this.width = width;}

   public double getHeight() {return height;}

   public void setHeight(double height) {this.height = height;}

   public Point getPosition() {return position;}

   public boolean equals(Object other)
   {
   {
      if (other == null) {return false;}

      if ( !(this.getClass().equals(other.getClass())) ) {return false;}

      Rectangle r = ((Rectangle)other);
      return width == r.getWidth() && 
             height == r.getHeight() &&
             position.equals( r.getPosition() ) &&
             color.equals( r.getColor() ) &&
             filled == ( r.getFilled() );
   }
   }

}
