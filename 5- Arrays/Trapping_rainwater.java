public class Trapping_rainwater {
    public static int calculate_trapwater(int height_of_bars[]) {
        int length = height_of_bars.length;

        // To calculate left max boundry of an bars
        int leftMax[] = new int[length];
        leftMax[0] = height_of_bars[0];
        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(height_of_bars[i], leftMax[i - 1]);
        }
        // To calculate right max boundry of an bars
        int rightMax[] = new int[length];
        rightMax[length - 1] = height_of_bars[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height_of_bars[i], rightMax[i + 1]);
        }

        int trapewater = 0;

        for (int i = 0; i < length; i++) {
            //  To find min boundry of leftmax and rightmax
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trapewater += waterlevel - height_of_bars[i];
        }
        return trapewater;

    }

    public static void main(String[] args) {
        int height_of_bars[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(calculate_trapwater(height_of_bars));
    }
}
