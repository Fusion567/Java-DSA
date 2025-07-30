//Tiling problem
//Place size of tiles 1xm in a floor of size nxm
public class Tiling {
    
    public static int place(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //horizontal placed
        int horizontal = place(n-1,m);
        //vertical placed
        int vertical = place(n-m,m);
        
        return horizontal+vertical;
    }
    public static void main(String[] args) {
        int ways = place(6,2);
        System.out.println(ways);
    }
}
