import java.util.Scanner;
public class euclideanGCD {
    static int gcdfunc1(int m,int n){    //basic
        while(m!=n){
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        return m;
    }

    public static int gcdfunc2(int m,int n){     //more optimised
        if(n==0){
            return m;
        }
        else{
            return gcdfunc2(n,m%n);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("The GCD of two numbers: "+gcdfunc2(m,n));
        sc.close();
    }
}
// if(n==0){
//     return m;
// }
// else{
//     return gcdfunc2(n,m%n);
// }