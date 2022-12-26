import java.util.Scanner;
public class LeftRotateByD_1 {
    static void lRotateOne(int arr[],int size){
        int temp=arr[0];
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
        }
        arr[size-1]=temp;
    }
    static void lRotateD1(int arr[],int size,int d){
        for(int i=0;i<d;i++){
            lRotateOne(arr,size);
        }
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

        System.out.print("Enter no.of places to rotate by: ");
        int d=sc.nextInt();

        System.out.print("Array before: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println();

        lRotateD1(arr,size,d);

        System.out.print("Array after: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");;
        }

        sc.close();
    }
}
