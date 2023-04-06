
//Make thread using thread class ;
// In it better approach than inherit Thread class because if we work on big project and we make class A as thread 
 // class A extend B{}  and then how can I make it beacuse java does not support multiple inheritance
 

import java.lang.*;

 class Test implements Runnable {
    
    public void run(){
        System.out.println("Make thread using Runnable Interface");
    }

    public static void main(String[] args) {
        Test T = new Test();
        // using obj of thread class
        Thread th = new Thread(T);
        th.start();
    }
}
