import java.util.*;

public class Main {

    public static int binarySearch(int[] arr, int k) {
        int lo = 0;
        int hi = arr.length - 1;

       while(lo<=hi){
            int mid = (hi + lo) / 2;

            if (arr[mid] == k) {
               return mid;
            }

            else if (arr[mid] < k) {
                lo = mid + 1;
            }

            else {
                hi = mid - 1;
            }

        }

     System.out.println("Not found");
     return -1;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int k = scn.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = scn.nextInt();
        // }


        int []arr = {10,20,30,40,50,60};
        int k = 60;
        

      int ans  =   binarySearch(arr, k);
      if(ans != -1){
        System.out.println("Idx-> " + ans);
       }
  
    }
}
