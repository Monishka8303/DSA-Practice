import java.util.Scanner;
public class JosephusProblem {
    int josephus(int n,int k){
        if(n==1){
            return 0;
        }
        return (josephus(n-1,k)+k)%n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of people: ");
        int n=sc.nextInt();
        System.out.print("Enter no. of people to be skipped: ");
        int x=sc.nextInt();
        JosephusProblem jp=new JosephusProblem();
        System.out.println("The last person alive is: "+jp.josephus(n,x));
        sc.close();
    }
}
