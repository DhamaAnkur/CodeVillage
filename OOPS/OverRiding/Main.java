// package OOPS.OverRiding;

// Over Riding
class A{
    void s(){
        System.err.println("A11");;
    } 
}

class B extends A{
    void s(){
        System.err.println("B11");;
    } 
}

class C extends A{
    void s(){
        System.err.println("C11");;
    } 
}

public class Main {

    public static void main(String[] args) {
        C input = new C();
        input.s();
    }

}
