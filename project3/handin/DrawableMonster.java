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
   public void draw() {
    
     pushMatrix();
     
     // Head
      noStroke();
      fill(100, 176, 88);
      ellipse(2,0,15,15);
      
       // Shell tail
      noStroke();
      fill(100, 176, 88);
      triangle(32,17,32,23,37,28);
     
      // Right leg
      noStroke();
      fill(100, 176, 88);
      ellipse(10,20,10,15); 
      
      // Left leg
      noStroke();
      fill(100, 176, 88);
      ellipse(26,20,10,15);
     
      // Shell body
      noStroke();
      fill(139,118,67);
      ellipse(17,12,30,19);
      
      // Shell Rim
      noStroke();
      fill(139,118,67);
      rect(0,15,34,6);
     
      popMatrix();

   }
}
