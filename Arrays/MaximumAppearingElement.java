import java.util.Scanner;
public class MaximumAppearingElement {
    static int maxAppear(int left[],int right[],int n){
        int freq[]=new int[101];
        for(int i=0;i<n;i++){
            freq[left[i]]++;
            freq[right[i]+1]--;
        }
        int res=0;
        for(int i=1;i<100;i++){
            freq[i]+=freq[i-1];
            if(freq[i]>freq[res]){
                res=i;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int left[]=new int[100];
        int right[]=new int[100];

        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.print("Enter the elements of the left array: ");
        for(int i=0;i<size;i++){
            left[i]=sc.nextInt();
        }

        System.out.print("Enter the elements of the right array: ");
        for(int i=0;i<size;i++){
            right[i]=sc.nextInt();
        }

        System.out.println("Maximum Appearing Element: "+maxAppear(left,right,size));

        sc.close();
    }
}
