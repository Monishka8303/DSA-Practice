class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
}
public class InsertAtEndInDCLL {
    static Node insertAtEnd(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            temp.prev=temp;
            temp.next=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return head;
    }
    static void printList(Node head){
        if(head==null){
            return;
        }
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
        System.out.println();
    }
    public static void main(String[] args){
        Node head=null;
        head=insertAtEnd(head,40);
        head=insertAtEnd(head,30);
        head=insertAtEnd(head,20);
        head=insertAtEnd(head,10);
        printList(head);
    }
}
