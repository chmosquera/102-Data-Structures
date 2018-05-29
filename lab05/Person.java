public class Person extends Animal {

   // Instance Variable
   private String name;

   // Constructor
   public Person(String name, int legs) {
      super(legs);
      this.name = name;
   }

   public boolean equals(Object other) {
      return super.equals(other) &&
             this.name.equals(((Person)other).name);
             
   } 

   public String toString() {
      return super.toString() + " and a Person object whose name is " + name;
   }

}
