public class Numrevsesr {
    public static void main(String[] args) {
        int num = 1234;
        int reverse = 0;

        while (num > 0) {
            int lastdigit= num % 10;
            num /= 10;
            reverse = reverse*10+lastdigit;
        }
        System.out.println(reverse);
    }
}
