import java.util.*;

public interface BasicListIterator<E> extends java.util.Iterator<E>{

   boolean hasPrevious();
   E previous();
}
   
