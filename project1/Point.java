/**
 * An interface to be implemented by CartesianPoint.java and PolarPoint.java
 *
 * @author Chanelle Mosquera
 * @version Project-1
 * @version CPE102-15
 * @version Spring 2016
 */

public interface Point
{
   double xCoordinate();
   double yCoordinate();
   double radius();
   double angle();
   double distanceFrom(Point other);
   Point rotate90();
    
}
