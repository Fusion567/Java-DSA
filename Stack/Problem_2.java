import java.util.*;
public class Problem_2 {
    public static void pushAtBottom(int data, Stack<Integer> s){
        //Base Case: If the stack is empty, push data and return.
        if(s.isEmpty()){
            s.push(data);
            return; 
        }

        //Recursive Case:
        // Pop the top element and store it.
        int top = s.pop();
        // Recursively call pushAtBottom(data, s) to reach the bottom.
        pushAtBottom(data, s);
        // Once data is placed at the bottom, push back all the popped elements.
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return; 
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void printStack(Stack<Integer> s) {
        //Create a Temporary Stack
        Stack<Integer> temp = new Stack<>();
        
        while (!s.isEmpty()) {
            int val = s.pop();
            System.out.print(val + " ");
            temp.push(val);
        }
        System.out.println();
    
        // Push elements back to original stack
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Stack before reverse:");
        printStack(s);

        reverse(s);

        System.out.println("Stack after reverse:");
        printStack(s);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
