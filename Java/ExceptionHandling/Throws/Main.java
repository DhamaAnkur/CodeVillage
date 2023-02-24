// package Java.ExceptionHandling.Throws;

// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         // Scanner scn = new Scanner(System.in);
//         int n = 20;
//         if (n < 100) {
//             throw new ArithmeticException("Not a valid number");
//         }
//         else{
//             System.out.println("Valid number");
//         }

//     }
// }

//-------------------------------------------------------------------------------------------------------

import java.util.*;

class Errors extends Exception {
    Errors(String msg) {
        super(msg);
    }
}

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner scn = new Scanner(System.in);
        int n = 5;

        if (n < 10) {
            throw new Exception("Not a valid number");
        }
         else {
            System.out.println("Valid number");
        }

    }
}
