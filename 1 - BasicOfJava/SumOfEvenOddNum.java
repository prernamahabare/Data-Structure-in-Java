import java.util.Scanner;

public class SumOfEvenOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Number is even");
                evensum += n;
                // break;
            } else {
                System.out.println("Number is odd");
                oddsum += n;
                // break;
            }
            System.out.println("The sum of even number is: " + evensum);
            System.out.println("The sum of odd number is: " + oddsum);
        } while (true);

    }
}
