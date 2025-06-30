package practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class NoOfBrackRemToBal {
    public static boolean noOfBracNeedToRem(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();


        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch=='('){
                st.push(ch);
            }else{
                boolean flag = false;
                if (!st.empty()){
                    if (st.peek()=='('){
                        st.pop();
                        flag=true;
                    }
                }
                if (flag==false){
                    st.push(ch);
                }

            }
        }

        if (st.size()>0){
            System.out.println("Min no of brack need to remove to make the given brac seq bal :"+ st.size());
            return false;
        }else{
            System.out.println("Min no of brack need to remove to make the given brac seq bal :"+ st.size());
            return true;
        }

    }
    public static void main(String[] args) {

        /*
        Find the minimum no of brackets thar we need
        to remove to make the given brackets seq balanced.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bracket seq : ");
        String str = sc.nextLine();


        System.out.println(noOfBracNeedToRem(str));

    }
}
