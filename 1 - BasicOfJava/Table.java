import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int counter = 1;

        while (counter <= 10) {
            int table = n*counter;
            System.out.println(n +"*"+ counter + "=" + table);
            counter++;  
        }

        // for (int i = 1; i <= 10; i++) {
            
        // }
    }
}
