import java.util.*;
public class IntersectionOfTwoArrays {
    static int intersection(int a[],int b[]){
        HashSet<Integer> s=new HashSet<>();
        for(int i:a){
            s.add(i);
        }
        int res=0;
        for(int j:b){
            if(s.contains(j)){
                res++;
                s.remove(j);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the arrays: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        System.out.print("Enter the elements of Array 1: ");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the elements of Array 2: ");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("No. of distinct elements in the intersection of both the arrays: "+intersection(arr1,arr2));
        sc.close();
    }
}
