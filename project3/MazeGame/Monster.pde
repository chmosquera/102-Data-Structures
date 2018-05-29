/**
 * Monster.java
 * CPE102-23: Class that contains characteristics of Monster which is-a RandomOccupant
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */

public class Monster extends RandomOccupant {

   // CONSTRUCTORS
   public Monster(Maze maze) {
      super(maze);
   }

   public Monster(Maze maze, long seed) {
      super(maze,seed);
   }

   public Monster(Maze maze, Square location) {
      super(maze, location);
   }

}
