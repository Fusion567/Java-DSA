//Count total path in a maze to move from (0,0) to (n,m)
//backtracking approach
public class maze {
    public static int travel(int i,int j,int n,int m){

        if(i==n || j==m){
            return 0;
        }

        if(i==n-1&&j==m-1){
            return 1;
        }
        //move downwards
        int downpaths = travel(i+1,j,n,m);
        //move rightwards
        int rightpaths = travel(i,j+1,n,m);

        return downpaths+rightpaths;

    }
    public static void main(String[] args){
        int CountPath = travel(0, 0, 3, 3);
        System.out.println(CountPath);
    }
}
