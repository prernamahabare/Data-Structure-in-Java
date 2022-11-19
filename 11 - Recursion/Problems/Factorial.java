public class Factorial {
    public static int printFactorial(int n) {
        int fact = 1;
        if (n < 2) {
            fact = 1;
        } else {
            fact = n * printFactorial(n - 1);
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));
    }
}
