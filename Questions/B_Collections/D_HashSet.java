package Questions.B_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class D_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(10);
        hs.add(45);

        Iterator<Integer> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (Integer num : hs) {
            System.out.print(num + " ");
        }
    }

}
