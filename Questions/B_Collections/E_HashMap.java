package Questions.B_Collections;

import java.util.HashMap;
import java.util.Map;

public class E_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("First", 100);
        hm.put("Second", 200);
        hm.put("Third", 300);
        hm.put("Fourth", 400);

        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }

}
