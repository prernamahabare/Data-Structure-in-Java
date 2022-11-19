public class QuickSort {
    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // partition
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[ei] > arr[j]) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // for left arr
        quickSort(arr, si, ei - 1);
        // for right arr
        quickSort(arr, ei + 1, arr.length - 1);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
