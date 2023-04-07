

// import java.util.*;
import java.lang.*;
class Main extends Thread  {

    public void run(){
        System.out.println("Make thread using Thread Class");
    }

    public static void main(String[] args) {
        Main M = new Main();
        M.start();
        M.start();
    }

}
