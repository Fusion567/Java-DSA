import java.util.*;
public class Framework {
    public static void main(String[] args) {
        //Imp Difference between Dequeue and Linkedlist framework
        //Queue<Integer> q = new ArrayDeque<><>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
