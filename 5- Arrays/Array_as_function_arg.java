import java.util.Scanner;

public class Array_as_function_arg {
    // Array is always passed as call by reference means main() function is reflected when we update anything in outoff main().

    public static void name(int marks[]) {
        // To incrase value by 1 and also passing array as funtion argument
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i]+ 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);

        // to take input from user
        System.out.print("Enter Marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] =sc.nextInt();
        }

        name(marks);

        // To print output
        System.out.print("Upadted Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
