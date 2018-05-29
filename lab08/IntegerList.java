import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;
import java.lang.StringBuilder;

public class IntegerList {

   // Instance Variables
   ArrayList<Integer> intList;

   // Constructor
   public IntegerList(int numObj, int max) {
      intList = new ArrayList<Integer>(numObj);
      Random rand = new Random();
      for (int i=0; i < numObj; i++) {
         int obj = rand.nextInt(max);
         intList.add(obj);
      }
   }
 
   public IntegerList(int numObj, int max, int seed) {
      intList = new ArrayList<Integer>(numObj);
      Random rand = new Random(seed);
      for (int i=0; i< numObj; i++) {
         int obj = rand.nextInt(max);
         intList.add(obj);
      }
   }

   public void sort() {
      Collections.sort(intList);   
   }
      
   public void sort(Comparator<Integer> comp) {
      // sort intList according to COmparator 
      Collections.sort(intList, comp);
   }

   public boolean isSorted() {
      // check if the list is in natural order specified by Integer's compareTo()
      ArrayList<Integer> sortedIntList = new ArrayList<Integer>(intList);
      Collections.sort(sortedIntList);
      for (int i = 0; i < intList.size(); i++) {
         if (intList.get(i).compareTo(sortedIntList.get(i)) != 0)
            return false;
      }
      return true;
   }

   public boolean isSorted(Comparator<Integer> comp) {
      ArrayList<Integer> sortedIntList = new ArrayList<Integer>(intList);
      Collections.sort(sortedIntList, comp);

      for (int i = 0; i < intList.size(); i++) {
         if (intList.get(i).compareTo(sortedIntList.get(i)) != 0)
            return false;
      }
      return true;
   }


   public String toString() {
      StringBuilder strInt = new StringBuilder();

      for (Integer i: intList) {
         strInt.append(i.toString() + '\n');
      }

      return strInt.toString();
   }

   public int get(int index) {
      return intList.get(index);
   }

   public void mySLOsort() { // selection
      int smallest;
      int smallIndex;
      for (int i = 0 ; i < intList.size(); i++)
      {
         smallest = intList.get(i);
         smallIndex = i;
         for (int j = i + 1; j < intList.size() ; j++)
         {
            if (smallest > intList.get(j)) {
               smallest = intList.get(j);
               smallIndex = j;
            }
         }
         if (smallIndex != i) {
           int temp = intList.get(i);
           intList.set(i, intList.get(smallIndex));
           intList.set(smallIndex, temp);
         }
      }
   }

   public void mySLOsort(Comparator<Integer> comp) { //insertion
      int num;
      for (int i = 1; i < intList.size(); i++) {
         num = intList.get(i);
         int j = i;
         while (j > 0 && ((comp.compare(num, intList.get(j-1)) < 0))) {
            intList.set(j, intList.get(j-1));
            j-=1;
         }
         intList.set(j, num);
      }
   }

   public int binarySearch(int idx) {
      int min = 0;
      int max = intList.size() -1;
      while (min < max) {
         int midpt = ((min+max)/2);
         if (intList.get(midpt) == idx)
            return midpt;
         else if (intList.get(midpt) < idx)
            min = midpt + 1;
         else
            max = midpt - 1;
      }
      return (-1);
   }


}
