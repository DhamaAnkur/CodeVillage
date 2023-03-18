import java.util.*;

public class ReverseArray {

    public static void swap(int a  , int b){
        int temp = a ;
        a= b;
        b=temp;
    }

    public static void reverse(ArrayList<Integer> al) {
        // Two pointer approach
        int i = 0;
        int j = al.size() - 1;

        while (i <= j) {
            swap(al.get(i) , al.get(j));

            al.add(i , al.get(i));
            al.add(j , al.get(j));
            i++;
            j--;
        }
        System.out.println(al);
    }

    public static void removeDuplicate(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i - 1];
            int b = arr[i];
            if (a != b) {
                al.add(a);
            } else if (i == arr.length - 1) {
                al.add(arr[i]);
            }
        }
        reverse(al);
        // System.out.println(al);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else
                System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 5 };
        removeDuplicate(arr);
        // reverse(arr);
        // display(arr);
    }

}
