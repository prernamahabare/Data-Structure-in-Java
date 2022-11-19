import java.util.ArrayList;

public class FindSubSet {
    private static void findSubsetsStr(String str, StringBuilder ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        findSubsetsStr(str, ans.append(str.charAt(i)), i + 1); // Yes (Recursion)
        findSubsetsStr(str, ans.deleteCharAt(ans.length() - 1), i + 1); // No (Backtracking)
    }
   
    public static void findSubSetOfArr(ArrayList<Integer> arr, ArrayList<Integer> ans, int i) {
        if (i == arr.size()) {
            System.out.println(ans);
            return;
        }

        ans.add(arr.get(i));
        findSubSetOfArr(arr, ans, i+1);

        ans.remove(ans.size()-1);
        findSubSetOfArr(arr, ans, i+1);
        
    }

    public static void main(String[] args) {
        findSubsetsStr("abc", new StringBuilder(""), 0);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        findSubSetOfArr(arr, new ArrayList<Integer>(), 0);
    }
}
