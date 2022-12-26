import java.util.Scanner;
public class MoveZeroes {
    static void moveZero(int arr[],int size){
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
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

        moveZero(arr,size);

        System.out.print("Array after: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");;
        }

        sc.close();
    }
}
