public class ReverseLinkedList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class ListNode{
        Node head = null;
        Node tail = null;

        int size;


        public void insertEle(int data){
            Node temp = new Node(data);
            if (head==null){
                head=temp;
                size++;
            }else {
                tail.next=temp;
                size++;
            }

            tail=temp;
        }


        public void displayRev(Node head){
            Node temp = head;
            if (head==null) return ;
            displayRev(temp.next);
            System.out.print(temp.data+" ");
        }

    }

    public static void display(Node head){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head){
        if (head.next==null) return head;
        Node newNode = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }


    public static Node rev(Node head){
        Node prev = null;
        Node curr = head;
        Node nextN = null;

        while (curr!=null){
            nextN = curr.next;
            curr.next=prev;
            prev=curr;
            curr = nextN;
        }

        return prev;
    }



    public static boolean isPalindrome(Node head){

        Node temp = head;
        Node temp2 = rev(head);

        while (temp!=null){
            if (temp.data!=temp2.data) return false;
            temp= temp.next;
            temp2 = temp2.next;
        }
        return true;
    }

    public static Node dupl(Node head){
        Node temp = head;

        Node head1 = null;
        Node tail = null;

        while (temp!=null){
            Node a = new Node(temp.data);
            if (head1==null){
                head1=a;
            }else{
                tail.next=a;

            }
            tail=a;
            temp=temp.next;
        }
        return head1;
    }


    public static boolean isPalindr(Node head, int size){

        Node temp = head;
        Node p1 = head;

        for (int i = 0; i < size/2-1; i++) {
            temp = temp.next;
        }

        Node p2 = rev(temp);

        while (p2!=null && p1!=temp){
            if (p1.data!=p2.data){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertEle(1);
        ll.insertEle(2);
        ll.insertEle(3);
        ll.insertEle(3);
        ll.insertEle(2);
        ll.insertEle(1);
        ll.insertEle(1);
        ll.insertEle(10);

        ListNode l = new ListNode();
        l.insertEle(1);
        l.insertEle(2);
        l.insertEle(3);
        l.insertEle(2);
        l.insertEle(1);


        System.out.println(isPalindr(ll.head,ll.size));




//        Node h = dupl(ll.head);
//        display(ll.head);
////        System.out.println(h.next.next.next.next.next);
//
//
//
//
//        System.out.println(isPalindrome(ll.head));

//        ll.displayRev(ll.head);
//        System.out.println();
//
//        System.out.println(ll.size);
//
//
//        ll.head = reverse(ll.head);
//
//        display(ll.head);
//
//        ll.head = rev(ll.head);
//        display(ll.head);

    }
}
