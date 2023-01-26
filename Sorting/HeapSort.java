import java.util.Scanner;
public class HeapSort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void maxHeapify(int arr[],int n,int i){
        int largest=i,left=2*i+1,right=2*i+2;
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(arr,i,largest);
            maxHeapify(arr,n,largest);
        }
    }
    static void buildHeap(int arr[],int n){
        for(int i=n/2-1;i>=0;i--){
            maxHeapify(arr,n,i);
        }
    }
    static void heapSort(int arr[],int n){
        buildHeap(arr,n);
        for(int i=n-1;i>=1;i--){
            swap(arr,0,i);
            maxHeapify(arr,i,0);
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

        heapSort(arr,n);
        //printing the array
		System.out.print("Final array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
    }
}
