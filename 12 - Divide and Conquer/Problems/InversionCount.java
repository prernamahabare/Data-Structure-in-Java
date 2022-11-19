public class InversionCount {
    // brute-force
    // private static int invresionCount(int[] arr) {
    //     int count = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] > arr[j] && i < j) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    public static int mergeSort(int arr[], int si, int ei) {
        int count = 0;
        if (si < ei) {

            int mid = si + (ei - si) / 2;
            count = mergeSort(arr, si, mid);
            count += mergeSort(arr, mid + 1, ei);

            count += merge(arr, si, mid + 1, ei);
        }
        return count;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid;
        int k = 0;
        int count = 0;

        while (i < mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
                count = count + (mid - i);
            }
        }
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; i <= ei; k++, i++) {
            arr[i] = temp[k];
        }
        return count;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(mergeSort(arr, 0, arr.length - 1));

    }
}
