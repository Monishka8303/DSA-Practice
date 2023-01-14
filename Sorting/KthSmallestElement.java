import java.util.Scanner;
public class KthSmallestElement {
    static int partition(int arr[],int l,int h){
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
    static int kthSmallest(int arr[],int n,int k){
        int l=0,h=n-1;
        while(l<=h){
            int p=partition(arr,l,h);
            if(p==k-1){
                return arr[p];
            }
            else if(p>k-1){
                h=p-1;
            }
            else{
                l=p+1;
            }
        }
        return -1;
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

        System.out.print("Enter k: ");
        int k=sc.nextInt();

        System.out.println(k+"th smallest element in the array: "+kthSmallest(arr,n,k));

        sc.close();
    }
}
