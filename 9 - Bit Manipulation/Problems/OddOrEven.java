public class OddOrEven {

    public static void printOddOrEven(int num) {
        int bitmask = 1;
        if ((num & bitmask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        printOddOrEven(3);
    } 
}
