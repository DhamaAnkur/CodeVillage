// package Calculator;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
     Scanner scn  = new Scanner(System.in);

     double a  = scn.nextInt();
     char ch = scn.next().charAt(0);
     double b  = scn.nextInt();

     switch(ch){

        case '+' : System.out.println(a+b);
        break ;

        case '-' : System.out.println(a-b);
        break ;

        case '*' : System.out.println(a*b);
        break ;

        case '/' : System.out.println(a/b);
        break ;

        case '%' : System.out.println(a%b);

     }



    }
}
