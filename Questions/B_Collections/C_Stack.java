package Questions.B_Collections;

import java.util.Stack;
import java.util.Iterator;

public class C_Stack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(22);
        stk.push(33);
        stk.push(44);
        stk.pop();

        Iterator<Integer> itr = stk.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
