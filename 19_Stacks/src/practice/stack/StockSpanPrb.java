package practice.stack;

import java.util.ArrayList;
import java.util.Stack;

class StockSpanPrb {


    public static class Solution {
        public ArrayList<Integer> calculateSpan(int[] arr) {
            // write code here\
            int n = arr.length;

            Stack<Integer> st = new Stack<>();
            ArrayList<Integer> ls = new ArrayList<>();
            ls.add(1);

            st.push(0);
            for (int i = 1; i < n; i++) {
                while (st.size() > 0 && arr[st.peek()] < arr[i]) {
                    st.pop();
                }
                if (st.size() > 0) {
                    ls.add(i - st.peek());
                } else {
                    ls.add(i + 1);
                }
                st.push(i);
            }

            return ls;

        }
    }

    public static void main(String[] args) {

        // Stock Span Problem on GFG using Previous Greater Element

        int[] arr = {100,80,60,70,60,75,85};


        Solution st = new Solution();
        ArrayList<Integer> res = st.calculateSpan(arr);

        System.out.println(res);
    }


}