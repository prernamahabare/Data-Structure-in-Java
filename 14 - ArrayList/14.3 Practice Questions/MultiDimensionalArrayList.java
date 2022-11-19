import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList> mainlist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(12);
        list2.add(15);

        mainlist.add(list);
        mainlist.add(list2);
        // System.out.println(mainlist);

        // for (int i = 0; i < mainlist.size(); i++) {
        //     // currentlist list store all the element at ith index in mainlist. 
        //     // On ith index of mainlist we have another arraylist to print that we need to travese on currenlist.
        //     ArrayList<Integer> currentlist = mainlist.get(i);
        //     for (int j = 0; j < currentlist.size(); j++) {
        //         System.out.print(currentlist.get(j)+ " ");
        //     }
        //     System.out.println();
        // }

        multiDimensionalArrayList();
    }

    public static void multiDimensionalArrayList() {
        ArrayList<ArrayList> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i*1); // 1 2 3 4 5
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        list2.remove(2);
        list2.remove(3);

        System.out.println(mainlist);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currentlist = mainlist.get(i);
            for (int j = 0; j < currentlist.size(); j++) {
                System.out.print(currentlist.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
