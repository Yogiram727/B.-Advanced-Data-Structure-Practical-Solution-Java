package Questions.B_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class A_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println("Using for each loop");
        System.out.println();
        for (String name : list) {
            System.out.println(name);
        }
    }
}
