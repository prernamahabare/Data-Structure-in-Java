public class Occurrences {
    public static void occurrences(int arr[], int key, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index]==key) {
            System.out.println(index);
        }
        occurrences(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[] ={2,2,2,4,5,6,7};
        occurrences(arr, 2, 0);
    }
}
