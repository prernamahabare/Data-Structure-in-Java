import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal num:");
        int n = sc.nextInt();
        int binNum = toBinary(n);
        System.out.println(binNum);
    }

    public static int toBinary(int n) {
        int bin = 0;
        int pow = 0;

        // To convert decimal to binary we need to take remainder of n (means decimal num)
        // store that at last postion of binary no because we calculate bin from msb to lsb (means store remainder from bottom to up) so that why we multiply remainder by 10 to the power.(If power is 0 then it store at oth postion if power is 1 it store at 10th postion and so on.)

        while (n > 0) {
            int remainder = n % 2;
            bin = bin + remainder * (int)Math.pow(10, pow);
            n = n/2; 
            pow++;
        }
        return bin;
    }
}
