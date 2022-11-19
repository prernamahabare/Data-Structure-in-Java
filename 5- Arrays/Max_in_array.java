public class Max_in_array {

    public static int Find_Max(int number[]) {
        int max = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < number.length; i++) {
            if(number[i] > max){
                max = number[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        // Find_Max(number);
        System.out.println( Find_Max(number));
    }
}
