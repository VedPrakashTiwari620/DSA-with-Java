package arrayImplementation;

public class StackArr {

    public static class Stack {


        int[] arr = new int[5];
        int size = 0;


        public void push(int data) {
            if (isFull()){
                System.out.println("Stack is full !!!");
            }else {
                arr[size] = data;
                size++;
            }
        }

        public boolean isFull(){
            if (size==arr.length) return true;
            return false;
        }

        public int size(){
            return size;
        }

        public int peek(){
            return arr[size-1];
        }


        public int pop(){

            if (!isEmpty()){
                int x = arr[size-1];
                arr[size-1]=0;
                size--;
                return x;
            }else{
                System.out.println("Stack is Empty !!!");
            }
            return -1;
        }

        public boolean isEmpty(){
            if (size==0) return true;
            return false;

        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        st.push(6);

//        System.out.println(st.size);
//        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
