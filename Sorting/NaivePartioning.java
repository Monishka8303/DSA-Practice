import java.util.Scanner;
public class NaivePartioning {
    static void partition(int arr[],int l,int h,int p){
        int temp[]=new int[h-l+1];
        int index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<=arr[p]){
                temp[index++]=arr[i];
            }
        }
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){
                temp[index++]=arr[i];
            }
        }
        for(int i=l;i<=h;i++){
            arr[i]=temp[i-l];
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
        System.out.print("Enter the partitioning index: ");
		int p=sc.nextInt();

        partition(arr,0,n-1,p);

		System.out.print("Final array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
    }
}
