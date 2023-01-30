// package BinaryToDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int n = 0;
        int decimal = 0;

        if (num == 0) {
            System.out.println(0);
            return;
        }

        else {
            while (num != 0) {
                int temp = num % 10;
                decimal += temp * Math.pow(2, n);
                num = num / 10;
                n++;
            }
        }

        System.out.println(decimal);

    }
}
