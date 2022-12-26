import java.util.Scanner;
public class EquilibriumPoint{
    static boolean ePoint(int arr[],int n){
        int rs=0,ls=0;
        for(int i=0;i<n;i++){
            rs+=arr[i];
        }
        for(int i=0;i<n;i++){
            rs-=arr[i];
            if(ls==rs){
                return true;
            }
            ls+=arr[i];
        }
        return false;
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

        System.out.println((ePoint(arr,size))?"True":"False");

        sc.close();
    }
}