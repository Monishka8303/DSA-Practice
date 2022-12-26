import java.util.Scanner;
public class Leaders {
    static void leaders(int arr[],int size){
        int curr_leader=arr[size-1];
        System.out.print(curr_leader+" ");
        for(int i=size-2;i>=0;i--){
            if(curr_leader<arr[i]){
                curr_leader=arr[i];
                System.out.print(curr_leader+" ");
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

        System.out.print("Leaders in the array: ");
        leaders(arr,size);
        sc.close();
    }
}
