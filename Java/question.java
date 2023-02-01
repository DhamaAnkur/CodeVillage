// package CVQuestions.String.1_____;

// 1. Write a Java Program to reverse a string without using String inbuilt function.
/* 
import java.util.*;
public class question {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "RAJA";
        int i = str.length()-1;
        String rev = "";
        

        while(i>=0){
            rev += str.charAt(i);
            i--;
        }

        System.out.println(rev);
    }

}
*/

// 2. Write a Java Program to count the number of words in a string. 
/* 
import java.util.*;
public class question {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "Ankur";
        // System.out.println(str.length());
        int i = 0;
        while(i<str.length()){
           i++;
        }
        System.out.println(i);
    }

}
*/

// 3.Write a Java Program to find whether a number is prime or not.
/* 
import java.util.*;
public class question {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for(int i=2 ; i<num ; i++){
            if(num%i == 0){
                System.out.println("This number is not prime-"+num);
                return  ;
            }
        }
        
        System.out.println("This number is prime-"+num);
    }

}
*/

//4. Write a Java Program for the Fibonacci series.
/*
import java.util.*;

public class question {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int range = scn.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < range ; i++) {
            if (i < 1) {
                System.out.print(i + " ");
            }

            else if (i < 2) {
                System.out.print(b + " ");
            }

            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
*/

//5.Write a Java Program to find the duplicate characters in a string.
/* 
import java.util.*;

public class question {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            for (int j = i+1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                 System.out.println(str.charAt(j));
                 return ; 
                }
            }

        }

    
    }

}
*/


//6.Write a Java Program to check Armstrong number. or in given range

// import java.util.*;

// public class question{

//     public static void main(String[] args) {
//         Scanner scn =  new Scanner(System.in);
//         System.out.println("Enter the range");
//         int a = scn.nextInt();
//         int z = scn.nextInt();
     
//         for(int i=a ; i<=z ; i++){
//          if(IsArmStrong(i)){
//           System.out.println("ArmStrong-->" + i);
//         }
//     }

//     }

//     public static boolean IsArmStrong(int num){
//       int originalNumber = num ;
//       int count = 0;
//       int sum = 0;

//       while(originalNumber!=0){
//         originalNumber /= 10;
//         count++;
//       }

//       originalNumber = num ;

//       while(originalNumber != 0){
//         int rem =  originalNumber%10 ;
//         sum += Math.pow(rem, count);
//         originalNumber /= 10 ;
//       }

//       if(sum == num){
//         return true;
//       }
//         return false;
//     }
// }



//7.Write a program tofing second highest number in array
/*
mport java.util.*;
public class question{

    public static void main(String[] args) {
        int [] arr = {1,4,7,10,2,6,3,9};

        for(int i=0; i<arr.length ; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
         
        int z  = arr.length-2;
        System.out.println(arr[z]);
    }
}
*/



//8.write a program to replace all white space with using "replaceAll";

// import java.util.*;
// public class question{

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//             String str = scn.nextLine();
        
//             str = str.replaceAll(" " , "-");
//             System.out.println(str);
        
//         // System.out.println(true && false || true);
//         // System.out.println(false || false && true);
//     }
// }



