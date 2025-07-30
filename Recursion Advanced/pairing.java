//Find number of ways in which you can invite  n people to your party, single or in pairs
public class pairing {
    
    public static int pair(int n){
        if(n<=1){
            return 1;
        }

        int way1 = pair(n-1);
        
        int way2 = (n-1) * pair(n-2);
        return way1+way2;  
    }
    public static void main(String[] args) {
        int Ways = pair(4);
        System.out.println(Ways);
    }
}