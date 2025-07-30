import java.util.Scanner;

public class Spiral_matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];
        for(int i = 0;i<row;i++){
            for (int j = 0; j < column; j++) {
                matrix  [i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Order of Matrix:");
        int row_start= 0;
        int row_end = row-1;
        int column_start= 0;
        int column_end = column-1;

        while(row_start<=row_end && column_start<=column_end){
            
            for (int j = column_start; j <= column_end; j++) {
                System.out.print(matrix[row_start][j] + " ");
            }
            row_start++;

            for (int i = row_start; i <= row_end; i++) {
                System.out.print(matrix[column_end][i] + " ");
            }
            column_end--;

            for (int j = column_end; j >= column_start; j--) {
                System.out.print(matrix[row_end][j] + " ");
            }
            row_end--;

            for (int i = row_end; i >= row_start; i--) {
                System.out.print(matrix[i][column_start] + " ");
            }
            column_start++;

            System.out.println();
        }
    }
}
