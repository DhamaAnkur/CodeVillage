 // package Java.ExceptionHandling.TryCatch;

// public class Main {
    
//     public static void main(String[] args) {
        
//         try{     // It will check where is exception/error in this code 
//             int a = 10;
//             int c = a/0;
//         }
       
//          catch(Exception e){   // It  will show you where are the exception/error
//             System.out.println(e);
//          }

//     }
// }



/////---------------------------------------------------------------------------------------------------------
// package Java.ExceptionHandling.TryCatch;

// public class Main {
    
//     public static void main(String[] args) {
        
//         try{     // It will check where is exception/error in this code 
//             int a = 10;   // agar iss try mai exception nhi aata hai toh nested wale try catch chlega  
//             int c = a/0;  // or agar ismai hi exception aa gya toh yhi se exception Name throw krr dega or return krr jaega

//             try{
//             System.out.println(c);
//             int [] arr  = new int[5];
//             System.out.println(arr[10]);
//             }

//             catch(Exception e){      // It  will show you where are the exception/error
//                 System.out.println(e);
//             }    

//         }
       
//          catch(Exception e){
//             System.out.println(e);
//          }

//         finally{    // It is used to print some msg chache code mai exception ho yaa na ho
//             System.out.println("Ankur");
//         }

//     }
// }
