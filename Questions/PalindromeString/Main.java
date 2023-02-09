// package Questions.PalindromeString;

import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "NITIN";

        int i=0;
        int j= str.length()-1;

        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                System.out.println("Not Palindrome");
                break;
            }
        }

        if(i>=j){
            System.out.println("Palindrome");
        }

    }

}
