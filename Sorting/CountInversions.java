import java.util.Scanner;
public class CountInversions{
    static int countAndMerge(int arr[],int l,int m,int h){
        int n1=m-l+1,n2=h-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
                res+=n1-i;
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
        return res;
    }
    static int countInv(int arr[],int l,int h){
        int res=0;
        if(l<h){
            int m=l+(h-l)/2;
            res+=countInv(arr,l,m);
            res+=countInv(arr,m+1,h);
            res+=countAndMerge(arr,l,m,h);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int[] arr=new int[100];
		
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		
		System.out.print("Enter the elements of the array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

        System.out.println("Inversions: "+countInv(arr,0,n-1));
		
		sc.close();
    }
}