/*  Print keypad combination
( 0 -> .;   1 -> abc    2 -> def    3 -> ghi    4 -> jkl    5 -> mno    6 -> pqrs   7 -> tu 8 -> vwx    9 -> yz) */
public class keypad {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void comb(String str, int index, String Combination) {
        if(index == str.length()){
            System.out.println(Combination);
            return;
        }
        char currChar = str.charAt(index);
        String mappinng = keypad[currChar -'0'];

        for (int i = 0; i < mappinng.length(); i++) {
            comb(str, index+1, Combination+mappinng.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        comb(str, 0," ");
    }
}
