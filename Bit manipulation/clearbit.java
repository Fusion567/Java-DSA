public class clearbit {
    public static void main(String[] args) {
        int number = 5; //0101
        int pos = 2;
        int bitmask = 1<<pos;

        int number_1 = ~bitmask;
        int number_2 = number_1&number;

        System.out.println(number_2);

    }
}
