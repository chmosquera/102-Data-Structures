public class Student extends Person {

   // Instance variables
   private double gpa;

   public Student(double gpa, String name, int legs) {
     super(name, legs);
     this.gpa = gpa;
   }

   public boolean equals(Object other) {
      return super.equals(other) && 
             this.gpa == ((Student)other).gpa;
   } 

   public String toString() {
      return super.toString() + " and a Student object with a " + gpa + " gpa";
   }

}
