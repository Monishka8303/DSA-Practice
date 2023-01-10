import java.util.Scanner;
public class MedianOf2SortedArray {
    static double getMedian(int a1[],int n1,int a2[],int n2){
        int a=0,b=n1-1;
        while(a<=b){
            int i1=a+(b-a)/2;
            int i2=((n1+n2+1)/2)-i1;
            int max1=(i1==0)?Integer.MIN_VALUE:a1[i1-1];
            int max2=(i2==0)?Integer.MIN_VALUE:a2[i2-1];
            int min1=(i1==n1)?Integer.MAX_VALUE:a1[i1];
            int min2=(i2==n2)?Integer.MAX_VALUE:a2[i2];
            if(max1<=min2 && max2<=min1){
                if((n1+n2)%2==0){
                    return (double)(Math.max(max1,max2)+Math.min(min1,min2))/2;
                }
                else{
                    return (double)(Math.max(max1,max2));
                }
            }
            else if(max1>min2){
                b=i1-1;
            }
            else{
                a=i1+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int[] a1=new int[100];
        int[] a2=new int[100];
		
		System.out.print("Enter the sizes of the array: ");
		int n1=sc.nextInt();
        int n2=sc.nextInt();
		
		System.out.println("Enter the elements of the array: ");
        System.out.print("1st array: ");
		for(int i=0;i<n1;i++){
			a1[i]=sc.nextInt();
		}
        System.out.print("2nd array: ");
		for(int i=0;i<n2;i++){
			a2[i]=sc.nextInt();
		}

        System.out.println("Median of given arrays: "+((n1<=n2)?getMedian(a1,n1,a2,n2):getMedian(a2,n2,a1,n1)));
		
		sc.close();
    }
}
