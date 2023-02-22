// import java.util.concurrent.SynchronousQueue;

// package Questions.MethodsQuestion';

public class RevDigit {

    static void reverse(int num){
     
        while(num!=0){
            System.out.print(num%10+ ",");
            num /= 10;
        }

    }
    public static void main(String[] args) {
        int dig = 1234;
        reverse(dig);
    }
   
}
