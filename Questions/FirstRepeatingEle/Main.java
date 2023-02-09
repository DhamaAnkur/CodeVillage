// package Questions.FirstRepeatingEle;

import java.util.*;

public class Main {

    public static int repeatEle(int[] arr) {

        for(int i=1 ; i<arr.length ; i++){
           int ans  = arr[i-1];
           if(ans == arr[i]){
            return arr[i];
           }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,6,6,6,3};
        int ans = repeatEle(arr);
        System.out.println(ans);
    }

}
