// package CVQuestions.FindPairSum;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int k = 5 ;

        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] + arr[j] == k){
                    System.out.println(arr[i] + "-" + arr[j]);
                }
            }
        }


    }
}
