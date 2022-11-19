public class print_subarray {
    public static void print_sub_array(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int j2 = start; j2 <= end; j2++) {
                    System.out.print( number[j2]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={1,2,3};
        print_sub_array(number);

    }
}
