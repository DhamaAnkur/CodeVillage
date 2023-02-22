// package Questions.MethodsQuestion';

public class Reverse {

    static void print(int[]arr){
        for(int i=arr.length-1 ; i>=0; i--){
            System.out.println(arr[i]);
         }
    }
    
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        print(arr);
    
    }
}
