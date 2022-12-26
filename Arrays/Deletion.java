import java.util.Scanner;
public class Deletion {
    static int delete(int arr[],int n,int x){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x){
                break;
            }
        }
        if(i==n){
            return n;
        }
        for(int j=i;j<n;j++){
            arr[j]=arr[j+1];
        }
        return (n-1);
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

        System.out.print("Enter the element: ");
        int element=sc.nextInt();
        
        System.out.print("Array before: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println();

        int new_size=delete(arr,size,element);

        System.out.print("Array after: ");
        for(int i=0;i<new_size;i++){
            System.out.print(arr[i]+" ");;
        }

        sc.close();
    }
}
