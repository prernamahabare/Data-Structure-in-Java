import java.util.ArrayList;

public class MonotonicArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);

        monotonicArrayList(list);
    }

    private static void monotonicArrayList(ArrayList<Integer> list) {
        boolean in = true;
        boolean de = true;


        for (int i = 0; i < list.size() - 1; i++) {
            // check sorted in incresing
            if (list.get(i) > list.get(i + 1)) {
                in =  false;
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            // check sorted in decresing
            if (list.get(i) < list.get(i + 1)) {
                de = false;
            }
        }

        if ( de || in) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
