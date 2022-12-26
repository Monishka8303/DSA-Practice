import java.util.Scanner;
public class IsSorted {
    static boolean isSorted(int arr[],int size){
        for(int i=1;i<size;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
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

        System.out.println((isSorted(arr,size))?"Yes.":"No");
        sc.close();
    }
}
