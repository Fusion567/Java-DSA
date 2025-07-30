import java.util.Scanner;
public class scan {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        
        String name =sc.next();//next(): One single word single token is scanned
        System.err.println(name);

        /*
        String name =sc.nextLine();//nextline(): Sentence is scanned
        System.err.println(name);
        */

        //nextint(): Is used to take integer as input
        //nextfloat(): Is used to take Float number as input
    }
}
