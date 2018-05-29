/**
 * Square.java
 * CPE102-23: Class that contains characteristics of each square in the game 
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */
import java.util.Scanner;

public class Square implements DelimitedTextIO {

   // Constants
   public static final int SQUARE_SIZE = 50; //pixels per Square
   public static final int UP = 0;
   public static final int RIGHT = 1;
   public static final int DOWN = 2;
   public static final int LEFT = 3;

   // instance variables
   private boolean[] walls = new boolean[4];
   private boolean seen;
   private boolean inView;
   private int row, col;
   private Treasure treasure;

   // Constructors
   public Square(int row, int col) {
      this.row = row;
      this.col = col;
   }

   public Square(boolean up, boolean right, boolean down, boolean left, int row, int col) {
      walls[0] = up;
      walls[1] = right;
      walls[2] = down;
      walls[3] = left;
      this.row = row;
      this.col = col;
      seen = false;
      inView = false;
   }

   // Query Methods 
   public boolean wall(int direction) {return walls[direction];}

   public boolean seen() {return seen;}
 
   public boolean inView() {return inView;}

   public int row() {return row;}

   public int col() {return col;}

   public Treasure treasure() {return treasure;}

   public int x() {return col*SQUARE_SIZE;}

   public int y() {return row*SQUARE_SIZE;}

   public void setInView(boolean inView) {
      this.inView = inView;
      if (inView) 
         {seen = true;}      
   }

   public void setTreasure(Treasure t) {treasure = t;}

   public void enter() {
      if (treasure != null) 
            { treasure.setFound(); }
   } 

   public String toText(char delimiter) { 
      return "Square" + delimiter + row + delimiter + col + delimiter + 
             wall(UP) + delimiter + wall(RIGHT) + delimiter + wall(DOWN) + delimiter + wall(LEFT) + 
             delimiter + seen + delimiter + inView;
   }
   // input = "bool, bool, bool, bool, bool, bool"
   public void toObject(Scanner input) {
      walls[0] = input.nextBoolean();
      walls[1] = input.nextBoolean();
      walls[2] = input.nextBoolean();
      walls[3] = input.nextBoolean();
      seen = input.nextBoolean();
      inView = input.nextBoolean();
   }
}
