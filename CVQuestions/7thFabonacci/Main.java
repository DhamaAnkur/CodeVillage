// package Java.Basic.Fabonacci;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
    
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int []arr  = new int[10];
        arr[0] = a;
        arr[1] = b;

        for(int i=2; i<10; i++){
            int c = a+b;
            System.out.print(c+" ");
            arr[i] = c ;
            a=b;
            b=c;
        }

        System.out.println();

        System.out.println("7th Fabonacci " + arr[6]);
       

    }
}
