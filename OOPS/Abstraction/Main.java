// package OOPS.Abstraction;

// import javax.sql.rowset.spi.SyncResolver;
// import javax.swing.plaf.synth.SynthScrollBarUI;

import java.util.*;

public class Main {

    abstract class A{
        abstract void show();
    }

   class B extends A{
      void show(){
        System.out.print("Abstraction");
        }
    }
    
    public static void main(String[] args) {
        B input = new B();
        input.show();
    }

}

