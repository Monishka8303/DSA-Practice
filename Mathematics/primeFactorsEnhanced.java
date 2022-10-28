import java.util.Scanner;
public class primeFactorsEnhanced {
    static void effPrimeFactors(int n){
        if(n<=1){
            return;
        }
        while(n%2==0){
            System.out.print("2 ");
            n=n/2;
        }
        while(n%3==0){
            System.out.print("3 ");
            n=n/3;
        }
        for(int i=5;i*i<=n;i+=6){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.print((i+2)+" ");
                n=n/(i+2);
            }
        }
        if(n>3){
            System.out.print(n);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Prime Factors: ");
        effPrimeFactors(n);
        sc.close();
    }
}
