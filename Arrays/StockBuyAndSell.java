import java.util.Scanner;
public class StockBuyAndSell {
    static int maxProfit(int arr[], int n){
        int profit=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];

        System.out.print("Enter the no. of days: ");
        int size=sc.nextInt();

        System.out.print("Enter the prices of stock: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Maximum Profit earned: "+maxProfit(arr,size));

        sc.close();
    }
}
