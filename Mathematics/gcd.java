import java.util.Scanner;
public class gcd {
    static int gcdfunc(int m,int n){
        int temp=(m>n)?n:m;
        while(temp>0){
            if(m%temp==0 && n%temp==0){
                break;
            }
            temp--;
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("The GCD of two numbers: "+gcdfunc(m,n));
        sc.close();
    }
}