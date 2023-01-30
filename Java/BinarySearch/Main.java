import java.util.*;

public class Main {

    public static void binarySearch(int[] arr, int k) {
        int lo = 0;
        int hi = arr.length - 1;

       while(lo<=hi){
            int mid = (hi + lo)+1 / 2;

            if (arr[mid] == k) {
               System.out.println(mid);
               break;
            }

            else if (arr[mid] < k) {
                lo = mid + 1;
            }

            else {
                hi = mid - 1;
            }

        }

     if(lo>hi){
     System.out.println("Not found");
     }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[]arr  = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        } 
        int k = scn.nextInt();
        

        binarySearch(arr, k);
    
  
    }
}
