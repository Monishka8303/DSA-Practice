import java.util.Scanner;
public class SearchRowColumnSOrtedMatrix {
    static int search(int arr[][],int target){
        int i=0,j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==target){
                System.out.println("Value present at: "+i+" row and "+j+" column.");
                return 0;
            }
            else if(arr[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return -1;
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

		System.out.print("Enter the value to be searched: ");
        int x=sc.nextInt();

        if((search(arr,x)==-1)){
            System.out.println("Value not present!!!");
        }
		
		sc.close();
    }
}