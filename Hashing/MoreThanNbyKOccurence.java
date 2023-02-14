import java.util.*;
public class MoreThanNbyKOccurence {                             //Efficient solution
    static void printNbyK(int arr[],int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:arr){
            h.put(i,h.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()>arr.length/k){
                System.out.print(e.getKey()+" ");
            }
        }
    }
    static void NbyK(int arr[],int k){                           // O(nk) solution for when n is large and k is small
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else if(h.size()<k-1){
                h.put(arr[i],1);
            }
            else{
                for(Map.Entry<Integer,Integer> e:h.entrySet()){
                    h.put(e.getKey(),e.getValue()-1);
                    if(e.getValue()==0){
                        h.remove(e.getKey());
                    }
                }
            }
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            int count=0;
            for(int i:arr){
                if(e.getKey()==i){
                    count++;
                }
            }
            if(count>arr.length/k){
                System.out.print(e.getKey()+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k=sc.nextInt();
        NbyK(arr,k);
        sc.close();
    }
}
