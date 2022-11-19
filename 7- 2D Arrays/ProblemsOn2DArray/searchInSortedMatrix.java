public class searchInSortedMatrix {
    public static boolean stairCaseSearch(int arr[][], int key) {
        // BY assuming the startint point as top right postion
        // int row = 0;
        // int col = arr[0].length-1;

        // while (row < arr.length && col >= 0) {
        // if (key == arr[row][col]) {
        // System.out.println("Found at index:" + row + "," + col);
        // return true;
        // } else if (key < arr[row][col]) {
        // col--;
        // } else {
        // row++;
        // }
        // }
        // return false;

        // BY assuming the startint point as bottom left postion

        int row = arr.length - 1;
        int col = 0;

        while (row >= 0 && col < arr[0].length) {
            if (key == arr[row][col]) {
                System.out.println("Found at index:" + row + "," + col);
                return true;
            } else if (key < arr[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 10;
        stairCaseSearch(arr, key);

    }
}