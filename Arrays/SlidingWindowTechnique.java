import java.util.Scanner;
public class SlidingWindowTechnique {
    static int maxSum(int arr[],int n,int k){
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        int res=curr;
        for(int i=k;i<n;i++){
            curr+=arr[i]-arr[i-k];
            res=Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];

        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();

        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k=sc.nextInt();

        System.out.println("Maximum Sum of "+k+" consecutive elements is: "+maxSum(arr,size,k));

        sc.close();
    }
}
