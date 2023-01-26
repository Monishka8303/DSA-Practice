import java.util.*;
public class CountingSort {
    static void countSort(int arr[],int n,int k){
        int count[]=new int[k];
        Arrays.fill(count,0);
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<k;i++){
            count[i]+=count[i-1];
        }
        int output[]=new int[n];
        for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--; 
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
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

        System.out.print("Enter the range from 0 to: ");
        int k=sc.nextInt();

        countSort(arr,n,k);
        //printing the array
		System.out.print("Final array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
    }
}
