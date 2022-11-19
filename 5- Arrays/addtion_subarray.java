import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

public class addtion_subarray {

    public static void print_sub_array(int number[]) {
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;
        
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int sum = 0;
                int end = j;
                // sum = sum + number[j];
                for (int k = start; k <= end; k++) {
                    sum = sum + number[k];
                    System.out.print(number[k]);
                }
                System.out.print("=" + sum);
                if (sum > maxval) {
                   maxval = sum;
                } 
                if (sum < minval) {
                    minval = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(maxval);
        System.out.println(minval);

       
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3};
        print_sub_array(number);
    }
}
