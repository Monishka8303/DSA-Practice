import java.util.Scanner;
public class SubaarayWithGivenSum {
    static boolean isSubSum(int arr[],int n,int sum){
        int s=0,curr=0;
        for(int e=0;e<n;e++){
            curr+=arr[e];
            while(sum<curr){
                curr-=arr[s];
                s++;
            }
            if(curr==sum){
                return true;
            }
        }
        return false;
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

        System.out.print("Enter sum: ");
        int sum=sc.nextInt();

        System.out.println((isSubSum(arr,size,sum))?"Yes.":"No.");

        sc.close();
    }
}
