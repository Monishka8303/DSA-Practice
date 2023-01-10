import java.util.Scanner;
public class PeakElement {
    static int getPeak(int arr[],int n){
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])){
                return mid;
            }
            if(mid>0 && arr[mid-1]>=arr[mid]){
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
        
        System.out.println("Peak at index: "+getPeak(arr,n));
		
		sc.close();
    } 
}
