public class searchKey {

    public static void printNoofKey(int arr[][],int key) {
        int no_of_Key= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    no_of_Key++;
                }
            }
        }
        System.out.println(no_of_Key);
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 4, 12 },
        { 4, 14, 15, 4 } };
        int key = 4;

        printNoofKey(arr, key);
    }
}
