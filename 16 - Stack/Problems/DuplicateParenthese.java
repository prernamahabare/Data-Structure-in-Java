package Problems;

import java.util.Stack;

public class DuplicateParenthese {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            // Closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+c)";
        String str1 = "(((a+b)+c))";
        
        System.out.println(isDuplicate(str1));
    }
}
