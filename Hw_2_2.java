import java.util.Scanner;

/*
Make a program that takes the radius of a circle as input, calculates its radius 
and area and prints it as output to the user.
 */	
public class Hw_2_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        System.out.println("Radius of circle: "+radius);
        float area = (float) (Math.PI * Math.pow(radius,2));
        System.out.println("Area of circle: "+area);
    }
}