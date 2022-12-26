import java.util.Scanner;
public class MaximumSumSubarray{
    static int maxSum(int arr[],int n){
        int res=arr[0],maxEnding=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
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

        System.out.println("Maximum Sum of any subarray in the array is: "+maxSum(arr,size));

        sc.close();
    }
}