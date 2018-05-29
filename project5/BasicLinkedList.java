import java.lang.IndexOutOfBoundsException;
import java.lang.UnsupportedOperationException;
import java.util.*;

public class BasicLinkedList<E> implements BasicList<E>{

   // instance variables (up to 3)
   private int size = 0;
   private Node head = null;
   private Node tail = null;

   // Constructor
   public BasicLinkedList() {}

   // Methods
   public void add(E element) {
      Node newNode = new Node(null, null, element);
      Node formerTail;

      if (size == 0) {
         head = newNode;
         tail = newNode;
      }
      else {
         formerTail = tail; 
         tail = newNode; // new node becomes tail
         formerTail.next = tail;
         tail.previous = formerTail;             
      }
      size++; 
   }

   public void add(int index, E element) {
      Node newNode = new Node(null, null, element);
      int curIdx = 0;
      Node prevNode = null;
      Node curNode = null;
      Node nextNode = null;
      boolean foundIdx = false;

      if (index > size || index < 0)
         throw new IndexOutOfBoundsException();
      // list is empty
      if (index == size) {
         add(element); 
      }
      // list not empty
      else {
         // __begin search at head__
         if (index <= (size/2)) {
            curIdx = 0;
            curNode = head;
            nextNode = curNode.next;
            prevNode = curNode.previous;        
            while (foundIdx == false) {
               if (curIdx == index) {
                  foundIdx = true; 
               }
               else {
                  curNode = nextNode;
                  nextNode = curNode.next;
                  prevNode = curNode.previous;
                  curIdx ++;
               }
            }
         }
         else if (index >= (size/2)) {
            curIdx = size-1;
            curNode = tail;
            nextNode = curNode.next;
            prevNode = curNode.previous;
            while (foundIdx == false) {
               if (curIdx == index) { 
                  foundIdx = true;                  
               }
               else {
                  curNode = prevNode;
                  prevNode = curNode.previous;
                  nextNode = curNode.next;
                  curIdx --;
               }
            }
         }
      }
      if (foundIdx == true) {
         nextNode = curNode;
         curNode = newNode;
         curNode.next = nextNode;
         curNode.previous = prevNode;
         nextNode.previous = curNode;
         if (index == 0) {
            head = curNode;
         }
         else if ((0 < index) && (index < size)) {
            prevNode.next = curNode;
         }
         size++;
      }
   }

 
   public BasicListIterator<E> basicListIterator() {
      BasicListIterator<E> iterator = new MyIterator(this);
      return iterator;
   }

   public void clear() {
      int initialSize = size;
      Node curNode;
      Node nextNode = head;

      for (int i = 0; i < initialSize; i++) {
         curNode = nextNode;
         if (curNode.item == null) {
            curNode.next = null;
            curNode.previous = null;
            curNode.item = null;
            size--;
         }
         else {
            nextNode = curNode.next;
            curNode.next = null;
            curNode.previous =  null;
            curNode.item = null;
            size --;
         }
      }
      head = null;
      tail = null;

   }

   public boolean contains(E element) {
      Node curNode = head;

      for (int i = 0; i < size; i++) {
         if (curNode.item == null) {
            if (element == null)
               return true;
         }
         else if (curNode.item.equals(element)) {
            return true;
         }
         if (curNode.next != null) {
            curNode = curNode.next;
         }
         else return false;
      }
      return false;
   }


   public E get(int index) {
      int curIdx=0;
      Node curNode = head;
      boolean foundIdx = false;

      if (index <= (size/2)) {
         curNode = head;
         curIdx = 0;
      }
      else if (index >= (size/2)) {
         curNode = tail;
         curIdx = size - 1;
      }
      if (curNode == head) {
         while (foundIdx == false) {
            if (curIdx >= size) 
               throw new IndexOutOfBoundsException();
            else if (curIdx == index) {
               foundIdx = true;
            }
            else {
               curNode = curNode.next;
               curIdx++;
            }
         }
      }
      else if (curNode == tail) {
         while (foundIdx == false) {
            if (curIdx < 0) 
               throw new IndexOutOfBoundsException();
            else if (curIdx == index)
               foundIdx = true;
            else {
               curNode = curNode.previous;
               curIdx--;
            }
         }     
      }
      return curNode.item;
   }



