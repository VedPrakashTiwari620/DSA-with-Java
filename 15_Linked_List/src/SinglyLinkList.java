public class SinglyLinkList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size;

        public void insertAtEnd(int data){
            Node t = new Node(data);
            if (head==null){
                head=t;
            }else {
                tail.next = t;
            }
            tail=t;
        }


        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
        }


    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(12);
        ll.insertAtEnd(10);
        ll.insertAtEnd(8);
        ll.insertAtEnd(6);

        ll.display();

        System.out.println();

        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        System.out.println(ll.tail.next);

    }
}
