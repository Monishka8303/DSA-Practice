import java.util.Scanner;
public class MaximumCircularSumSubarray {
    static int normalMaxSum(int arr[],int n){
        int res=arr[0],maxEnding=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(maxEnding,res);
        }
        return res;
    }

    static int circularMaxSum(int arr[],int n){
        int normal_max=normalMaxSum(arr,n);
        if(normal_max<0){
            return normal_max;
        }
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum+=arr[i];
            arr[i]=-arr[i];         //Inverting elements
        }
        int circular_max=arr_sum+normalMaxSum(arr,n);      //after inverting the elements, the maximum sum of new array will be
        return Math.max(normal_max,circular_max);          //the minimum sum of the original array
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

        System.out.println("Maximum Circular Sum Subarray is: "+circularMaxSum(arr,size));

        sc.close();
    }
}
