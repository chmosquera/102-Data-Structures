import java.util.*;

/**
 * RandomOccupant.java
 * CPE102-23: Parent class describing characteristics of Monster and Treasure
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */

public abstract class RandomOccupant extends Occupant{

   // INSTANCE VARIABLES
   private Random rand;
   private Maze maze;

   // CONSTRUCTORS 
   public RandomOccupant(Maze maze) {
      this.maze = maze; 
      rand = new Random();

      // randomly set location
      int row = rand.nextInt(maze.rows());
      int col = rand.nextInt(maze.cols());
      Square loc = maze.getSquare(row,col);
      this.moveTo(loc);
   }

   public RandomOccupant(Maze maze, long seed) {
      this.maze = maze;
      rand = new Random(seed);

      // randomly set location based on seed
      int row = rand.nextInt(maze.rows());
      int col = rand.nextInt(maze.cols());
      Square loc = maze.getSquare(row,col);
      this.moveTo(loc);
   }

   public RandomOccupant(Maze maze, Square location) {
      super(location);
      this.maze = maze;
      rand = new Random();
   }

   // METHODS
   public void move() {
      int row = (location()).row();
      int col = (location()).col();
      int direction;
      boolean onBorder;

      do {
         onBorder = false;
         direction = rand.nextInt(4);
         if ((direction == Square.UP) && (row == 0)) 
            {onBorder = true;}
         if ((direction == Square.RIGHT) && (col == (maze.cols()-1))) 
            {onBorder = true;}
         if ((direction == Square.DOWN) && (row == (maze.rows()-1)))
            {onBorder = true;}
         if ((direction == Square.LEFT) && (col == 0)) 
            {onBorder = true;}
      } while ( ((location()).wall(direction) == true) || (onBorder == true) );

      if (direction == location().UP) {row -= 1;}
      if (direction == location().RIGHT) {col += 1;}
      if (direction == location().DOWN) {row += 1;}
      if (direction == location().LEFT) {col -= 1;}

      Square newLoc = maze.getSquare(row, col);
      moveTo(newLoc);
   }

   public void toObject(Scanner input) {
      int row = input.nextInt();
      int col = input.nextInt();
      this.moveTo(maze.getSquare(row, col));
      
   }

}
