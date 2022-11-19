public class paliendome {
    // 1st way
    public static boolean checkifPalindromeOrNot(String str) {
       for (int i = 0; i < str.length()/2; i++) {
        int n = str.length();
        if (str.charAt(i )!= str.charAt(n-1-i)) {
            // is not palindrome
            return false;
        }
       }
       return true;
    }
    // 2nd way
    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkifPalindromeOrNot(str));
    }
}