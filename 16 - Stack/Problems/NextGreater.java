package Problems;

import java.util.*;

public class NextGreater {
    public static void nextGreater(int element[], int nextGreater[]) {
        Stack<Integer> s = new Stack<>();
        int n = element.length;

        for (int i = n-1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek()<=element[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = s.peek();
            }
            s.push(element[i]);
        }
    }
    public static void main(String[] args) {
        int element[] = {6,8,0,1,3};
        int nextGreaterele[] = new int[element.length];

        nextGreater(element, nextGreaterele);

        for (int i = 0; i < nextGreaterele.length; i++) {
            System.out.print(nextGreaterele[i]+" ");
        }
    }
}
