// package MultiThreading.ThreadClassMethods;

// public class Main {
    
//     public static void main(String[] args) {
//         System.out.println("Hello");
//         System.out.println("Thread Name--> " + Thread.currentThread().getName());

//         Thread.currentThread().setName("New Thread Name");  // It is use to rename the thread
//         System.out.println("Thread Name--> " + Thread.currentThread().getName());
//     }
// }


import java.lang.*;
class Main extends Thread{
public void run(){
    System.out.println("Ankur");
    System.out.println("Thread name : " + Thread.currentThread().getName());
}

public static void main(String[] args) {
    Main T = new Main();
    T.start();
    System.out.println("Thread name : " + Thread.currentThread().getName());
    System.out.println(Thread.currentThread().isAlive());  //  return true or false checking thread is alive or dead
    // System.out.println(T.isAlive());
}

}
