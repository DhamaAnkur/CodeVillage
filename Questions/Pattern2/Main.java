
// package Questions.Pattern2;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = scn.nextInt();
        int i = 0;
        int count = 1;

        while (i < n) {

            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();

            if(i < n-1){
            for (int j = 0; j <= count; j++) {
                System.out.print(" ");
            }
        }

            count = count + 2;
            n = n - 1;
            i++;

        }

    }

}
