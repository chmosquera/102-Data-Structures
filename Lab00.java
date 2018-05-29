public class Lab00
{
   public static void main(String[] args)
   {
    // declaring and initializing some variables
    int x = 5;
    String y = "hello";
    double z = 9.8;
   
    // print the variables
    System.out.println("x: " + x + " y: " + y + " z: " + z);

    // a list (make an array in java)
    int nums[] = {3,6,-1,2};
    for(int num:nums)
	System.out.println(num);

    // call a function
    int numFound;
    numFound = char_count(y,'l');
    System.out.println("Found: " + numFound);
    
    // a counting for loop
    for(int i=1; i<11; i++)
        System.out.print(i + " ");
    System.out.println();


   }
   public static int char_count(String s, char c)
   {
    int cnt = 0;
    for(int i=0; i<s.length(); i++)
       {
       if (s.charAt(i) == 'l')
          cnt += 1;
       }
     return cnt;
    }
}

