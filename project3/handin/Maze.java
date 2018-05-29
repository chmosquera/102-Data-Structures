import java.util.*;
/**
 * Maze.java
 * CPE102-23: Class that contains all the logic to model a Maze with Treasures, Monsters, and an Explorer.
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */

public class Maze
{
   // named constants
   public static final int ACTIVE = 0;
   public static final int EXPLORER_WIN = 1;
   public static final int MONSTER_WIN = 2;
    
    // instance variables
   private Square[][] squares;
   private ArrayList<RandomOccupant> randOccupants;
   private Explorer explorer;
   private int rows;
   private int cols;

   /**
    * Constructor for objects of class Maze
    */
   public Maze(Square[][] squares, int rows, int cols) // WAS EDITED
   {
      this.squares = squares;
      this.rows = rows;
      this.cols = cols;
		
      randOccupants = new ArrayList<RandomOccupant>();
		
   }
	
   // QUERIES
   public Square getSquare(int row, int col) { return squares[row][col]; }
   public int rows() {return rows;}
   public int cols() {return cols;}
   public String explorerName() {return explorer.name();}
   public Explorer getExplorer() {return explorer;}
    
   public RandomOccupant getRandomOccupant(int index) {return randOccupants.get(index);} // WAS EDITED

   public int getNumRandOccupants() {return randOccupants.size();} // WAS EDITED
	
   // COMMANDS
   public void addRandomOccupant(RandomOccupant ro) {randOccupants.add(ro);} // WAS EDITED
	
   public void setExplorer(Explorer e) {explorer = e;}
	
   public void explorerMove(int key)
   {
      explorer.move(key);
   }
	
   public void randMove()
   {
      for (RandomOccupant ro: randOccupants) {ro.move();}
   }
	
   /**
    * Returns the status of the game.
    *
    * If all treasures have been found, return EXPLORER_WIN.
    * If not, check each maze occupant, if it is a Monster and
    *    it is in the same location as the Explorer, return
    *    MONSTER_WIN.  Note that you can use == to check locations, do you know why?
    * Otherwise, return ACTIVE.
    */
   public int gameStatus() // WAS EDITED
   {
      int status = ACTIVE;
        
      if (foundAllTreasures() == true) {return EXPLORER_WIN;}
      for (RandomOccupant ro: randOccupants) {
         if (ro instanceof Monster) {
            Monster monster = (Monster)ro;
            if (monster.location() == explorer.location()) {return MONSTER_WIN;}
         }           
      }
        
      return status;
   }
	
   private boolean foundAllTreasures() // WAS EDITED
   {
      boolean foundAll = true;
        
      // - search through all the occupants to see if the Treasures have been found.  Return false if
      // - there is a Treasure that hasn't been found.
      for (RandomOccupant ro: randOccupants) {
         if (ro instanceof Treasure) {
            Treasure treasure = (Treasure)ro;
            if (treasure.found() == false) {foundAll = false;}
         }
      }
              
      return foundAll;
   }
    
   public void lookAround(Square s) // WAS EDITED
   {
      int row = s.row();
      int col = s.col();
        
      // Clear what was previously in view
      resetInView();
        
      // Set the current square so that we are viewing it (obviously)
      s.setInView(true);
        
      // - Check the adjacent squares.  If there isn't a wall in the way, set their inview to true.
      // - Check the diagonal squares.  If there isn't a wall in the way, set their inview to true.


      if (!s.wall(0) && row!=0) {               // UP
         Square adjSquare = getSquare(row-1, col);
         adjSquare.setInView(true);

         if (!adjSquare.wall(1) && col!=(this.cols-1)) { // UP-RIGHT
            squares[row-1][col+1].setInView(true);
         }
         if (!adjSquare.wall(3) && col!=0) { // UP-LEFT
            squares[row-1][col-1].setInView(true);
         }
      }
      if (!s.wall(1) && col!=(this.cols-1)) {      // RIGHT
         Square adjSquare = getSquare(row, col+1);
         adjSquare.setInView(true);

         if (!adjSquare.wall(0) && row!=0) { // RIGHT-UP
            squares[row-1][col+1].setInView(true);
         }
         if (!adjSquare.wall(2) && row!=(this.rows-1)) { // RIGHT-DOWN
            squares[row+1][col+1].setInView(true);
         }
      }
      if (!s.wall(2) && row!=(this.rows-1)) {       // DOWN
         Square adjSquare = getSquare(row+1, col);
         adjSquare.setInView(true);
         
         if (!adjSquare.wall(1) && col!=(this.cols-1)) { // DOWN-RIGHT
            squares[row+1][col+1].setInView(true);
         }
         if (!adjSquare.wall(3) && col!=0) { // DOWN-LEFT
            squares[row+1][col-1].setInView(true);
         }
      }
      if (!s.wall(3) && col!=0) {       // LEFT
         Square adjSquare = getSquare(row,col-1);
         adjSquare.setInView(true);

         if (!adjSquare.wall(0) && row!=0) { // LEFT-UP
            squares[row-1][col-1].setInView(true);
         }
         if (!adjSquare.wall(2) && row!=(this.rows-1)) { // LEFT-DOWN
            squares[row+1][col-1].setInView(true);
         }
      }
   }
    
   private void resetInView()
   {
      for (int i = 0; i<rows; i++) {
         for (int j = 0; j<cols; j++) {
            squares[i][j].setInView(false);
         }
      }
   }
}






