/**
 * DrawableExplorer.java
 * CPE102-23: Class that draws Explorer object in Processing Window
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */

public class DrawableExplorer extends Explorer implements Drawable {

   // CONSTRUCTORS
   public DrawableExplorer(Square location, Maze maze, String name) {
      super(location, maze, name);
   }

   public void draw() {}
}
