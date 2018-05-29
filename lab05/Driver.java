public class Driver {

   public static void main(String args[]) {
   

   /**
    * Animal tests
    */
      System.out.println("ANIMAL TESTS");

      // Constructors
      Animal a1 = new Animal(2); // original
      Animal a2 = new Animal(2); // same
      Animal a3 = new Animal(4); // different

      // equals()
      System.out.println("Expected: True   Result: " + a1.equals(a2));
      System.out.println("Expected: False   Result: " + a1.equals(a3));

      // toString()
      System.out.println(a1.toString());

      System.out.println();

   /**
    * Person tests
    */
      System.out.println("PERSON TESTS");

      // Constructors
      Person p1 = new Person("Yogurt", 2); // original
      Person p2 = new Person("Yogurt", 2); // same
      Person p3 = new Person("McCheesy", 2); // different - name
      Person p4 = new Person("Yogurt", 3);  // different - legs

      // equals()
      System.out.println("Expected: True   Result: " + p1.equals(p2));
      System.out.println("Expected: False   Result: " + p1.equals(p3));
      System.out.println("Expected: False   Result: " + p1.equals(p4)); 

      // toString()
      System.out.println(p1.toString());

      System.out.println();

   /**
    * Student tests
    */
      System.out.println("STUDENT TESTS");

      // Constructors
      Student s1 = new Student(4.0, "Yogurt", 2); // original
      Student s2 = new Student(4.0, "Yogurt", 2); // same
      Student s3 = new Student(3.57, "Yogurt", 2); // different - gpa
      Student s4 = new Student(4.0, "McCheesy", 2); // different - name
      Student s5 = new Student(4.0, "Yogurt", 3); // different - legs

      // equals
      System.out.println("Expected: True   Result: " + s1.equals(s2));
      System.out.println("Expected: False   Result: " + s1.equals(s3));
      System.out.println("Expected: False   Result: " + s1.equals(s4));
      System.out.println("Expected: False   Result: " + s1.equals(s5));

      // toString()
      System.out.println(s1.toString());



   }
}
