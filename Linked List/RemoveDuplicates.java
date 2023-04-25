class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class RemoveDuplicates {
    static void removeDuplicates(Node head){
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
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
        head=insertBeg(head, 30);
        head=insertBeg(head, 30);
        head=insertBeg(head, 20);
        head=insertBeg(head, 20);
        head=insertBeg(head, 10);
        head=insertBeg(head, 10);
        head=insertBeg(head, 10);
        printList(head);

        removeDuplicates(head);
        printList(head);
    }
}
