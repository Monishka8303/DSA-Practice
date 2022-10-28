import java.util.*;
public class SetBitsLookupTable {
    static int[] table=new int[256];

    static void initialize(){
        table[0]=0;
        for(int i=0;i<256;i++){
            table[i]=(i&1)+table[i/2];
        }
    }

    static int setbit(int n){
        return table[n & 0xff]+table[(n>>8) & 0xff]+table[(n>>16) & 0xff]+table[n>>24];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        initialize();
        System.out.println("No. of set bits: "+setbit(n));
        sc.close();
    }
}
