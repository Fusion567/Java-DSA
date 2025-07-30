import java.util.Scanner;

public class sortCheck {

    public static boolean isSort(int num[]){
        for (int i = 0; i < num.length - 1; i++) {
            if(num[i]>num[i+1]){
                return false;
            }
        }
        return true;
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int Size = sc.nextInt();

        int num[] = new int[Size];
        System.out.print("Enter the elements of the array:");

        for(int i = 0; i < Size;i++){
            num[i] = sc.nextInt();
        } 
        if (isSort(num)) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }

        sc.close();
    }
        
}