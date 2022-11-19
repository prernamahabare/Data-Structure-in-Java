import java.util.Scanner;

public class Basic2D {
    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (key == arr[i][j]) {
                    System.out.println("The key is on" + i + j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = arr.length, m = arr[0].length;

        Scanner sc = new Scanner(System.in);
        // int data = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        search(arr, 5);

    }
}