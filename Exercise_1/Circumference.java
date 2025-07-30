//Q4
import java.util.Scanner;

public class Circumference {
    public static double circle(double r){
        double pi = Math.PI;
        double circumference = 2 * pi * r;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of a circle: ");
        float r = sc.nextFloat();

        double circumference = circle(r);
        System.out.println("Circumference of circle is: "+ circumference);
    }
}
