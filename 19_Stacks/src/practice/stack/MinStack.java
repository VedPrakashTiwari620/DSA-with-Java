package practice.stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st = new Stack<>();
    int min = 0;
    public void push(int val){
        if(st.size()==0){
            st.push(val);
            min = st.peek();
        }else{
            if (val<min){
                st.push(val-min);
                min = val;
            }else{
                st.push(val);
            }
        }
    }

    public int getMin(){
        return min;
    }


    public void pop(){
        if(st.peek()>min){
            st.pop();
        }else {
            int oldmin = min-st.peek();
            min = oldmin;
            st.pop();
        }
    }

    public static void main(String[] args) {
        MinStack ss = new MinStack();
        ss.push(6);
        ss.push(7);
        ss.push(9);
        ss.push(4);
        ss.push(9);




        System.out.println(ss.getMin());

        ss.pop();

        System.out.println(ss.getMin());

        ss.pop();

        System.out.println(ss.getMin());
    }
}
