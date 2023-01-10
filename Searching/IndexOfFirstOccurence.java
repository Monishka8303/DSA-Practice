import java.util.Scanner;
public class IndexOfFirstOccurence {
    static int recFirstOcc(int arr[],int l,int h,int x){
        if(l>h){
            return -1;
        }
        int mid=l+(h-l)/2;
        if(arr[mid]>x){
            return recFirstOcc(arr,l,mid-1,x);
        }
        else if(arr[mid]<x){
            return recFirstOcc(arr,mid-1,h,x);
        }
        else{
            if(mid==0 || arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                return recFirstOcc(arr,l,mid-1,x);
            }
        }
    }

    static int firstOcc(int arr[],int n,int x){
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
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    e=mid-1;
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

        System.out.println((recFirstOcc(arr,0,n-1,x)==-1)?("Value not present!!!"):("Value present at: "+recFirstOcc(arr,0,n-1,x)));
        System.out.println((firstOcc(arr,n,x)==-1)?("Value not present!!!"):("Value present at: "+firstOcc(arr,n,x)));

		sc.close();
    }
}
