import java.util.*;
public class IntersectionOf2SortedArrays
{
    static ArrayList<Integer> intersection(int a[],int m,int b[],int n){
        ArrayList<Integer> l=new ArrayList<>();
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]>b[j]){
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                l.add(a[i]);
                i++;
                j++;
            }
        }
        return l;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[100];
        int arr2[]=new int[100];

        System.out.print("Enter the size of the arrays: ");
        int m=sc.nextInt();
        int n=sc.nextInt();

        System.out.print("Enter the element of Array1: ");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the element of Array2: ");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> l=intersection(arr1,m,arr2,n);
        System.out.println("Intersection: ");
        for(Object i:l){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
