package stacks;

import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottomRecursion(Stack<Integer> st, int ele){
        if (st.empty()){
            st.push(ele);
            return;
        }

        int x = st.pop();
        pushAtBottomRecursion(st, ele);
        st.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        pushAtBottomRecursion(st,10);

        System.out.println(st);
    }
}
