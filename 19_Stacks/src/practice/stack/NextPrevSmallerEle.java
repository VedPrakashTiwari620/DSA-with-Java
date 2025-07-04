package practice.stack;

import java.util.Stack;

public class NextPrevSmallerEle {

    public int[] nextSmallerElement(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        res[n-1]=-1;
        for (int i = n-2; i >= 0; i--) {
            while (st.size()>0 && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if (st.size()==0) res[i]=-1;
            else res[i] = arr[st.peek()];
            st.push(i);
        }


        return res;
    }


    public int[] prevSmallerElement(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        res[0]=-1;
        st.push(0);

        for (int i = 1; i < n; i++) {
            while (st.size()>0 && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if (st.size()==0) res[i]=-1;
            else res[i]=arr[st.peek()];
            st.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        // Find Next Smaller Element and Previous Smaller Element

        int[] arr = {5,2,4,6,3,5};

        NextPrevSmallerEle nn = new NextPrevSmallerEle();


        int[] res = nn.nextSmallerElement(arr);
        System.out.println("Next Smaller Element :");
        for (int re : res) {
            System.out.print(re+" ");
        }
        System.out.println();


        int[] res1 = nn.prevSmallerElement(arr);
        System.out.println("Previous Smaller Element :");
        for (int re : res1) {
            System.out.print(re+" ");
        }

    }
}
