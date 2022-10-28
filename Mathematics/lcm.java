import java.util.Scanner;
public class lcm {
    static int gcdf(int m,int n){
        if(n==0){
            return m;
        }
        return gcdf(n,m%n);
    }

    public static int lcmf(int m,int n){
        return (m*n)/gcdf(m,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("The LCM of two numbers: "+lcmf(m,n));
        sc.close();
    }
}
