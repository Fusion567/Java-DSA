import java.util.Scanner;

public class Hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totalLength = 0;

        for(int i = 0; i < size; i++) {
            array[i] = sc.next();
            totalLength += array[i].length();
        }

        System.out.println(totalLength);
        sc.close(); // Closing the scanner
    }
}