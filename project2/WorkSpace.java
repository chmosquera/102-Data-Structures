/**
 * Array list that holds all objects
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

public class WorkSpace
{
   // Instance variables
   private ArrayList<Shape> Collection;

   // Default Constructor 
   public WorkSpace()
   {
      Collection = new ArrayList<Shape>();
   }

   // Methods
   public void add(Shape shape)
   {
      Collection.add(shape);
   }

   public Shape remove(int index)
   {
      if (index >= Collection.size()) {return null;}
      else 
      {
         Shape shape = Collection.get(index);
         Collection.remove(index);
         return shape;
      }
   }

   public Shape get(int index)
   {
      Shape shape = Collection.get(index);
      return shape;
   }

   public int size()
   {
      return Collection.size();
   }

   public ArrayList<Circle> getCircles()
   {
      ArrayList<Circle> CircleList = new ArrayList<Circle>();

      for (Shape shape: Collection)
      {
         if (shape instanceof Circle)
         {
            CircleList.add((Circle)shape);
         }
      }
      return CircleList;
   }

   public ArrayList<Rectangle> getRectangles()
   {
      ArrayList<Rectangle> RectangleList = new ArrayList<Rectangle>();

      for (Shape shape: Collection)
      {
         if (shape instanceof Rectangle)
         {
            RectangleList.add((Rectangle)shape);
         }
      }
      return RectangleList;
   }

   public ArrayList<Triangle> getTriangles()
   {
      ArrayList<Triangle> TriangleList = new ArrayList<Triangle>();

      for (Shape shape: Collection)
      {
         if (shape instanceof Triangle)
         {
            TriangleList.add((Triangle)shape);
         }
      }
      return TriangleList;
   }

   public ArrayList<ConvexPolygon> getConvexPolygons()
   {
      ArrayList<ConvexPolygon> ConvexPolygonList = new ArrayList<ConvexPolygon>();

      for (Shape shape: Collection)
      {
         if (shape instanceof ConvexPolygon)
         {
            ConvexPolygonList.add((ConvexPolygon)shape);
         }
      }
      return ConvexPolygonList;
   }

   public ArrayList<Shape> getShapesByColor(Color color)
   {
      ArrayList<Shape> ColorList = new ArrayList<Shape>();
      for (Shape shape: Collection)
      {
         if (shape.getColor().equals(color))
         {
            ColorList.add(shape);
         }
      }
      return ColorList;
   }

   public double getAreaOfAllShapes()
   {
      double totalArea = 0;
      for (Shape shape : Collection)
         {
            totalArea += shape.getArea();
         }
      return totalArea;
   }


}
