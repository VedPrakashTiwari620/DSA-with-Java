//package practice.stack;
//
//import java.util.Stack;
//



//          String str = "8-5+3*4/6";



//public class InfixEvaluation {
//    public static void main(String[] args) {
//        String str = "8-5+3*4/6";
//        Stack<Integer> val = new Stack<>();
//        Stack<Character> op = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int ascii = (int)ch;
//            if (ascii>=48 && ascii<=57) val.push(ascii-48);
//            else if (op.size()==0) op.push(ch);
//            else {
//                if (ch=='+' || ch=='-'){
//                    //work
//                    int v2 = val.pop();
//                    int v1 = val.pop();
//                    if (op.peek()=='+') val.push(v1+v2);
//                    if (op.peek()=='-') val.push(v1-v2);
//                    if (op.peek()=='*') val.push(v1*v2);
//                    if (op.peek()=='/') val.push(v1/v2);
//                    op.pop();
//
//                    //push
//                    op.push(ch);
//                }
//                if (ch=='*' || ch=='/'){
//
//                    if (op.peek()=='*'|| op.peek()=='/'){
//
//                        //work
//                        int v2 = val.pop();
//                        int v1 = val.pop();
//
//                        if (op.peek()=='*') val.push(v1*v2);
//                        if (op.peek()=='/') val.push(v1/v2);
//                        op.pop();
//
//                        //push
//                        op.push(ch);
//                    }
//                    else op.push(ch);
//                }
//            }
//        }
//
//
//
//        while (val.size()>1){
//            int v2 = val.pop();
//            int v1 = val.pop();
//            if (op.peek()=='+') val.push(v1+v2);
//            if (op.peek()=='-') val.push(v1-v2);
//            if (op.peek()=='*') val.push(v1*v2);
//            if (op.peek()=='/') val.push(v1/v2);
//            op.pop();
//        }
//
//
//        System.out.println(val.peek());
//    }
//}






//          String str = "8-(5+3)*4/6";

//
//package practice.stack;
//
//import java.util.Stack;
//
//public class InfixEvaluation {
//    public static void main(String[] args) {
//        String str = "9-(5+3)*4/6";
//        Stack<Integer> val = new Stack<>();
//        Stack<Character> op = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int ascii = (int)ch;
//            if (ascii>=48 && ascii<=57) val.push(ascii-48);
//            else if (op.size()==0 || ch == '('  || op.peek()=='(') op.push(ch);
//            else if (ch==')'){
//                while (op.peek()!='('){
//                    //work
//                    int v2 = val.pop();
//                    int v1 = val.pop();
//                    if (op.peek()=='+') val.push(v1+v2);
//                    if (op.peek()=='-') val.push(v1-v2);
//                    if (op.peek()=='*') val.push(v1*v2);
//                    if (op.peek()=='/') val.push(v1/v2);
//                    op.pop();
//                }
//                op.pop();
//            } else {
//                if (ch=='+' || ch=='-'){
//                    //work
//                    int v2 = val.pop();
//                    int v1 = val.pop();
//                    if (op.peek()=='+') val.push(v1+v2);
//                    if (op.peek()=='-') val.push(v1-v2);
//                    if (op.peek()=='*') val.push(v1*v2);
//                    if (op.peek()=='/') val.push(v1/v2);
//                    op.pop();
//
//                    //push
//                    op.push(ch);
//                }
//                if (ch=='*' || ch=='/'){
//
//                    if (op.peek()=='*'|| op.peek()=='/'){
//
//                        //work
//                        int v2 = val.pop();
//                        int v1 = val.pop();
//
//                        if (op.peek()=='*') val.push(v1*v2);
//                        if (op.peek()=='/') val.push(v1/v2);
//                        op.pop();
//
//                        //push
//                        op.push(ch);
//                    }
//                    else op.push(ch);
//                }
//            }
//        }
//
//
//
//        while (val.size()>1){
//            int v2 = val.pop();
//            int v1 = val.pop();
//            if (op.peek()=='+') val.push(v1+v2);
//            if (op.peek()=='-') val.push(v1-v2);
//            if (op.peek()=='*') val.push(v1*v2);
//            if (op.peek()=='/') val.push(v1/v2);
//            op.pop();
//        }
//
//
//        System.out.println(val.peek());
//    }
//}



package practice.stack;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args){
        String st = "9-(5+3)*4/6";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else if (op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            } else if (ch==')') {
                while (op.peek()!='('){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();
            }else {
                if (ch=='+' || ch=='-'){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();

                    op.push(ch);
                }

                if (ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/') {

                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);
                        op.pop();

                        op.push(ch);
                    }else{
                        op.push(ch);
                    }

                }
            }

        }


        while (val.size()>1){
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek() == '+') val.push(v1 + v2);
            if (op.peek() == '-') val.push(v1 - v2);
            if (op.peek() == '*') val.push(v1 * v2);
            if (op.peek() == '/') val.push(v1 / v2);
            op.pop();
        }


        System.out.println(val.peek());

    }
}








