// package Panagram;

import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashSet<Character> hs = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            if('a' <= str.charAt(i) && 'z' >= str.charAt(i)){
               hs.add(str.charAt(i));
            }
        }

        if(hs.size() >= 26){
            System.out.println("This is Panagram");
        }
        else{
            System.out.println("Not a Panagram");
        }

    }
}
