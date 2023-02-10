import java.util.*;
public class LongestConsecutiveSubsequence {
    static int longestSub(int arr[]){
        HashSet<Integer> h=new HashSet<>();
        for(int i:arr){
            h.add(i);
        }
        int res=0;
        for(Integer i:h){
            if(h.contains(i-1)==false){
                int curr=1;
                while(h.contains(i+curr)){
                    curr++;
                }
                res=Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Longest Consecutive Subsequence: "+longestSub(arr));
        sc.close();
    }
}
