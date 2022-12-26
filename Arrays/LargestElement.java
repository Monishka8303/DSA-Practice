import java.util.Scanner;
public class LargestElement {
    static int largest(int arr[],int size){
        int large=0;
        for(int i=0;i<size;i++){
            if(arr[i]>arr[large]){
                large=i;
            }
        }
        return large;
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
        System.out.println("Largest element in the array is: "+arr[largest(arr,size)]);
        sc.close();
    }
}
