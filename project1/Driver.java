public class Driver
{

   public static void main(String args[])
   {

      //_______Cartesian Point Tests______

      Point pd = new CartesianPoint(1.0,1.0);  
    
      Point p1 = new CartesianPoint(1.0, 1.0);
      System.out.println("X: " + p1.xCoordinate());
      System.out.println("Y: " + p1.yCoordinate());
      System.out.println("distance: " + p1.distanceFrom(pd));
      System.out.println("Angle: " + p1.angle());
      System.out.println("Radius: " + p1.radius());
      System.out.println();

      Point p2 = new CartesianPoint(0.0,1.0);
      System.out.println("X: " + p2.xCoordinate());
      System.out.println("Y: " + p2.yCoordinate());
      System.out.println("distance: " + p2.distanceFrom(pd));
      System.out.println("Angle: " + p2.angle());
      System.out.println("Radius: " + p2.radius());
      System.out.println();

      Point p3 = p1.rotate90();
      System.out.println("X: " + p3.xCoordinate());
      System.out.println("Y: " + p3.yCoordinate());
      System.out.println("distance: " + p3.distanceFrom(pd));
      System.out.println("Angle: " + p3.angle());
      System.out.println("Radius: " + p3.radius());
      System.out.println();

      Point p4 = new CartesianPoint(-1.0, 0.0);
      System.out.println("X: " + p4.xCoordinate());
      System.out.println("Y: " + p4.yCoordinate());
      System.out.println("distance: " + p4.distanceFrom(pd));
      System.out.println("Angle: " + p4.angle());
      System.out.println("Radius: " + p4.radius());
      System.out.println();
   }
}
