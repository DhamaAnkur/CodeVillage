import java.util.*;

public class Main {

    public static int binarySearch(int[] arr, int target, int iterations) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) + 1 / 2;
            if (target == arr[mid]) {
                System.out.println("Index of taregt:- " + mid);
                iterations++;
                break;
            }
            else if (target < arr[mid]) {
                hi = mid - 1;
                iterations++;
            }
            else {
                lo = mid + 1;
                iterations++;
            }

        }

        if (lo > hi) {
            System.out.println("Not found");
            // break;
        }

        return iterations;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n =scn.nextInt();
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,  12, 13, 14, 15 };
        int k = 1;

        int iterations = binarySearch(arr, k, 0);
        System.out.println("Iternations are to search this target is:- " + iterations);

    }
}
