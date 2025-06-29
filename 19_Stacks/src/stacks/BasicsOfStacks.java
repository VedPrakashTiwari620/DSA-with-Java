package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
//        int arr[] = new int[5];
//        ArrayList<Integer> list = new ArrayList<>();


        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.peek());


        System.out.println(st);

        System.out.println(st.pop());

        System.out.println(st);

        System.out.println(st.size());

        while (st.size()>1){
            st.pop();
        }

        System.out.println(st);


    }
}
