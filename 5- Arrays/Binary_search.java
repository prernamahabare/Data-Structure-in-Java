public class Binary_search {

    public static void main(String[] args) {
        int number[] = { 1, 3, 4, 5, 6, 7, 8, 9 };
        int key = 4;
        System.out.println(do_Binary_search(number, key));
        // do_Binary_search(number, key);
    }

    public static int do_Binary_search(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start+end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) { //
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}