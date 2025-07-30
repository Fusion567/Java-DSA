import java.util.Scanner;

// Make a Calculator
public class Hw_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();
        switch (button) {
            case 1: System.out.println("Addition= "+(a+b));
            break;
            case 2: System.out.println("Subtraction= "+(a-b));
            break;
            case 3: System.out.println("Multiplication= "+(a*b));
            break;
            case 4: System.out.println("Division= "+(a/b));
            break;
            case 5: System.out.println("Modulo= "+(a%b));
            break;
            default:
                break;
        }
    }    
}
