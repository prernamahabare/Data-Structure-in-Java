public class Reversenumber {
    public static void main(String[] args) {
        int n = 4321;
        int lastdigit = 0;

        while ( n > 0) {
        lastdigit = n % 10;
        System.out.print(lastdigit);
        n /= 10;     
        }
    }
}
