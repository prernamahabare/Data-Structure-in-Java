public class Sorting {
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minposition = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[minposition] > arr[j]) {
                    minposition = j;
                }
            }
            int temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i-1;
            while (previous >= 0 && arr[previous] > current) {
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;


        }
    }
    public static void countingsort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int count[] = new int [max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void ToPrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        countingsort(arr);
        // insertionSort(arr);
        // selectionSort(arr);
        ToPrintArr(arr);
    }

}