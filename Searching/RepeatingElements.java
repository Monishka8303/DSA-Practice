import java.util.Scanner;
public class RepeatingElements {
    static int findRepeating(int arr[],int n){
        int slow=arr[0]+1,fast=arr[0]+1;
        do{
            slow=arr[slow]+1;
            fast=arr[arr[fast]+1]+1;
        }while(slow!=fast);
        slow=arr[0]+1;
        while(slow!=fast){
            fast=arr[fast]+1;
            slow=arr[slow]+1;
        }
        return slow-1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int[] arr=new int[100];
		
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		
		System.out.print("Enter the elements of the array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

        System.out.println("The repeating element: "+findRepeating(arr,n));
        sc.close();
    }
}
