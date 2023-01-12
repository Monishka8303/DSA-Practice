import java.util.*;
public class UnionOf2SortedArrays {
    static ArrayList<Integer> union(int a[],int m,int b[],int n){
        int i=0,j=0;
        ArrayList<Integer> l=new ArrayList<Integer>();
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                l.add(a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                l.add(b[j]);
                j++;
            }
            else{
                l.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<m){
            if(i>0 && a[i]!=a[i-1]){
                l.add(a[i]);
                i++;
            }
        }
        while(j<n){
            if(j>0 && b[j]!=b[j-1]){
                l.add(b[j]);
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
        ArrayList<Integer> l=union(arr1,m,arr2,n);
        System.out.print("Union: ");
        for(Integer i:l){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
