public class Basics {

    public static class Node{
        int data; // value
        Node next; // address of next node

        Node(int data){
            this.data=data;
        }
    }

    public static void printLinkedList(Node head){

        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }


    public static void printLinkedRecur(Node head){

        if (head==null) return;
        System.out.print(head.data + " ");
        printLinkedList(head.next);
    }


    static int length(Node head){
        int i=0;
        while (head!=null){
            i++;
            head = head.next;
        }
        return i;
    }


//    static int lengthRecur(Node head){
//        int count =0;
//        if (head==null) return -1;
//        count++;
//        printLinkedList(head.next);
//        return count;
//    }

    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(3);
        Node n4 = new Node(5);
        Node n5 = new Node(3);


        n1.next=n2;  // 3 -> 5 3 5 3 -> null
        n2.next=n3;  // 3 -> 5 -> 3 5 3 -> null
        n3.next=n4;  // 3 -> 5 -> 3 -> 5 3 -> null
        n4.next=n5;  // 3 -> 5 -> 3 -> 5 -> 3 -> null

//        System.out.println(n4.next);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);

//        System.out.println(n1.data);
//        System.out.println(n2.data);
//        System.out.println(n1.next.data);


        //Insert at index 2 15
//        Node n6 = new Node(15);
//        n2.next=n6;
//        n6.next=n3;

//
//        System.out.println("-------------------");
//        System.out.println(n1.data);
//        System.out.println(n1.next.data);
//        System.out.println(n2.next.data);
//        System.out.println(n3.next.data);
//
        System.out.println(n1.data);
        System.out.println(n1.next.data);
        System.out.println(n1.next.next.data);
        System.out.println(n1.next.next.next.data);
        System.out.println(n1.next.next.next.next.data);

        Node temp = n1;
//        System.out.println(n1.data);
//        System.out.println(temp.data);

//        for (int i = 1; i <= 5; i++) {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }



        // For printing the Linked List
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp= temp.next;
//        }

        printLinkedList(n1);
        System.out.println();
        printLinkedRecur(n1);
        System.out.println();
        System.out.println(length(n1));

    }

}
