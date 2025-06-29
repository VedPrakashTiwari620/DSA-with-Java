package stacks;

import java.util.Stack;
import java.util.Scanner;

public class CopyMoveStackInSameOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();


        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        while (n>0){
            st.push(sc.nextInt());
            n--;
        }
        System.out.println("Element pushes successfully.");

        System.out.println(st);




        //Insert at bottom 10 [1, 2, 3, 4, 5]
        Stack<Integer> r = new Stack<>();
        while (st.size()>0) r.push(st.pop());
        st.push(10);
        while (r.size()>0) st.push(r.pop());
        System.out.println(st);


        //Insert at index 2 20   [10, 1, 2, 3, 4, 5]
        while (st.size()>1) r.push(st.pop());
        st.push(20);
        while (r.size()>0) st.push(r.pop());

        System.out.println(st);



        // To print the stack element

        while (st.size()>0) r.push(st.pop());
        System.out.print("[");
        while (r.size()>0){
            System.out.print(r.peek()+", ");
            st.push(r.pop());
        }
        System.out.print("]");
        System.out.println();

        int size= st.size();
        int arr[] = new int[size];
        int i = 0;
        while (st.size()>0){
            arr[i]=st.pop();
            i++;
        }

        for (int j = size-1; j >= 0; j--) {
            System.out.print(arr[j]+" ");
            st.push(arr[j]);
        }
        System.out.println();

        System.out.println(st);
    }
}
