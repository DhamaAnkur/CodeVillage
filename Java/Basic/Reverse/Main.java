// package Java.Basic.Reverse;\

import java.util.*;
public class Main {
    
    public static int reverse(int n){
        int rev = 0;

        while(n!=0){
            int rem  = n%10;
            rev  = rev*10+rem;
            n = n/10;

        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(321));
    }
}
