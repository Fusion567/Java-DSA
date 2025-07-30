// Important for placements
//Print all the subsequences of a string.
//Time complexity O(2^n)
public class subsequence {
    public static void subsequences(String str, int index, String newString){
        if(index == str.length()){
            System.err.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        //to be
        subsequences(str, index+1, newString+currChar);
        //not to be
        subsequences(str, index+1, newString);
    }
    
    public static void main(String[] args) {
        subsequences("abc", 0, " ");
    }
}
