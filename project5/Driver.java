public class Driver {


   public static void main(String[] args) {
/*
      BasicLinkedList<Integer> list = new BasicLinkedList<Integer>();

     for (int i = 0; i < 20; i++)
      {
         if (i % 2 == 0)
         {
            list.add(null);
         }
         else
         {
            list.add(i);
         }

         for (int j = 0; j <= i; j++)
         {
            Integer actual = list.get(j);

            if (j % 2 == 0)
            {
               //pass &= test(actual == null,
                 //          "get(): Expected null, found " + actual);
               System.out.println("get(): expectation: null" + " actual: " + actual);
            }
            else
            {
               //pass &= test(actual.equals(j),
                  //         "get(): Expected " + j + ", found " + actual);
               System.out.println("get(): expectation: " + j + " actual: " + actual);
            }
         }
      }

      BasicListIterator<Integer> it = list.basicListIterator();
      for (int i = 0; i < list.size(); i++)
      {
         Integer value = it.next();

         if (i % 2 == 0)
         {
           //pass &= test(value == null, "BasicListIterator.next = expected null element");
               System.out.println("expectation: null" + " actual: " + value);
         }
         else
         {
//            pass &= test(value == i, "BasicListIterator.next = expected " + i);
               System.out.println("expectation: " + i + " actual: " + value);
         }
      }
/*
      for (int i = 19; i < -1; i--)
      {
         Integer value = it.previous();

         if (i % 2 == 0)
         {
            pass &= test(value == null, "BasicListIterator.previous = expected null element");
         }
         else
         {
            pass &= test(value == i, "BasicListIterator.previous = expected " + i);
         }
      }
*/
      BasicLinkedList<Integer> list = new BasicLinkedList<Integer>();
      int[] ints = new int[] {99, 88, 77, 66, 55};
      
      BasicListIterator<Integer> iter;
      iter = list.basicListIterator(); 
      list.add(ints[0]);
      iter = list.basicListIterator(); 

System.out.println(list.get(0));
System.out.println(iter.hasNext());



   }
}

