package day37_ArrayList;

import java.util.ArrayList;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean r1 = list.contains(1);

        ArrayList<Integer> element = new ArrayList<>();
        element.add(1);
        element.add(2);
        element.add(4);

        boolean r2 = list.containsAll(element);

        System.out.println(r2);
    }
}
