//Print all the permutations of a string
//backtracking approach
public class permutation{
    
    public static void printperm(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        
        for (int i = 0; i <str.length() ; i++) {
            char currChar = str.charAt(i);
            //"abc" -> bc
            String newString = str.substring(0,i)+ str.substring(i+1);
                printperm(newString, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printperm(str, " ");
    }
}