import java.util.Scanner;
public class MajorityElement {
    static int findMajority(int arr[],int n){
        int res=0,count=1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }
        if(count<=n/2){
            return -1;
        }
        return arr[res];
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

        System.out.println((findMajority(arr,size)!=-1)?("Majority Element is: "+(findMajority(arr,size))):("No Majority Element"));

        sc.close();
    }
}
