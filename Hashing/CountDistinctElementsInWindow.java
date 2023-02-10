import java.util.*;
public class CountDistinctElementsInWindow {
    static void countDistinct(int arr[],int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<k;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        System.out.print(h.size()+" ");
        for(int i=k;i<arr.length;i++){
            h.put(arr[i-k],h.get(arr[i-k])-1);
            if(h.get(arr[i-k])==0){
                h.remove(arr[i-k]);
            }
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
            System.out.print(h.size()+" ");
        }
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
        System.out.print("Enter window size: ");
        int k=sc.nextInt();
        System.out.println("No. of distinct elements in each window: ");
        countDistinct(arr,k);
        sc.close();
    }
}
