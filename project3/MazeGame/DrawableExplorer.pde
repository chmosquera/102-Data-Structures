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

   public void draw() {
     pushMatrix();
     translate(this.location().x() + (Square.SQUARE_SIZE/2), this.location().y() + (Square.SQUARE_SIZE/2));
     //______________Marlon___________
     // body
     fill(255, 168, 61); // vibrant orange
     noStroke();
     ellipse(-5,0,35,25);
     triangle(7,0,25,-9,23,5);
     
     //eyes
     fill(255,255,255);
     noStroke();
     ellipse(-15,-4,15,15);
     
     // Pupil
     fill(0,0,0);
     noStroke();
     ellipse(-12,-2,7,7);     
     
     fill(255,255,255);
     noStroke();
     rect(-5,-13,3,25);
     rect(0,-12,2,24);
     rect(5,-10,2,20);

     popMatrix();
           
   }
}