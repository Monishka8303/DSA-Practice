import java.util.*;
public class FrequencyOfArrayElements {
    static void countFreq(int arr[]){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Frequency: ");
        countFreq(arr);
        sc.close();
    }
}
