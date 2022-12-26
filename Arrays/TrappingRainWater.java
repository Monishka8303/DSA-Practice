import java.util.Scanner;
public class TrappingRainWater {
    static int getWater(int arr[],int n){
        int res=0;
        int lMax[]=new int[n];
        int rMax[]=new int[n];
        lMax[0]=arr[0];
        for(int i=1;i<n;i++){
            lMax[i]=Math.max(arr[i],lMax[i-1]);
        }
        rMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rMax[i]=Math.max(arr[i],rMax[i+1]);
        }
        for(int i=1;i<n-1;i++){
            res+=Math.min(lMax[i],rMax[i])-arr[i];
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];

        System.out.print("Enter the no. of rows: ");
        int size=sc.nextInt();

        System.out.print("Enter the height of bars: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Amount of rainwater trapped: "+getWater(arr,size));

        sc.close();
    }
}
