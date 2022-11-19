import java.lang.reflect.Array;

public class ConvertNumToWord {
    public static void convertNumToWord(String st[], int key) {
        if (key == 0) {
            return;
        }
        int lastdigit = key % 10;
        convertNumToWord(st, key / 10);
        System.out.print(st[lastdigit] + " ");
    }

    public static void main(String[] args) {
        String st[] = { "Zero", "one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        convertNumToWord(st, 2021);
    }
}
