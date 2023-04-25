class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class DeleteLastNode {
    static Node delLast(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
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
        head=delLast(head);
        System.out.println();
        printList(head);
    }
}

