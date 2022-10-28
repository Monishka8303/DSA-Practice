import java.util.*;
public class SieveOfEratosthenes {
    static void sieve1(int n){
        if(n<=1){
            return;
        }
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);

        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+"\t");
            }
        }
    }

    static void sieve2(int n){
        if(n<=1){
            return;
        }
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+"\t");
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Prime numbers till "+n+" : ");
        sieve2(n);
        sc.close();
    }
}
