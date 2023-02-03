
// wap for table of 5 using recursion-------------------------------------------------------------------------------

import java.util.*;
public class Main {

    public static void table(int a,int i ) {
       if(i > 10){
        return ;
       }

       System.out.println(a*i);
       table(a,i+1 );
        }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 5;
        table(a,1);
    }
}