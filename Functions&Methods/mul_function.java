import java.util.Scanner;

public class mul_function {
    public static float multiply(float a, float b){
        float product = a * b;
        return product;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of a: ");
        float a = sc.nextFloat();
        System.out.print("Value of b: ");
        float b = sc.nextFloat();

         float product = multiply(a,b); 
        System.out.println("Multiplication of 2 numbers: " + product);

    }
}
