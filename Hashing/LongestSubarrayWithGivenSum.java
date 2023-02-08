import java.util.*;

public class LongestSubarrayWithGivenSum {
    static int subarray(int arr[], int sum) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int preSum = 0,res=0;
        for (int i=0;i<arr.length;i++) {
            preSum += arr[i];
            if(preSum==sum){
                res=i+1;
            }
            if (h.containsKey(preSum)==false) {
                h.put(preSum,i);
            }
            if (h.containsKey(preSum-sum)) {
                res=Math.max(res,i-h.get(preSum-sum));
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
        System.out.print("Enter required sum: ");
        int sum = sc.nextInt();
        System.out.println("Length of the longest subarray: "+subarray(arr,sum));
        sc.close();
    }
}
