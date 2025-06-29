package stacks;

import java.util.Stack;

public class ReverseRecursive {

    public static void reverse(Stack<Integer> st){
        if (st.size()==0) return;
        int top = st.pop();
        reverse(st);
        insertAtBottom(st,top);
    }

    public static void insertAtBottom(Stack<Integer> st, int top){
        if (st.empty()){
            st.push(top);
            return;
        }
        int el = st.pop();
        insertAtBottom(st,top);
        st.push(el);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
