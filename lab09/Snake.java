public class Snake implements TotemPole {

   private TotemPole x;

   public Snake(TotemPole x) {
      this.x = x;
   }

   public int power() {
      int points = 3;
      return points + x.power();

   }  // the total power of the pole

   public int height() {
      int heads = 1;
      return heads + x.height();

   } // the number of heads in the pole

   public boolean chiefPole(int bearCount) {
      int count = 0 * bearCount;
      if (count >= 3) 
         return true && x.chiefPole(count);
      return false && x.chiefPole(count);
      

   }  // is this pole worthy of a chief?
         // bearCount is how many bears encountered in a row so far

}
