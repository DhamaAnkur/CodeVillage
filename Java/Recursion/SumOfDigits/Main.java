// package SumOfDigits;

import java.util.*;
public class Main {
    
    public static void SumOfDigits(int n ,int sum){
        if(n==0){
            System.out.println("Sum of Digits-> " + sum);
            return ;
        }

        sum += n%10;
        n= n/10;
        SumOfDigits(n ,sum);
    
    }
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 5;
        // int sum = 0;
        // SumOfDigits(n,sum);

        for(int i=0; i<n ; i++){
             for(int j=i ; j<n ; j++){
                System.out.print("* " );
             }
             System.out.println();
        }
        
    }

}
