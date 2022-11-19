public class TilingTiesProblem {

    public static int printTilingWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int vartical = printTilingWays(n - 1);
        int horizontal = printTilingWays(n - 2);
        int totalWays = vartical + horizontal;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(printTilingWays(3));
    }
}
