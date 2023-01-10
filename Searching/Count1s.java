import java.util.Scanner;
public class Count1s {
    static int countOnes(int arr[],int n){
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==0){
                s=mid+1;
            }
            else{
                if(mid==0||arr[mid-1]==0){
                    return (n-mid);
                }
                else{
                    e=mid-1;
                }
            }
        }
        return 0;
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

        System.out.println("No. of Occurences of 1: "+countOnes(arr,n));

		sc.close();
    }
}
