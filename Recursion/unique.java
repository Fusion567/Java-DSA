// Important for placements
//Print all unique subsequences of a string.
// Also knows as longest common subsequence
import java.util.HashSet;
public class unique {
    public static void subsequences(String str, int index, String newString, HashSet<String> set){
        //base case
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.err.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(index);
        
        //to be
        subsequences(str, index+1, newString+currChar,set);
        //not to be
        subsequences(str, index+1, newString,set);
    }
    
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subsequences("aaa", 0, " ",set);
    }
}
