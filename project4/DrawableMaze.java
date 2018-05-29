/**
 * DrawableMaze.java
 * CPE102-23: Class that draws Maze object in Processing Window
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */


public class DrawableMaze extends Maze implements Drawable {
   
   // CONSTRUCTORS
   public DrawableMaze(DrawableSquare[][] maze, int rows, int cols) {
      super(maze, rows, cols);
   }

   public void draw() {}

}
