import java.util.*;

public class Basic {
    public static void main(String[] args) {
        // 5 size of array
        int marks[] = new int[5];

        // direct decalration
        // int marks1[] = { 1, 2, 3 };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            marks[i]= sc.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
