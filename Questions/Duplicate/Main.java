import java.util.*;

public class Main {

    // public static void duplicate(int[]arr , int i){

    //     for(int j=0 ;j<arr.length ; j++){
    //         if(arr[j]  )
    //     }

    // }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 6, 6, 6, 3 };
        Arrays.sort(arr);
        boolean flag = false;

        for(int i=0; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[i] == arr[j] && flag == false){
                    System.out.println(arr[i]);
                    flag = true;
                }
                
            }
        }


     
    }

}