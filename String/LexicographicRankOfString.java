import java.util.Scanner;
public class LexicographicRankOfString {
    static int fact(int n){
        int prod=1;
        for(int i=2;i<=n;i++){
            prod*=i;
        }
        return prod;
    }
    static int lexRank(String str){
        int res=1;
        int mul=fact(str.length());
        int count[]=new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=1;i<256;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<str.length()-1;i++){
            mul=mul/(str.length()-i);
            res+=count[str.charAt(i)-1]*mul;
            for(int j=str.charAt(i);j<256;j++){
                count[j]--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Lexicographic Rank of the String: "+lexRank(str));
        sc.close();
    }
}
