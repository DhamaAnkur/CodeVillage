// package OOPS.OverRiding;

// Over Riding
class A{
    void s(){
        System.err.println("11");;
    } 
}

class B extends A{
    void s(){
        System.err.println("Ankur");;
    } 
}

class C extends A{
    void s(){
        System.err.println("Ankur 11");;
    } 
}

public class Main {

    public static void main(String[] args) {
        C input = new C();
        input.s();
    }

}
