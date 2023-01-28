import java.util.Scanner;
public class BoundaryTraversal {
    static void boundary(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        if(r==1){
            for(int i=0;i<c;i++){
                System.out.print(arr[0][i]+" ");
            }
        }
        else if(c==1){
            for(int i=0;i<r;i++){
                System.out.print(arr[i][0]+" ");
            }
        }
        else{
            for(int i=0;i<c;i++){
                System.out.print(arr[0][i]+" ");
            }
            for(int i=1;i<r;i++){
                System.out.print(arr[i][c-1]+" ");
            }
            for(int i=c-2;i>=0;i--){
                System.out.print(arr[r-1][i]+" ");
            }
            for(int i=r-2;i>=1;i--){
                System.out.print(arr[i][0]+" ");
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
        System.out.println("Printing boundary traversal...");
        boundary(arr);
        sc.close();
    }
}
