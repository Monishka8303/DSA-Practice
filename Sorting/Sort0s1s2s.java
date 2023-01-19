import java.util.Scanner;
public class Sort0s1s2s {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort(int arr[],int n){
        int l=0,mid=0,h=n-1;
        while(mid<=h){
            if(arr[mid]==0){
                swap(arr,l,mid);
                mid++;
                l++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,h);
                h--;
            }
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
		sort(arr, n);
        System.out.print("Final Array: ");
        for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

        sc.close();
    }
}
