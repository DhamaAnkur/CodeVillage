
// Maximum Occurance of a Character in a String  ( input--> "aabcccc" );
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String str = scn.nextLine();
        int z = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            z = Math.max(z, map.get(ch));
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int val = map.get(ch);

            if (val == z) {
                System.out.println(ch+"->"+ val);
                break;
            }

        }

    }
}
