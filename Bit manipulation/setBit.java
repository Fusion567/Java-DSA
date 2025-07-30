//Program to set a bit at a given position

public class setBit {
    public static void main(String[] args) {
        int n = 5;//0101
        int pos = 1;
        int bitmask = 1<<pos;
        int newnumber = n|bitmask;
        System.out.println(newnumber);
    }
}
