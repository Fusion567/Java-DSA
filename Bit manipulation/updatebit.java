import java.util.*;
public class updatebit {
    public static void main(String[] args) {
        int n = 5;//0101
        int pos = 1;
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int bitmask = 1<<pos;
        
        if(oper==1){
            //set operation
            int newnumber = n|bitmask;
            System.out.println(newnumber);
        }else{
            //clear operation
            int newBitmask = ~(bitmask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }
    }
}
