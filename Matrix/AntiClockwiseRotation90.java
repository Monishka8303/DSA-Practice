import java.util.Scanner;
public class AntiClockwiseRotation90 {
    static void swap(int arr[][],int i,int j,int a,int b){
        int temp=arr[i][j];
        arr[i][j]=arr[a][b];
        arr[a][b]=temp;
    }
    static void rotate(int arr[][]){
        for(int i=0;i<arr.length;i++){            //transpose
            for(int j=i+1;j<arr.length;j++){
                swap(arr,i,j,j,i);
            }
        }
        for(int i=0;i<arr.length;i++){           //reverse columns
            int lo=0,hi=arr.length-1;
            while(lo<hi){
                swap(arr,hi,i,lo,i);
                lo++;
                hi--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter elements of the matrix: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        rotate(arr);
        System.out.println("After anti clockwise rotation by 90 degrees, matrix: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
