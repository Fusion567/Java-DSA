//print numbers in descending order
public class numbers2 {
    public static void printnumbers(int n){
        if(n==6){
            return;
        }
        System.out.print(n+ " ");
        printnumbers(n+1);
    }
    public static void main (String args[]){
        int n=1;
        printnumbers(n);
    }
}
