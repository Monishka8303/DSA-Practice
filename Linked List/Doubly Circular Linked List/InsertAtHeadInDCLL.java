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
public class InsertAtHeadInDCLL{
    static Node insertAtHead(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
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
        head=insertAtHead(head,40);
        head=insertAtHead(head,30);
        head=insertAtHead(head,20);
        head=insertAtHead(head,10);
        printList(head);
    }
}