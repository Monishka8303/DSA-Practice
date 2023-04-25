import java.util.HashSet;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class IntersectionPointOfTwoLinkedListMethod1 {
    static int getIntersection(Node head1,Node head2){
        HashSet<Node> s=new HashSet<>();
        for(Node curr=head1;curr!=null;curr=curr.next){
            s.add(curr);
        }
        for(Node curr=head2;curr!=null;curr=curr.next){
            if(s.contains(curr)){
                return curr.data;
            }
        }
        return -1;
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
    
    	System.out.print(getIntersection(head1, head2)); 
    }
}
