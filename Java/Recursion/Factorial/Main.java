// package Recursion.Factorial;

import java.util.*;
public class Main {
    
    public static void factorial(int a ,int n ){
        if(a==0){
            System.out.println(n);
            return ;
        }

         n *= a;
         factorial(a-1 , n);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = 1;
        factorial(a,n);

    }


}
