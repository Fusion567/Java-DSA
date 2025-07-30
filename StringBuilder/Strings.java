public class Strings{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));
        
        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert element into string
        sb.insert(3,'n');
        System.out.println(sb);

        //delete a character from a string
        sb.delete(2,4);
        System.out.println(sb);

        //append: add element at the end
        StringBuilder SB = new StringBuilder("h");
        SB.append("e");
        SB.append("l");
        SB.append("l");
        SB.append("o");
        System.out.println(SB);
        System.out.println(SB.length());
    }
}