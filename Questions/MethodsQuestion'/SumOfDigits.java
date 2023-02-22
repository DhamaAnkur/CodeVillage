
import java.util.*;
class SumOfDigits{

    static int sum(int a){
        int sum = 0;

        while(a!=0){
            sum += a%10;
            a /= 10;
        }
        return sum ;
      }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int ans  = sum(a);
        System.out.println(ans);
    }

}