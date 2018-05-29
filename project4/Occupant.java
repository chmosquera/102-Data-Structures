/**
 * Occupant.java
 * CPE102-23: Main parent class for all objects in game
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */
import java.util.Scanner;

public abstract class Occupant implements DelimitedTextIO {

   // instance variables
   private Square location;

   // constructor
   public Occupant() {
   }
  
   public Occupant(Square start) {
      location = start;
   }

   // Methods
   public Square location() {return location;}

   public void moveTo(Square newLoc) {location = newLoc;}

   public String toText(char delimiter) {
      return this.getClass().getName() + delimiter + location.row() + delimiter + location.col();
   }
}
