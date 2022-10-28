import java.util.Scanner;
public class TwoOddOccuring {
    static void findOdd(int arr[],int n){
        int xor=0,res1=0,res2=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        int sn=xor & (~(xor-1));
        for(int i=0;i<n;i++){
            if((arr[i] & sn)!=0){
                res1=res1^arr[i];
            }
            else{
                res2=res2^arr[i];
            }
        }
        System.out.println(res1+" "+res2);
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
        System.out.print("The 2 Odd Occuring numbers are: ");
        findOdd(arr,n);
        sc.close();
    }
}
