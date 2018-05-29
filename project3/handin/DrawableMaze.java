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

   public void draw() {
      rect(0,0,this.cols() * Square.SQUARE_SIZE, this.rows() * Square.SQUARE_SIZE);
      fill(68, 62, 55);

      // Draw Squares
      for (int col=0; col < this.cols(); col++) {
         for (int row=0; row < this.rows(); row++) {
            DrawableSquare sq = (DrawableSquare)getSquare(row,col);
            sq.draw();
         }
      }

       for (int i=0; i < getNumRandOccupants(); i++) {
          RandomOccupant ro = getRandomOccupant(i);
          if (ro instanceof Monster) {
             ((DrawableMonster)ro).draw();
          }
          if (ro instanceof Treasure) {
             ((DrawableTreasure)ro).draw();
          }
       }
   }

}
