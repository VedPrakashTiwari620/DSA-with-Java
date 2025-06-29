package arrayImplementation;

public class StackArrImplem {
    public static class Stack{
        int size = 0;

        int arr[] = new int[10];

        public  void push(int data){

            if (isFull()){
                System.out.println("Stack is full!");
            }else{
                arr[size]=data;
                size++;
            }

        }
        public void peek(){
            if (size==0){
                System.out.println("Stack is empty!");
            }else {
                System.out.println(arr[size-1]);
            }
        }

        public int pop(){
            int data = arr[size-1];
            arr[size-1]=0;
            size--;
            return data;
        }

        public void display(){
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }


        public int sizeOf(){
            return size;
        }

        public boolean isEmpty(){
            if (size==0) return true;
            return false;
        }


        public boolean isFull(){
            if (size== arr.length) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.peek();

        System.out.println(st.sizeOf());

        System.out.println(st.isEmpty());

        System.out.println(st.isFull());

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();
        System.out.println(st.sizeOf());

        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);




        st.peek();

        System.out.println(st.pop());

        st.peek();

        st.display();


        System.out.println(st.sizeOf());


        System.out.println(st.isEmpty());



        st.push(11);

        st.push(12);
        st.push(13);
    }
}
