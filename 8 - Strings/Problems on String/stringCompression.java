public class stringCompression {
    public static String stringCompress(String str) {
        StringBuilder st = new StringBuilder("");
        st.append(str.charAt(0));
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
              count++;
            } 
            else {
                if (count > 1 ) {  
                    st.append(count);
                    count=1;
                }
                st.append(str.charAt(i));
            }
            // For last char
            if (i == str.length()-1 &&  count > 1 ) {  
                st.append(count);
            }
        }
        return st.toString();
    }

    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(stringCompress(str));
    }
}
