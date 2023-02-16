import java.util.Scanner;
public class ReverseWordsInString {
    static void reverse(char str[],int low,int high){
        while(low<=high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;
            high--;
        }
    }
    static void reverseWords(char s[]){
        int start=0;
        for(int end=0;end<s.length;end++){
            if(s[end]==' '){
                reverse(s,start,end-1);
                start=end+1;
            }
        }
        reverse(s,start,s.length-1);
        reverse(s,0,s.length-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        char str[]=s.toCharArray();
        reverseWords(str);
        System.out.println(str);
        sc.close();
    }
}
