import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("Even");
        }
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;      
        }else{
            return false;
        }
    }
}
