import java.util.*;

public class InputType {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // To take string as input we used next()
        // String input = sc.next();

        // System.out.print("Hello");
        // System.out.print(input);

        // To take number as input we used nextInt()
        int a = sc.nextInt();
        int b = sc.nextInt();

        // To take string (with spaces)as input we used nextline()
        int c = sc.nextInt();

        System.out.println(a + b + c);

    }
}