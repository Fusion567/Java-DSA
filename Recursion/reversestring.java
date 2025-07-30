//To reverse a string using recursion
public class reversestring {
    public static void reverse(String str, int index){
        if(index == 0){
            System.out.print(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index)+" ");
        reverse(str, index-1);

    }

    public static void main(String[] args) {
        String str = "Maybe in another life";
        reverse(str, str.length()-1);
    }
}
