/**
 * A interface for all shapes
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

public interface Shape
{
   /**
    * Returns Area of specified shape
    * @return double 
    */
   double getArea();

   /**
    * Returns Color of specified shape
    * @return Color
    */   
   Color getColor();

   /**
    * Sets Color of shape to the specified color passed in the parameters
    * @param Color
    */
   void setColor(Color color);

   /**
    * Returns shape's filled state
    * @return boolean
    */
   boolean getFilled();

   /**
    * Sets the filled state of the shape
    * @param boolean
    */
   void setFilled(boolean filled);

   /**
    * Moves the shape to specified point passed in the parameters, changing position of Shape
    * @param Point
    */
   void move(Point point);
}

