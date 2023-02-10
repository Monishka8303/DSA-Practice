import java.util.*;
public class LongestCommonSum {
    static int longestCommonSum(int arr1[],int arr2[]){
        int temp[]=new int[arr1.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr1[i]-arr2[i];
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0,res=0;
        for(int i=0;i<temp.length;i++){
            sum+=temp[i];
            if(sum==0){
                res=i+1;
            }
            if(h.containsKey(sum)){
                res=Math.max(res,i-h.get(sum));
            }
            else{
                h.put(sum,i);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the arrays: ");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.print("Enter the elements of Array 1: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the elements of Array 2: ");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Longest Common Span with the same sum: "+longestCommonSum(arr1,arr2));
        sc.close();
    }
}
