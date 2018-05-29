public class NegativeRadiusException extends CircleException {

   // Instance variables
   private double rad;

   public NegativeRadiusException(double radius) {
      super("negative radius");
      rad = radius;
   }

   public double radius() {return rad;}
}
