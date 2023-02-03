// package Java.PrintPermutations;

public class Main {
    
    public static void main(String[] args) {
        String str = "rrraajaa";

        String ans  = ""; 

        ans += str.charAt(0);

        for(int i=1; i<str.length(); i++){
            char prev = str.charAt(i-1);
            char curr = str.charAt(i);

            if(curr != prev){
                ans += curr;
            }
        }

        System.out.println(ans);
    }

}

