public class PrintPower {

    public static int printXtoThePowerN(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * printXtoThePowerN(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 2;
        System.out.println(printXtoThePowerN(x, n));
    }
}
