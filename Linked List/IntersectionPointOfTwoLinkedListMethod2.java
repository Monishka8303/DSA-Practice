class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class IntersectionPointOfTwoLinkedListMethod2 {
    static int getNode(Node head1,Node head2){
        int c1=getCount(head1);
        int c2=getCount(head2);
        int d;
        if(c1>c2){
            d=c1-c2;
            return getIntersectionNode(d,head1,head2);
        }
        else{
            d=c2-c1;
            return getIntersectionNode(d,head2,head1);
        }
    }
    static int getIntersectionNode(int d,Node head1,Node head2){
        int i;
        Node current1=head1;
        Node current2=head2;
        for(i=0;i<d;i++){
            if(current1==null){
                return -1;
            }
            current1=current1.next;
        }
        while(current1!=null && current2!=null){
            if(current1==current2){
                return current1.data;
            }
            current1=current1.next;
            current2=current2.next;
        }
        return -1;
    }
    static int getCount(Node head){
        int count=0;
        for(Node curr=head;curr!=null;curr=curr.next){
            count++;
        }
        return count;
    }
    public static void main(String args[]) 
    { 
        /* 
    		Creation of two linked lists 
    	
    		1st 3->6->9->15->30 
    		2nd 10->15->30 
    	
    		15 is the intersection point 
    	*/
    
    	Node newNode; 
    
    	Node head1 = new Node(10); 
    
    	Node head2 = new Node(3); 
    
    	newNode = new Node(6); 
    	head2.next = newNode; 
    
    	newNode = new Node(9); 
    	head2.next.next = newNode; 
    
    	newNode = new Node(15); 
    	head1.next = newNode; 
    	head2.next.next.next = newNode; 
    
    	newNode = new Node(30); 
    	head1.next.next = newNode; 
    
    	head1.next.next.next = null; 
    
    	System.out.print(getNode(head1, head2)); 
    }
}
