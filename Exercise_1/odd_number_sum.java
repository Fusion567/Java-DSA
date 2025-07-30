//Q2
import java.util.Scanner;

public class odd_number_sum {
    public static int OddSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int sum = OddSum(n);
        System.out.println("Sum of Odd n Numbers: " + sum);
    }
}
