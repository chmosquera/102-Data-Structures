public class RecursionLab {

   public static int countSpaces(String sentence) {
      int counter = 0;
      if (sentence.length() > 1) {
         if (sentence.charAt(0) == ' ')
            counter = 1;
         else counter = 0;
      }
   //   if (sentence.length() > 1) 
     //    subString = sentence.substring(1);
      if (sentence.length() == 1) 
         return counter;
      String subString = sentence.substring(1);
      return counter + countSpaces(subString);
   }

   public static int findMax(int[] items, int index) {
      int max = items[index];
      int[] list = items.clone();

      if ((list.length - index) > 1) {
         if (list[index + 1] > max) 
            max = list[index + 1];
         else
            list[index + 1] = max;
      }
      if (index < list.length-1) {
         findMax(list, index + 1);
      }
      return max;
   }

   public static boolean isPalindrome(String sentence) {
      boolean same = true;
      String subString = sentence.substring(1, sentence.length() - 2);
      if (sentence.length() > 1) {
         if (sentence.charAt(0) == sentence.charAt(sentence.length() - 1))
            same = true;
         else 
             same = false;
      }
      return same && isPalindrome(subString);
   }


}
