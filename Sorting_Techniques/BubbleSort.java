// package Sorting_Techniques;

import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        String[] arr = { "Deep", "Raja", "Ankit", "Parth", "Shubham" };

        // Question(1):- If we sort a integer
        // array---------------------------------------------------------------------------------------------
        // for (int i = 0; i < arr.length; i++) {
        // int flag = 0;
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // flag = 1;
        // }
        // }
        // if (flag == 0) {
        // break;
        // }
        // }

        // Question(2):- If we sort a string array then we use compareTo()
        // method---------------------------------------------------------------------------------------------

        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
        
    }
}
