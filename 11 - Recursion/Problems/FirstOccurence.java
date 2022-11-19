public class FirstOccurence {

    public static int printFirstOccurence(int arr[], int index, int key) {

        if (index == arr.length) {
            return -1;

        }
        if (arr[index] == key) {
            return index;
        }
        return printFirstOccurence(arr, index+1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int key = 5;
        int index = 0;
        System.out.println(printFirstOccurence(arr, index, key));
        // printFirstOccurence(arr, index, key);

    }
}
