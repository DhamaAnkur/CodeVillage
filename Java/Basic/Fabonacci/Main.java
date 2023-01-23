// package Java.Basic.Fabonacci;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0;
        int b=1;
        int c = 0;

        if(n==1){
            System.out.println("Nth Fibonacci-->" +0);
            return ;
        }
        else if(n==2){
            System.out.println("Nth Fibonacci-->" +1);
            return ;
        }
        else{
        for(int i=0; i<n-2; i++){
            c = a+b;
            a = b;
            b = c;
        }

        System.out.print("Nth Fibonacci-->" + c);

    }
    }
}
