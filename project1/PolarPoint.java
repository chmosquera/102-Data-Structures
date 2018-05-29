/**
 * Describing a point using Polar coordinates
 *
 * @author Chanelle Mosquera
 * @version Project-1
 * @version CPE102-15
 * @version Spring 2016
 */

public class PolarPoint implements Point
{
   // instance variables
   private double radius;
   private double angle;


   // Constructor
   public PolarPoint(double radius, double angle)
   {
      this.radius = radius;
      this.angle = angle;
   }

   /* OPERATIONS */
   public double xCoordinate()
   {
      double x = this.radius * Math.cos(this.angle);
      return x;
   }

   public double yCoordinate()
   {
      double y = this.radius * Math.sin(this.angle);
      return y;
   }

   public double angle() {return this.angle;}

   public double radius() {return this.radius;}

   public double distanceFrom(Point other)
   {
      double r1 = this.radius;
      double r2 = other.radius();
      double a1 = this.angle;
      double a2 = other.angle();
      double distance = Math.sqrt(Math.pow(r1,2) + Math.pow(r2,2) - (2 * r1 * r2 * Math.cos(a2-a1)));
      return distance;
   }

   public Point rotate90()
   {
      double new_angle = this.angle + Math.toRadians(90);
      Point rotate90_pt = new PolarPoint(this.radius, new_angle);
      return rotate90_pt;
   }

}
