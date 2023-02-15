import java.util.Scanner;
public class SubstringOrNot {
    static boolean isSubstring(String s1,String s2){
        int j=0;
        for(int i=0;i<s1.length() && j<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return j==s2.length();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1=sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String str2=sc.nextLine();
        System.out.println((isSubstring(str1,str2))?"Substring!":"Not a substring!");
        sc.close();
    }
}
