class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class InsertAtEndInCLL {
    static Node insertEnd(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            // Node curr=head;
            // while(curr.next!=head){
            //     curr=curr.next;
            // }
            // curr.next=temp;
            // temp.next=head;
            // return head;                 OR
            temp.next=head.next;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return temp;
        }
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
    public static void main(String[] args) {
        Node head=null;
        head=insertEnd(head,10);
        head=insertEnd(head,20);
        head=insertEnd(head,30);
        head=insertEnd(head,40);
        printList(head);
    }
}
