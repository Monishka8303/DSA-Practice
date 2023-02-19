import java.util.Scanner;
public class ConstructingLPSArray {
    static int[] fillLPS(String txt){
        int lps[]=new int[txt.length()];
        int len=0;
        lps[0]=0;
        int i=1;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt=sc.nextLine();
        int lps[]=fillLPS(txt);
        for(int i:lps){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
