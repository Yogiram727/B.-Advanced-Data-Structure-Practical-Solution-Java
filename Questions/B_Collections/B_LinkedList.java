package Questions.B_Collections;

import java.util.LinkedList;
import java.util.Iterator;

public class B_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ram");
        list.add("Hari");
        list.add("Gita");
        list.add("Sita");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        for (String name : list) {
            System.out.print(name + " ");
        }

    }
}
