import java.util.Scanner;
public class MinimumxConsecutiveFlips {
    static void printGroups(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0]){
                    System.out.print("From "+i+" to ");
                }
                else{
                    System.out.println(i-1);
                }
            }
        }
        if(arr[n-1]!=arr[0]){
            System.out.println(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];

        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();

        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Flips: ");
        printGroups(arr,size);
        sc.close();
    }
}
