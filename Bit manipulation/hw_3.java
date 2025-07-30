//Write a program to count the number of 1’s in a binary representation of the number.
import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int result = 0; 

        for (int pos = 0; pos < 32; pos++) { 
            int bitmask = 1 << pos; 
            if ((bitmask & n) != 0) { 
                result++; 
            }
        }

        System.out.println("Number of 1's are: " + result);
        scanner.close();
    }
}
