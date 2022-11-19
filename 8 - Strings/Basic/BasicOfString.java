import java.util.Scanner;

public class BasicOfString {

    public static void main(String[] args) {
        // Declaration of string
        String str = "prerna";
        String str2 = new String("mahabare");
        // concate of string
        System.out.println(str + " " +str2);

        // input of string
        Scanner sc = new Scanner(System.in);

        // only print letter upto space
        // String name = sc.next();
        // System.out.println(name);

        // print letter with space also.
        // String name1 = sc.nextLine();
        // System.out.println(name1);

        // length of string
        System.out.println(str.length());

        // char At
        System.out.println(str.charAt(0));

        // campare of strings
        if (str.equals(str2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        // Substring
        System.out.println(str.substring(0, 2));

        // compareTo
        String friuts[] = { "apple","banana","mango"};
        String largest  = friuts[0];

        for (int i = 1; i < friuts.length; i++) {
            if (largest.compareTo(friuts[i])<0) {
                largest = friuts[i];
            }
        }
        System.out.println(largest);
    }
}