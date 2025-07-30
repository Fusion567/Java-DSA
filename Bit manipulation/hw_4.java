/* Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from 
one number system to another. [BONUS] */

import java.util.Scanner;

public class hw_4 {
    public static int decimalToBinary(int n){
        return;
    }
    public static int binaryToDecimal(int m){
        for (int pos = 0; pos < 32; pos++) {
            int bitmask = 1<<pos;
        }
        return;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a decimal number: ");
            int n = sc.nextInt();

            System.out.println("Decimal to Binary: " + decimalToBinary(n));    
        
            System.out.println("Binary to Decimal: " + binaryToDecimal("1010"));
    }
}
