public class LinkedListImplement {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        public  void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head==null){
                head = temp;
            }else {
                tail.next= temp;
            }

            tail=temp;
        }



        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);

        ll.display();
    }
}
