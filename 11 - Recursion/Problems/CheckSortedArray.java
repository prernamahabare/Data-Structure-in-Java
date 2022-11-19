public class CheckSortedArray {

    public static void checkSortedArray(int arr[], int n) {
        if (n == arr.length-1) {
            System.out.println(true);
            return;
        }
        if (arr[n] > arr[n+1]) {
            System.out.println(false);
        } else {
            checkSortedArray(arr, n+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,9,4,5,6};
        int n = 0;
        checkSortedArray(arr, n);


    }
}
