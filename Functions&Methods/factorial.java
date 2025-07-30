import java.util.Scanner;

public class factorial {
    public static int fact(int num){
        int factorial = 1;
        for (int i = num; i >=1; i--){
            factorial*=i ;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int num = sc.nextInt();

        int factorial = fact(num);
        System.out.println("Factorial of given number is:" + factorial);
    }
}
