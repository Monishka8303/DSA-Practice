import java.util.Scanner;
public class primeFactors {
    static void getPrimeFactors(int n){     //efficient
        if (n<=1){
            return;
        }
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+"\t");
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Prime Factors: ");
        getPrimeFactors(n);
        sc.close();
    }
}
