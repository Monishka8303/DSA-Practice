class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class InsertAtGivenPosition {
    static Node insertPos(Node head,int pos,int data){
        Node temp=new Node(data);
        if(head==null){
            if(pos==1){
                return temp;
            }
            else{
                return head;
            }
        }
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i=1;i<=pos-2;i++){
            curr=curr.next;
            if(curr==null){
                System.out.println("Position out of range!");
                return head;
            }
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
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertBeg(head, 40);
        head=insertEnd(head, 50);
        head=insertBeg(head,30);
        head=insertEnd(head,60);
        head=insertBeg(head,20);
        head=insertEnd(head,70);
        head=insertBeg(head,10);
        head=insertEnd(head,80);
        printList(head);
        head=insertPos(head,1,5);
        head=insertPos(head,3,15);
        head=insertPos(head,5,25);
        head=insertPos(head,7,35);
        head=insertPos(head,9,45);
        head=insertPos(head,11,55);
        head=insertPos(head,13,65);
        printList(head);
        head=insertPos(head,19,75);
        printList(head);
    }
}
