public class countVowels {
    public static int countNoOfVowels(String st) {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i)=='a'|| st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String st = "abcdefg";
        System.out.println(countNoOfVowels(st));

    }
}
