import java.util.Scanner;
public class SquareRoot {
    static int squareRoot(int x){
        int low=1,high=x,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int mSq=mid*mid;
            if(mSq==x){
                return mid;
            }
            else if(mSq>x){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value: ");
        int x=sc.nextInt();

        System.out.println("Square Root of "+x+": "+squareRoot(x));

		sc.close();
    }
}
