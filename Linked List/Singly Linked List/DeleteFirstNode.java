class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class DeleteFirstNode {
    static Node delFirst(Node head){
        if(head==null){
            return null;
        }
        return head.next;
    }
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
        head=insertEnd(head, 10);
        head=insertEnd(head,20);
        head=insertEnd(head,30);
        head=insertEnd(head,40);
        printList(head);
        head=delFirst(head);
        System.out.println();
        printList(head);
    }
}

