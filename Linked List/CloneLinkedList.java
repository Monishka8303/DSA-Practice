import java.util.HashMap;
class Node {  
    int data;  
    Node next,random;  
    Node(int x)  
    {  
        data = x;  
        next = random = null;  
    }  
}
public class CloneLinkedList {
    static Node clone(Node h1){
        HashMap<Node,Node> m=new HashMap<>();
        for(Node curr=h1;curr!=null;curr=curr.next){
            m.put(curr,new Node(curr.data));
        }
        for(Node curr=h1;curr!=null;curr=curr.next){
            Node clone=m.get(curr);
            clone.next=m.get(curr.next);
            clone.random=m.get(curr.random);
        }
        return m.get(h1);
    }
    static Node clone2(Node h1){
        Node next;
        for(Node curr=h1;curr!=null;){
            next=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=next;
            curr=next;
        }
        for(Node curr=h1;curr!=null;curr=curr.next.next){
            curr.next.random=(curr.random==null)?null:curr.random.next;
        }
        Node original=h1;
        Node clone=h1.next;
        Node temp=clone;
        while(original!=null && clone!=null){
            original.next=(original.next!=null)?original.next.next:null;
            clone.next=(clone.next!=null)?clone.next.next:clone.next;
            original=original.next;
            clone=clone.next;
        }
        return temp;
    }
    static void printList(Node head){
        Node ptr = head; 
        while (ptr!=null) 
        { 
            System.out.println ( "Data = " + ptr.data + ", Random  = "+ ptr.random.data ); 
            ptr = ptr.next; 
        }
    }
    public static void main(String[] args) 
	{ 
		Node head = new Node(10); 
        head.next = new Node(5); 
        head.next.next = new Node(20); 
        head.next.next.next = new Node(15); 
        head.next.next.next.next = new Node(20); 
        
        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;
        
        System.out.print( "Original list : \n"); 
        printList(head); 
      
        System.out.print( "\nCloned list : \n"); 
        Node cloned_list = clone2(head); 
        printList(cloned_list);  
	}
}
