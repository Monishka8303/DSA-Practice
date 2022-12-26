import java.util.Scanner;
public class Insertion {
    static int insert(int arr[],int n,int element,int index){
        for(int i=n-2;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        return (n+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];

        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size-1;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the element to be inserted: ");
        int element=sc.nextInt();

        System.out.print("Enter the index: ");
        int index=sc.nextInt();
        
        System.out.print("Array before: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println();

        int new_size=insert(arr,size,element,index);

        System.out.print("Array after: ");
        for(int i=0;i<new_size;i++){
            System.out.print(arr[i]+" ");;
        }

        sc.close();
    }
}
