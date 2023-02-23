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
public class DeleteLastOfDLL {
    static Node delLast(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }
    static Node insertBegin(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        if(head!=null){
            head.prev=temp;
        }
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
        head=insertBegin(head,40);
        head=insertBegin(head,30);
        head=insertBegin(head,20);
        head=insertBegin(head,10);
        printList(head);
        head=delLast(head);
        printList(head);
    }
}
