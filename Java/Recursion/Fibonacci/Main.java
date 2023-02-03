import java.util.*;
public class Main {

    public static void fibonacci(int a, int b, int n) {
        if (n == 2) {
            return;
        }

        if (a == 0 && b == 1) {
            System.out.print(a + " ");
            System.out.print(b + " ");
        }
            
        int c = a + b;
        a = b;
        b = c;
        System.out.print(c + " ");
        fibonacci(a, b, n - 1);
        }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 10;
        fibonacci(a, b, n);
    }
}
