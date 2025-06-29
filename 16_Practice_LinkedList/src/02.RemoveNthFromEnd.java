class RemoveNthFromEnd {


    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        public  void insertNode(int data){
            Node temp = new Node(data);
            if (head==null){
                head = temp;
            }else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }




        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+ " ");
                temp= temp.next;
            }
            System.out.println();
        }


        public void deleteNthFromEnd(int n){
            Node slow = head;
            Node fast = head;

            for (int i = 0; i < n; i++) fast=fast.next;

            if (fast==null){
                head = head.next;
                return;
            }
            while (fast!=tail){
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;
        }
    }




    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insertNode(5);
        ll.insertNode(10);
        ll.insertNode(15);
        ll.insertNode(20);
        ll.insertNode(25);
        ll.insertNode(30);


        ll.display();


        ll.deleteNthFromEnd(6);

        ll.display();

        System.out.println(ll.tail.data);

    }
}
