import java.util.Scanner;
public class ReverseAnArray {
    static void reverse(int arr[],int size){
        int s=0,e=size-1;
        while(s<e){
            int temp;
            temp=arr[s];
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
        System.out.print("Array before: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println();

        reverse(arr,size);

        System.out.print("Array after: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");;
        }

        sc.close();
    }
}
