
public class Main {

    public static boolean isPrime(int n) {
        for (int i = 2; i <=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 500;
        int div = 2;

        while (n != 0) {
            if (n % div == 0) {
                if (isPrime(div)) {
                    System.out.println(div);
                }
            }
            div++;

            if (div > n) {
                break;
            }
        }

    }
}

// -----------------------------------------------------------------------------------
// public class Main {

// public static void main(String[] args) {

// int[] arr = { 2, 1, 0, 0, 1, 2, 1, 0, 2 };
// for (int i = 0; i < arr.length; i++) {

// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] > arr[j]) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
// }

// }

// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + ", ");
// }

// }
// }