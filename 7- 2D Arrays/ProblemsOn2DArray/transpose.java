public class transpose {

    public static void transposeOfMatrix(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int transpose[][]= new int [col][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        printArray(transpose);
    }
    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
        { 5, 6, 7 }};
        printArray(arr);
        transposeOfMatrix(arr);
    }
}
