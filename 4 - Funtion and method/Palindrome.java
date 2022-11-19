import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to check is palindrome or not:");
        int n = sc.nextInt();
        
        if (isPalindrome(n)) {
            System.out.println("num is palindrome");
        }else{
            System.out.println("num is not palindrome");
        }
    }
    // A number is called a palindrome ifthe number is equal to the reverse of a number   e.g.,121 is a palindrome because the reverse of 121 is 121 itself.On the other hand,321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321
    public static boolean isPalindrome(int n) {
        int originalnum = n;
        int reverse = 0;

         while (n > 0 ) {
            int lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n = n/10;
            // reverse++;
        }
        if(reverse == originalnum){
            return true;
        }else{
            return false;
        }
    }
}
