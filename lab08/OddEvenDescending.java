import java.util.*;

public class OddEvenDescending implements Comparator<Integer> {

   public int compare(Integer int1, Integer int2) {
      
      // (odd,even)
      if ((int1 % 2 == 1) && (int2 % 2 == 0))
         return -1;

      // (even,odd) 
      if ((int1 % 2 == 0) && (int2 % 2 == 1))
         return 1;
 
      // (odd,odd)
      if ((int1 % 2 == 1) && (int2 % 2 == 1)) {
         if (int1 < int2) 
            return 1;
         if (int1 > int2)
            return -1;
      }

      // (even, even)
      if ((int1 % 2 == 0) && (int2 % 2 == 0)) {
         if (int1 < int2)
            return 1;
         if (int1 > int2)
            return -1;
      }

      return 0;
   }

}
