/**
 * DrawableMonster.java
 * CPE102-23: Class that draws Monster objects in Processing Window
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */


public class DrawableMonster extends Monster implements Drawable {

   // CONSTRUCTOR
   public DrawableMonster(Maze maze) {
      super(maze);
   }

   public DrawableMonster(Maze maze, long seed) {
      super(maze, seed);
   }

   public DrawableMonster(Maze maze, Square location) {
      super(maze, location);
   }

   // METHODS
   public void draw() {}
}
