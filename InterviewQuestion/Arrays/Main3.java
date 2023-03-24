
import java.util.*;

public class Main3 {

    public static Scanner scn = new Scanner(System.in);

    public static void ColumnWiseSpiral(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        // int minCol = 0;
        // int minRow = 0;
        // int maxRow = n;
        // int count = 0;
        // List<Integer> al = new ArrayList<>();

        // while (count < arr.length * arr[0].length) {
        //     if (minRow == 0) {
        //         for (int i = minRow; i < maxRow && count < n * m; i++) {
        //             al.add(arr[i][minCol]);
        //             count++;
        //         }
        //         minCol++;
        //     }
        //     else {
        //         for (int i = maxRow; i < minRow && count < n * m; i++) {
        //             al.add(arr[i][minCol]);
        //             count++;
        //         }
        //         minCol++;
        //     }
        // }
        // System.out.println(al);

        for(int j=0; j<m ; j++){
            if(j%2==0){
                for(int i=0; i<n ; i++){
                    System.out.println(arr[i][j]+" ");
                }
            }
            else{
                for(int i=n-1; i>=0 ; i--){
                    System.out.println(arr[i][j]+" ");
                }
            }
            
        }

    }

    public static void Input2DArray(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void print2DArray(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        Input2DArray(arr, n, m);
        ColumnWiseSpiral(arr);

    }
}
