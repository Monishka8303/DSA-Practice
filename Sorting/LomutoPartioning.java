import java.util.Scanner;
public class LomutoPartioning {
    static int lPartition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
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

        int x=lPartition(arr,0,n-1);

		System.out.print("Final array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

        System.out.println("\nNew Partitioning index: "+x);
		
		sc.close();
    }
}
