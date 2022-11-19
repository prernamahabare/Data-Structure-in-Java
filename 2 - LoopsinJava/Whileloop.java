public class Whileloop {
    public static void main(String[] args) {
        int a = 1;
        int num = 5;
        int sum = 0;
        while (a <= num) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
