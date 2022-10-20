import java.util.*;
public class SetBit {
    static boolean setBitL(int n,int k){
        // if((n & (1<<(k-1))) != 0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return ((n & (1<<(k-1))) != 0)?true:false;
    }
    static boolean setBitR(int n,int k){
        // if(((n>>(k-1)) & 1) == 1){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return (((n>>(k-1)) & 1) == 1)?true:false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n and k: ");
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println((setBitR(n,k))?"Yes.":"No.");
        sc.close();
    }
}
