import java.util.*;
public class LongestSubstringWithDistinctCharacters {
    static int longestDistinct(String str){
        int res=0;
        int prev[]=new int[256];
        Arrays.fill(prev,-1);
        int i=0;
        for(int j=0;j<str.length();j++){
            i=Math.max(i,prev[str.charAt(j)]+1);
            int maxEnd=j-i+1;
            res=Math.max(res,maxEnd);
            prev[str.charAt(j)]=j;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.println("Longest substring with distinct characters: "+longestDistinct(str));
        sc.close();
    }
}
