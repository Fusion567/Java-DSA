//Print the fibonacci sequence till nth term.
public class fibonnaci {
    public static void fibb(int a,int b,int n){
        if (n==0){
            return;
        }
        int c = a+b;
        System.out.print(a + " ");
        fibb(b,c,n-1);
    }
    public static void main(String[] args) {
        System.out.print("Fibonacci sequence is: ");
        fibb(0,1,10);
    }
}

