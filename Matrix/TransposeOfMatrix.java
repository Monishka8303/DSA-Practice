import java.util.Scanner;
public class TransposeOfMatrix {
    static void swap(int arr[][],int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    static void transpose(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                swap(arr,i,j);
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
        transpose(arr);
        System.out.println("Transpose of matrix: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
