
//Array :-  Sorting Algorithms , Reverse an array using two pointer and  recursion ,Sum of two Array , Difference
// between two arryas , Remove duplicates from Array with the help of ArrayList

import java.util.*;

public class Array {

    static int l = 0;

    public static int MaxArray(int[] arr, int[] arr2) {
        int sum = 0;
        int sum2 = 0;
        int count = 1;
        int count2 = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i] * count;
            count *= 10;
        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            sum2 += arr2[i] * count2;
            count2 *= 10;
        }

        if (sum < sum2) {
            return arr2.length;
        }
        return arr.length;
    }

    public static void sumOfTwoArray(int[] arr1, int[] arr2) {
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int l = Math.max(i, j);
        int[] ans = new int[l + 1];

        while (l >= 0) {
            int sum = 0;
            sum += carry;

            if (i >= 0) {
                sum += arr1[i--];
            }
            if (j >= 0) {
                sum += arr2[j--];
            }

            ans[l--] = sum % 10;
            carry = sum / 10;

        }

        if (carry > 0) {
            System.out.print(carry + " ");
        }

        display(ans, ans.length);

    }

    public static void DifferenceOfTwoArray(int[] arr1, int[] arr2) {
        // Please complete this
        // code------------------------------------------------------------------------------

        int idx = MaxArray(arr1, arr2);
        int[] ans = new int[idx];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int borrow = 0;

        while (i >= 0) {
            int digit = 0;
            digit += arr1[i] + borrow;

            if (j >= 0) {
                digit -= arr2[j];
            }

            if (digit < 0) {
                digit += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            ans[--idx] = digit;
            i--;
            j--;

        }

        boolean flag = true;
        for (int z = 0; z < ans.length; z++) {
            if (ans[z] == 0 && flag != false) {
                continue;
            }
            if (ans[z] != 0) {
                System.out.print(ans[z] + " ");
                flag = false;
            }
        }

    }

    public static void sort(int[] arr) {

        // Merge Sort:- Time complexity--> 0(nlogn) , space complexity--> 0(n) ;

        // Bubble Sort:- Time complexity--> 0(n*n) , Space complexity--> 0(1) ;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Insertion Sort:- Time complexity--> 0(n*n) , space complexity--> 0(1)
        // int n = arr.length;
        // for (int i = 1; i < n; ++i) {
        // int key = arr[i];
        // int j = i - 1;

        // while (j >= 0 && arr[j] > key) {
        // arr[j + 1] = arr[j];
        // j = j - 1 ;
        // }
        // arr[j + 1] = key;
        // }

        // Selection sort:- Time complexity--> 0(n*n) , Space complexity--> 0(1) ;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] < arr[i]) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }

    }

    public static void display(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i]);
            } else
                System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int n) {

        // Reverse using recursion ----------------------------------------
        if (l >= n) {
            return;
        }

        int temp = arr[l];
        arr[l] = arr[n - 1];
        arr[n - 1] = temp;
        l++;
        reverse(arr, n - 1);

        // Reverse using two pointer ------------------------------
        // int i = 0;
        // int j = n - 1;

        // while (i <= j) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // i++;
        // j--;
        // }

    }

    public static int removeDuplicate(int[] arr, int n) {

        ArrayList<Integer> al = new ArrayList<>();
        int size = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                al.add(arr[i - 1]);
                size++;
            }
            if (i == arr.length - 1) {
                al.add(arr[i]);
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            arr[i] = al.get(i);
        }
        return size;
    }

    public static void main(String[] args) {
        int[] arr1 = { 6, 7, 2 };
        int[] arr2 = { 5, 8, 9 };

        DifferenceOfTwoArray(arr1, arr2);

        // sumOfTwoArray(arr1, arr2);

        // sort(arr);
        // int len = removeDuplicate(arr, arr.length);
        // reverse(arr, len);
        // display(arr, len);

    }

}
