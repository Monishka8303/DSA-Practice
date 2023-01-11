import java.util.Scanner;
public class MergeSort {
    static void merge(int arr[],int l,int m,int h){
        int n1=m-l+1,n2=h-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+i+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    static void mergeSort(int arr[],int l,int h){
        if(h>l){
            int mid=l+(h-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,mid,h);
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

        mergeSort(arr,0,n-1);
        //printing the array
		System.out.print("Final array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
    }
}
