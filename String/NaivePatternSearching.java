import java.util.Scanner;
public class NaivePatternSearching {
    static boolean isDistinct(String str){
        int count[]=new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i:count){
            if(i>1){
                return false;
            }
        }
        return true;
    }
    static void patSearch(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<n-m+1;i++){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                System.out.print(i+" ");
            }
        }
    }
    static void patSearchDistinct(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<n-m+1;){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                System.out.print(i+" ");
            }
            if(j==0){
                i++;
            }
            else{
                i=i+j;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text: ");
        String txt=sc.nextLine();
        System.out.print("Enter the pattern to search: ");
        String pat=sc.nextLine();
        System.out.print("Pattern comes at indexes: ");
        if(isDistinct(pat)){
            patSearchDistinct(txt,pat);
        }
        else{
            patSearch(txt,pat);
        }
        sc.close();
    }
}
