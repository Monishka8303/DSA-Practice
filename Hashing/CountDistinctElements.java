import java.util.*;
public class CountDistinctElements {
    static int countDistinct(int arr[]){
        HashSet<Integer> h=new HashSet<>();
        for(int i:arr){
            h.add(i);
        }
        return h.size();
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
        System.out.println("No. of distinct elements: "+countDistinct(arr));
        sc.close();
    }
}
