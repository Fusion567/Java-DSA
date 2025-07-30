import java.util.Scanner;

//	Make a program that prints the table of a number that is input by the user
public class Hw_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Table of "+a);
        System.out.println(a+"x1 = "+(a*1));
        System.out.println(a+"x2 = "+(a*2));
        System.out.println(a+"x3 = "+(a*3));
        System.out.println(a+"x4 = "+(a*4));
        System.out.println(a+"x5 = "+(a*5));
        System.out.println(a+"x6 = "+(a*6));
        System.out.println(a+"x7 = "+(a*7));
        System.out.println(a+"x8 = "+(a*8));
        System.out.println(a+"x9 = "+(a*9));
        System.out.println(a+"x10 = "+(a*10));
    }        
}