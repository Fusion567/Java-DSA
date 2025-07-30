//Q5
import java.util.Scanner;

public class vote {
    public static void voter(int age){
        if (age>18){
            System.out.println("Person is an adult and eligible to vote");
        }
        else{
            System.out.println("Person is underage and not eligible to vote");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        voter(age);
    }
}
