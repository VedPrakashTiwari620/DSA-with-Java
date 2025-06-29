public class DoublyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val= val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        if (temp.prev!=null){
            while (temp.prev!=null){
                temp=temp.prev;
            }
        }
//        System.out.println(temp);

        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void displayRev(Node tail){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(15);
        Node c = new Node(20);
        Node d = new Node(25);
        Node e = new Node(30);
        a.next=b;
        a.prev=null;
        b.next=c;
        b.prev=a;
        c.next=d;
        c.prev=b;
        d.next=e;
        d.prev=c;
        e.next=null;
        e.prev=d;

        display(c);
        displayRev(e);


    }
}
