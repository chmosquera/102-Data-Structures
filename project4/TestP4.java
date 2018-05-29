import java.util.*;
import java.io.*;


public class TestP4 {

   public static void main(String args[]) throws IOException, FileNotFoundException, MazeReadException {

      Maze maze;

      // Read & Write mazeBadLineFormat2.txt
      maze = new Maze();

      maze.readMazeFromFile("mazeBadLineFormat2.txt");
      maze.writeMazeToFile("newMazeBadLineFormat2.txt");

      // Read & Write mazeDupSquare.txt
      maze = new Maze();

      maze.readMazeFromFile("mazeDupSquare.txt");
      maze.writeMazeToFile("newMazeDupSquare.txt");


   }


}
