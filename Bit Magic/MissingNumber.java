import java.util.Scanner;
public class MissingNumber {
    static int findMissing(int arr[],int n){
        int result=0;
        for(int i=0;i<n;i++){
            result=result^arr[i]^(i+1);
        }
        result=result^(n+1);
        return result;
    }
    public static void main(String[] args){
        int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The missing number is: "+findMissing(arr,n));
        sc.close();
    }
}
