public class TrappingRainWater {

    public static void main(String[] args) {
        int HeighatOfBars[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappingRainWater(HeighatOfBars));
    }

    private static int trappingRainWater(int[] HeighatOfBars) {
        int n = HeighatOfBars.length;

        int leftMax[] = new int[n];
        leftMax[0] = HeighatOfBars[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(HeighatOfBars[i], leftMax[i - 1]);
        }

        int RightMax[] = new int[n];
        RightMax[n - 1] = HeighatOfBars[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(HeighatOfBars[i], RightMax[i + 1]);
        }
        int TrappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], RightMax[i]);
            TrappedWater += waterLevel - HeighatOfBars[i];
        }
        return TrappedWater;

    }
}