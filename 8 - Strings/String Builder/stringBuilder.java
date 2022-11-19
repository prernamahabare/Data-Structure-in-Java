public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("");

        for (char i = 'a' ; i <= 'z'; i++) {
            st.append(i);
        }
        System.out.println(st);
        
    }
}
