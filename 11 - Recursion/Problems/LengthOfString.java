public class LengthOfString {
    public static void lengthOfString(String st, int i) {
        if (i == st.length()) {
            System.out.println(i);
            return;
        }
        lengthOfString(st, i + 1);
    }

    public static void main(String[] args) {
        String st = "prerna";
        lengthOfString(st, 1);

    }
}
