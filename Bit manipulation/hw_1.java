import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a power of 2
        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }

        scanner.close();
    }

    // Function to check if a number is a power of 2
    public static boolean isPowerOfTwo(int n) {
        // A power of 2 has only one bit set
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
