import java.util.Scanner;

public class Min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int Size = sc.nextInt();
        int num[] = new int [Size];
        
        for (int i = 0; i < Size; i++) {
            num[i] = sc.nextInt();
        }

        int max =  Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Maximum value is:"+ max);
        System.out.println("Minimum value is:"+ min);    
   }
}
