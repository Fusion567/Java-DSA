import java.util.*;

public class for_loop_2 {
    public static void main(String[] args) {
        System.out.println("Print the sum of first n natural numbers.");
        System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of first "+n+" Natural numbers:"+sum);
    }
}
