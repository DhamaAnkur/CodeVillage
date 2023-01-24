import java.util.*;

class Main {
    
    public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);

           int n = 789456123 ;

           for(int i=2; i<=n/2 ; i++){
            if((n%i) == 0){
                System.out.println("Not a prime Number");
                return ;
            }
           }

           System.out.println("This is a prime number");
    }

}
