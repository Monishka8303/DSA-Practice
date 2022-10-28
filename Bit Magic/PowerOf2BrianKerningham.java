import java.util.Scanner;
public class PowerOf2BrianKerningham {
    static boolean isPow2(int n){
        return((n!=0) && ((n&(n-1))==0));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println((isPow2(n))?"Yes.":"No.");
        sc.close();
    }
}
