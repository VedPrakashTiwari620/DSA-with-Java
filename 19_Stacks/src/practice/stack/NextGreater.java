package practice.stack;

import java.util.Stack;

public class NextGreater {

    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        res[n-1]=-1;
        st.push(arr[n-1]);

        for (int i = n-2; i >= 0; i--) {
            while (st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if (st.size()==0){
                res[i]=-1;
            }else {
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,5,3,2};



        //          Using for loop T.C-> O(n2)
//        int[] res = new int[arr.length];
//        int k=0;
//
//        for (int i = 0; i < arr.length; i++) {
//            res[i]=-1;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j]>arr[i]){
//                    res[k]=arr[j];
//                    k++;
//                    break;
//                }
//            }
//        }



        int[] res = nextGreater(arr);
        for (int re : res) {
            System.out.print(re+" ");
        }

    }
}
