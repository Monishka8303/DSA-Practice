class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class DeleteHeadOfCLL {
    static Node delHead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
    static Node insertBegin(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            temp.next=head.next;
            head.next=temp;
            int t=temp.data;
            temp.data=head.data;
            head.data=t;
            return head;
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
        head=insertBegin(head,40);
        head=insertBegin(head,30);
        head=insertBegin(head,20);
        head=insertBegin(head,10);
        printList(head);
        head=delHead(head);
        printList(head);
    }
}
