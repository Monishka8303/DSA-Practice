import java.util.*;
public class insertionSort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[100];
		
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		
		System.out.print("Enter the elements of the array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		//Insertion Sort
		for(int i=1;i<n;i++){                 //we take unsorted array's starting index as 1 because an array with a single element is always sorted which is arr[0]
			int temp=arr[i];                  //temporary variable to be sorted
			int j=i-1;                        //ending index of sorted array for traversing and inserting the next element
			while(j>=0 && arr[j]>temp){       //loop goes until we find element less than temporary variable
				arr[j+1]=arr[j];              //asigning the rest of the values to next index until the required position
				j--;
			}
			arr[j+1]=temp;                    //assigning element to the required index
		}
		
		//printing the array
		System.out.print("Final array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}
}