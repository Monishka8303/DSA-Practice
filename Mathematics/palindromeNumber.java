import java.util.Scanner;
public class palindromeNumber {
    static boolean palindrome(int n){
        int m=n;
        int reverse=0;
        while(m>0){
            int rem=m%10;
            reverse=reverse*10+rem;
            m=m/10;
        }
        return (reverse==n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        System.out.println((palindrome(x))?"Palindrome.":"Not a Palindrome.");
        sc.close();
    }
}
