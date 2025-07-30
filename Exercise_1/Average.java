//Q1 
import java.util.Scanner;


public class Average{
    public static float Ave(float a, float b, float c){
        float average = (a+b+c)/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        float a = sc.nextFloat();
        System.out.print("Enter value of b: ");
        float b = sc.nextFloat();
        System.out.print("Enter value of c: ");
        float c = sc.nextFloat();

        float average = Ave(a,b,c);
        System.out.println("Average of 3 numbers: " + average);
    }
}