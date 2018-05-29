/**
 * Characteristics of a Convex Polygon
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

public class ConvexPolygon implements Shape
{
   // Instance Variables
   private Point[] vertices = new Point[0];
   private Color color;
   private boolean filled;

   // Constructor
   public ConvexPolygon(Point[] vertices, Color color, boolean filled)
   {
    this.vertices = vertices;
    this.color = color;
    this.filled = filled;
   }

   // Shape Methods
   public double getArea()
   {
      double area = 0.0;
      double total = 0.0;
      double total2 = 0.0;
      for (int index=0; index < vertices.length; index++)
      {
         if (index == (vertices.length - 1))
         {
            double x = vertices[index].getX();
            double y = vertices[0].getY();
            double x2 = vertices[0].getX();
            double y2 = vertices[index].getY();
            total = total + (x * y);
            total2 = total2 + (x2 * y2);
         }
         else
         {
            double x = vertices[index].getX();
            double y = vertices[index + 1].getY();
            double x2 = vertices[index + 1].getX();
            double y2 = vertices[index].getY();
            total = total + (x * y);
            total2 = total2 + (x2 * y2);
         }
      }
      area = Math.abs(.5 * (total - total2));
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
      for (Point p: vertices)
      {
         ((Point)p).translate((int)point.getX(), (int)point.getY());
      }
   }

   // ConvexPolygon Methods
   public Point getVertex(int index)
   {
      return vertices[index];
   }

   public void setVertex(int index, Point point)
   {
      vertices[index] = point;
   }

   public boolean equals(Object other)
   {
      if (other == null) {return false;}

      if (!this.getClass().equals(other.getClass())) {return false;}

      ConvexPolygon cp = ((ConvexPolygon)other);
      
      for (int i=0; i < vertices.length; i++)
      {
         if ( !((Point)this.vertices[i]).equals(((Point)cp.getVertex(i))) ) {return false;}
      }

      return color.equals(cp.getColor()) &&
             filled == cp.getFilled();
   }
}
