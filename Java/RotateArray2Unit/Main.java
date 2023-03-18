// package RotateArray2Unit;\



import java.util.*;
public class Main {
    
    public static void display(int[]arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int k = 2;
        rotate(arr, k);
        display(arr);

    }

    public static void swap (int []a , int i , int j ){
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }
  
    public static void reverse(int[] a , int i , int j){
      while (i<=j){
          swap (a , i , j);
          i++;
          j--;
      }
    }
  
    public static void rotate(int[] a, int k){
       k = k%a.length;
       if (k<0){
           k+= a.length;
       }
      int n = a.length;
      reverse ( a  , 0 , n-k-1 );
      reverse ( a ,n-k , n-1 );
      reverse ( a , 0 , n-1 );
    }
}
