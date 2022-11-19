public class Fibonacci {
    public static int PrintNthFibNum(int n) {
        int fib = 0;
        if (n < 2) {
            fib = n;
        } else {
            fib = PrintNthFibNum(n - 1) + PrintNthFibNum(n - 2);
        }
        return fib;
    }

    public static void main(String[] args) {
        int pos = 7;
        System.out.println(PrintNthFibNum(pos));

    }
}
