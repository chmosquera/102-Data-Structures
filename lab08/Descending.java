import java.util.*;

public class Descending implements Comparator<Integer> {

   public int compare(Integer int1, Integer int2) {
      if (int1 > int2) 
         return -1;
      if (int1 < int2) 
         return 1;
      return 0;
   }

}
