/* Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
   Delete all nodes which have values greater than 25. */
import java.util.*;
   class Hw_2 {
      LinkedList<Integer> list = new LinkedList<>();
      Scanner sc = new Scanner(System.in);

      public void add() {
         while (true) {
               System.out.println("Enter the element to be added in the list (Enter 0 to stop):");
               int num = sc.nextInt();

               if (num == 0) { 
                  break;
               }

               
               if (num >= 1 && num <= 50) {
                  list.add(num);
               } else {
                  System.out.println("Please enter a number in the range of 1 to 50.");
               }
         }
      }

      
      public void deleteGreaterThan25() {
         list.removeIf(n -> n > 25);
      }

      
      public void display() {
         System.out.println("Current List: " + list);
      }

    
      public static void main(String[] args) {
         Hw_2 obj = new Hw_2();

         
         obj.add();

         
         System.out.println("List before deletion:");
         obj.display();

         
         obj.deleteGreaterThan25();

         
         System.out.println("List after deletion:");
         obj.display();
   }
}
