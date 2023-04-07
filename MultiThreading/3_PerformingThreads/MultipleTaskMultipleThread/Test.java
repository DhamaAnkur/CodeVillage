

// Multiple task from Multiple Threads


import java.lang.*;

class MyThread1 extends Thread{
    public void run(){
        System.out.println("Ankur");  // first task
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("Dhama");  // Second task
    }
}

class Test{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();  
        t1.start();   // first thread

        MyThread2 t2 = new MyThread2();
        t2.start();    // second thread
    }
}