/**
 * DrawableSquare.java
 * CPE102-23: Class that draws Square objects in Processing Window
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */

public class DrawableSquare extends Square implements Drawable {

   // CONSTRUCTORS
   public DrawableSquare(boolean up, boolean right, boolean down, boolean left, int row, int col) {
      super(up, right, down, left, row, col);
   }

   public void draw() {}

}
