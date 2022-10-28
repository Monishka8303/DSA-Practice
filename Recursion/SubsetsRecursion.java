import java.util.Scanner;
public class SubsetsRecursion {
    static void subsets(String str,String curr,int index){
        if(index==str.length()){
            System.out.print("\""+curr+"\" \t");
            return;
        }
        subsets(str,curr,index+1);
        subsets(str,curr+str.charAt(index), index+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        System.out.print("Subsets are: ");
        subsets(s,"",0);
        sc.close();
    }
}
