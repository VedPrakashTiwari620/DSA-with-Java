package practice.stack;

import linkedListImplementation.StackList;

import java.util.Stack;

public class NextGreater2ndAppr {

    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int[] res = new int[n];
        st.add(0);
        for (int i = 1; i < n; i++) {
            while( st.size()>0 && arr[i]>arr[st.peek()]){
                res[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            if (res[i]==0){
                res[i]=-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //Find Next Greater Using Stack 2nd Approach


        int[] arr = {1,5,3,2,1,6,3,4};


        int[] res = nextGreater(arr);

        for (int re : res) {
            System.out.print(re+" ");
        }
    }
}
