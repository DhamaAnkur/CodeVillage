// package TestForPlacement;

// public class Main {

//     public static void main(String[] args) {
//         int n = 5;

//         for(int i = 0 ; i<n ; i++){

//             for(int k=i ; k<n-1 ; k++){
//                 System.out.print("  ");
//             }

//             for(int j=0 ; j<i+1 ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//     }   
// }

// ----------------------------------------------------------------------------------------------------------------

// public class Main{

// public static void main(String[] args) {
// int []arr = {5,4,3,2,1};
// int a = 0;
// int rotate = arr[0];

// for(int i=1 ; i<arr.length; i++){
// arr[a] = arr[i];
// a++;
// }

// arr[arr.length-1] = rotate ;

// for(int i=0; i<arr.length; i++){
//  System.out.print(arr[i]+ " ");
// }

// }
// }

///------------------------------------------------------------------------------------------------------------------

public class Main {


   
    public static void main(String[] args) {
        int n = 122;
        int ans = 0;
        int mul = 1;
        int orig = n ;

        while (n != 0) {
            ans += n % 10 * mul;
            mul = mul * 10;
            n = n / 10;
        }

       
    }
}