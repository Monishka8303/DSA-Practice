import java.util.Scanner;
public class OneOddOccuring {
    static int findOdd(int arr[],int n){
        int result=0;
        for(int i=0;i<n;i++){
            result=result^arr[i];
        }
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
        System.out.println("The Odd Occuring number is: "+findOdd(arr,n));
        sc.close();
    }
}
