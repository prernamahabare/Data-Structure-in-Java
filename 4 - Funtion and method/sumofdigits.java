import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("The sum of digit is: "+ sumofdigits (n));
    }

    public static int sumofdigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastdigit = n %10;
            sum +=lastdigit;
            n = n /10;
        }
        return sum;
    }
}
