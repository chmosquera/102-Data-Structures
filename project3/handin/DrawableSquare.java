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

   public void draw() {
      if (this.seen() == false) {
         rect(this.x(), this.y(), Square.SQUARE_SIZE,Square.SQUARE_SIZE);
         fill(68, 62, 55);
      }

      if (this.inView() == true) {
         rect(this.x(), this.y(), Square.SQUARE_SIZE,Square.SQUARE_SIZE);
         fill(137,117,76);
         if (this.wall(Square.UP)) {
            rect(this.x(),this.y(),50,5);
            noStroke();
            fill(255,255,66);
         }
         if (this.wall(Square.RIGHT)) {
            rect(this.x() + 45,this.y(),5,50);
            noStroke();
            fill(255,255,66);
         }
         if (this.wall(Square.LEFT)) {
            rect(this.x(),this.y(),5,50);
            noStroke();
            fill(255,255,66);
         }
         if (this.wall(Square.DOWN)) {
            rect(this.x(),this.x() + 45,50,5);
            noStroke();
            fill(255,255,66);
         }
      }

      if (this.seen() == true && this.inView()==false) {
         rect(this.x(), this.y(), Square.SQUARE_SIZE,Square.SQUARE_SIZE);
         fill(86,65,22);
         if (this.wall(Square.UP)) {
            rect(this.x(),this.y(),50,5);
            noStroke();
            fill(255,255,66);
         }
         if (this.wall(Square.RIGHT)) {
            rect(this.x() + 45,this.y(),5,50);
            noStroke();
            fill(255,255,66);
         }
         if (this.wall(Square.LEFT)) {
            rect(this.x(),this.y(),5,50);
            noStroke();
            fill(255,255,66);
         }
         if (this.wall(Square.DOWN)) {
            rect(this.x(),this.x() + 45,50,5);
            noStroke();
            fill(255,255,66);
         }
      }
   }

}
