// package ReverseOfNumRecursion;

public class Main {
    
    public static void RecAns(int num){
        if(num == 0){
            return ;
        }
        
        int ans  = num%10;
        System.out.print(ans);
        num = num/10;
        RecAns(num);
        
    }

    public static void main(String[] args) {
       int num = 12345;
       RecAns(num);
    }
}
