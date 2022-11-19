public class prefix_array {

    public static void print_prefix_array(int number[]) {
        int minsum = Integer.MAX_VALUE;
        int maxsum = Integer.MIN_VALUE;

        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        int currentsum = 0;
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = number[i]+ prefix[i-1];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = start; j < number.length; j++) {
                int end = j;
                currentsum = start == 0 ?prefix[end]:prefix[end]-prefix[start-1];
                if (currentsum > maxsum) {
                    maxsum = currentsum;
                }

                if (currentsum < minsum) {
                    minsum = currentsum;

                }
            }
        }
        System.out.println(minsum);
        System.out.println(maxsum);




        // for (int i = 0; i < prefix.length; i++) {
        //     System.out.println(prefix[i]);
        // }
        
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        print_prefix_array(number);
    }
}
