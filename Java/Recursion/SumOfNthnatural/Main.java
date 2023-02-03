// package SumOfNthnatural;
// wap for sum first n natural number 

import java.util.*;
public class Main {
    
    public static void SumOfNatural(int n , int sum){
      if(n==0){
        System.out.println(sum);
        return;
      }

      sum += n;
      SumOfNatural(n-1 ,sum);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0 ;
        SumOfNatural(n, sum);
    }
}
