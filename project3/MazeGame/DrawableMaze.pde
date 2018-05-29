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
      fill(0,0,0); // white
      rect(0,0,this.cols() * 50, this.rows() * 50);

      // Draw Squares
      for (int row=0; row < this.rows(); row++) {
         for (int col=0; col < this.cols(); col++) {
            DrawableSquare sq = (DrawableSquare)getSquare(row,col);
            sq.draw();
         }
      }


      // Draw Random Occupants
      for (int i=0; i < getNumRandOccupants(); i++) {
         if (getRandomOccupant(i).location().inView() == true) {
            Drawable ro = ((Drawable)getRandomOccupant(i));
            ro.draw();
         }
         
         if (getRandomOccupant(i) instanceof Treasure) {
           if (((Treasure)getRandomOccupant(i)).found() == true) {
               Drawable ro = ((Drawable)getRandomOccupant(i));
               ro.draw();
           }
         }
     }
     
      // Draw Explorer
      ((DrawableExplorer)getExplorer()).draw();
       
   }

}