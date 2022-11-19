public class FindPermutations {
    public static void findPermutationsOnArr(int arr[], int pointer) {
        if (pointer == arr.length) {
            printArr(arr);
            return;
        }

        for (int i = pointer; i < arr.length; i++) {
            swap(i, pointer, arr);
            findPermutationsOnArr(arr, pointer+1);
            swap(i, pointer, arr);
        }
    }

    public static void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3};
        findPermutationsOnArr(arr, 0);

    }
}
