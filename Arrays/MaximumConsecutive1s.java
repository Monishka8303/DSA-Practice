import java.util.Scanner;
public class MaximumConsecutive1s {
    static int maxConsecutiveOnes(int arr[],int size){
        int res=0,curr=0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                curr=0;
            }
            else{
                curr++;
                res=Math.max(res,curr);
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

        System.out.println("Maximum Consecutive Ones in the array are: "+maxConsecutiveOnes(arr,size));

        sc.close();
    }
}
