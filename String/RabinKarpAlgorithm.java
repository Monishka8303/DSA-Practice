import java.util.Scanner;
public class RabinKarpAlgorithm {
    static final int d=256;
    static final int q=101;
    static void RKAlgo(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        int h=1;
        for(int i=1;i<m;i++){
            h=(h*d)%q;
        }
        int p=0,t=0;
        for(int i=0;i<m;i++){
            p=((p*d)+pat.charAt(i))%q;
            t=((t*d)+txt.charAt(i))%q;
        }
        for(int i=0;i<=n-m;i++){
            if(p==t){
                boolean flag=true;
                for(int j=0;j<m;j++){
                    if(pat.charAt(j)!=txt.charAt(i+j)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(i+" ");
                }
            }
            if(i<n-m){
                t=((d*(t-txt.charAt(i)*h))+txt.charAt(i+m))%q;
                if(t<0){
                    t=t+q;
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
        RKAlgo(txt,pat);
        sc.close();
    }
}
