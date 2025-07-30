//Print x^n (with stack height = n)
public class power {
    public static int printpower(int x, int n){
        if (n==0) {
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpownM1 = printpower(x,n-1);
        int xpown = xpownM1*x;
        return xpown;
    }
    public static void main(String[] args) {
        int x =2, n= 4;
        int ans = printpower(x, n);
        System.out.println(ans);;
    }
    
}
