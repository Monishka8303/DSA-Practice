import java.util.Scanner;
public class Search {
    static int getElement(int arr[],int size,int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
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
        
        System.out.println((getElement(arr,size,element)==-1)?("Element not found!"):("Element found at index: "+getElement(arr,size,element)));
        sc.close();
    }
}
