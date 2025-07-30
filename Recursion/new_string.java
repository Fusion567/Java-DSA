//Move all ‘x’ to the end of the string.
public class new_string {
    public static void transfer(int index, String str,char element,int count, String newString){
        
        if(index==str.length()){
            for (int i = 0; i < count; i++) {
                newString+=element;
            }
            System.out.println(newString);
            return;
        }

        if (str.charAt(index)==element) {
            count++;
            transfer(index+1, str, element,count,newString);
            return;
        }else{
            newString+=str.charAt(index);
            transfer(index+1, str, element,count,newString);
        }   
        
    }
    
    public static void main(String[] args) {
        String str = "axbycx";
        transfer(0, str, 'a', 0," ");
    }
}
