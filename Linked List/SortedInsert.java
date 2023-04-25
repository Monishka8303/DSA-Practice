class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class SortedInsert {
    static Node sortedInsert(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            return temp;
        }
        if(data<head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<data){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
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
        head=insertBeg(head, 50);
        head=insertBeg(head, 40);
        head=insertBeg(head, 30);
        head=insertBeg(head, 20);
        head=insertBeg(head, 10);
        printList(head);

        head=sortedInsert(head,45);
        printList(head);
    }
}
