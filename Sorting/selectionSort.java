import java .util.*;
public class selectionSort{
	public static void swap(int arr[],int i,int j){
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
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
		
		//Selection Sort
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			if(min!=i){
				swap(arr,min,i);
			}
		}
		
		//printing the array
		System.out.print("Final array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}
}