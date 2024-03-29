
// Leetcode roman to integer"
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "LCDM";
        int ans = romanToInt(str);
        System.out.println(ans);
    }

    public static int romanToInt(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = map.get(str.charAt(str.length() - 1));

        for (int i = str.length() - 2; i >= 0; i--) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                ans -= map.get(str.charAt(i));
            } else {
                ans += map.get(str.charAt(i));
            }
        }
        return ans;

    }
}
