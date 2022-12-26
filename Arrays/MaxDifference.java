import java.util.Scanner;
public class MaxDifference {
    static int maxDiff(int arr[],int size){
        int res=arr[1]-arr[0];
        int minVal=arr[0];
        for(int i=1;i<size;i++){
            res=Math.max(res,arr[i]-minVal);
            minVal=Math.min(minVal,arr[i]);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];

        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Maximum Difference of 2 elements in the array: "+maxDiff(arr,size));

        sc.close();
    }
}
