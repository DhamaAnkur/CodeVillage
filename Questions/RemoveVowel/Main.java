// package Questions.PrintStar;

import java.util.*;

public class Main {

    public static void removeVowel(String name) {
        char[] ch = { 'a', 'e', 'i', 'o', 'u' };
        String ans = "";

        for (int i = 0; i < name.length(); i++) {
            int j = 0;

            while (j < ch.length) {
                if (name.charAt(i) == ch[j]) {
                    break;
                }
                j++;
            }

            if (j == ch.length) {
                ans += name.charAt(i);
            }
            
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        String name = "ankurdhama";
        removeVowel(name);

    }

}
