class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class IntersectionPointOfTwoLinkedListMethod3 {
    static Node getIntersection(Node head1,Node head2){
        if(head1==null||head2==null){
            return null;
        }
        Node a=head1;
        Node b=head2;
        while(a!=b){
            a=(a==null)?head2:a.next;
            b=(b==null)?head1:b.next;
        }
        return a;
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
        Node ans=getIntersection(head1, head2);
    	System.out.print(ans.data); 
    }
}
