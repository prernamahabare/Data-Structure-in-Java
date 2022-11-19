public class LastOccurrence {
    public static int printLastOccurrence(int arr[], int index, int key) {
        if (index == arr.length) {
            return -1;
        }
        int isFound = printLastOccurrence(arr, index + 1, key);

        if (isFound == -1 && arr[index] == key) {
            return index;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3,3};
        System.out.println(printLastOccurrence(arr, 0, 3));
    }
}
