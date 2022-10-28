import java.util.Scanner;
import java.lang.Math;
public class PowerSet {
    static void powerSet(String str){
        int n=str.length();
        int setSize=(int)(Math.pow(2,n));
        for(int count=0;count<setSize;count++){
            System.out.print("\"");
            for(int i=0;i<n;i++){
                if((count & (1<<i))!=0){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.print("\"\t");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
        System.out.println("Power Set of the given String is: ");
        powerSet(s);
        sc.close();
    }
}
