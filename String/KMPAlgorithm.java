import java.util.Scanner;
public class KMPAlgorithm {
    static int[] fillLPS(String txt){
        int lps[]=new int[txt.length()];
        int len=0,i=1;
        lps[0]=0;
        while(i<txt.length()){
            if(txt.charAt(i)==txt.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    len=lps[len-1];
                }
            }
        }
        return lps;
    }
    static void KMPAlgo(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        int lps[]=fillLPS(pat);
        int i=0,j=0;
        while(i<n){
            if(pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                System.out.print((i-m)+" ");
                j=lps[j-1];
            }
            else if(i<n && pat.charAt(j)!=txt.charAt(i)){
                if(j==0){
                    i++;
                }
                else{
                    j=lps[j-1];
                }
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
        KMPAlgo(txt,pat);
        sc.close();
    }
}
