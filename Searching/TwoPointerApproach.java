import java.util.Scanner;
public class TwoPointerApproach {
    static boolean getPair(int arr[],int n,int x){
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                return true;
            }
            else if(arr[i]+arr[j]<x){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
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

		System.out.print("Enter sum: ");
        int x=sc.nextInt();

        System.out.println((getPair(arr,n,x))?("Pair exists!!!"):("Pair does not exist!!!"));
		
		sc.close();
    }
}
