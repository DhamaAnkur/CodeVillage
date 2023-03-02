// package Java.COmpareTwoString;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        String [] list1 = {"abc" , "def" , "ghi"};
        String [] list2 = {"def" , "ghi", "abc"};
        int idx = Integer.MAX_VALUE ;
        int a = 0;
        int b= 0;
        int check = Integer.MAX_VALUE;


        for(int i=0; i<list1.length ; i++){

            String s1 = list1[i];

            for(int j=0; j<list2.length ; j++){
                String s2 = list2[j];
                
                if(s1.equalsIgnoreCase(s2)){
                    a = i;
                    b = j;
                    idx = a+b;
                    System.out.println(a + " and " + b + " -> " + s2 + ", idx sum-------->"+ idx);
                }

            }

            check = Math.min(idx ,check );
            
            
        }

        System.out.println(check);

    }
    
}
