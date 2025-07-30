import java.util.Scanner;

public class Sum_function{
    public static int Sum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of a: ");
        int a = sc.nextInt();
        System.out.print("Value of b: ");
        int b = sc.nextInt();

        int sum = Sum(a,b);
        System.out.println("Sum: "+sum);
    }
}

