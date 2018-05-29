import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math;


public class Driver
{
   public static void main(String args[])
   {

      Point p_Rectangle = new Point(0,0);
      Point p1 = new Point(1,0);
      Point p2 = new Point(5,5);


      /*________CIRCLE TESTS__________*/
      System.out.println("CIRCLES");

      Circle c1 = new Circle(2.0, new Point(1,0), Color.black, false);
      Circle c2 = new Circle(2.0, new Point(1,0), Color.black, false);
      Circle c3 = new Circle(2.0, new Point(2,0), Color.black, false);
      
     
      System.out.println("Equals: " + c2.equals(c3));
      System.out.println("Area: " + c1.getArea());
      System.out.println("Color: " + c1.getColor());
      System.out.println("Got Filled? " + c1.getFilled());
      c1.setColor(Color.black);
      System.out.println("New Color: " + c1.getColor());
      c1.setFilled(c1.getFilled());
      System.out.println("Got Filled Now? " + c1.getFilled());
      System.out.println("Position" + c1.getPosition());
      c1.move(p1);
      System.out.println("New Position" + c1.getPosition());
      System.out.println("Radius: " + c1.getRadius());
      c1.setRadius(5.0);
      System.out.println("Radius: " + c1.getRadius());
      

     
 
      /*________RECTANGLE TESTS__________*/
      System.out.println();
      System.out.println("RECTANGLES");


      Rectangle r1 = new Rectangle(1 ,1, p_Rectangle, Color.black, false);
      Rectangle r2 = new Rectangle(1 ,1, p_Rectangle, Color.black, false);

      System.out.println("Equals: " + r1.equals(r2));
      System.out.println("Area: " + r1.getArea());
      System.out.println("Color: " + r1.getColor());
      System.out.println("Got Filled? " + r1.getFilled());
      r1.setColor(Color.black);
      System.out.println("New Color: " + r1.getColor());
      r1.setFilled(r1.getFilled());
      System.out.println("Got Filled Now? " + r1.getFilled());
      System.out.println("Position: "  + r1.getPosition());
      r1.move(p2);
      System.out.println("New Position: " + r1.getPosition());
      System.out.println("Width: " + r1.getWidth());
      r1.setWidth(3.0);
      System.out.println("Width: " + r1.getWidth());
      System.out.println("Height: " + r1.getHeight());
      r1.setHeight(2.0);
      System.out.println("Height: " + r1.getHeight());


      /*________TRIANGLE TESTS__________*/
      System.out.println();
      System.out.println("TRIANGLES");
/*
      Triangle t1 = new Triangle(new Point(0,0), new Point(1,0), new Point(0,1), null, false);

      System.out.println("Area: " + t1.getArea());
      System.out.println("Color: " + t1.getColor());
      System.out.println("Got Filled? " + t1.getFilled());
      t1.setColor(Color.black);
      System.out.println("New Color: " + t1.getColor());
      t1.setFilled(t1.getFilled());
      System.out.println("Got Filled Now? " + t1.getFilled());
      System.out.println("Vertex A: "  + t1.getVertexA());
      System.out.println("Vertex B: "  + t1.getVertexB());
      System.out.println("Vertex C: "  + t1.getVertexC());
      t1.move(p2);
      System.out.println("New Vertex A: "  + t1.getVertexA());
      System.out.println("New Vertex B: "  + t1.getVertexB());
      System.out.println("New Vertex C: "  + t1.getVertexC()); */

      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(0,1), Color.BLACK, false);
      System.out.println("--->" + t.getArea());


      /*________CONVEXPOLYGON TESTS__________*/
      System.out.println();
      System.out.println("ConvexPolygon");

      Point[] points = new Point[4];
      points[0] = new Point(0,0);
      points[1] = new Point(1,0);
      points[2] = new Point(1,1);
      points[3] = new Point(0,1);

      Point[] points1 = new Point[4];
      points[0] = new Point(0,0);
      points[1] = new Point(1,0);
      points[2] = new Point(1,9);
      points[3] = new Point(0,1);


      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false); // Original
      ConvexPolygon cp1 = new ConvexPolygon(points, Color.BLACK, false);  // Same
      ConvexPolygon cp2 = new ConvexPolygon(points1, Color.BLACK, false);  // Different

      System.out.println("Equal - cp = cp1: " + cp.equals(cp1));
      System.out.println("Equal - cp = cp2: " + cp.equals(cp2));
      System.out.println("Lengh: " + cp.Length());



     System.out.println("Length of list: " + cp.Length());
     System.out.println("Area: " + cp.getArea());


   }
}

