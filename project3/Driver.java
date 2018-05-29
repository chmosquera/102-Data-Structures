public class Driver {

   public static void main(String[] args) {
   
      Square[][] mazeSquares = new Square[5][5];
      Maze maze;
      Explorer ex;
      
      /*     -------------
       *     |       |   |
       *     |       |   |
       *     -----   -   |
       *     |   |       |
       *     |   |       |
       *     |   -   -   |
       *     |       |   |
       *     |       |   |
       *     -------------
       */
    
      mazeSquares[0][0] = new Square(true, false, true, true, 0, 0);
      mazeSquares[0][1] = new Square(true, true, false, false, 0, 1);
      mazeSquares[0][2] = new Square(true, true, false, true, 0, 2);
      mazeSquares[1][0] = new Square(true, true, false, true, 1, 0);
      mazeSquares[1][1] = new Square(false, false, false, true, 1, 1);
      mazeSquares[1][2] = new Square(false, true, false, false, 1, 2);
      mazeSquares[2][0] = new Square(false, false, true, true, 2, 0);
      mazeSquares[2][1] = new Square(false, true, true, false, 2, 1);
      mazeSquares[2][2] = new Square(false, true, true, true, 2, 2);
      
      maze = new Maze(mazeSquares, 3, 3);
      ex = new Explorer(mazeSquares[0][0], maze, "Super Chris");

      System.out.println("squares[0][0] is inView? " + mazeSquares[0][0].inView());

      int l = 12;
      int w = 8;
      int d = 2;

      int side1 = 12 * 2;
      int side2 = 12 *8;
      int side3 = 2*8;

      int SA = (2*side1) +(2*side2) + (2*side3);
      System.out.println(SA);

   }

}
