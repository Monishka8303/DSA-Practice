import java.util.*;
public class SubarrayWithZeroSum {
    static boolean isSubarray(int[] arr){
        HashSet<Integer> h=new HashSet<>();
        int preSum=0;
        for(int i:arr){
            preSum+=i;
            if(h.contains(preSum)){
                return true;
            }
            if(preSum==0){
                return true;
            }
            h.add(preSum);
        }
        return false;
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
        System.out.println((isSubarray(arr))?"Subarray exists!":"Subarray doesn't exists!");
        sc.close();
    }
}
