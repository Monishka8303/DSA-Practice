import java.util.Scanner;
public class RemoveDuplicates {
    static int remDuplicates(int arr[],int size){
        int res=1;
        for(int i=1;i<size;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
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
        System.out.print("Array before: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println();

        int x=remDuplicates(arr,size);

        System.out.print("Array after: ");
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");;
        }

        sc.close();
    }
}
