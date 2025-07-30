//Remove duplicates in a string.
//time commplexity = O(n)
public class duplicate {
    public static boolean[] map= new boolean[26];

    public static void removeDuplicates(int index,String newString, String str) {
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar-'a']==true){
            removeDuplicates(index+1, newString, str);
        }else{
            newString+=currChar;
            map[currChar-'a'] = true;
            removeDuplicates(index+1, newString, str);
        }

    }
    public static void main(String[] args) {
        String str = "aabbccddg";
        removeDuplicates(0, " ",  str);
    }
}
