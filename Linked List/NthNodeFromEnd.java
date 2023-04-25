class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class NthNodeFromEnd {
    static void printNthFromEnd(Node head, int n){
        int len=0;
        for(Node curr=head;curr!=null;curr=curr.next){
            len++;
        }
        Node curr=head;
        for(int i=1;i<len-n+1;i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
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
        head=insertBeg(head, 60);
        head=insertBeg(head, 50);
        head=insertBeg(head, 40);
        head=insertBeg(head, 30);
        head=insertBeg(head, 20);
        head=insertBeg(head, 10);
        printList(head);

        printNthFromEnd(head,5);
    }
}
