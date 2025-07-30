//Write a program to toggle a bit a position = “pos” in a number “n”.
import java.util.Scanner;

public class hw_2 {
    public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Enter a number (n): ");
                int n = scanner.nextInt();
                System.out.print("Enter the position to toggle (pos): ");
                int pos = scanner.nextInt();
        
                int mask = 1 << pos; 
                int result = n ^ mask; // Toggle the bit using XOR
        
                System.out.println("Number after toggling the bit at position " + pos + ": " + result);
                scanner.close();
            }
}