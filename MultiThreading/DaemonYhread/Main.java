
import java.util.*;

class Main extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Demon Thread");
        } else {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");

        Main t = new Main();
        t.setDaemon(true); // Make a simple thread to deamon thread
        t.start();
    }
}
