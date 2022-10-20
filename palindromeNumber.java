import java.util.Scanner;
public class palindromeNumber {
    static boolean palindrome(int n){
        int m=n;
        int rev=0;
        while(m>0){
            int rem=0;
            rem=m%10;
            rev=rev*10+rem;
            m=m/10;
        }
        return(rev==n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        System.out.println((palindrome(x))?"Palindrome.":"Not a Palindrome.");
        sc.close();
    }
}
