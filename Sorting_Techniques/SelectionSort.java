
import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 8, 4 };

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        
    }
}
