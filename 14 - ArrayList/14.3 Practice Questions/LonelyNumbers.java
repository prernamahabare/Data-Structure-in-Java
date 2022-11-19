import java.util.ArrayList;
import java.util.Arrays;

public class LonelyNumbers {
    public static void main(String[] args) {
        int arr[] = { 10, 6, 5, 8 };
        System.out.println(lonelyNumbers(arr));
    }

    private static ArrayList<Integer> lonelyNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        if (nums.length == 1) {
            result.add(nums[0]);
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] == nums[i + 1] || nums[i] + 1 == nums[i + 1]) {
                    continue;
                }
            } else if (i == nums.length - 1) {
                if (nums[i] == nums[i - 1] || nums[i] - 1 == nums[i - 1]) {
                    continue;
                }
            } else if (nums[i] == nums[i + 1] || nums[i] == nums[i - 1] || nums[i] + 1 == nums[i + 1]
                    || nums[i] - 1 == nums[i - 1]) {
                continue;
            }
            result.add(nums[i]);
        }
        return result;
    }
}
