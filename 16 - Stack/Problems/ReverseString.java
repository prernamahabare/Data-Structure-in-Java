package Problems;
import java.util.*;
public class ReverseString {
    public static String ReverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        str = result.toString();
        return str;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(ReverseString(str));
    }
}
