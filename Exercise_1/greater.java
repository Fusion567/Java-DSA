//Q3
import java.util.Scanner;

public class greater {
    public static int great(int a,int b){
        int Great = 0;
        if (a > b & a>Great){
            Great = a;
            return  Great;    
        }
        else{
            Great = b;
            return  Great;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        int Great = great(a,b);
        System.out.println("Greater number between "+ a + " and "+ b + " is: " + Great);
    }
}
