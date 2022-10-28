import java.util.Scanner;
public class divisors {
    static void getDivisors(int n){          //prints divisors but not in a sorted order
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
                if(i!=n/i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }

    static void printDivisors(int n){       //prints divisors in a sorted order
        int i;
        for(i=1;i*i<n;i++){                        //for divisors from 1 to sqrt(n)[exclusive]
            if(n%i==0){
                System.out.print(i+"\t");          
            }
        }
        for(;i>=1;i--){                            //for divisors from sqrt(n) to n
            if(n%i==0){
                System.out.print((n/i)+"\t");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Divisors: ");
        printDivisors(n);
        sc.close();
    }
}
