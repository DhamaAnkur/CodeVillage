// package StringToArray;

public class Main {

    public static void main(String[] args) {
        String str = "Dhama Ankur";
        int n = str.length();

        char[] arr = new char[n];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        System.out.println(arr);

    }

}
