package practice.stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch=='('){
                st.push(ch);
            } else {
                if (st.size()==0){
                    return false;
                }
                if (st.peek()=='('){
                    st.pop();
                }
            }
        }
        if (st.size()>0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Brackets string to check is  Balanced or Not : ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
