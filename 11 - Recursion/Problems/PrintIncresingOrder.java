public class PrintIncresingOrder {

    public static void printIncresingOrder(int n, int current) {
        System.out.println(current);
        if (current == n) {
            return;
        }
        printIncresingOrder(n, current + 1);
    }

    public static void printIncresingOrderSecondWay(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printIncresingOrderSecondWay(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int current = 1;
        int n = 10;

        // printIncresingOrder(n, current);
        printIncresingOrderSecondWay(n);

    }
}
