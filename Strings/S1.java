import java.util.Scanner;

public class S1{
    public static void main(String[] args) {
        String name ="Yashraj";
        System.out.println(name);

        //Scan from user
        //sc.next takes a single tone
        //whereas sc.nextLine() takes whole sentence
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        System.out.println("Your full name is: "+ Name);

        //concatenation
        String Name1 = "Yashraj";
        String Name2 = "Parmar";
        String Fullname = Name1 + " " + Name2;
        System.out.println("Your full name is: "+ Fullname);
        System.out.println("Length of full string is: " + Fullname.length());

        //charAt
        for (int i = 0; i < Fullname.length(); i++) {
            System.out.println(Fullname.charAt(i));
        }

        if(Name1.compareTo(Name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(Name1==Name2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //substring
        String sentence = "Life has no meaning";
        String names = sentence.substring(11,sentence.length());
        System.out.println(names);
    }
}