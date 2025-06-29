public class Singly_Circular {

    public static class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
        }
    }


    public static class SinglyCirList{
        Node head = null;
        Node tail = null;

        public void insertEle(int data){
            Node n = new Node(data);
            if (head==null){
                head=n;
                head.next=head;
            }else {
                tail.next = n;
            }
            tail=n;
            tail.next=head;
        }


        public void display(){
            Node temp = head.next;
            System.out.print(head.data+" ");
            while (temp!=head){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyCirList singlyCirList = new SinglyCirList();

        singlyCirList.insertEle(5);
        singlyCirList.insertEle(10);
        singlyCirList.insertEle(15);
        singlyCirList.insertEle(20);
        singlyCirList.insertEle(25);


        System.out.println(singlyCirList.head.data);
        System.out.println(singlyCirList.tail.data);
        System.out.println(singlyCirList.tail.next.data);

        singlyCirList.display();
    }
}
