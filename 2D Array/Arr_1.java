// take matrix as input from user and search for a given number x and print the indices
import java.util.Scanner;

class Arr_1{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int column = sc.nextInt();

        int numbers[][] = new int[row][column];
        System.out.println("Enter the elements of the matrix:");

        for(int i = 0;i<row;i++){
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number to search for:");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (numbers[i][j] == x){
                    System.out.println("Number " + x + " is found at index [" + i + ", "+j+"]");
                }
            }
        }
    }
}