import java.util.Scanner;
public class LeftRotateByD_3 {
    static void lRotateD3(int arr[],int size,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,size-1);
        reverse(arr,0,size-1);
    }
    static void reverse(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
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

        lRotateD3(arr,size,d);

        System.out.print("Array after: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");;
        }

        sc.close();
    }
}
