import java.util.Scanner;
public class CountOccurences {
    static int firstOcc(int arr[],int n,int x){
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>x){
                e=mid-1;
            }
            else if(arr[mid]<x){
                s=mid+1;
            }
            else{
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;
    }
    static int lastOcc(int arr[],int n,int x){
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>x){
                e=mid-1;
            }
            else if(arr[mid]<x){
                s=mid+1;
            }
            else{
                if(mid==n-1||arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return -1;
    }
    static int occ(int arr[],int n,int x){
        int first=firstOcc(arr,n,x);
        int last=lastOcc(arr,n,x);
        if(first==-1){
            return 0;
        }
        return (last-first+1);
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

        System.out.println("No. of Occurences: "+occ(arr,n,x));

		sc.close();
    }
}
