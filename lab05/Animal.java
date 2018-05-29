/**
 * A class describing an animal
 *
 * @author Chanelle Mosquera
 * @version Lab 05
 * @version CPE102-15
 * @version Spring 2016
 */

public class Animal {
   
   // instance variables
   private int legs;

   // Constructor
   public Animal(int legs) {
      this.legs = legs;
   }
   
   public boolean equals(Object other) {
      if (other == null) {return false;}

      if ( !(this.getClass().equals( other.getClass() )) ) {return false;}

      Animal animal = (Animal)other;
      return legs == animal.legs;
    }

   public String toString() {
      return "I am an Animal object with " + legs + " legs";
   }

}
