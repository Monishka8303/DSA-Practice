import java.util.*;
public class GivenSumUnsortedArray {
    static boolean isPair(int arr[],int sum){
        HashSet<Integer> s=new HashSet<>();
        for(int i:arr){
            if(s.contains(sum-i)){
                return true;
            }
            s.add(i);
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
        System.out.print("Enter required sum: ");
        int sum=sc.nextInt();
        System.out.println((isPair(arr,sum))?"Pair exists!":"Pair doesn't exists!");
        sc.close();
    }
}