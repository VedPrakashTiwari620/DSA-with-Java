package stacks;

import java.util.Stack;

public class DisplayStack {

    public static void displayRecursively(Stack<Integer> st){
        if (st.empty()) return;
        int s = st.pop();
        displayRecursively(st);
        System.out.print(s);
    }




    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

//        Stack<Integer> rt = new Stack<>();
//        while (!st.empty()){
//            rt.push(st.pop());
//        }
//        System.out.println(st);
//        while (!rt.empty()){
//            System.out.print(rt.peek()+" ");
//            st.push(rt.pop());
//        }
//        System.out.println();
//        System.out.println(st);


        displayRecursively(st);
    }
}
