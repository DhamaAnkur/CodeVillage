public class MergeSort {
    
    public static void conqer(int[]arr , int si , int mid , int ei){
        int [] ans  = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int i = 0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                ans[i++] = arr[idx1++];
            }
            else{
                ans[i++] = arr[idx2++];
            }
        }

        while(idx1 <= mid ){
              ans[i++] = arr[idx1++];
        }

        while(idx2 <= ei ){
              ans[i++] = arr[idx2++];
        }

    }

    public static void divide(int []arr , int si , int ei){
        if(si>=ei){
            return  ;
        }

        int mid = si+(ei-si)/2;
        divide(arr , si , mid);
        divide(arr , mid+1 , ei);
        conqer(arr, si ,mid , ei);
 
    }


    public static void main(String[] args) {
        int [] nums  = {2,1,4,5,3};
        int n = nums.length ; 
        divide(nums , 0 , n-1);
        for(int j=0; j<nums.length ; j++){
            System.out.print(nums[j]+ ",");
        }
    }
}

