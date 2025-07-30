//Time complexity - O(n*n!)
public class arrangement{
    public static void printArr(String str, String arrangemment, int index) {
        if(str.length()==0){
            System.out.println(arrangemment);
            return;
        }
            for(int i=0;i<str.length();i++){
                char currchar = str.charAt(i);
                String newstr = str.substring(0,i)+str.substring(i+1);
                printArr(newstr, arrangemment+currchar, index+1);
            }
    }
    public static void main(String[] args) {
        String str = "abc";
        printArr(str, " ", 0);
    }

}