import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element [TC - O(1)]
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(maxElement(list));
    }

    private static int maxElement(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
