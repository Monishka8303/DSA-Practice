import java.util.Scanner;
public class AllocateMinimumPagesEfficient {
    static boolean isFeasible(int arr[],int n,int k,int barrier){
        int req=1,sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>barrier){
                req++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return req<=k;
    }
    static int minPages(int arr[],int n,int k){
        if(k>n){
            return -1;
        }
        int sum=0,mx=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            mx=Math.max(mx,arr[i]);
        }
        int low=mx,high=sum,res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isFeasible(arr,n,k,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
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

		System.out.print("Number of students: ");
		int k=sc.nextInt();

        System.out.println("Minimum Page allocated: "+minPages(arr,n,k));
        sc.close();
    }
}
