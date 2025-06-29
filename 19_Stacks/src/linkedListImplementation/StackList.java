package linkedListImplementation;

public class StackList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static class Stack{
        Node head = null;

        int size = 0;


        public void push(int data){
            Node n1 = new Node(data);
            n1.next=head;
            head=n1;
            size++;

        }

        public int peek(){
            return head.data;
        }

        public int pop(){
            Node temp = head;
            head=head.next;
            return temp.data;
        }


        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+"--->");
                temp=temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.size);
        System.out.println(st.head.data);
        System.out.println(st.peek());
        System.out.println();
        System.out.println();
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        st.push(3);
//        System.out.println(st.peek());
//        System.out.println(st.pop());



        st.display();
    }
}
