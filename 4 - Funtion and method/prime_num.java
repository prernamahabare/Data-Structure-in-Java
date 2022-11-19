public class prime_num {
    public static void main(String[] args) {
        range(2, 10);
    }

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void range(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }
}
