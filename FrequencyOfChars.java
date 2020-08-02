package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "AAABBC";

        ArrayList<String> list = new ArrayList<>();

        for (String each : str.split("")) {
            list.add(each);
        }
        System.out.println(list);

        String nonDup = Util.removeDup(str);

        for (String letters : nonDup.split("")) {
            int count = Collections.frequency(list, letters);
            System.out.print(letters + count);

        }
    }
}
