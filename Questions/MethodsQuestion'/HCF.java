// package Questions.MethodsQuestion';
import java.util.*;
public class HCF {

    static void hcf(int a, int b){

        while (a != b) {
            if (a > b){
                a = a - b;
            }
             else {
                b = b - a;
            }
        }

     System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt() ;
        int b= scn.nextInt();
        hcf(a,b);
    }
    
}
