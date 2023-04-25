class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class ReverseInGroupsOfK {
    static Node reverseK(Node head,int k){
        Node curr=head,next=null,prev=null;
        int count=0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++; 
        }
        if(next!=null){
            Node rest_head=reverseK(next,k);
            head.next=rest_head;
        }
        return prev;
    }
    static Node recReverseK(Node head,int k){
        Node curr=head,prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node first=curr,prev=null;
            int count=0;
            while(curr!=null && count<k){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            if(isFirstPass){
                head=prev;
                isFirstPass=false;
            }
            else{
                prevFirst.next=prev;
            }
            prevFirst=first;
        }
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
        head=insertBeg(head, 70);
        head=insertBeg(head, 60);
        head=insertBeg(head, 50);
        head=insertBeg(head, 40);
        head=insertBeg(head, 30);
        head=insertBeg(head, 20);
        head=insertBeg(head, 10);
        printList(head);

        head=recReverseK(head,3);
        printList(head);
    }
}
