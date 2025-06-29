class NthNode {

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


        public Node nthNodeFromEnd(int n){
            Node temp = head;

            int ind = size-n+1;



            for (int i = 0; i < ind-1; i++) {
                temp= temp.next;
            }

            return temp;
        }

        public Node nthNodeFromStart(int n){
            Node temp = head;
            for (int i = 0; i < n-1; i++) {
                temp=temp.next;
            }
            return temp;
        }



        public Node nthFromEnd(int n){
            Node slow = head;
            Node fast = head;
            for (int i = 0; i < n; i++) {
                fast=fast.next;
            }
            while (fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
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

        System.out.println(ll.size);


        Node n1 = ll.nthNodeFromEnd(8);
        System.out.println(n1.data);


        Node n2 = ll.nthNodeFromStart(6);
        System.out.println(n2.data);


        Node n3 = ll.nthFromEnd(5);
        System.out.println(n3.data);


    }
}
