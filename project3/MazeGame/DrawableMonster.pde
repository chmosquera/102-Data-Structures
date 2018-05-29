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
     translate(this.location().x() + (Square.SQUARE_SIZE/2), this.location().y() + (Square.SQUARE_SIZE/2)); 
     
     // body
     noStroke();
     fill(156, 199, 227); // even light submerged blue
     triangle(0,-15,0,-25,4,-14);
     ellipse(0,2.5,50,35);
     fill(27, 88, 167); // light submerged blue
     ellipse(0,5,50,35);
     fill(108, 163, 199); // medium lighter submerged blue     
     ellipse(0,10,50,25);
     fill(0,0,0); // black
     ellipse(0,9,20,18);
   
     pushMatrix(); // PUSH____________
     translate(0,15);
     scale(.7,.7);
     fill(255,255,255);
     // Bottom Middle
     triangle(-3,5,3,5,0,-5);
     // Bottom left side
     triangle(-7,3,-3,5,-4,-4);
     triangle(-11,-1,-7,3,-8,-4);
     // Bottom right side
     triangle(7,3,3,5,4,-4);
     triangle(11,-1,7,3,8,-4);
     
     // Top
     triangle(-6,-13,0,-13,-3,-2);
     triangle(0,-13,6,-13,3,-2);
     // Top Left
     triangle(-11,-15,-6,-15,-8,-4);
     triangle(-15,-19,-11,-17,-13,-6);
     // Top Right
     triangle(11,-15,6,-15,8,-4);
     triangle(15,-19,11,-17,13,-6);
     popMatrix(); // POP--------------
     
     noStroke();
     
     fill(108, 163, 199); // even lighter submerged blue
     ellipse(0,3,18,7);
     
     //nose
     fill(0,0,0);
     ellipse(-2,0,2,2);
     ellipse(2,0,2,2);
     
     //eyes
     fill(255,255,255); // white
     ellipse(-12,-7,10,7);
     ellipse(12,-7,10,7);
     fill(0,0,0); // black
     ellipse(-10,-6,5,5);
     ellipse(10,-6,5,5);

     popMatrix();
   }
}