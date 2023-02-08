import java.util.*;
public class LongestSubarraywithEqual0sAnd1s {
    static int subarray(int arr[]) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int preSum = 0,res=0;
        for (int i=0;i<arr.length;i++) {
            preSum +=(arr[i]==0)?-1:1;
            if(preSum==0){
                res=i+1;
            }
            if (h.containsKey(preSum)) {
                res=Math.max(res,i-h.get(preSum));
            }
            else{
                h.put(preSum,i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of the longest subarray: "+subarray(arr));
        sc.close();
    }
}
