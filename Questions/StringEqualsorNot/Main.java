// package Questions.StringEqualsorNot;


import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        String one = "ankur";
        String two = "AnKr";

        if(one.length() != two.length()){
            System.out.println("String are not equal");
            return;
        }

        one = one.toLowerCase();
        two = two.toLowerCase();

        if(one.equals(two)){
            System.out.println("both string are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        
    }
}
