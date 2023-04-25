import java.util.HashSet;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class DetectLoopMethod2 {
    static boolean isLoop(Node head){
        HashSet<Node> s=new HashSet<>();
        for(Node curr=head;curr!=null;curr=curr.next){
            if(s.contains(curr)){
                return true;
            }
            s.add(curr);
        }
        return false;
    }
    public static void main(String[] args) {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
    	if (isLoop(head)) 
            System.out.print("Loop found"); 
        else
            System.out.print("No Loop"); 

    }
}
