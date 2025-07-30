import java.util.Scanner;

public class name{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names you want to take as input: ");
        int Size = sc.nextInt();
        String name[] = new String[Size];
        
        for(int i=0; i<Size; i++){
            name[i] =sc.next();
        }

        for (String name1 : name) {
            System.out.println("Names are as follow: " + name1 + " ");
        }
    }
}