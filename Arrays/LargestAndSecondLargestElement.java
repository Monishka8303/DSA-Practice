import java.util.Scanner;
import java.util.ArrayList;
public class LargestAndSecondLargestElement {
    static ArrayList<Integer> func(int arr[],int n){
        int res=-1,large=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[large]){
                res=large;
                large=i;
            }
            else if(arr[i]<arr[large]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(arr[large]);
        l.add((res==-1)?-1:arr[res]);
        return l;
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
        System.out.println("Largest and second largest elements in the array are: "+func(arr,size));

        sc.close();
    }
}
