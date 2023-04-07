
import java.lang.*;

class Test extends Thread {

    public void run() {
        System.out.println("Ankur"); // Single task
    }

    public static void main(String[] args) {
        Test T = new Test();
        T.start(); // First Thread

        Test T2 = new Test();
        T2.start();    // second thread
    }

}