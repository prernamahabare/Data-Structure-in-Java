public class CheckPowerOf2 {
    public static boolean CheckPowerOf2OrNot(int n) {
        return ((n&n-1)==0);
    }
    public static void main(String[] args) {
        System.out.println(CheckPowerOf2OrNot(7));
    }
}
