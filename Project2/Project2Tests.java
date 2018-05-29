/**
 * A simple JUnit test class to test the Project 2 shape classes and interface.
 * This test is very incomplete.  Many of the tests are trivial, or test nothing
 * but that the code will compile.  You should ADD to this tester.
 *
 * @author Julie Workman
 * @version 4/11/2016 (Written to JUnit-4.12)
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.util.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Project2Tests
{   
   @Rule
   public TestRule watcher = new TestWatcher() {
      protected void starting(Description description) {
         System.out.print("Starting: " + description.getMethodName() + "...");
      }
   };
   
   @Rule
   public Stopwatch sw = new Stopwatch() {
      protected void finished(long nanos, Description description) {
         System.out.println(" (" + runtime(TimeUnit.MILLISECONDS) + " ms)");
      }
      protected void succeeded(long nanos, Description description) {
         System.out.print("Passed");
      }
      protected void failed(long nanos, Throwable e, Description description) {
         System.out.print("Failed");
      }
   };
   
   /* ------------------------------ Circle Tests ---------------------------*/
   
   /* Circle Constructor test */
   @Test (timeout = 5000)
   public void circleConstructorTest_1()
   {
      Circle c = new Circle(3.2, new Point(0,0), Color.BLACK, false);
      
      assertEquals(3.2, c.getRadius(), .000001);
      assertEquals(new Point(0,0), c.getPosition());
      assertEquals(Color.BLACK, c.getColor());
      assertFalse(c.getFilled());
   }
   

   /* Circle Set test */
   @Test (timeout = 5000)
   public void circleSetTest()
   {
      Circle c = new Circle(3.2, new Point(0,0), Color.BLACK, false);
      
      // Note that this isn't actually asserting anything!  I just call them to make sure they compile.
      // You might want to add some asserts here.
      c.setRadius(5.0);
      c.setColor(Color.BLUE);
      c.setFilled(true);

      assertEquals(5.0, c.getRadius(), .0000001);
      assertEquals(Color.BLUE, c.getColor());
      assertEquals(true, c.getFilled());
      assertEquals(new Point(0,0), c.getPosition());
   }
   
   /* Circle Move test */
   @Test (timeout = 5000)
   public void circleMoveTest()
   {
      Circle c = new Circle(3.2, new Point(0,0), Color.BLACK, false);
      
      c.move(new Point(0,0));
      assertEquals(new Point(0,0), c.getPosition());	// Origin

      c.move(new Point(1,2));
      assertEquals(new Point(1,2), c.getPosition());	// (+,+)
   
      c.move(new Point(-3,-5));
      assertEquals(new Point(-2,-3), c.getPosition());	// (-,-)

      c.move(new Point(1,10));
      assertEquals(new Point(-1,7), c.getPosition()); // (-,+)

      c.move(new Point(3,-8));
      assertEquals(new Point(2,-1), c.getPosition());	// (+,-)
   }
   
   /* Circle Area test */
   @Test (timeout = 5000)
   public void circleAreaTest()
   {
      Circle c = new Circle(1.0, new Point(0,0), Color.BLACK, false);
      
      assertEquals(Math.PI, c.getArea(), .000001);

      c.setRadius(5.0);
      assertEquals(25 * Math.PI, c.getArea(), .0000001);

      c.setRadius(0.0);
      assertEquals(0.0, c.getArea(), .000001);
   }
   
   /* Circle Equals test */
   @Test (timeout = 5000)
   public void circleEqualsTest()
   {
      Circle c1 = new Circle(1.0, new Point(0,0), Color.BLACK, false); // original
      Circle c2 = new Circle(1.0, new Point(0,0), Color.BLACK, false); // same
      Circle c3 = new Circle(3.0, new Point(0,0), Color.BLACK, false); // Radius
      Circle c4 = new Circle(1.0, new Point(3,0), Color.BLACK, false); // Point
      Circle c5 = new Circle(1.0, new Point(0,0), Color.BLACK, true);  // filled
      Circle c6 = new Circle(1.0, new Point(0,0), Color.BLUE, false); // Color
      
      assertFalse(c1.equals(null));
      assertTrue(c1.equals(c2));
      assertFalse(c1.equals(c3));
      assertFalse(c1.equals(c4));
      assertFalse(c1.equals(c5));
      assertFalse(c1.equals(c6));

   }
     
   /* ------------------------------ Rectangle Tests ---------------------------*/
   
   /* Rectangle Constructor test */
   @Test (timeout = 5000)
   public void rectangleConstructorTest()
   {
      Rectangle r = new Rectangle(1.0, 2.0, new Point(0,0), Color.BLACK, false);
      
      assertEquals(1.0, r.getWidth(), .000001);
      assertEquals(2.0, r.getHeight(), .000001);
      assertEquals(new Point(0,0), r.getPosition());
      assertEquals(Color.BLACK, r.getColor());
      assertFalse(r.getFilled());
   }
   
   /* Rectangle Set test */
   @Test (timeout = 5000)
   public void rectangleSetTest()
   {
      Rectangle r = new Rectangle(1.0, 2.0, new Point(0,0), Color.BLACK, false);
      
      assertEquals(1.0, r.getWidth(), .0000001);
      assertEquals(2.0, r.getHeight(), .0000001);
      assertEquals(Color.BLACK, r.getColor());
      assertFalse(r.getFilled());

      r.setWidth(5.0);
      r.setHeight(3.1);
      r.setColor(Color.BLUE);
      r.setFilled(true);

      assertEquals(5.0, r.getWidth(), .0000001);
      assertEquals(3.1, r.getHeight(), .0000001);
      assertEquals(Color.BLUE, r.getColor());
      assertTrue(r.getFilled());
   }
   
   /* Rectangle Move test */
   @Test (timeout = 5000)
   public void rectangleMoveTest()
   {
      Rectangle r = new Rectangle(1.0, 2.0, new Point(0,0), Color.BLACK, false);
      
      r.move(new Point(0,0));
      assertEquals(new Point(0,0), r.getPosition());	// Origin

      r.move(new Point(1,2));
      assertEquals(new Point(1,2), r.getPosition());	// (+,+)
   
      r.move(new Point(-3,-5));
      assertEquals(new Point(-2,-3), r.getPosition());	// (-,-)

      r.move(new Point(1,10));
      assertEquals(new Point(-1,7), r.getPosition()); // (-,+)

      r.move(new Point(3,-8));
      assertEquals(new Point(2,-1), r.getPosition());	// (+,-)
   }
   
   /* Rectangle Area test */
   @Test (timeout = 5000)
   public void rectangleAreaTest()
   {
      Rectangle r = new Rectangle(1.0, 1.0, new Point(0,0), Color.BLACK, false);
      
      assertEquals(1.0, r.getArea(), .000001);

      r.setWidth(3.0);
      r.setHeight(2.0);
      assertEquals(6.0, r.getArea(), .000001);

      r.setWidth(9.0);
      r.setHeight(5.0);
      assertEquals(45.0, r.getArea(), .0000001);
   }
   
   /* Rectangle Equals test */
   @Test (timeout = 5000)
   public void rectangleEqualsTest()
   {
      Rectangle r = new Rectangle(1.0, 1.0, new Point(0,0), Color.BLACK, false); // Original
      Rectangle r1 = new Rectangle(1.0, 1.0, new Point(0,0), Color.BLACK, false); // same
      Rectangle r2 = new Rectangle(2.0, 1.0, new Point(0,0), Color.BLACK, false); // Width
      Rectangle r3 = new Rectangle(1.0, 4.0, new Point(0,0), Color.BLACK, false); // Height
      Rectangle r4 = new Rectangle(1.0, 1.0, new Point(5,0), Color.BLACK, false); // Position
      Rectangle r5 = new Rectangle(1.0, 1.0, new Point(0,0), Color.GREEN, false);  //Color
      Rectangle r6 = new Rectangle(1.0, 1.0, new Point(0,0), Color.BLACK, true); // Filled
      
      assertFalse(r.equals(null));
      assertTrue(r.equals(r1));
      assertFalse(r.equals(r2));
      assertFalse(r.equals(r3));
      assertFalse(r.equals(r4));
      assertFalse(r.equals(r5));
      assertFalse(r.equals(r6));
   }
   
   /* ------------------------------ Triangle Tests ---------------------------*/
   
   /* Triangle Constructor test */
   @Test (timeout = 5000)
   public void triangleConstructorTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(2,2), Color.BLACK, false);
      
      assertEquals(new Point(0,0), t.getVertexA());
      assertEquals(new Point(1,1), t.getVertexB());
      assertEquals(new Point(2,2), t.getVertexC());
      assertEquals(Color.BLACK, t.getColor());
      assertFalse(t.getFilled());
   }
   
   /* Triangle Set test */
   @Test (timeout = 5000)
   public void triangleSetTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(2,2), Color.BLACK, false);
      
      // Note that this isn't actually asserting anything!  I just call them to make sure they compile.
      // You might want to add some asserts here.
      assertEquals(new Point(0,0), t.getVertexA());
      assertEquals(new Point(1,1), t.getVertexB());
      assertEquals(new Point(2,2), t.getVertexC());
      assertEquals(Color.BLACK, t.getColor());
      assertFalse(t.getFilled());

      t.setVertexA(new Point(3,0));
      t.setVertexB(new Point(1,2));
      t.setVertexC(new Point(4,2));
      t.setColor(Color.BLUE);
      t.setFilled(true);

      assertEquals(new Point(3,0), t.getVertexA());
      assertEquals(new Point(1,2), t.getVertexB());
      assertEquals(new Point(4,2), t.getVertexC());
      assertEquals(Color.BLUE, t.getColor());
      assertTrue(t.getFilled());
   }
   
   /* Triangle Move test */
   @Test (timeout = 5000)
   public void triangleMoveTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(2,2), Color.BLACK, false);
      
      t.move(new Point(0,0));
      assertEquals(new Point(0,0), t.getVertexA());  // Origin

      t.move(new Point(1,2));
      assertEquals(new Point(1,2), t.getVertexA());	// A(+,+)
      assertEquals(new Point(2,3), t.getVertexB());	// B(+,+)
      assertEquals(new Point(3,4), t.getVertexC());	// C(+,+)
   
      t.move(new Point(-4,-5));
      assertEquals(new Point(-3,-3), t.getVertexA());	// A(-,-)
      assertEquals(new Point(-2,-2), t.getVertexB());	// B(-,-)
      assertEquals(new Point(-1, -1), t.getVertexC());	// C(-,-)

      t.move(new Point(1,10));
      assertEquals(new Point(-2,7), t.getVertexA());   // A(-,+)
      assertEquals(new Point(-1,8), t.getVertexB());	// B(0,+)
      assertEquals(new Point(0,9), t.getVertexC());	// C(+,+)

      t.move(new Point(3,-8));
      assertEquals(new Point(1,-1), t.getVertexA());   // A(+,-)
      assertEquals(new Point(2,0), t.getVertexB());	// B(+,0)
      assertEquals(new Point(3,1), t.getVertexC());	// C(+,+)
   }
   
   /* Triangle Area test */
   @Test (timeout = 5000)
   public void triangleAreaTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(0,1), Color.BLACK, false);
      
      assertEquals(.5, t.getArea(), .000001);

      t.setVertexA(new Point(-5,-5));
      t.setVertexB(new Point(0,30));
      t.setVertexC(new Point(55,0));
      assertEquals(t.getArea(), 1037.50, .0000001);

      t.setVertexA(new Point(30,-10));
      t.setVertexB(new Point(-6,-5));
      t.setVertexC(new Point(23,21));
      assertEquals(t.getArea(), 540.50, .0000001);     
   }
   
   /* Triangle Equals test */
   @Test (timeout = 5000)
   public void triangleEqualsTest()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(1,1), new Point(0,1), Color.BLACK, false); // Original
      Triangle t1 = new Triangle(new Point(0,0), new Point(1,1), new Point(0,1), Color.BLACK, false); // Same
      Triangle t2 = new Triangle(new Point(0,-1), new Point(1,1), new Point(0,1), Color.BLACK, false); // Vertex A
      Triangle t3 = new Triangle(new Point(0,0), new Point(4,1), new Point(0,1), Color.BLACK, false); // Vertex B
      Triangle t4 = new Triangle(new Point(0,0), new Point(1,1), new Point(-5,1), Color.BLACK, false);  // Vertex C
      Triangle t5 = new Triangle(new Point(0,0), new Point(1,1), new Point(0,1), Color.BLUE, false);  // Color
      Triangle t6 = new Triangle(new Point(0,0), new Point(1,1), new Point(0,1), Color.BLACK, true);  // Filled
      
      assertFalse(t.equals(null));
      assertTrue(t.equals(t1));
      assertFalse(t.equals(t2));
      assertFalse(t.equals(t3));
      assertFalse(t.equals(t4));
      assertFalse(t.equals(t5));
      assertFalse(t.equals(t6));
   }
   
   /* ------------------------------ ConvexPolygon Tests ---------------------------*/   
   
   /* ConvexPolygon Constructor test */
   @Test (timeout = 5000)
   public void convexPolygonConstructorTest()
   {
      Point[] points = new Point[5];
      points[0] = new Point(0,0);
      points[1] = new Point(0,-4);
      points[2] = new Point(1,-3);
      points[3] = new Point(2,0);
      points[4] = new Point(1,2);
      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);
      
      assertEquals(new Point(0,0), cp.getVertex(0));
      assertEquals(Color.BLACK, cp.getColor());
      assertFalse(cp.getFilled());
   }
   
   /* ConvexPolygon Set test */
   @Test (timeout = 5000)
   public void convexPolygonSetTest()
   {
      Point[] points = new Point[5];
      points[0] = new Point(0,0);
      points[1] = new Point(0,-4);
      points[2] = new Point(-1,3);
      points[3] = new Point(2,0);
      points[4] = new Point(-1,-2);
      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);
      
      // Note that this isn't actually asserting anything!  I just call them to make sure they compile.
      // You might want to add some asserts here.
      assertEquals(new Point(0,0), cp.getVertex(0));
      assertEquals(new Point(0,-4), cp.getVertex(1)); 
      assertEquals(new Point(-1,3), cp.getVertex(2));
      assertEquals(new Point(2,0), cp.getVertex(3));
      assertEquals(new Point(-1,-2), cp.getVertex(4));
      assertEquals(Color.BLACK, cp.getColor());
      assertFalse(cp.getFilled());

      cp.setVertex(0, new Point(5,-5));
      cp.setVertex(1, new Point(-1,1));
      cp.setVertex(2, new Point(0,0));
      cp.setVertex(3, new Point(7,7));
      cp.setVertex(4, new Point(-2,-2));
      cp.setColor(Color.BLUE);
      cp.setFilled(true);

      assertEquals(new Point(5,-5), cp.getVertex(0));
      assertEquals(new Point(-1,1), cp.getVertex(1)); 
      assertEquals(new Point(0,0), cp.getVertex(2));
      assertEquals(new Point(7,7), cp.getVertex(3));
      assertEquals(new Point(-2,-2), cp.getVertex(4));
      assertEquals(Color.BLUE, cp.getColor());
      assertTrue(cp.getFilled());
   }
   
   /* ConvexPolygon Move test */
   @Test (timeout = 5000)
   public void convexMoveTest()
   {
      Point[] points = new Point[5];
      points[0] = new Point(0,0); 
      points[1] = new Point(0,-4);
      points[2] = new Point(-1,3);
      points[3] = new Point(2,0);
      points[4] = new Point(-1,-2);
      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);
      
      cp.move(new Point(10,-5));
      assertEquals(new Point(10,-5), cp.getVertex(0));
      assertEquals(new Point(10,-9), cp.getVertex(1));
      assertEquals(new Point(9,-2), cp.getVertex(2));
      assertEquals(new Point(12,-5), cp.getVertex(3));
      assertEquals(new Point(9,-7), cp.getVertex(4));

      cp.move(new Point(-6, 2));
      assertEquals(new Point(4,-3), cp.getVertex(0));
      assertEquals(new Point(4,-7), cp.getVertex(1));
      assertEquals(new Point(3,0), cp.getVertex(2));
      assertEquals(new Point(6,-3), cp.getVertex(3));
      assertEquals(new Point(3,-5), cp.getVertex(4));
   }
   
   /* ConvexPolygon Area test */
   @Test (timeout = 5000)
   public void convexAreaTest()
   {
      Point[] points = new Point[4];
      points[0] = new Point(0,0);
      points[1] = new Point(1,0);
      points[2] = new Point(1,1);
      points[3] = new Point(0,1);
      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);
      
      assertEquals(1.0, cp.getArea(), .000001);

      Point[] points1 = new Point[5];
      points1[0] = new Point(0,0); 
      points1[1] = new Point(0,-4);
      points1[2] = new Point(-1,3);
      points1[3] = new Point(2,0);
      points1[4] = new Point(-1,-2);
      ConvexPolygon cp1 = new ConvexPolygon(points1, Color.BLACK, false);

      assertEquals(7.0, cp1.getArea(), .000001);
   }
   
   /* ConvexPolygon Equals test */
   @Test (timeout = 5000)
   public void convexEqualsTest()
   {
      Point[] points = new Point[4]; // set of points
      points[0] = new Point(0,0);
      points[1] = new Point(1,0);
      points[2] = new Point(1,1);
      points[3] = new Point(0,1);

      Point[] points1 = new Point[4];  // different set of points
      points[0] = new Point(1,0);
      points[1] = new Point(1,0);
      points[2] = new Point(1,1);
      points[3] = new Point(0,1);

      ConvexPolygon cp = new ConvexPolygon(points, Color.BLACK, false);  // Original
      ConvexPolygon cp1 = new ConvexPolygon(points, Color.BLACK, false);  // Same
      ConvexPolygon cp2 = new ConvexPolygon(points1, Color.BLACK, false);  // Points
      ConvexPolygon cp3 = new ConvexPolygon(points, Color.BLUE, false);  // Color
      ConvexPolygon cp4 = new ConvexPolygon(points, Color.BLACK, true);  // Filled

      
      assertFalse(cp.equals(null));
      assertTrue(cp.equals(cp1));
      assertFalse(cp.equals(cp2));
      assertFalse(cp.equals(cp3));
      assertFalse(cp.equals(cp4));
   }
   
   /* ------------------------------ WorkSpace Tests ---------------------------*/   
   
   /* WorkSpace Constructor test */
   @Test (timeout = 5000)
   public void workSpaceConstructorTest()
   {
      WorkSpace ws = new WorkSpace();
      
      assertEquals(0, ws.size());
   }
   
   /* WorkSpace AddGetRemove test */
   @Test (timeout = 5000)
   public void workSpaceAddGetRemoveTest()
   {
      WorkSpace ws = new WorkSpace();
      Shape s;
      
      // These tests are trivial.  Add more!
      ws.add(new Circle(1.0, new Point(0,0), Color.BLACK, false));
      assertEquals(1, ws.size());

      s = ws.get(0);
      assertEquals(1, ws.size());
      assertTrue(s instanceof Circle);
      
      s = ws.remove(0);
      assertEquals(0, ws.size());
      assertTrue(s instanceof Circle);

      Point[] points = new Point[4]; // set of points
      points[0] = new Point(0,0);
      points[1] = new Point(1,0);
      points[2] = new Point(1,1);
      points[3] = new Point(0,1);

      ws.add(new Rectangle(2.0, 3.0, new Point(0,1), Color.BLACK, true));
      ws.add(new Triangle(new Point(0,0), new Point(0,1), new Point(1,1), Color.BLACK, true));
      ws.add(new ConvexPolygon(points, Color.BLACK, true));

      assertEquals(3, ws.size()); // Size
      assertTrue(ws.get(0) instanceof Rectangle); // Get
      assertTrue(ws.get(1) instanceof Triangle); // Get
      assertTrue(ws.get(2) instanceof ConvexPolygon); // Get
   }
   
   /* WorkSpace "Get All" tests */
   @Test (timeout = 5000)
   public void workGetAllTest()
   {
      Point[] points = new Point[4]; // set of points
      points[0] = new Point(0,0);
      points[1] = new Point(1,0);
      points[2] = new Point(1,1);
      points[3] = new Point(0,1);

      WorkSpace ws = new WorkSpace();
      ArrayList<Circle> circles;
      ArrayList<Rectangle> rectangles;
      ArrayList<Triangle> triangles;
      ArrayList<ConvexPolygon> convexPolygons;
      ArrayList<Shape> shapes;
      
      ws.add(new Circle(1.0, new Point(0,0), Color.BLACK, false)); // Circle
      ws.add(new Rectangle(2.0, 3.0, new Point(0,1), Color.BLACK, true)); // Rectangle
      ws.add(new Triangle(new Point(0,0), new Point(0,1), new Point(1,1), Color.BLACK, true)); // Triangle
      ws.add(new Triangle(new Point(0,0), new Point(0,1), new Point(1,1), Color.BLACK, true)); // Triangle
      ws.add(new ConvexPolygon(points, Color.BLACK, true));  // ConvexPolygon
      ws.add(new ConvexPolygon(points, Color.BLACK, true));  // ConvexPolygon
      ws.add(new ConvexPolygon(points, Color.BLUE, true));  // ConvexPolygon
     
      circles = ws.getCircles();
      assertEquals(1, circles.size());  // getCircles
      rectangles = ws.getRectangles();  
      assertEquals(1, rectangles.size());  // getRectangles
      triangles = ws.getTriangles();
      assertEquals(2, triangles.size());  // getTriangles
      convexPolygons = ws.getConvexPolygons();  // getConvexPolygons
      assertEquals(3, convexPolygons.size());
      shapes = ws.getShapesByColor(Color.RED); // Color
      assertEquals(0, shapes.size());
      shapes = ws.getShapesByColor(Color.BLACK);  // Color
      assertEquals(6, shapes.size());
      shapes = ws.getShapesByColor(Color.BLUE);  // Color
      assertEquals(1, shapes.size());
      

      assertEquals((10.0 + Math.PI), ws.getAreaOfAllShapes(), .000001);
   }
}
