import java.util.*;
public class MeetingMaximumGuests {
    static int maxGuest(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,curr=1,res=1;
        while(i<n && j<n){
            if(arr[i]<dep[j]){
                curr++;
                i++;
            }
            else{
                curr--;
                j++;
            }
            res=Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
        int arr[]={900,600,700};
        int dep[]={1000,800,730};

        System.out.println("Maximum Guests: "+maxGuest(arr,dep,arr.length));
		
		sc.close();
    }
}
