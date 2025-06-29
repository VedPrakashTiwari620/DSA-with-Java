package stacks;

import java.util.Stack;

public class ReverseStackRecursively {

    public static void reverseStack(Stack<Integer> st){


        if (st.empty()){
             return;
        }
        int y = st.pop();

        reverseStack(st);

        insertAtBottom(st,y);
    }

    public static void insertAtBottom(Stack<Integer> st, int top){
        if (st.empty()) {
            st.push(top);
            return;
        }
        int s = st.pop();
        insertAtBottom(st,top);
        st.push(s);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        reverseStack(st);

        System.out.println(st);


    }
}
