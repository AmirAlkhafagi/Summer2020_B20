package day37_ArrayList;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        String str = "ABCDEABDE";
        ArrayList<Character> list = new ArrayList<>();
        for (char each : str.toCharArray()) {
            list.add(each);
        }
        for (char letters : list) {
            int count = Collections.frequency(list, letters);
            if (count == 1) {
                System.out.println(letters);
            }
        }
    }
}
