// Given an array nums of size n, return the majority element. (MEDIUM)
// The majority element is the element that appears more than [n/2] times.
// You may assume that the majority element always exists in the array.

public class MajorityElement {

    // brute-force approach - [TC = O(n^2)]
    // public static int majorityElement(int arr[]) {
    // int majorityElementCount = arr.length / 2;
    // for (int i = 0; i < arr.length; i++) {
    // int count = 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // count += 1;
    // }
    // }
    // if (count > majorityElementCount) {
    // return arr[i];
    // }
    // }
    // return -1;
    // }

    // optimized approach [Moore Voting Algorithm - TC = O(n)]
    public static int majorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 2, 3, 4, 4 };
        System.out.println(majorityElement(arr));
    }
}
