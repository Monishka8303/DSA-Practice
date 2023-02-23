class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        prev=null;
        next=prev;
    }
}
public class InsertAtEndInDLL {
    static Node insertEnd(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            return temp;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
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
        head=insertEnd(head,40);
        head=insertEnd(head,30);
        head=insertEnd(head,20);
        head=insertEnd(head,10);
        printList(head);
    }
}
