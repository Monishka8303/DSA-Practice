class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class CircularLinkedList {
    static void printList(Node head){
        if(head==null){
            return;
        }
        // System.out.print(head.data+" ");
        // for(Node r=head.next;r!=head;r=r.next){
        //     System.out.print(r.data+" ");
        // }
        // System.out.println();
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=head;
        printList(head);
    }
}
