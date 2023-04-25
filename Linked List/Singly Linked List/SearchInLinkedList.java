import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class SearchInLinkedList {
    static int search(Node head,int x){
        if(head==null){
            return -1;
        }
        int pos=1;
        Node curr=head;
        while(curr!=null){
            if(curr.data==x){
                return pos;
            }
            else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }
    static int recSearch(Node head,int x){
        if(head==null){
            return -1;
        }
        if(head.data==x){
            return 1;
        }
        else{
            int res=recSearch(head.next,x);
            if(res==-1){
                return -1;
            }
            else{
                return res+1;
            }
        }
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
        Scanner sc=new Scanner(System.in);
        Node head=null;
        head=insertBeg(head, 40);
        head=insertEnd(head, 50);
        head=insertBeg(head,30);
        head=insertEnd(head,60);
        head=insertBeg(head,20);
        head=insertEnd(head,70);
        head=insertBeg(head,10);
        head=insertEnd(head,80);
        System.out.print("Enter the element to be searched in the list(Iterative search): ");
        int x=sc.nextInt();
        if(search(head,x)<0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: "+search(head,x));
        }
        System.out.print("Enter the element to be searched in the list(Recursive search): ");
        int y=sc.nextInt();
        if(search(head,y)<0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: "+recSearch(head,y));
        }
        sc.close();
    }
}
