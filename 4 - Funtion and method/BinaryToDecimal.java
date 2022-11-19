import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number:");
        int n = sc.nextInt();
        int decimalnum = convertToDecimal(n);
        System.out.print(decimalnum);
    }

    public static int findPower(int base, int expo){
        int result = 1;
        for (int i = 1; i <= expo; i++) {
            result *= base;  
        }
        return result;
    }
    public static int convertToDecimal(int n){
        int decimal = 0;
        int power = 0;

        while( n > 0){
            int lastdigit = n % 10;
            decimal = decimal + (lastdigit * findPower(2, power));
            power++;
            n = n / 10; 
        }
        return decimal;
    }
}
