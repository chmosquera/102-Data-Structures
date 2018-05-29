import java.awt.event.KeyEvent;

/**
 * Explorer.java
 * CPE102-23: Class that contains characteristics of Explorer which is-a Occupant
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */

public class Explorer extends Occupant {

   // instance variables
   private String name;
   private Maze maze;

   // Constructors
   public Explorer(Square location, Maze maze, String name) {
      super(location);
      this.name = name;
      this.maze = maze;
      maze.lookAround(location); 
   }

   // Methods
   public String name() {return name;}

   public void move(int key) {
      int row = (location()).row(); //current locations
      int col = (location()).col();
      int direction;

      if ((key ==  KeyEvent.VK_KP_UP) || (key == KeyEvent.VK_UP)) 
         {direction = 0;}
      else if ((key == KeyEvent.VK_KP_RIGHT) || (key == KeyEvent.VK_RIGHT)) 
         {direction = 1;}
      else if ((key == KeyEvent.VK_KP_DOWN) || (key == KeyEvent.VK_DOWN)) 
         {direction = 2;}
      else if ((key == KeyEvent.VK_KP_LEFT) || (key == KeyEvent.VK_LEFT)) 
         {direction = 3;}
      else direction = 999;

      if ((direction != 999) && ((location()).wall(direction) == false)) {
         if (direction == 0) {row -= 1;} // up
         if (direction == 1) {col += 1;} // right
         if (direction == 2) {row += 1;} // down
         if (direction == 3) {col -= 1;} // left
       
         this.moveTo(maze.getSquare(row,col));
      }
   }
   
   public void moveTo(Square s) {
      super.moveTo(s);
      s.enter();
      maze.lookAround(s);
   }

}
