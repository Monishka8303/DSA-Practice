import java.util.Scanner;
public class RecursiveBinarySearch {
    static int bSearch(int arr[],int l,int h,int x){
        if(l>h){
            return -1;
        }
        int mid=l+(h-l)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            return bSearch(arr,l,mid-1,x);
        }
        else{
            return bSearch(arr,mid+1,h,x);
        }
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

        System.out.println((bSearch(arr,0,n-1,x)==-1)?("Value not present!!!"):("Value present at: "+bSearch(arr,0,n-1,x)));
		
		sc.close();
    }
}
