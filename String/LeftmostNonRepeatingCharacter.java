import java.util.*;
public class LeftmostNonRepeatingCharacter {
    static int leftmost(String str){
        int freq[]=new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
    static int leftMost(String str){
        int freq[]=new int[256];
        Arrays.fill(freq,-1);
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==-1){
                freq[str.charAt(i)]=i;
            }
            else{
                freq[str.charAt(i)]=-2;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<256;i++){
            if(freq[i]>=0){
                res=Math.min(res,freq[i]);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Leftmost Non Repeating Character index: " + leftMost(str));
        sc.close();
    }
}