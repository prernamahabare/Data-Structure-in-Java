public class Linear_search {
    public static int LinearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
        int key = 8;

        int result = LinearSearch(number, key);
        if (result == -1) {
            System.out.println("NOT Found");
        } else {
            System.out.println("The index is " + result);
        }
    }
}