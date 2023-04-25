class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

public class RecursiveReverseMethod1 {
    static Node recReverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node rest_head=recReverse(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
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
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertBeg(head, 70);
        head=insertBeg(head, 60);
        head=insertBeg(head, 50);
        head=insertBeg(head, 40);
        head=insertBeg(head, 30);
        head=insertBeg(head, 20);
        head=insertBeg(head, 10);
        printList(head);

        head=recReverse(head);
        printList(head);
    }
}
