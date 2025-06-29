public class LinkListImp1 {
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


        // Method to insert at end
        public void insertAtEnd(int data){
            Node temp = new Node(data);
            if (head==null){
                head=temp;
            }else {
                tail.next= temp;
            }
            tail=temp;
            size++;
        }



        // Method to insert a node to the start beginning
        public void insertAtBegin(int data){
            Node temp = new Node(data);
            if (head==null){
                head = temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;
        }



        //Method to insert at Index
        public void insertAt(int ind, int data){
            Node t = new Node(data);
            int length = size();
            Node temp = head;

            if (ind==0){
                insertAtBegin(data);
                return;
            }else if (ind>0 && ind<length){
                for (int i = 1; i <= ind-1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
                size++;
                return;
            }else if (ind==length){
                insertAtEnd(data);
                return;
            }
            System.out.println("Wrong Index");

        }



        // Delete at Index
        public void deleteAtIndex(int ind){
            Node temp = head;

            if (ind==0){
                head = head.next;
                size--;
                return;
            }
            if (ind>0 && ind<size-1){
                for (int i = 0; i < ind-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;

                size--;
                return;
            }
            if (ind==size-1){

                for (int i = 0; i < ind-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                tail= temp;
                size--;
                return;
            }
            System.out.println("Wrong Index");
        }


        // To get element at given index
        public int getElement(int ind){
            Node temp = head;
            int ele = -1;

            if (ind>=size()){
                return -1;
            }

            for (int i = 0; i < ind; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // To Print the LinkedList
        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }

            System.out.println();
        }

        // To return the length of the linked list
        public int size(){
            int count = 0;
            Node temp = head;
            while (temp!=null){
                count++;
                temp= temp.next;
            }
            return count;
        }


    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.insertAtEnd(5);
//        ll.insertAtEnd(4);
//        ll.insertAtEnd(3);
//        ll.insertAtEnd(2);
//


        int length = ll.size();



//        ll.insertAtBegin(6);
//
//
//        ll.insertAt(1,23);

        ll.insertAt(0,30);
        ll.insertAt(0,20);
        ll.insertAt(0,10);
        ll.insertAt(1,15);
        ll.insertAt(3,25);
        ll.insertAt(5,35);
        ll.insertAt(6,40);
        ll.insertAt(0,5);

        ll.display();
//        System.out.println(ll.head.data);
//        System.out.println(ll.tail.data);

//        ll.insertAt(9,234);

//        System.out.println(ll.getElement(2));

        System.out.println(ll.size);
        ll.deleteAtIndex(3);
        ll.display();
        System.out.println(ll.size);
        ll.deleteAtIndex(0);
        ll.display();
        System.out.println(ll.size);
        ll.deleteAtIndex(5);
        ll.display();
        System.out.println(ll.size);


        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);


        System.out.println(ll.head.next.data);
        System.out.println(ll.tail.next);

    }
}
