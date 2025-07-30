//Q8
import java.util.Scanner;

public class power {
    public static double Power(double x, double n){
        double power = Math.pow(x, n);
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double x = sc.nextDouble();
        System.out.print("Enter the power: ");
        double n = sc.nextDouble();

        double power = Power(x,n);
        System.out.println("The value of " + x + " raised to " + n + " is: " + power);
    }
}
