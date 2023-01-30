// package EvenOdd;

public class Main {
    

    public static void main(String[] args) {
        int [] arr = {2,6,5,4,3,9,8,1,0,7};

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println("Even-> " + arr[i]);
            }
            else{
                System.out.println("Odd-> " + arr[i]);
            }
        }
    }
}
