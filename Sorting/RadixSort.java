import java.util.Scanner;
public class RadixSort {
    static void countingSort(int arr[],int n,int exp){
        int count[]=new int[10];
        int output[]=new int[n];
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    static void radixSort(int arr[],int n){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
        }
        for(int exp=1;mx/exp>0;exp*=10){
            countingSort(arr,n,exp);
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

        radixSort(arr,n);
        //printing the array
		System.out.print("Final array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
    }
}
