import java.util.Scanner;
public class AnagramSearch {
    static boolean areSame(int CT[],int CP[]){
        for(int i=0;i<CT.length;i++){
            if(CT[i]!=CP[i]){
                return false;
            }
        }
        return true;
    }
    static boolean searchAnagram(String txt,String pat){
        int CT[]=new int[256];
        int CP[]=new int[256];
        for(int i=0;i<pat.length();i++){
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        for(int i=pat.length();i<txt.length();i++){
            if(areSame(CT,CP)){
                return true;
            }
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text: ");
        String txt=sc.nextLine();
        System.out.print("Enter the pattern: ");
        String pat=sc.nextLine();
        System.out.println((searchAnagram(txt,pat))?"Anagram of pattern present!":"Anagram of pattern not present!");
        sc.close();
    }
}
