import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(containerWithMostWater(height));
    }

    private static int containerWithMostWater(ArrayList<Integer> height) {
        // Brute force approch - TC = O(n^2)
        // int maxAreaOfWater = 0;

        // for (int i = 0; i < height.size(); i++) {
        // for (int j = i + 1; j < height.size(); j++) {
        // int heightOfminbar = Math.min(height.get(i), height.get(j));
        // int width = j - i;
        // int areaOfWater = heightOfminbar * width;
        // maxAreaOfWater = Math.max(maxAreaOfWater, areaOfWater);
        // // if (maxAreaOfWater < areaOfWater) {
        // // maxAreaOfWater = areaOfWater;
        // // }
        // }
        // }


        // 2 Pointer apporch- TC = O(n)
        int maxAreaOfWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int heightOfminbar = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int areaOfWater = heightOfminbar * width;
            maxAreaOfWater = Math.max(areaOfWater, maxAreaOfWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }

        return maxAreaOfWater;
    }
}
