class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class DeleteNodeWithOnlyItsPointer {
    static void deleteNode(Node ptr){
        ptr.data=ptr.next.data;
        ptr.next=ptr.next.next;
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
        Node head=new Node(10);
    	head.next=new Node(20);
    	Node ptr=new Node(30);
	    head.next.next=ptr;
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=new Node(25);
        printList(head);
        deleteNode(ptr);
        printList(head);
    }
}
