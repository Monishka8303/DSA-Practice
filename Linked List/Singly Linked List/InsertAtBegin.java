class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class InsertAtBegin {
    static Node insertBeg(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        return temp;
    }
    static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertBeg(head, 10);
        head=insertBeg(head,20);
        head=insertBeg(head,30);
        head=insertBeg(head,40);
        printList(head);
    }
}
