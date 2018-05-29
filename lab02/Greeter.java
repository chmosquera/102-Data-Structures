public class Greeter
{
   // instance variables
   private String name;

   // default constructor
   public Greeter()
   {
   }

   // similar to __init__ in python
   public Greeter(String name)
   {
      this.name = name;
   }

   public String greet() 
   {
      if (this.name != null) 
         return "Hello " + this.name;

      else return "Heeeyyyy buddy!";

    }

   

   /* MAIN METHOD */
   public static void main(String arg[])
   {
      // tests
      Greeter person1 = new Greeter("Chanelle");
      Greeter person2 = new Greeter();
      System.out.println(person1.greet());
      System.out.println(person2.greet());

   }

}
