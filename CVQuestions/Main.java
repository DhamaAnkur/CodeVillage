// package CVQuestions.String.1_____;

// 1. Write a Java Program to reverse a string without using String inbuilt function.
/*
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int i = str.length()-1;
        String rev = "";

        while(i>=0){
            rev += str.charAt(i);
            i--;
        }

        System.out.println(rev);
    }

}
*/

// 2. Write a Java Program to count the number of words in a string. 
/* 
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "Ankur";
        int i = 0;

        while(i<str.length()){
           i++;
        }

        System.out.println(i);
    }

}
*/

// 3.Write a Java Program to find whether a number is prime or not.
/* 
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for(int i=2 ; i<num ; i++){
            if(num%i == 0){
                System.out.println("This number is not prime-"+num);
                return  ;
            }
        }
        
        System.out.println("This number is prime-"+num);
    }

}
*/

//4. Write a Java Program for the Fibonacci series.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int range = scn.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < range ; i++) {
            if (i < 1) {
                System.out.print(i + " ");
            }

            else if (i < 2) {
                System.out.print(b + " ");
            }

            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}