class Intersection {
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


        public void insertElement(int data){
            Node temp = new Node(data);
            if (head==null){
                head=temp;
            }else {
                tail.next = temp;
            }

            tail=temp;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertElement(10);
        ll.insertElement(15);
        ll.insertElement(20);
        ll.insertElement(25);
        ll.insertElement(30);
    }
}
