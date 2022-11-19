public class kadane_algo {

    // public static void print_maxsumarray(int number[]) {
    // int currentsum = 0;
    // int max = Integer.MIN_VALUE;

    // for (int i = 0; i < number.length; i++) {
    // currentsum = currentsum + number[i];
    // if (currentsum < 0) {
    // currentsum = 0;
    // }
    // // System.out.print(currentsum);
    // if (max < currentsum) {
    // max = currentsum;
    // }
    // }
    // System.out.println(max);
    // }

    public static int maxSubarraySumKadaneAlgo(int array[]) {
        int currSum = 0, maxSum = 0, maxNegativeNumber = array[0];
        boolean negative = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                // When array contains positive value
                negative = false;
            }

            currSum += array[i];
            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
            maxNegativeNumber = Math.max(maxNegativeNumber, array[i]);
        }
        if (negative) {
            return maxNegativeNumber;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxSubarraySumKadaneAlgo(number));

    }
}
