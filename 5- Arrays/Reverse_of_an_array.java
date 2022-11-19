public class Reverse_of_an_array {
    public static void print_reverse(int arr[]) {
        int first_index = 0;
        int last_index = arr.length - 1;

        while (first_index < last_index) {
            int store = arr[first_index];
            arr[first_index] = arr[last_index];
            arr[last_index] = store;
            first_index++;
            last_index--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
        print_reverse(arr);
    }
}