   public int indexOf(E element) {
      int idx = 0;
      Node curNode = head;
      boolean foundE = false; 

      while (foundE == false) {
         if (idx >= size)
            throw new NoSuchElementException();
         else if (curNode.item == null) {
            if (element == null) {
               foundE = true;
            }    
            else   
               idx ++;
         }
         else if ((curNode.item).equals(element))
               foundE = true;
         else {
            curNode = curNode.next;
            idx ++;
         }

      }
      return idx;
   }

   public Iterator<E> iterator() {
       Iterator<E> iterator = new MyIterator(this);
       return iterator;
   }

   public E remove(int index) {
      int curIdx = 0;
      Node curNode = head;
      Node nextNode = null;
      Node prevNode = null;
      boolean foundIdx = false;
      E element = null;
      
      if (size == 0) {
         throw new IndexOutOfBoundsException(); 
      }

      while (foundIdx == false) {
         if (curIdx >= size) {
            throw new IndexOutOfBoundsException();
         }
         else if (curIdx == index) {
            foundIdx = true;
            element = curNode.item;
         }
         else {
            curNode = curNode.next;
            curIdx ++;
         }
      }  
      // foundIdx == true   
      prevNode = curNode.previous;
      nextNode = curNode.next;
      curNode = nextNode;
      if (size == 1) {
         head = null;
         tail = null;
      }
      else if (index == 0) {
         curNode.previous = prevNode;
         head = curNode;
      }
      else if (index == size-1) {
         prevNode.next = curNode;
         tail = prevNode;
      }
      else {
         nextNode = nextNode.next;
         curNode.previous = prevNode;
         prevNode.next = curNode;
      }
      size--;
      return element;
   }

   public E set(int index, E element) {
      Node newNode = new Node(null,null,element);
      E oldItem = null;
      int curIdx = 0;
      Node curNode = head;
      Node prevNode = new Node();
      Node nextNode = new Node();
      boolean foundIdx = false;

      if ((index < 0) || (index >= size)) {
         throw new IndexOutOfBoundsException();
      }
      while (foundIdx == false) {
         prevNode = curNode.previous;
         nextNode = curNode.next;
         if (curIdx > size) {
            throw new IndexOutOfBoundsException(); 
         }
         else if (curIdx == index) {
            foundIdx = true;
            oldItem = curNode.item;
         }
         else {
            curNode = curNode.next;
            curIdx ++;
         }
      }
      if (foundIdx == true) {
         curNode = newNode;
         curNode.next = nextNode;
         curNode.previous = prevNode;
         if (index == 0 && size == 1) {
            head = curNode;
            tail = curNode;
         }
         else if (index == 0 && size > 1) {
            nextNode.previous = curNode;
            head = curNode;
         }
         else if ((index > 0) && (index < size - 1)) {
            prevNode.next = curNode;
            nextNode.previous = curNode;
         }
         else if ((index == size - 1) && (size > 1)) {
            prevNode.next = curNode;
            tail = curNode;
         }
      }
      return oldItem;
   }

   public int size(){
      return size;
   }

   private Node head() {
      return this.head;
   }


   private class Node {

      // INSTANCE VARIABLES
      public Node next;
      public Node previous;
      public E item;

      // CONSTRUCTOR
      public Node(Node next, Node previous, E item) {
         this.next = next;
         this.previous = previous;
         this.item = item;
      }

      public Node() {
         this.next = null;
         this.previous = null;
         this.item = null;
      }
 
      public boolean exists() {
         if (item == null) 
            return false;
         else return true;
      }
   }

   private class MyIterator implements BasicListIterator<E>{
      
      // INSTANCE VARIABLES
      private BasicLinkedList<E> list;
      private Node node = head;
      private Node pnode = null;

      // Constructor
      public MyIterator(BasicLinkedList<E> list) {
         this.list = list;          
      }

      public boolean hasNext() {
         if (node == null)
            return false;
         return true;
      }

      public boolean hasPrevious() {
         if (pnode == null)
            return false;
         return true;
      }

      public E next() {
         try {
            E element = null;
            if (!hasNext())
              throw new NoSuchElementException();
            else {
               element = node.item;
               pnode = node;
               node = node.next;
            }
            return element;
         }
         catch (NoSuchElementException e) {
            throw e;
         }
      }

      public E previous() {
         try {
            E element = null;
            if (!hasPrevious())
              throw new NoSuchElementException();
            else {
               element = pnode.item;
               node = pnode;
               pnode = pnode.previous;
            }
            return element;
         }
         catch (NoSuchElementException e) {
            throw e;
         }
      }

      public void remove() {
         throw new UnsupportedOperationException();
      }

   }
}
