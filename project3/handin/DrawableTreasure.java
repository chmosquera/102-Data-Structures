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
   public void draw() {

      if (this.found() == true) {
         rect(Square.SQUARE_SIZE/2, Square.SQUARE_SIZE/2, 30,30);
         fill(170, 57, 57);
      } 

      if (this.found() == false) {
         rect(Square.SQUARE_SIZE/2, Square.SQUARE_SIZE/2, 30,30);
         fill(128, 21, 21);
      }

   }
}
