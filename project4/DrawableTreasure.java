/**
 * DrawableTreasure.java
 * CPE102-23: Class that draws Treasure object in Processing Window
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */


public class DrawableTreasure extends Treasure implements Drawable {
   
   // CONSTRUCTORS
   public DrawableTreasure(Maze maze) {
      super(maze);
   }

   public DrawableTreasure(Maze maze, long seed) {
      super(maze, seed);
   }

   public DrawableTreasure(Maze maze, Square location) {
      super(maze, location);
   }

   // METHODS
   public void draw() {}
}
