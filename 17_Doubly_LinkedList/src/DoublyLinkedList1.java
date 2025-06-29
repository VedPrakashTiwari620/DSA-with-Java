public class DoublyLinkedList1 {

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
             this.val= val;
        }
    }


    public static class DDL{
        Node head = null;
        Node tail = null;

        public void insertEle(int data){
            int val = data;

            Node n = new Node(val);

            if (head==null){
                head = n;
            }else {
                tail.next=n;
                n.prev=tail;
            }
            tail=n;
        }


        public void insertAtHead(int data){
            Node n = new Node(data);
            if (head==null){
                head=n;
            }else {
                n.next=head;
                head.prev=n;
                head=n;
            }
        }




        public void insertAtIndex(int data, int ind){

            Node temp = head;
            Node n = new Node(data);

            for (int i = 0; i < ind-1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next= n;


        }



        public void insertAtTail(int data){
            Node n = new Node(data);
            Node temp = head;

            if (head==null){
                head=n;
            }else {
                while (temp.next!=null){
                    temp=temp.next;
                }

                temp.next=n;
                n.prev=temp;
                tail=n;
            }

        }


        public void display(){
            Node temp = head;

            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }

            System.out.println();
        }


        public void twoSum(int tar){
            Node h = head;
            while (h.next!=null){
                h=h.next;
            }
            Node t = h;
            h = head;

            while (h.val<t.val){
                if (h.val+t.val==tar){
                    System.out.println(h.val+", "+t.val);
                    break;
                } else if ((h.val+t.val>tar)) {
                    t = t.prev;
                } else {
                    h=h.next;
                }
            }
        }


        public void disMinimaMaxima(){
            Node h=head.next;


            int min =0;
            int index=1;
            int c1 = -1;
            int c2=-1;


//            System.out.println(min);

            while (h.next!=null){
                if ((h.prev.val)< h.val && h.val>(h.next.val) || (h.prev.val>h.val && h.val<h.next.val)){
                   if (c1==-1){
                       c1=index;
                   }
                   else if (c2==-1){
                       c2=index;
                   }
                   else{
                       c1=c2;
                       c2 = index;
                   }
                }

                min = c2-c1;
                index++;
                h=h.next;

            }

            System.out.println(min);
        }

    }


    public static void main(String[] args){
        DDL ddl = new DDL();
        ddl.insertEle(5);
        ddl.insertEle(10);
        ddl.insertEle(15);
        ddl.insertEle(20);
        ddl.insertEle(25);


        ddl.display();

        ddl.insertAtHead(0);

        ddl.display();

//        ddl.insertAtIndex(12,5);

        ddl.display();

        ddl.insertAtTail(30);

        ddl.display();

        System.out.println(ddl.head.val);

        System.out.println(ddl.tail.val);

        ddl.twoSum(15);




        DDL ddl1 = new DDL();
        ddl1.insertEle(1);
        ddl1.insertEle(2);
        ddl1.insertEle(1);
        ddl1.insertEle(4);
        ddl1.insertEle(5);
        ddl1.insertEle(6);
        ddl1.insertEle(7);
        ddl1.insertEle(8);
        ddl1.insertEle(9);
        ddl1.insertEle(8);
        ddl1.display();
        ddl1.disMinimaMaxima();
    }
}
