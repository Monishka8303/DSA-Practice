import java.util.Scanner;
public class RopeCuttingProblemRecursion {
    static int maxPieces(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int result=Math.max(maxPieces(n-a,a,b,c),Math.max(maxPieces(n-b,a,b,c),maxPieces(n-c,a,b,c)));
        if(result==-1){
            return -1;
        }
        return result+1;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total length of the rope: ");
        int n=sc.nextInt();
        System.out.print("Enter valid rope lengths: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Maximum no. of pieces: "+maxPieces(n,a,b,c));
        sc.close();
    }
}
