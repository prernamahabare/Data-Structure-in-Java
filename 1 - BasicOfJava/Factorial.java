
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int Factorial = 1;
        for (int i = 1; i <= n; i++) {
            Factorial *= i;
        }
        System.out.println(Factorial);
    }
}
