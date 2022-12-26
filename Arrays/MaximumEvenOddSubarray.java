import java.util.Scanner;
public class MaximumEvenOddSubarray {
    static int maxEvenOdd(int[] arr,int n){
        int res=1,curr=1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                curr++;
                res=Math.max(res,curr);
            }
            else{
                curr=1;
            }
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

        System.out.println("Maximum length of an Even-Odd Subarray is: "+maxEvenOdd(arr,size));

        sc.close();
    }
}
