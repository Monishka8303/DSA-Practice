import java.util.Scanner; 
public class TowerOfHanoi {
    static long toh(int n,char from,char to,char aux){
        long moves=0l;
        if(n>=1){
            moves+=toh(n-1,from,aux,to);
            System.out.println("Move disc "+n+" from rod "+from+" to rod "+to);
            moves++;
            moves+=toh(n-1,aux,to,from);
        }
        return moves;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of discs: ");
        int n=sc.nextInt();
        System.out.println("Solution: ");
        System.out.println(toh(n,'A','C','B'));
        sc.close();
    }
}
