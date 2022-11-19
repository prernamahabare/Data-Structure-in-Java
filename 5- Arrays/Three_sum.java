public class Three_sum {
    public static void Print_triplate(int number[]) {
        for (int i = 0; i < number.length - 2; i++) {
            // int sum = 0;
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int j2 = j + 1; j2 < number.length; j2++) {
                    int sum = number[i] + number[j] + number[j2];
                    if (sum == 0) {
                        System.out.println(number[i] + "," + number[j] + "," + number[j2]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int number[] = { -1, 0, 1, 2, -1, 4 };
        Print_triplate(number);

    }
}
