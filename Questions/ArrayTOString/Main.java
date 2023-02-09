// package Questions.ArrayTOString;

import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5};
        String ans  = "";

        for(int i=0; i<arr.length; i++){
           ans  += arr[i];
        }

       System.out.println(ans); 
    }
}
