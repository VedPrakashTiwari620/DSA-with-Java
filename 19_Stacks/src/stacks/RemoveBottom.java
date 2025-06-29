package stacks;

import java.util.Stack;

public class RemoveBottom {

    public static void removeBottom(Stack<Integer> st){
        Stack<Integer> r = new Stack<>();
        while (st.size()>1){
            r.push(st.pop());
        }
        st.pop();
        while (r.size()>0){
            st.push(r.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        removeBottom(st);
        System.out.println(st);
    }
}
