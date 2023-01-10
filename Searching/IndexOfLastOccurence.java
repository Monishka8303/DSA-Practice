import java.util.Scanner;
public class IndexOfLastOccurence {
    static int recLastOcc(int arr[],int l,int h,int x,int n){
        if(l>h){
            return -1;
        }
        int mid=l+(h-l)/2;
        if(arr[mid]>x){
            return recLastOcc(arr,l,mid-1,x,n);
        }
        else if(arr[mid]<x){
            return recLastOcc(arr,mid-1,h,x,n);
        }
        else{
            if(mid==h || arr[mid]!=arr[mid+1]){
                return mid;
            }
            else{
                return recLastOcc(arr,mid+1,h,x,n);
            }
        }
    }

    static int lastOcc(int arr[],int n,int x){
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>x){
                e=mid-1;
            }
            else if(arr[mid]<x){
                s=mid+1;
            }
            else{
                if(mid==n-1||arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return -1;
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

		System.out.print("Enter the value to be searched: ");
        int x=sc.nextInt();

        System.out.println((recLastOcc(arr,0,n-1,x,n)==-1)?("Value not present!!!"):("Value present at: "+recLastOcc(arr,0,n-1,x,n)));
        System.out.println((lastOcc(arr,n,x)==-1)?("Value not present!!!"):("Value present at: "+lastOcc(arr,n,x)));

		sc.close();
    }
}
