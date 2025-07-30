public class power_2 {
    public static int printpower(int x, int n){
        if (n==0) {
            return 1;
        }
        if(x==0){
            return 0;
        }
        
        //if n is even
        if(n%2==0){
            return printpower(x, n/2)*printpower(x, n/2);
        }else{//if odd
            return printpower(x, n/2)*printpower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x =2, n= 4;
        int ans = printpower(x, n);
        System.out.println(ans);;
    }
}
