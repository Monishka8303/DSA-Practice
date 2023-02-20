import java.util.Scanner;
public class IsRotated {
    static boolean isRotated(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        return ((s1+s1).indexOf(s2)>=0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1=sc.nextLine();
        System.out.print("Enter second string: ");
        String s2=sc.nextLine();
        System.out.print((isRotated(s1,s2))?"2nd string is rotated":"2nd string is not rotated");
        sc.close();
    }
}
