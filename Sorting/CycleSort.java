import java.util.Scanner;
public class CycleSort {
    static void swap(int arr[],int item,int pos){
        
    }
    static void cycleSort(int arr[],int n){
        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i]<item){
                    pos++;
                }
            }
            int temp=arr[pos];
            arr[pos]=item;
            item=temp;
            while(pos!=cs){
                pos=cs;
                for(int i=cs+1;i<n;i++){
                    if(arr[i]<item){
                        pos++;
                    }
                }
                temp=arr[pos];
                arr[pos]=item;
                item=temp;
            }
        }
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

        cycleSort(arr,n);
        //printing the array
		System.out.print("Final array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
    }
}
