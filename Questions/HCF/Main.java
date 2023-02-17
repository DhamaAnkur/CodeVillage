// package Questions.HCF;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        while (n != m) {
            if (n > m) {
                n = n - m;
            }
             else {
                m = m - n;
            }
        }

        System.out.println(m);

    }
}
