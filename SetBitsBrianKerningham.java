import java.util.Scanner;
public class SetBitsBrianKerningham {
    static int setbit(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("No. of set bits: "+setbit(n));
        sc.close();
    }
}
