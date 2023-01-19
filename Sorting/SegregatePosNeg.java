import java.util.Scanner; 
public class SegregatePosNeg {
    static void segPosNeg(int arr[],int n){
        int i=-1,j=n;
		while(true){
			do{
				i++;
			}while(arr[i]<0);
			do{
				j--;
			}while(arr[j]>0);
			if(i>=j){
				return;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
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
		segPosNeg(arr, n);
        System.out.print("Final Array: ");
        for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

        sc.close();
    }
}
