import java.util.Scanner;
public class AllocateMinimumPagesNaive {
	static int sum(int arr[],int s,int e){
		int sum=0;
		for(int i=s;i<=e;i++){
			sum+=arr[i];
		}
		return sum;
	}
	static int minPages(int arr[],int n,int k){
		if(k==1){
			return sum(arr,0,n-1);
		}
		if(n==1){
			return arr[0];
		}
		int res=Integer.MAX_VALUE;
		for(int i=1;i<n;i++){
			res=Math.min(res,Math.max(minPages(arr,i,k-1),sum(arr,i,n-1)));
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
