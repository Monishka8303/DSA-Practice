import java.util.Scanner;
public class countDigits {
    static int digits(int x){
        int count=0;
        while(x>0){
            x/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("The number of digits: "+digits(n));
        sc.close();
    }
}
