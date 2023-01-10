import java.util.Scanner;
public class bubbleSort{
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
		
		//Bubble Sort
		for(int i=0;i<n-1;i++){
			boolean b=false;
			for(int j=0;j<n-i-1;j++){                  // n-i-1 as whenever a pass is over, the last element is sorted
				if(arr[j+1]<arr[j]){                   // if the next element is lesser than the preceding element
					swap(arr,j+1,j);                   // swaps both the elements
					b=true;
				}
			}
			if(!b){
				break;
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