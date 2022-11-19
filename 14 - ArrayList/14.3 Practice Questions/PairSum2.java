import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
    }

    private static boolean pairSum2(ArrayList<Integer> list, int target) {
        int breakingPoint = -1;
        int n = list.size();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakingPoint = i;
                break;
            }
        }

        int leftPointer = breakingPoint + 1;
        int rightPointer = breakingPoint;

        while (leftPointer != rightPointer) {
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            }

            if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer = (leftPointer + 1) % n;
            } else {
                rightPointer = (n + rightPointer - 1) % n;
            }
        }

        return false;

    }
}
