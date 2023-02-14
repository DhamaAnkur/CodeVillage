// package Questions.Pattern;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 4;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }




    }

}
