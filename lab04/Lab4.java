/**
 * Scanner input and Array List
 *
 * @author Chanelle Mosquera
 * @version Lab 04
 * @version CPE102-15
 * @version Spring 2016
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Double;

public class Lab4{

   public static void main(String[] args){

      // Declare and construct a Scanner object to read from command line
      Scanner scanner = new Scanner(System.in);

      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Double> doubleList = new ArrayList<Double>();
      ArrayList<String> strList = new ArrayList<String>();
      boolean quit = false;

      do {

         // Prompt for input in command line
         System.out.print("Enter an int, double, any random text, or type 'quit' to end: ");

         // Read input
  
         if (scanner.hasNextInt() == true){
            intList.add(new Integer(scanner.nextInt()));
            scanner.nextLine();
         }
         else if (scanner.hasNextDouble() == true) {
            doubleList.add(new Double(scanner.nextDouble()));
            scanner.nextLine();
         }
         else if (scanner.hasNext("quit") == true) {
            quit = true;
         }
         else {

            strList.add(scanner.nextLine());
         }


      } while (quit == false);

      // Prints
      System.out.println("Integers:");
      for (int i = 0; i < intList.size(); i++) {
         System.out.println("   Integer[" + i + "] is " + intList.get(i));
      }

      System.out.println("Doubles:");
      for (int i = 0; i < doubleList.size(); i++) {
         System.out.println("   Doubles[" + i + "] is " + doubleList.get(i));
      }

      System.out.println("Other:");
      for (int i = 0; i < strList.size(); i++) {
         System.out.println("   Other[" + i + "] is " + strList.get(i));
      }

   }

} 
