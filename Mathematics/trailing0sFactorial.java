import java.util.Scanner;
public class trailing0sFactorial {
    static int trailing0s(int x){
        int temp=0;
        for(int i=5;i<=x;i=i*5){
            temp+=x/i;
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("No. of trailing zeroes in "+n+"! : "+trailing0s(n));
        sc.close();
    }
}
