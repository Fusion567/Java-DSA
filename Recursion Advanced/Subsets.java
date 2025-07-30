//Print all Subsets of a set of first n natural numbers
//Time Complexity O(2^n)
import java.util.*;

public class Subsets {
    
    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findsubset(int n,ArrayList<Integer> subset){
        if(n==0){
            printsubset(subset);
            return;
        }
        //if added
        subset.add(n);
        findsubset(n-1,subset);

        //if not added
        subset.remove(subset.size()-1);
        findsubset(n-1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findsubset(n, subset);
    }
}
