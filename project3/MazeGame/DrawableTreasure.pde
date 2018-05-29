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
     if (this.found() == false) {
        pushMatrix();
        translate(this.location().x() + (Square.SQUARE_SIZE/2), this.location().y() + (Square.SQUARE_SIZE/2));
     
        // body
        fill(108, 155, 207); // light submerged blue
        noStroke();
        rect(-15,-14,30,28,5,15,15,5);
        fill(255, 255, 30);
        triangle(7,0,25,-9,23,5);
        triangle(0,-1,4,0,6,-17);
     
        fill(0,0,0);
        triangle(7,0,7,-9,5,5);     
        //eyes
        fill(255,255,255);
        noStroke();
        ellipse(-15,-4,15,15);
     
        // Pupil
        fill(0,0,0);
        noStroke();
        ellipse(-12,-2,7,7);
     
        popMatrix();
     }
     if (this.found() == true) {
        pushMatrix();
        translate(this.location().x() + (Square.SQUARE_SIZE/2), this.location().y() + (Square.SQUARE_SIZE/2));   
        scale(1.5);
        // body
        fill(37, 126, 225); // light submerged blue
        noStroke();
        rect(-15,-14,30,28,5,15,15,5);
        fill(255, 255, 30);
        triangle(7,0,25,-9,23,5);
        triangle(0,-1,4,0,6,-17);
     
        fill(0,0,0);
        triangle(7,0,7,-9,5,5);          
        
        //eyes
        fill(255,255,255);
        noStroke();
        ellipse(-15,-4,17,17);
        
        // Pupil
        fill(0,0,0);
        noStroke();
        ellipse(-12,-2,7,7);
        
        arc(-15,8,20,10,-0.7,PI/2,PIE); 
        
        popMatrix();
     }
   }
}