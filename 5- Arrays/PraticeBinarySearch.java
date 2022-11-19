public class PraticeBinarySearch {

    public static void implementBinarySearch(int key, int arr[]) {
        System.out.println("hiii");
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // System.out.println("hiii");

            if (arr[mid] == key) {
                System.out.println("key found at index " + mid);
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
               end = mid - 1;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
        int key = 8;
        implementBinarySearch(key, arr);

    }
}