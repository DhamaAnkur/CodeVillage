package CVQuestions.SwapAdjacent;
// package CVQuestions.FindKthEle;

// write a programm to swap adjacent element in array

public class Main {
    
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int k = arr.length-1;
       int temp = arr[0];
       arr[0] = arr[k];
       arr[k] = temp;

       for(int i=0 ; i<arr.length ; i++){
        System.out.print(arr[i]+ " ");
       }
    }
}
