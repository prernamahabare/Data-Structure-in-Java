import java.util.ArrayList;

public class PairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;

        System.out.println(pairSum1(list, target));
    }

    private static boolean pairSum1(ArrayList<Integer> list, int target) {
        // Brute force approch - TC = O(n^2)

        // for (int i = 0; i < list.size(); i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // if (list.get(i) + list.get(j) == target) {
        // return true;
        // }
        // }
        // }

        // return false;

        // 2 Pointer apporch- TC = O(n)

        int leftPointer = 0;
        int rightPointer = list.size() - 1;

        while (leftPointer != rightPointer) {
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                // System.out.println(list.get(leftPointer) + " " + list.get(rightPointer));
                return true;
            }

            // IN BELOW CASE IF TARGET IS < THEN POINTER WE NEED TO INCRESE LP BECAUSE WE
            // NEED GREATER SUM THAN NOW.
            if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return false;
    }
}
