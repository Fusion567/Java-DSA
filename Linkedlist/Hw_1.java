/* Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
   Search for the number 7 & display its index. */
import java.util.*;

   class Hw_1 {
    public static void main(String[] args) {
      LinkedList <Integer> list  = new LinkedList<>();
      list.add(1);
      list.add(5);
      list.add(7);
      list.add(3);
      list.add(8);
      list.add(2);
      list.add(3);

      int target = 7;
      // Search for the number and display its index
      int index = list.indexOf(target);

      if (index != -1) {
          System.out.println("The number " + target + " is found at index: " + index);
      } else {
          System.out.println("The number " + target + " is not found in the list.");
      }
    }
}
