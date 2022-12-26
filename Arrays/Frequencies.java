import java.util.Scanner;
public class Frequencies {
    static void printFreq(int arr[],int n){
        int freq=1,i=1;
        while(i<n){
            while(i<n && (arr[i]==arr[i-1])){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
        if(n==1 || (arr[n-1]!=arr[n-2])){
            System.out.println(arr[n-1]+" "+freq);
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

        System.out.println("Frequencies of elements in the array: ");
        printFreq(arr,size);

        sc.close();
    }
}
