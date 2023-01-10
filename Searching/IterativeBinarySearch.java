import java.util.Scanner;
public class IterativeBinarySearch {
    static int bSearch(int arr[],int n,int x){
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
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

		System.out.print("Enter the value to be searched: ");
        int x=sc.nextInt();

        System.out.println((bSearch(arr,n,x)==-1)?("Value not present!!!"):("Value present at: "+bSearch(arr,n,x)));
		
		sc.close();
    }
}
