/**
 * Describing a point using Cartesian coordinates
 *
 * @author Chanelle Mosquera
 * @version Project-1
 * @version CPE102-15
 * @version Spring 2016
 */

public class CartesianPoint implements Point
{
   // instance variables
   private double xCoord;
   private double yCoord;

   // Constructor
   public CartesianPoint(double xCoord, double yCoord)
   {
      this.xCoord = xCoord;
      this.yCoord = yCoord;
   }

   /* OPERATIONS */
   public double xCoordinate() {return xCoord;}

   public double yCoordinate() {return yCoord;}

   public double angle()
   {
      double angle = Math.atan2(yCoord,xCoord);
      return angle;
   }

   public double radius()
   {
      double x_dist = Math.abs(this.xCoord - 0);
      double y_dist = Math.abs(this.yCoord - 0);
      double distance = Math.sqrt(Math.pow(x_dist, 2) + Math.pow(y_dist, 2));
      return distance;
   }

   public double distanceFrom(Point other)
   {
      double x_dist = Math.abs(other.xCoordinate() - this.xCoord);
      double y_dist = Math.abs(other.yCoordinate() - this.yCoord);
      double distance = Math.sqrt(Math.pow(x_dist, 2) + Math.pow(y_dist, 2));
      return distance;
   }   

   public Point rotate90()
   {
      double y = -this.yCoordinate();
      double x = this.xCoordinate();
      double new_y = x;
      double new_x = y;
      Point rotate90_pt = new CartesianPoint(new_x,new_y);
      return rotate90_pt;
   }


   /* MAIN METHOD */
   public static void main (String args[])
   {
      // Declare object of class
      Point pt = new CartesianPoint (1.0, 1.0);
   
      // Tests
      System.out.println(pt.xCoordinate());
      System.out.println(pt.radius());
      System.out.println(pt.angle());
   }

}
