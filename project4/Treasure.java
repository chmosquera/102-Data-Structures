/**
 * Treasure.java
 * CPE102-23: Class that contains characteristics of Treasure objets which is-a RandomOccupant
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */
import java.util.Scanner;

public class Treasure extends RandomOccupant {

   // INSTANCE VARIABLES
   private boolean found;

   // CONSTRUCTORS
   public Treasure(Maze maze) {
      super(maze);
      found = false;
      location().setTreasure(this);
   }

   public Treasure(Maze maze, long seed) {
      super(maze,seed);
      found = false;
      location().setTreasure(this);
   }

   public Treasure(Maze maze, Square location) {
      super(maze,location);
      found = false;
      location().setTreasure(this);
   }

   // METHODS
   public boolean found() {return found;}

   public void setFound() {found = true;}

   public void move() {}

   public void moveTo(Square s) {
      if (this.location() != null) {
         this.location().setTreasure(null);
      }
      super.moveTo(s);
      s.setTreasure(this);
   }

   public String toText(char delimiter) {
      return super.toText(delimiter) + delimiter + found;
   }

   public void toObject(Scanner input) {
      super.toObject(input);
      this.location().setTreasure(this);
      found = input.nextBoolean();
   }

}
