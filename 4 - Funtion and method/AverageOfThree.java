import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = average(a, b, c);
        System.out.print("Average of no is: ");
        System.out.println(avg);
    }

    public static int average(int a, int b, int c) {
        int avg = 0;
        avg = (a + b+ c)/3;
        return avg;
    }
    
}
