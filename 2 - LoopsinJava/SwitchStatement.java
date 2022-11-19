package LoopsinJava;
import java.util.*;

public class SwitchStatement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // String input = sc.next();

        // System.out.print("Hello");
        // System.out.print(input);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // System.out.println("Addition of a and b is "+ (a+b));
        // System.out.println("Subtration of a and b is "+ (a-b));
        // System.out.println("Multipliaction of a and b is "+ a*b);
        // System.out.println("Division of a and b is "+ a/b);

        String op = sc.next();
        int result = 0;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                break;
        }

        System.out.println("The result is : " + result);

    }
}