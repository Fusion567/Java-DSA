//Find the occurrence of the first and last occurrence of an element using recursion.
public class Occurence {
    public static int first = -1;
    public static int last = -1;


    public static void occurance(String str, int index, char element) {
        if (index == str.length()) {
            return;
        }

        char currchar =str.charAt(index);
        
        if(currchar == element){
            if(first ==-1){
                first = index;
            }else{
                last = index;
            }
            }
        occurance(str, index+1, element);
    }
    public static void main(String[] args) {
        String str = "Yashraj";
        occurance(str, 0, 'a');
        System.out.println("First Occurance: "+ first);
        System.out.println("Last Occurance: "+ last);
    }
}
