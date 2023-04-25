class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class NthNodeFromEndMethod2 {
    static void printNthFromEnd(Node head, int n){
        if(head==null){ return; }
        Node first=head,second=head;
        for(int i=0;i<n;i++){
            if(first==null){    return;   }
            first=first.next;
        }
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        System.out.println(second.data);
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

        printNthFromEnd(head,3);
    }
}