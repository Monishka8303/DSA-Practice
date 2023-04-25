class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class SegregateEvenandOddNodes {
    static Node segregate(Node head){
        Node es=null,ee=null,os=null,oe=null;
        for(Node curr=head;curr!=null;curr=curr.next){
            int x=curr.data;
            if(x%2==0){
                if(es==null){
                    es=ee=curr;
                }
                else{
                    ee.next=curr;
                    ee=ee.next;
                }
            }
            else{
                if(oe==null){
                    os=oe=curr;
                }
                else{
                    oe.next=curr;
                    oe=oe.next;
                }
            }
        }
        if(os==null|| es==null){
            return head;
        }
        ee.next=os;
        oe.next=null;
        return es;
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
        Node head=new Node(17);
    	head.next=new Node(15);
    	head.next.next=new Node(8);
    	head.next.next.next=new Node(12);
    	head.next.next.next.next=new Node(10);
    	head.next.next.next.next.next=new Node(5);
    	head.next.next.next.next.next.next=new Node(4);
    	printList(head);
    	head=segregate(head);
    	printList(head);
    }
}
